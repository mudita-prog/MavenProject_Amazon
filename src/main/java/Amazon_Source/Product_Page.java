package Amazon_Source;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Page{
	
	WebDriver driver;
	
	
	@FindBy(xpath="//input[@id=\"add-to-wishlist-button-submit\"]")
	WebElement ClickWishListButton;
	
	@FindBy (xpath="//span[@id=\"wl-redesigned-create-list\"]")
	WebElement CreateWishlist;
	
	
	public void AddToWishList()
	{
		ClickWishListButton.click();
	}
	
	public void Create_Wishlist()
	{
		CreateWishlist.click();
		
	}
	
	public Product_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
