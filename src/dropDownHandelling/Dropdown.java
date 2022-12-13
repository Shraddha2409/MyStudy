package dropDownHandelling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

//==============================================================================
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
		
//==============================================================================
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select D=new Select(day);
//==============================================================================
//1.		
	D.selectByVisibleText("20");
	Thread.sleep(2000);
		
//2.		
	D.selectByValue("23");	
	Thread.sleep(2000);
		
//3.
	D.selectByIndex(29);
		Thread.sleep(2000);
		
//===============================================================================		
		
		WebElement Month = driver.findElement(By.id("month"));
		
		Select M=new Select(Month);
//===============================================================================		
//1.	
		M.selectByValue("6");
		Thread.sleep(2000);
		
//2.
		M.selectByIndex(1);
		Thread.sleep(2000);
//3.
		M.selectByVisibleText("Oct");
		Thread.sleep(2000);
//===============================================================================		
		
		WebElement Year = driver.findElement(By.id("year"));
		
		Select Y=new Select(Year);
//===============================================================================		
		
//1.		
		Y.selectByVisibleText("2016");
		Thread.sleep(2000);
		Y.selectByVisibleText("2011");
		Thread.sleep(2000);
		Y.selectByVisibleText("2022");
		Thread.sleep(2000);
		
//2.		
		Y.selectByValue("1992");
		Thread.sleep(2000);
		Y.selectByValue("1996");
		Thread.sleep(2000);
		Y.selectByValue("2020");
		Thread.sleep(2000);
		
//3		
		Y.selectByIndex(22);
		Thread.sleep(2000);
		Y.selectByIndex(30);
		Thread.sleep(2000);
		Y.selectByIndex(77);
		Thread.sleep(2000);

		
		
		
		
		
	}

}
