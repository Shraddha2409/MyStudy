package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe_Practice {

	public static void main(String[] args) throws InterruptedException {
	
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();

		driver.get("https://vctcpune.com/selenium/practice.html");				

		Thread.sleep(3000);

		driver.switchTo().frame("iframe-name");
		Thread.sleep(2000);

		WebElement text = driver.findElement(By.xpath("//h3[text()='For Velocity class inquiry please contact on below numbers']"));
		
		//WebElement text = driver.findElement(By.xpath("//p[contains(text(),'To build ')]"));

		//JavascriptExecutor jS = (JavascriptExecutor)driver;
		//jS.executeScript("arguments[0].scrollIntoView(true)", text);
		
		Actions act=new Actions(driver);
		act.scrollToElement(text).perform();
		
		System.out.println(text.getText());
		Thread.sleep(2000);
	//======================================================================================	
		
		driver.switchTo().defaultContent();
		
		//WebElement te = driver.findElement(By.xpath("//a[text()='PRACTICE']"));
		

	}

}
