package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame1");
		
		String text = driver.findElement(By.xpath("//b[@id=\"topic\"]")).getText();
		System.out.println(text);
		
		
	
		driver.switchTo().frame("frame3");
		
		WebElement clkChk = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		clkChk.click();
		
//Switch Child Frame to Parent Frame		
		
		

		
	}

}
