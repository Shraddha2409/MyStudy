package pop_up;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyPractice2 {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();		
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		String MainPageID = driver.getWindowHandle();
		System.out.println(MainPageID);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Open Tab']")).click();
		
		Set<String> AllPageID = driver.getWindowHandles();
		System.out.println(AllPageID);
		
		Iterator<String> it = AllPageID.iterator();
		
		
		String MainPage = it.next();
		String ChildPage= it.next();
		System.out.println(ChildPage);
		System.out.println("===============================");
		System.out.println(MainPage);
		
//======================================================================================
		
		driver.switchTo().window(ChildPage);
		Thread.sleep(2000);

		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
