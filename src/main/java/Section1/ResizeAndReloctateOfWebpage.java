package Section1;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeAndReloctateOfWebpage
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/") ;
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Dimension d=new Dimension(400,500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		Point p=new Point(200,300);
		driver.manage().window().setPosition(p);
	}
}
