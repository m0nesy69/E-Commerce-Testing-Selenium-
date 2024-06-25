package Com.Ec.TestCases;

import org.testng.annotations.Test;

import Com.Ec.BaseClass.BaseClass;
import Com.Ec.PageClass.IndexPage;

public class IndexTest extends BaseClass{
	
	
	@Test
	public void validateLogo() {
		IndexPage ip= new IndexPage(driver);
		ip.verifyLogo();
	}
	@Test
	public void nextpage() {
		
		IndexPage ip= new IndexPage(driver);
		ip.clickonbutton();
		
	}

}
