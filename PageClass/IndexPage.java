package Com.Ec.PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ec.BaseClass.BaseClass;

public class IndexPage extends BaseClass {
	
	@FindBy(xpath="//img[@alt='nopCommerce demo store']")
     private WebElement logo;
	
	@FindBy(xpath="//a[@class='ico-login']")
	private WebElement Lbutton;
	
	
	public IndexPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyLogo() {
		boolean logo1=logo.isDisplayed();
		return logo1;
	}
	public void clickonbutton() {
		Lbutton.click();
	}

}
