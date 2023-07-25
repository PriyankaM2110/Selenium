package seleniumBrushup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		driver.switchTo().frame("iframe1");
		
		driver.switchTo().parentFrame();
		//driver.switchTo().frame("iframe2");
		
		driver.switchTo().frame(2);
		System.out.println(driver.findElement(By.xpath("//h1[text()='Error: Server Error']")).getText());
		

	}

}
