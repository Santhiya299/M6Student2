package Section1;

import java.time.Duration;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationProgram 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");

	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	Thread.sleep(3000);
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	Navigation nav=driver.navigate();
	nav.to("https://www.myntra.com/");
	Thread.sleep(3000);
	nav.back();
	Thread.sleep(3000);
	nav.forward();
	Thread.sleep(3000);
	nav.refresh();
	}
}
