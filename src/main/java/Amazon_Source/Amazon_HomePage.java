package Amazon_Source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_HomePage {
	
	WebDriver driver;
	//step 1
	@FindBy(xpath = "//span[@id=\"nav-link-accountList-nav-line-1\"]")
	WebElement Accounts_Lists; 
	
	@FindBy(xpath="(//span[.=\"Sign in\"])[1]")
	WebElement SelectSignINButton;
	
	
	@FindBy(id="twotabsearchtextbox")
	WebElement ProductSearch;

	@FindBy(xpath="//span[.=\"Sign Out\"]")
	WebElement Logout;
	
	@FindBy(xpath="(//div[@class=\"sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 AdHolder sg-col s-widget-spacing-small sg-col-4-of-20\"][1]")
	WebElement Product;	
	
	//step 2
	
	public void HoverOverOnAccounts_Lists(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(Accounts_Lists).perform();
		
	}
	
	public void SignInButton()
	{
		SelectSignINButton.click();
	}
	
	public void SearchProduct()
	{
		ProductSearch.sendKeys(("gucci flora")+Keys.ENTER);	
	}
	
	public void LogOut()
	{
		Logout.click();
	}
	
	public void Product_Selection()
	{
		Product.click();		
	}
	//step 3
	public Amazon_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
