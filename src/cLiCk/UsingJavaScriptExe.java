package cLiCk;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingJavaScriptExe {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");		
		Thread.sleep(2000);
//=======================================================================================
		
//By USing JavaScipt Executor Going to Click 
//Use Type Cast
/* To Perform the Click Operation We Can Use JavaScriptExecutor Which is Basicallly Used to 
 * Perform the Click Even if any Elements Overlap With the Element on Which 
 We Want to have get Clicked
 */
		
		
	WebElement contactClk = driver.findElement(By.xpath("(//a[@class='nav-link'])[3]"));
		
	JavascriptExecutor jS=(JavascriptExecutor)driver;
	
	jS.executeScript("arguments[0].click()", contactClk);
	
	
//There are three way to perform the operation The Click Operation
	//1. By Using click() Method
	//2. By Using Actions Class Click Method
	//3. By Using JavaScriptExecutor
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
