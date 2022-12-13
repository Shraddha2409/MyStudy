package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframePra {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();

driver.get("https://vctcpune.com/selenium/practice.html#serviceid");		
		Thread.sleep(5000);
		 
		
		driver.findElement(By.xpath("//a[text()='Click to Start Selenium Practice Now']")).click();

		Thread.sleep(5000);
		
		driver.quit();
		
		
		
	}

}
