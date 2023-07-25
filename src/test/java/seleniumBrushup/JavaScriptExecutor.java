package seleniumBrushup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement checkthis = driver.findElement(By.xpath("//button[@onclick='setTimeout(myFunctionAXD,10000)']"));
		js.executeScript("arguments[0].scrollIntoView(true);", checkthis);
		
		WebElement getPrompt = driver.findElement(By.xpath("//input[@id='prompt']"));
		//getPrompt.click();
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", getPrompt);
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		

	}

}
