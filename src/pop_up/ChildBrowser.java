package pop_up;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();		
		
		driver.get("https://skpatro.github.io/demo/links/");
		
//To get ID of main page we need to use Syntax
		
		String mainPageId = driver.getWindowHandle();
		
		System.out.println("Main page Id is "+mainPageId);
		System.out.println("===============================");

//=====================================================================================
		
//By Clicking new Window getting Child Browser
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click(); 
		
		Set<String> allPageId = driver.getWindowHandles();
		
		System.out.println(allPageId);
		System.out.println("===============================");
//=====================================================================================
		 
//Getting Id of all pages
		
		Iterator<String> it = allPageId.iterator();
		
		String MainPage = it.next();
		String ChildPage= it.next();
		System.out.println(ChildPage);
		System.out.println("===============================");
		System.out.println(MainPage);
		
//=====================================================================================
				
		
		driver.switchTo().window(ChildPage);
		
		driver.manage().window().maximize();
		
		WebElement Search = driver.findElement(By.xpath("(//i[contains(@class,' mw-ico')])[1]"));
		
		Thread.sleep(2000);
	
		Search.click();
		
		Thread.sleep(1000);
		driver.quit();
		
		
		
		
		
		
		
	}

}
