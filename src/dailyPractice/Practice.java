package dailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();		
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		WebElement user = driver.findElement(By.name("email"));
		
	//getAttribute Method
		
		System.out.println(user.getAttribute("placeholder"));
		
	
	//getCurrenURL
		
		System.out.println(driver.getCurrentUrl());
		System.out.println("--------------------------------");
// getTitleName
		
		System.out.println(driver.getTitle());
		System.out.println("--------------------------------");
	
		System.out.println(driver.getClass());
		
		System.out.println("--------------------------------");

		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getWindowHandle());          //MainPage   id
		
		System.out.println("--------------------------------");

		System.out.println(driver.toString());
		System.out.println("--------------------------------");

		
		
		
		
		
		
	}
	
	
	

}
