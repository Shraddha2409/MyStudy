package a_SelfStudy;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
 public class DemoSite {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Sele and Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");		
		
		Thread.sleep(2000);	
		
//===========================================================================
		
		WebElement fName = driver.findElement(By.xpath("(//input[contains(@class,'form-control ng-pristine ')])[1]"));
		
		//getAttribute---WebElementMethod
		System.out.println(fName.getAttribute("placeholder"));
		
		
//Using Keyboard Action---->By Actions Class 
		
		Actions act=new Actions(driver);
		
		act.sendKeys(fName, "Shraddha").keyDown(Keys.TAB).sendKeys("Yadav").
		keyDown(Keys.TAB).sendKeys("Pimpri Gaon Soundarya Colony").
		keyDown(Keys.TAB).sendKeys("shrayayadav1120@gmail.com").
		keyDown(Keys.TAB).sendKeys("7410170703").
		keyDown(Keys.TAB).sendKeys(Keys.LEFT).
		
		keyUp(Keys.SHIFT).
		build().perform();
		 		
//===========================================================================		
		
//isSelected ---> For RadioButton, Checkbox		
		
		WebElement hobbies = driver.findElement(By.id("checkbox1"));
		
		act.click(hobbies).perform();
		
		if(hobbies.isSelected()) {
			
			System.out.println("Hobbies Cricket is Seleted ---> TC is Passed");
			
		}
		else {
			System.out.println("Hobbies Cricket is Not Seleted ----> TC is Failed");
			
		}
		
		driver.findElement(By.id("checkbox2")).click();
		
//Is Enabled----->       Accepting Data or not
//is Displayed------> All types of logo, images
		
		
//===========================================================================	
		
//Select Language Without Using select Method 
		
		
			WebElement lang = driver.findElement(By.xpath("//div[@id='msdd']"));	
			
			lang.click();
		
			WebElement engL = driver.findElement(By.xpath("(//ul[contains(@class,'ui-autoco')]//li)[8]"));
		
			engL.click();
		
//Dynamic Elements
			
			Thread.sleep(2000);
			
			List<WebElement> allLang = driver.findElements(By.xpath("//ul[contains(@class,'ui-autoco')]//li"));
			
			System.out.println(allLang.size());
			
			Iterator<WebElement> it = allLang.iterator();
		
			while(it.hasNext()) {
				
				System.out.println(it.next().getText());
						}
		
//===========================================================================	
		
			WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
	
			Select sel=new Select(skills);
			
			
			sel.selectByVisibleText("Software");
			
//===========================================================================
			
			
		
	}

}
