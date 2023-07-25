package seleniumBrushup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='drop1']"));
		Select select = new Select(dropdown);
		WebElement firstselectOption = select.getFirstSelectedOption();
		System.out.println(firstselectOption.getText());
		select.selectByIndex(1);
		Thread.sleep(2000); 
		select.selectByValue("abc");
		Thread.sleep(2000);
		select.selectByVisibleText("doc 2");
		Thread.sleep(2000);
		
		
		/*WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		Select select = new Select(dropdown1);
		select.selectByIndex(3);
		Thread.sleep(2000); 
		select.selectByValue("swiftx");
		Thread.sleep(2000); 
		select.selectByVisibleText("Hyundai");
		Thread.sleep(2000); 
		List<WebElement> elements = select.getAllSelectedOptions();
		System.out.println(elements.size());
		Thread.sleep(2000); 
		select.deselectByIndex(2);
		Thread.sleep(2000); 
		select.deselectByValue("swiftx");
		Thread.sleep(2000); 
		List<WebElement> elements1 = select.getAllSelectedOptions();
		System.out.println(elements1.size());*/
		
		
		

	}

}
