package frames_browserWindows;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleInnerFrame {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
