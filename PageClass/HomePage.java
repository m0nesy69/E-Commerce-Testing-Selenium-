package Com.Ec.PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ec.BaseClass.BaseClass;
import Com.Ec.Utility.pagescrolling;

public class HomePage extends BaseClass {
	pagescrolling ref;
	@FindBy(xpath="//input[@id='small-searchterms']")
	private WebElement box;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement sbutton;
	@FindBy(xpath="//button[normalize-space()='Add to cart']")
	private WebElement abutton;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void verifyserach(String product) {
		box.sendKeys(product);
		sbutton.click();
	}
	public CartPage verifyadd() {
		
		ref.scroll(0,500);
		abutton.click();
		return new CartPage(driver);
	}

}
