package seleniumBrushup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement male = driver.findElement(By.xpath("//input[@id='radio1']"));
		WebElement Female = driver.findElement(By.xpath("//input[@id='radio2']"));
		male.click();
		System.out.println(male.isSelected());
		System.out.println(Female.isSelected());
		
		List<WebElement> radioButton = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radioButton.size());
		
		

	}

}
