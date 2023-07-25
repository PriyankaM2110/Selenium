package seleniumBrushup;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		
		List<WebElement> vegetables = driver.findElements(By.xpath("//div[@class='products']/div"));
		System.out.println(vegetables);
		driver.findElement(By.xpath("//a[@class='cart-header-navlink' and text()='Top Deals']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> i1 =windows.iterator();
		i1.next();
		String childwindow=i1.next();
		driver.switchTo().window(childwindow);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
		
		driver.findElement(By.cssSelector("input#search-field")).sendKeys("Tomato");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
		String vege = driver.findElement(By.cssSelector("th[role='columnheader']")).getText();
		System.out.println(vege);
		
		
		driver.close();


	}

}
