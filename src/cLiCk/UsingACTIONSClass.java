package cLiCk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingACTIONSClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");		
		Thread.sleep(1000);
		WebElement contactClk = driver.findElement(By.xpath("  (//a[@class='nav-link'])[2]"));
		
		Actions act=new Actions(driver);
				
		act.click(contactClk).perform();
		
		
		
		
		
		
		
		
		
		
	}

}
