package screenshotPra;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Orange {

	public static void main(String[] args) throws InterruptedException, IOException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		WebElement userName = driver.findElement(By.name("username"));
		Thread.sleep(2000);

		act.sendKeys(userName, "Admin").keyDown(Keys.TAB).sendKeys("admin123").
		keyDown(Keys.TAB).keyDown(Keys.ENTER).build().perform();
		
		Thread.sleep(5000);

		WebElement chart = driver.findElement(By.xpath("(//div[contains(@class,'oxd-sheet oxd-s')])[5]"));

		JavascriptExecutor jS = (JavascriptExecutor)driver;
		
		jS.executeScript("arguments[0].scrollIntoView(true)", chart);
		Thread.sleep(2000);

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\Administrator\\OneDrive\\Documents\\Pictures\\SeleniumSS.orange.png");
		
		FileHandler.copy(src, dest);
		
		
		
		
		
		
	}

}
