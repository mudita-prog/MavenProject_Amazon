package Amazon_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_LoginPage {
	
	WebDriver driver;
	
	@FindBy (name="email")
	WebElement username_field;
	
	@FindBy (id="continue")
	WebElement continue_button;

	@FindBy  (id="ap_password")
	WebElement EnterPassword;
	
	@FindBy (xpath="//input[@id=\"signInSubmit\"]")
	WebElement signInButton;
	
	public void enterUSername()
	{
		username_field.sendKeys("9717377131");
	}
	public void continueButton()
	{
		continue_button.click();
	}
	public void PasswordField()
	{
		EnterPassword.click();
		EnterPassword.sendKeys("Qazwsx123@");
	}
	public void signIn()
	{
		signInButton.click();
	}
	public Amazon_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
