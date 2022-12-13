package dailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyPra {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();		
		
		driver.navigate().to("https://www.facebook.com/");	
		
		WebElement Un = driver.findElement(By.name("email"));
		
		System.out.println(Un.getAttribute("class"));
		System.out.println("---------------------------------");

		WebElement te = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		
		System.out.println(te.getAttribute("class"));
		
		System.out.println("---------------------------------");
		System.out.println(te.getText());
		
		//Difference between getAttribute and getText
		
		
		
		
	}

}
