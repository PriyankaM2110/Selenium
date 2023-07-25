package seleniumBrushup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int a = checkboxes.size();
		System.out.println(a);
		

	}

}
