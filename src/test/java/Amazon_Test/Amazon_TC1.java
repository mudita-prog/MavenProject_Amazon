package Amazon_Test;
import org.testng.annotations.Test;

import Amazon_Source.Amazon_HomePage;
import Amazon_Source.Amazon_LoginPage;

public class Amazon_TC1 extends _Launch_Quit
{
	
	@Test
public void login_to_amazon()
{
		
	Amazon_HomePage hp = new Amazon_HomePage(driver);
	hp.HoverOverOnAccounts_Lists(driver);
	hp.SignInButton();
	Amazon_LoginPage lp = new Amazon_LoginPage(driver);
	lp.enterUSername();
	lp.continueButton();
	lp.PasswordField();
	lp.signIn();
	
}
}
