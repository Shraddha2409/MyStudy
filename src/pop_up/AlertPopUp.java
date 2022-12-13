package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {

//First We need to set the properties after 
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
				
//Launch the browser with the help of get method
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirmBox")).click();
		
//=================================================================================================		
//If we are able to inspect element present in popup then we can use selenium directly to handle that popup
		
//But---> If we are unable to inspect element present in popup then we need to use 3rd party tool
		//To Handle that popup
		
	
//==================================================================================================
		
//Alert Pop up
		/*
		 * 1  WE can not inspect the element present in pop up, it does not have any Colors
		 * 2. This pop ups contain OK button or CANCEL button or TEXT button
		 * 3. Sometimes this type of Pop ups contains "?" or "!" Symbol
*/		
//==================================================================================================
		
//Procedure to handle alert pop up 		
//So Here We need to Switch Selenium focus from main page to alert pop up by using Syntax
		//Alert alt=driver.swichTo().alert();
		
	Alert alt=driver.switchTo().alert();
	Thread.sleep(2000);
		
		
//So here Alert is an interface which contains abstract methods like
/*
	1. accept() ---->use to click on OK button
	alt.accept();
	
	2. dismiss() ----> Use to click on Cancel button
	alt.dismiss();
	
	3. getText() ----> Use to get text present in a Alert Popup.
	String Text=alt.getText();	
		
*/		
		
		alt.dismiss();
		
		
		
		
	}

}
