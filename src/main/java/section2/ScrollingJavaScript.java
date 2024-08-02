package section2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingJavaScript 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.makemytrip.com/");
		//String JavascriptExecutor;
		Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window,scrollBy(-800,0);");
		Thread.sleep(3000);
		
	}
}
