package dailyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();		
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
			
		
		
		
		
		
		
	}

}
