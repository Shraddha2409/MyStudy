package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");		
		Thread.sleep(1000);

		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
