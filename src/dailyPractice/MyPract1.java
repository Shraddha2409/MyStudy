package dailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MyPract1 {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();		
		
		driver.navigate().to("https://qavalidation.com/demo/");			
		
		WebElement gender = driver.findElement(By.name("sgender"));
		WebElement Tools = driver.findElement(By.id("tools"));

			Select se=new Select(gender);
			Select sel=new Select(Tools);

		Thread.sleep(2000);
	
//Scroll Into view Concept
	
		
		
		Actions act=new Actions(driver);
		act.scrollToElement(gender);
		
		se.selectByVisibleText("Male");
		Thread.sleep(2000);

		act.scrollToElement(Tools);

		sel.selectByIndex(3);
		Thread.sleep(2000);
		
		sel.selectByValue("codedui");
		
		
		
	}

}
