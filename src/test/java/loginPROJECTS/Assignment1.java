package loginPROJECTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://admin-demo.nopcommerce.com");
		
		Thread.sleep(4000);
		
		WebElement id=driver.findElement(By.name("Email"));
		id.clear();
		id.sendKeys("admin@yourstore.com");
		
		Thread.sleep(3000);
		WebElement pass=driver.findElement(By.id("Password"));
		pass.clear();
		pass.sendKeys("admin");
		
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		
		Thread.sleep(4000);
		
		String act_label="";
		try
		{
		act_label=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		}
		catch(Exception e) {}
		
		String exp_label="Dashboard";
		
		if(act_label.equals(exp_label))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.quit();
		
	}

}
