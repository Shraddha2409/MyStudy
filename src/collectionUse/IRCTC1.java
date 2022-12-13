package collectionUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC1 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();

	driver.get("https://www.irctc.co.in/nget/train-search");	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@role='button']")).click();
		Thread.sleep(5000);
		
		List<WebElement> AllClass = driver.findElements(By.xpath("//ul[@role='listbox']"));
		
		for(WebElement AC:AllClass) {
			
			System.out.println(AC.getText());
		}
		
		
		
		
		
		
		
		
	}

}
