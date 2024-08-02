package Section1;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario_4
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement element=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		element.sendKeys("iphone 14");
		element.submit();
		List<WebElement> pname=driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		Iterator<WebElement> itr=pname.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getText());
		}	
	}
}
