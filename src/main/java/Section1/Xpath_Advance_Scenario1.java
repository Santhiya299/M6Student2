package Section1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Advance_Scenario1 
{
	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement element=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		element.sendKeys("i phone 14");
		element.submit();
		Thread.sleep(3000);
		List<WebElement> ee=driver.findElements(By.xpath("//div[text()='Apple iPhone 14 (Blue, 128 GB)']/../following-sibling::"
	+ "div[@class='col col-5-12 BfVC2z']/div[contains(@class,'cN')]/div[@class='hl05eU']/div[contains(@class,'Nx')]"));
		Iterator<WebElement> name = ee.iterator();
		while(name.hasNext())
		{
			System.out.println(name.next().getText());
		}
		
	}
}
/*    //div[text()='Apple iPhone 14 (Blue, 128 GB)']/../following-sibling::
div[@class='col col-5-12 BfVC2z']/div[@class='cN1yYO']/div[@class='hl05eU']/div[@class='Nx9bqj _4b5DiR'];

//div[text()='Apple iPhone 14 (Blue, 128 GB)']/../following-sibling::
div[contains(@class,'col')]/div[@class='cN1yYO']/div[@class='hl05eU']/div[@class='Nx9bqj _4b5DiR']   */