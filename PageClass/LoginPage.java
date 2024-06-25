package Com.Ec.PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ec.BaseClass.BaseClass;
import Com.Ec.Utility.pagescrolling;

public class LoginPage extends BaseClass {
	pagescrolling ref;
	@FindBy(xpath="//*[@id=\"Email\"]")
	private WebElement uid;
	@FindBy(xpath="//input[@id='Password']")
	private WebElement pass;
	@FindBy(xpath="//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
	private WebElement button;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void Login(String username,String password) {
		ref.scroll(0,300);
		uid.sendKeys(username);
		pass.sendKeys(password);
		button.click();
	}

}
