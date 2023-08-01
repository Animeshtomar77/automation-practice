package checkbox_dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownWithoutSelectTag {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_3");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[3]/div/span/div/button/span")).click();
		List<WebElement>options=driver.findElements(By.xpath("//ul[contains(@class, multiselect)]//label"));
		
		for(WebElement option:options)
		{
			if(option.getText().equals("Java")|| option.getText().equals("MySQL"))
			{
				option.click();
		}
		}

	}

}
