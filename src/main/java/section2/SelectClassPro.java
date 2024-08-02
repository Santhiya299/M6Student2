package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassPro 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		Thread.sleep(3000);
		WebElement gender =driver.findElement(By.xpath("//select[@id='select2']"));
		Select s=new Select(gender);
		Thread.sleep(3000);
		s.selectByIndex(2);
		Thread.sleep(3000);
		WebElement country=driver.findElement(By.xpath("//select[@id='select3']"));
		Select ss=new Select(country);
		Thread.sleep(3000);
		ss.selectByVisibleText("India");
		Thread.sleep(3000);
		
		WebElement state=driver.findElement(By.xpath("//select[@id='select5']"));
		Select sss=new Select(state);
		sss.selectByVisibleText("Tamil Nadu");
		Thread.sleep(3000);
		
		WebElement district=driver.findElement(By.xpath("//select[@id='select5']/../../following-sibling::div/div/select"));
		Select ssss=new Select(district);
		ssss.selectByVisibleText("Coimbatore");
		Thread.sleep(3000);
		
		
	}
}
