package orangehrm;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mydaily {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);

//Action Class---->For Send Keys
		
		WebElement UN = driver.findElement(By.xpath("//input[@name='username']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(500);
		
		act.sendKeys(UN, "Admin");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		
		act.sendKeys(password, "admin123");
		
		act.keyDown(Keys.TAB).keyDown(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Configuration ']")).click();
		
//Mouse Action
		
		Thread.sleep(500);
		 WebElement data = driver.findElement(By.xpath("//a[text()='Data Import']"));
		
		act.moveToElement(data).click().perform();
		
		
		
		
		
		
	}

}
