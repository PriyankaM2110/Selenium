package seleniumBrushup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement redColorPicker = driver.findElement(By.xpath("//div[@id='red']/span"));
		WebElement blueColorPicker = driver.findElement(By.xpath("//div[@id='blue']/span"));
		WebElement greenColorPicker = driver.findElement(By.xpath("//div[@id='green']/span"));
		
		System.out.println(redColorPicker.getLocation());
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(redColorPicker, -70, 125).perform();
		Thread.sleep(2000);
		action.dragAndDropBy(blueColorPicker, 80, 125).perform();
		Thread.sleep(2000);
		action.dragAndDropBy(greenColorPicker, 70, 125).perform();
		Thread.sleep(2000);
		
		
		//*[@id="red"]/span
		//div[@id='red']/span

	}

}
