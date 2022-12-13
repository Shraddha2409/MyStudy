package cLiCk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingClickMethod {

	public static void main(String[] args) throws InterruptedException {


		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");		
		Thread.sleep(1000);
		WebElement contactClk = driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
		
		contactClk.click();
		
		
		
		
	}

	
}
