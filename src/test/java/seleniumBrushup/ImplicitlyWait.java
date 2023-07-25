package seleniumBrushup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		WebElement checkThis = driver.findElement(By.xpath("//button[text()='Check this']"));
		
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkThis);
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='dte']"));
		
		checkBox.click();
		System.out.println(checkBox.isDisplayed());
		System.out.println(checkBox.isSelected());
		

	}

}
