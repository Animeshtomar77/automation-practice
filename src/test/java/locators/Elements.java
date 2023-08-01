package locators;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Elements {

	public static void main(String[] args) throws InterruptedException {
		
		SafariDriver driver=new SafariDriver();
	driver.get("https://www.google.co.in/?client=safari");
	Thread.sleep(5000);
	
	driver.quit();
	
	
	}

}
