package screenshotPra;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotP {

	public static void main(String[] args) throws InterruptedException, IOException {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@Role='button'])[2]")).click();
		Thread.sleep(2000);
//===============================================================================		
		
		WebElement UN = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		UN.sendKeys("Shraddha");
		
		Thread.sleep(2000);
		
//================================================================================		
//Taking Screen Shot
//1
		File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(Src);
//2.		
	File dest=new File("C:\\Users\\Administrator\\OneDrive\\Documents\\Pictures\\SeleniumSS\\FbSS.png");	
		
//3.
	FileHandler.copy(Src, dest);
	
		driver.close();
	}

}
