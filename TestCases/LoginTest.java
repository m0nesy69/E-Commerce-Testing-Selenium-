package Com.Ec.TestCases;

import org.testng.annotations.Test;

import Com.Ec.BaseClass.BaseClass;
import Com.Ec.PageClass.LoginPage;

public class LoginTest extends BaseClass {
	
	
	
	@Test
	public void validateLogin() {
		LoginPage lp= new LoginPage(driver);
		
		lp.Login("amibedre@gmail.com","iteducation");
		
	}

}
