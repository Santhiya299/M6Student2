package Section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTittleUrlSrcCode
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");

	String expectedTittle="OrangeHRM";
	String expectedURL = "https://www.orangehrm.com/";
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.orangehrm.com/en/");
	String CurrentWebPageTittle = driver.getCurrentUrl();
	String CurrentPageurl = driver.getPageSource();
	String Srccode = driver.getPageSource();
	System.out.println(CurrentWebPageTittle );
	System.out.println(CurrentPageurl);
	System.out.println(Srccode);
	
	if(CurrentPageurl.contains(expectedURL) ||  CurrentWebPageTittle .contains(expectedTittle)	)	
			System.out.println("pass");
	else
		System.out.println("Fail");
	}
	
}
