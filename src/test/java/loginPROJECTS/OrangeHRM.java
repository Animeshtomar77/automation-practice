package loginPROJECTS;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class OrangeHRM {
	
	public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			driver.manage().window().maximize(); //maximize the page
			
			//force wait time of 5 sec
			Thread.sleep(5000);
			
			//WebElement txtUsername=driver.findElement(By.name("username"));
			//txtUsername.sendKeys("Admin");
			//OR
			
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			
			
			/*
			//Validation 1
			//validating home page title
			
			String act_title=driver.getTitle();
			String exp_title="OrangeHRM";
			
			if(act_title.equals(exp_title))
			{
				System.out.println("Test Passed");
			}
			else
			{
				System.out.println("Test failed");
			}
			*/
			Thread.sleep(5000);
			//Validation 2
			String act_label= "";
			try
			{
			act_label=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
			}
			
			catch(Exception e) { }
			String exp_label="Dashboard";
			
			if(act_label.equals(exp_label))
				{
					System.out.println("Test passed");
				}
			else
				{
					System.out.println("Test failed");
				}
				
		
			
		driver.quit();
		
	
		}

	}


