package seleniumBrushup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links are " +links.size());
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println( links.get(i).getAttribute("href"));
			System.out.println(links.get(i).getText());
		}
		

	}

}
