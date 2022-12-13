package dropDownHandelling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("disha-banner-close")).click();
		Thread.sleep(2000);

		WebElement AllClass = driver.findElement(By.xpath("(//div[@role='button'])[1]"));
		AllClass.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='AC First Class (1A) ']")).click();
		Thread.sleep(2000);

		driver.close();
	}

}
