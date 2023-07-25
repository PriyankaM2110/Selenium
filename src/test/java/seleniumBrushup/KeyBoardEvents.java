package seleniumBrushup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		
		WebElement sourceText = driver.findElement(By.xpath("//div[@class='CodeMirror-code']"));
		WebElement targetText = driver.findElement(By.xpath("(//div[@class='CodeMirror-code'])[2]"));
		Actions action = new Actions(driver);
		action.keyDown(sourceText, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		action.keyDown(targetText, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		Thread.sleep(2000);
		

	}

}
