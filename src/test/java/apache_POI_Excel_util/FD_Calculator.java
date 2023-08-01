package apache_POI_Excel_util;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FD_Calculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
	driver.manage().window().maximize();
	
	String file=System.getProperty("user.dir")+("/testdata/caldata2.xlsx");
	
	WebElement pinput=driver.findElement(By.xpath("//input[@id='mat-input-0']"));
	WebElement time=driver.findElement(By.xpath("(//input[@id='mat-input-1'])[1]"));
	WebElement roi=driver.findElement(By.xpath("(//input[@id='mat-input-2'])[1]"));
	WebElement button=driver.findElement(By.xpath("//button[@id='CIT-chart-submit']"));
	
	int rows=ExcelUtils.getRowCount(file, "Sheet1");
	System.out.println("no of rows "+rows);
	for(int i=1; i<=rows; i++)
	{
		//read data from excel
		String princ=ExcelUtils.getCellData(file,"Sheet1",i, 0);
		String rate=ExcelUtils.getCellData(file,"Sheet1",i, 1);
		String length=ExcelUtils.getCellData(file,"Sheet1",i, 2);
		String period=ExcelUtils.getCellData(file,"Sheet1",i, 3);
		String exptotal=ExcelUtils.getCellData(file,"Sheet1",i, 4);
		
		//passing data to application
		
		pinput.clear();
		time.clear();
		roi.clear();
		
		Thread.sleep(3000);
		
		roi.sendKeys("rate");
		time.sendKeys("length");
		pinput.sendKeys("princ");
		
		//Duration/compunding drpdown not have select tag
		WebElement drpbutton=driver.findElement(By.xpath("//mat-select[@id='mat-select-0']"));
		drpbutton.click();
		List<WebElement>options=driver.findElements(By.xpath("//div[@id='mat-select-0-panel']//mat-option"));
		
		for(WebElement option:options)
		{
			if(option.getText().equals(period));
				option.click();
		}
		
				
		button.click();   ///click on button to calculate cd calculation based on xl cell data
		String acttotal = driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
		
		System.out.println("act total is: " + acttotal);
		System.out.println("exp total is: " + exptotal);
		
		if(exptotal.equals(acttotal))
			
		{
			ExcelUtils.setCellData(file, "Sheet1", i, 6, "Passed");
			ExcelUtils.fillGreenColor(file, "Sheet1", i, 6);
		}
		else	
		{
			ExcelUtils.setCellData(file, "Sheet1", i, 6, "Failed");
			ExcelUtils.fillRedColor(file, "Sheet1", i, 6);
			
		}
		
	}
		System.out.println("Test completed");
		driver.close();
		
	

	}
	
	}
