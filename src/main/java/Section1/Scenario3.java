package Section1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class  Scenario3
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");
			
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
	 WebDriver driver =new ChromeDriver() ;
	 driver.manage().window().maximize();
	 driver.get("https://www.myntra.com/");
	 WebElement element=driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
	 element.sendKeys("Shoes");
	 element=driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']"));
	 Thread.sleep(3000);

	 element.click();
	 element=driver.findElement(By.xpath("//label[text()='Women']"));
	 element.click();
	 List<WebElement> ppname=driver.findElements(By.xpath("//h3[@class='product-brand']"));
	 List<WebElement> pprice=driver.findElements(By.xpath("//h3[@class='product-brand']/../h4[@class='product-sizes']/following-sibling::div[@class='product-price']/span/span[@class='product-discountedPrice']"))
	;
	 Thread.sleep(3000);

	 Iterator<WebElement> i=ppname.iterator();
	 Iterator<WebElement> ii= pprice.iterator();
	 Thread.sleep(3000);

		while(i.hasNext()&&ii.hasNext())
		{
			String name=i.next().getText();
			String price=ii.next().getText();
			System.out.println(name+"----->"+price);
		}
		

	}
}
