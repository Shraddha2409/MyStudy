package screenshotPra;


public class Important {

	public static void main(String[] args) {

		
/*
 * We can take ScreenShot By Using TakesScreenShot Method 
TakesScreenshot is an interaface we can'nt use it directly So we need to do Type cast as ((TakesScreenshot)driver)  
After that need to use getScreenshotAs(OutputType.FILE)
That store in Reference variable of File
		
 i.e    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
Now it's Screenshot is at Temporary Place----->So need to put in Desired Location
	File dest=new File("Path for Screenshot and give name with .png")
		
Now Here use FileHandler.copy Mathod	
================================================================================
Or We can use FileUtils.copyFile(src,dest) method
		With the help of FileUtils method we can Takes Screenshot of Specific Elements 
		
		In which there is we no need to do Type cast For  TakesScreenShot Method
		
		For Take Specific element ScreenShot we have to Take Locator for that specific element and need to store in Reference variable
		and instead of using TakesScreenshot method, we can put refrence Variable there
For Example:

	WebElement chart = driver.findElement(By.xpath("(//div[contains(@class,'oxd-sheet oxd-s')])[5]"));
	
	File src=chart.getScreenshotAs(OutputType.FILE);
	
	File dest=new File("C:\\Users\\Administrator\\OneDrive\\Documents\\Pictures\\SeleniumSS.chart.png");
	
			
	FileUtils.copyFile(src, dest);
		
		
	*/	
		
		
		
		
	}

}
