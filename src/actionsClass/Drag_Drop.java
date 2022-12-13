package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		
		WebElement drag1 = driver.findElement(By.xpath("//div[@id='box1']"));
		
		WebElement drop1 = driver.findElement(By.xpath("//div[@id='box101']"));
		
		
		act.dragAndDrop(drag1, drop1).perform();
		Thread.sleep(1000);

		
		 WebElement drag2 = driver.findElement(By.xpath("//div[@id='box6']"));
		
		WebElement drop2 = driver.findElement(By.xpath("//div[@id='box106']"));
		
		act.dragAndDrop(drag2, drop2).perform();
		
		
		
		
		
		
	}

}
