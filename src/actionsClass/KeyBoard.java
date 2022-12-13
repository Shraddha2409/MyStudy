package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(1000);

		
		Actions act=new Actions(driver);
		
		WebElement fName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		act.sendKeys(fName, "Shraddha").perform();
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		act.click(day).perform();
		
	//	act.sendKeys(Keys.ARROW_DOWN).perform();
		
		for(int i=0;i<=10;i++) {
			
			act.sendKeys(Keys.ARROW_DOWN).perform();
			
		}
		  act.sendKeys(Keys.ENTER).perform();
		
			Thread.sleep(1000);
//------------------------------------------------------------------------------------------------------
		  WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		  
		  act.click(month).perform();
		  for(int i=0;i<=8;i++) {
			  
			  act.sendKeys(Keys.ARROW_UP).perform();
				
		  }
		  act.sendKeys(Keys.ENTER).perform();
		
	}
	
//------------------------------------------------------------------------------------------------------
	
	
	
	
	
	
	

}
