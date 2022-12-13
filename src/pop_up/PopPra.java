package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopPra {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");	
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframeResult");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(1000);

		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.accept();
//===================================================================================



















		
		
		
		
		
		
		
		
		
	}

}
