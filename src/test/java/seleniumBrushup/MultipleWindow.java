package seleniumBrushup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='link2']")).click();
		
		Set<String> window = driver.getWindowHandles();
		
		Iterator<String> i = window.iterator();
		String Parentwindow = i.next();
		System.out.println(Parentwindow);
		driver.switchTo().window(Parentwindow);
		System.out.println(driver.getTitle());
		//driver.findElement(By.partialLinkText("what-is-selenium")).click();
		driver.findElement(By.xpath("//a[text()='What is Selenium?']")).getText();
		driver.findElement(By.xpath("//a[text()='What is Selenium?']")).click();
		
		
		
		Set<String> window1 = driver.getWindowHandles();
		System.out.println(window1);
		Iterator<String> i1 = window.iterator();
		String Parentwindow1 = i1.next();
		System.out.println(Parentwindow1);
		//String Childwindow1 = i1.next();
		driver.switchTo().window(Parentwindow1);
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//span[text()='Google “Selenium By Arun” and start learning Selenium. ']")).getText());
		

	}

}
