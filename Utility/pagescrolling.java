package Com.Ec.Utility;

import org.openqa.selenium.JavascriptExecutor;

import Com.Ec.BaseClass.BaseClass;

public class pagescrolling extends BaseClass{
	
	public static void scroll(int x, int y) {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
	}

}
