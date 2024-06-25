package Com.Ec.TestCases;

import org.testng.annotations.Test;

import Com.Ec.BaseClass.BaseClass;
import Com.Ec.PageClass.CartPage;

public class CartTest extends BaseClass {
	
	public  CartPage cp;
	
   @Test
   public void verifycart() {
	    cp= new CartPage(driver);
	   cp.clickoncart();
	   
   }
   @Test
   public void verifycbutton() {
	   cp.cartbutton();
   }

}
