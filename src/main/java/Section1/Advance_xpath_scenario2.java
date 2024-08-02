package Section1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advance_xpath_scenario2
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement element=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		element.sendKeys("i phone 14");
		element.submit();
		List<WebElement> pnames= driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		Iterator<WebElement> i= pnames.iterator();
		
		List<WebElement> pprice=driver.findElements(By.xpath("//div[@class='KzDlHZ']/../following-sibling::div[@class='col col-5-12 BfVC2z']/div[@class='cN1yYO']/div[@class='hl05eU']/div[contains(@class,'Nx')]"))
		;
		Iterator<WebElement> ii= pprice.iterator();
		
		while(i.hasNext()&&ii.hasNext())
		{
			String name=i.next().getText();
			String price=ii.next().getText();
			System.out.println(name+"----->"+price);
		}
		
		
		
	}

	
}

