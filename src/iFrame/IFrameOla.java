package iFrame;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameOla {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();

   driver.get("https://www.olacabs.com/");		
		Thread.sleep(5000);
	
		WebElement IFrame = driver.findElement(By.xpath("//iframe[@class='city-iframe']"));
		
		driver.switchTo().frame(IFrame);
		
		
		driver.findElement(By.xpath("//*[text()='Enter drop for ride estimate']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pune");	
		
		
		
	} 

}
