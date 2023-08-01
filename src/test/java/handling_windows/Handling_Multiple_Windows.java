package handling_windows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_Windows {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium (software)']")).click();
		
		Set<String> windowids=driver.getWindowHandles();
		
		for(String winid:windowids)
		{
			String title=driver.switchTo().window(winid).getTitle();
			
			if(title.equals("Selenium - Wikipedia")|| title.equals("Selenium in biology - Wikipedia")|| title.equals("Selenium (software) - Wikipedia"))
			{
				driver.close();
			}
		}	
			
	}

}
