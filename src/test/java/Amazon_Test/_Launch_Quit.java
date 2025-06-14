package Amazon_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class _Launch_Quit {
 
	WebDriver driver;
	@BeforeMethod
	public void Launch()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
	}
	
/*	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}*/
}
