package screenshotPra;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class FB_SS {

	public static void main(String[] args) throws InterruptedException, IOException {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();		
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
//By Using Actions Class
		
		Thread.sleep(4000);

		WebElement UN = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		UN.click();
		UN.sendKeys("Shraddha");
		
//By Actions Class
		
		Actions Act=new Actions(driver);
		
		Act.keyDown(Keys.TAB).sendKeys("Yadav").keyDown(Keys.TAB).sendKeys("9503440931")
		.keyDown(Keys.TAB).sendKeys("Shraya$24").keyUp(Keys.CONTROL)
		.build().perform();
		
		Thread.sleep(5000);

//To Take Screenshot we need to type cast driver object to takes Screenshot interface
		
		File Src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		System.out.println(Src);
		
		
		File Destination=new File("C:\\Users\\Administrator\\OneDrive\\Documents\\Pictures\\SeleniumSS\\MyFB.png");
		
		FileHandler.copy(Src, Destination);
		
		
		
		
		
		
		
		
		
		
	}

}
