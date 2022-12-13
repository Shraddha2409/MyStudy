package pop_up;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyPractice {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();		
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
		
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		Thread.sleep(2000);

		alt.dismiss();
		//alt.accept();
		
		//System.out.println(alt.getText());
		

		
		
	}

}
