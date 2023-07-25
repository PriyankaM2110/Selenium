package seleniumBrushup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(3000);
		//driver.quit();

	}

}
