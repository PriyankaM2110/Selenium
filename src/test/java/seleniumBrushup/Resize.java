package seleniumBrushup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']/div[2]"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(resize, 300, 100).perform();
		
		

	}

}
