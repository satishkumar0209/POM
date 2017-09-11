package Agro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_page 

{

WebDriver driver;

By username=By.xpath("//*[@id='myId']/app-root/div[1]/div/app-header/div[3]/div[1]/div[2]/form/div/div[1]/input");
By password=By.xpath("//*[@id='myId']/app-root/div[1]/div/app-header/div[3]/div[1]/div[2]/form/div/div[2]/input");
By Login=By.xpath("");

public Login_page(WebDriver driver)
{
	this.driver=driver;	
}

public void logintoagro(String uid,String pass)
{
	driver.findElement(username).sendKeys(uid);
	driver.findElement(password).sendKeys(pass);
	driver.findElement(Login).click();
}


public void email(String uid)
{
	driver.findElement(username).sendKeys(uid);
}
public void pwd(String pass)
{
	driver.findElement(username).sendKeys(pass);
}
public void loginbutton()
{
	driver.findElement(username).click();
}
public void Chromedriver()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\COMPAQ\\Desktop\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://lottery1.sia.co.in/#/signup");
}



}
