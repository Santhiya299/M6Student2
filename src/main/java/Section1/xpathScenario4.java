package Section1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathScenario4 
{
	static WebElement element=null;
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		element=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		element.sendKeys("i phone 14");
		element.submit();
		List<WebElement> option=driver.findElements(By.xpath("//span[text()='Add to Compare']"));
		Thread.sleep(3000);
		for(int i=0;i<=option.size()-1;i++)
		{
			option.get(i).click();
		}
		
	}
}
