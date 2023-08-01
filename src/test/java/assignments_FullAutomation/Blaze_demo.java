package assignments_FullAutomation;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Blaze_demo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement fromcityele=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select fromcity=new Select(fromcityele);
		
		fromcity.selectByVisibleText("San Diego");
		
		WebElement tocityele=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select tocity=new Select(tocityele);
		
		tocity.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		int rows=driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		System.out.println("total rows: "+rows);
		
		String pricearry[]=new String[rows];
		
		String pricesArr[]=new String[rows];   //0-4
		for(int r=1;r<rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();
			pricesArr[r-1]=price; //adding price into array
		}
		
	//7- Sort prices then find lower price value
		
		for(String arrvalue:pricesArr)
		{
			System.out.println(arrvalue);
		}
		
	}

}
