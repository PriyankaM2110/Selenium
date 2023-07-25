package seleniumBrushup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoIt {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\priya\\check\\fileUpload.exe");
		
		WebElement convertButton = driver.findElement(By.xpath("//button[@id='processTask']/span"));
		//WebElement convertButton = driver.findElement(By.cssSelector(".btn.btn--process.btn--red.pdfjpg"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='processTask']")));	
		 wait.until(ExpectedConditions.visibilityOfElementLocated (By.id("processTask")));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", convertButton);
		driver.findElement(By.xpath("//span[@id='pickfiles']")).click();
		File file = new File("C:\\Users\\priya\\Downloads\\summary_page-0001 (3).exe");
		if(file.exists())
		{
			System.out.println("file found");
		}
		

	}

}
