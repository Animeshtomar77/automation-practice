package checkbox_dropdowns;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement countrydrpdwn=driver.findElement(By.xpath("//*[@id=\"country-list\"]"));
		Select drpdwn=new Select(countrydrpdwn);
		
		drpdwn.selectByVisibleText("USA");
		
		
		
		
	}

}
