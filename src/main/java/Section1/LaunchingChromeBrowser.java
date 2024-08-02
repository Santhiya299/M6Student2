package Section1;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchingChromeBrowser 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);			
	}

}
                             