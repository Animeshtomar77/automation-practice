package checkbox_dropdowns;
import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//select single checkbox
		
		//driver.findElement(By.xpath("//*[@id=\'monday\']")).click();
		
		//selecting multiple checkboxes
		
		List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input' and @type=\"checkbox\"]"));
		
		//normal for loop
		
		for(int i=0; i<7; i++)
		{
			checkboxes.get(i).click();
		}
		
		
	}

}
