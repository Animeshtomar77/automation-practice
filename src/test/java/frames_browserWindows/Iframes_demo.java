package frames_browserWindows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_demo {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("mce_0_ifr");
		
		driver.findElement(By.id("tinymce")).clear(); // clears box
		driver.findElement(By.id("tinymce")).sendKeys("Welcome to automation");
		
		driver.findElement(By.id("tinymce")).sendKeys(Keys.CONTROL+"a");//select text
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@title='Bold']")).click();//bold 
		
		

	}




	}


