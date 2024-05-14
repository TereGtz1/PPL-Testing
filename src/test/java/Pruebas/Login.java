package Pruebas;

import Paginas.Login.Clases.PaginaLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	PaginaLogin login;

	String driverPath = "..\\\\PPL\\\\Drivers\\\\chromedriver.exe";
	String url = "http://38.65.139.14:3000/#/action-3";

	@BeforeSuite
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", driverPath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		driver = new ChromeDriver( options);
		driver.manage().window().maximize();
		driver.get( url);
		login = new PaginaLogin(driver);
	}

	@Test(priority = 0)
	public void irRegistroLogin() {

		login.enterEmail("admin@ibl.mx", "rootroot.");
	}
}
