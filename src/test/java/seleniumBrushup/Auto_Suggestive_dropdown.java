package seleniumBrushup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_Suggestive_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement From = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		From.click();
		From.sendKeys("sa");
		From.sendKeys(Keys.ARROW_DOWN);
		From.sendKeys(Keys.ENTER);
		WebElement Destination = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
		Destination.click();
		Destination.sendKeys("BLR");
		Destination.sendKeys(Keys.ARROW_DOWN);
		Destination.sendKeys(Keys.ENTER);

	}

}
