package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ScenarioaAllConcepts 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---disable-notification");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin",Keys.TAB,"root",Keys.ENTER);
		boolean b=driver.findElement(By.xpath("//img[@src=\"themes/softed/images/Home.PNG\"]")).isDisplayed();
		System.out.println("Home Page is Visible or not(True/False)  -->"+b);
		driver.findElement(By.xpath("//a[text()='Leads'and@href='index.php?module=Leads&action=index']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Santhiya",Keys.TAB,Keys.TAB,"M",Keys.TAB,"9876543210",Keys.TAB,"Cognizant",Keys.TAB,"98754213",
				Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"santhiya29@gmail.com");
		//driver.findElement(By.xpath("//input[@id=\"mobile\"]")).sendKeys("9876543210",,);
		driver.findElement(By.xpath("//textarea[@name='lane']")).sendKeys("1/99,Dindigul,TamilNadu,624220",Keys.TAB,Keys.TAB,"624220",
				Keys.TAB,"Dindigul",Keys.TAB,"India",Keys.TAB,"TamilNadu");
		
		
		WebElement e1=driver.findElement(By.xpath("//select[@name='leadsource']"));
		Select  s=null;
		s=	new Select(e1);
		//System.out.println(s.isMultiple());
		s.selectByValue("Employee");
		Thread.sleep(4000);
		WebElement e2=driver.findElement(By.xpath("//select[@name='industry']"));
		s=new Select(e2);
		s.selectByValue("Banking");
		Thread.sleep(4000);
		WebElement e3=driver.findElement(By.xpath("//select[@name='leadstatus']"));
		s=new Select(e3);
		s.selectByValue("Contacted");
		Thread.sleep(4000);
		WebElement e4=driver.findElement(By.xpath("//select[@name='rating']"));
		s=new Select(e4);
		s.selectByValue("Active");
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//input[@title=\"Save [Alt+S]\"])[2]")).click();
		Thread.sleep(4000);
		//Alert az=driver.switchTo().alert();
		//System.out.println(az.getText());
		//az.dismiss();
		Actions ac=new Actions(driver);
		Thread.sleep(4000);
		WebElement ee2=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		ac.moveToElement(ee2).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		Thread.sleep(4000);		
	}

}
