package seleniumBrushup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
		Actions action = new Actions(driver);
		action.doubleClick(doubleClick).build().perform();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
        WebElement compendium = driver.findElement(By.xpath("(//div[@class='widget-content']/ul/li[1])[2]"));		
		action.contextClick(compendium).build().perform();
		Thread.sleep(5000);
		
		
		WebElement doubleClick1 = driver.findElement(By.xpath("//p[@id='testdoubleclick']"));
		action.doubleClick(doubleClick1).build().perform();
		//Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//div[@id='myDropdown']/a")).getText());
		driver.findElement(By.xpath("//div[@id='myDropdown']/a")).click();
		

		
		

	}

}
