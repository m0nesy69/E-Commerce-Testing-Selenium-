package Com.Ec.TestCases;

import org.testng.annotations.Test;

import Com.Ec.BaseClass.BaseClass;
import Com.Ec.PageClass.HomePage;

public class HomeTest extends BaseClass {
	
	@Test
	public void validateserach() {
		HomePage hp= new HomePage(driver);
		hp.verifyserach("Apple MacBook Pro 13-inch");
        hp.verifyadd();
	}

}
