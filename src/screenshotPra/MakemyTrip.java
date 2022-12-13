package screenshotPra;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemyTrip {

	public static void main(String[] args) throws InterruptedException, IOException {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();		
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);	
		
		WebElement fromBox = driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']"));
		
		File src= fromBox.getScreenshotAs(OutputType.FILE);
		
		File Dest=new File("C:\\Users\\Administrator\\OneDrive\\Documents\\Pictures\\Screenshots\\city.png");
		
		FileUtils.copyFile(src, Dest);
		
		
		
		
		
		
		
		
	}

}
