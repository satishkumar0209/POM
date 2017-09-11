package Agro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chrome {
static WebDriver driver;
@Test()	
public void validlogin() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\COMPAQ\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://lottery1.sia.co.in/#/signup");

	}

}
