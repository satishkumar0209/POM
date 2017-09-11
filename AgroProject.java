package Agro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AgroProject extends chrome

{


@Test()
public void login()

{
	validlogin();
	
	Login_page login=new Login_page(driver);
	
	login.logintoagro("admin@gmail.com", "password");	
}
}
