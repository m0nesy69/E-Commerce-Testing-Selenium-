package Com.Ec.PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ec.BaseClass.BaseClass;
import Com.Ec.Utility.pagescrolling;

public class CartPage extends BaseClass{
	pagescrolling ref;
	
	@FindBy(xpath="//span[@class='cart-label']")
	private WebElement cbutton;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-button-4\"]")
	private WebElement addbutton;
	
	public CartPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickoncart(){
		ref.scroll(0, 500);
		addbutton.click();
		
	}
	public void cartbutton() {
		driver.navigate().refresh();
		cbutton.click();
	}

}
