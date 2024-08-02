package Section1;

import org.openqa.selenium.chrome.ChromeDriver;
public class MaximizationAndMinimization
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);		
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();

	}

}
