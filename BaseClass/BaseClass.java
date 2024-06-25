package Com.Ec.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public static WebDriver driver;
	@BeforeSuite
	public void init() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinesh\\Downloads\\chromedriver-win64 (14)\\chromedriver-win64\\chromedriver.exe");
	        driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		
	}
	

}
