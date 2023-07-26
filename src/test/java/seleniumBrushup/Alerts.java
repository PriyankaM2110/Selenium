package seleniumBrushup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='alert1']")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		System.out.println("Priyanka");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement getPrompt = driver.findElement(By.xpath("//input[@id='prompt']"));
		getPrompt.click();
		Thread.sleep(3000);
		js.executeScript("arguments[0].value='Hi Priyanka';",getPrompt);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("//input[@id='confirm']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.quit();

	}

}
