package Section1;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
public class Chrome_to_Validate
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Dimension d=new Dimension(400,500);
		Thread.sleep(1000);
		driver.manage().window().setSize(d);
		Point p=new Point(200,300);
		driver.manage().window().setPosition(p);
		driver.get("https://www.orangehrm.com/en/");
		Thread.sleep(1000);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		Navigation nav=driver.navigate();
		Thread.sleep(2000);
		nav.back();
		
		nav.forward();
		
		
		Thread.sleep(2000);
		nav.refresh();
		
		String expectedResult = "flipkart";
		String actualResult = driver.getCurrentUrl();
	
		if( actualResult.contains(expectedResult) )
			System.out.println("pass");
		else
			System.out.println("Fail");
	}
}
