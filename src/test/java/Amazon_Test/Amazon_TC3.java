package Amazon_Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Amazon_Source.Amazon_HomePage;
import Amazon_Source.Amazon_LoginPage;
import Amazon_Source.Product_Page;

public class Amazon_TC3 extends _Launch_Quit{
	
	
	@Test
	public void AddToWIshlist()
	{
	Amazon_HomePage hp = new Amazon_HomePage(driver);
	hp.HoverOverOnAccounts_Lists(driver);
	hp.SignInButton();
	Amazon_LoginPage lp = new Amazon_LoginPage(driver);
	lp.enterUSername();
	lp.continueButton();
	lp.PasswordField();
	lp.signIn();
	hp.SearchProduct();
	hp.Product_Selection();
	Product_Page bp = new Product_Page(driver);
	Set <String> s1 = driver.getWindowHandles();
	Iterator <String> i1 = s1.iterator();
	String parentId = i1.next();
	String childId = i1.next();
	System.out.println(parentId);
	System.out.println(childId);
	driver.switchTo().window(childId);
	bp.AddToWishList();
	bp.Create_Wishlist();
	
	WebElement continueShopping = driver.findElement(By.xpath("//span[@id=\"continue-shopping\"]"));
	continueShopping.click();
	

}
}