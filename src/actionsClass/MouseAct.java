package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAct {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
		Thread.sleep(2000);

		WebElement doublC = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Actions act=new Actions(driver);

		JavascriptExecutor jS = (JavascriptExecutor)driver;
		
		
		jS.executeScript("arguments[0].scrollIntoView(true)", doublC);
		act.doubleClick(doublC).perform();
		
		
		Thread.sleep(1000);
		
		WebElement rightC = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		jS.executeScript("arguments[0].scrollIntoView(true)", rightC);
		act.contextClick(rightC).perform();
		
		Thread.sleep(1000);

		WebElement clickM= driver.findElement(By.xpath("//button[text()='Click Me']"));
		jS.executeScript("arguments[0].scrollIntoView(true)", clickM);
		
		//For Click--->jS.executeScript("arguments[0].click()", clickM);      We Can Use Click Method  By Using JavaScriptExecutor
		
		act.click(clickM).perform();
		
		Thread.sleep(4000);
		WebElement moveTo = driver.findElement(By.xpath("//span[text()='Text Box']"));
		jS.executeScript("arguments[0].scrollIntoView(true)", moveTo);
		
		act.moveToElement(moveTo).click().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
