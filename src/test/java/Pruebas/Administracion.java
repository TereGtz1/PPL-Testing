package Pruebas;

import Paginas.Administracion.Clases.CrearUsuario;
import Paginas.Login.Clases.PaginaLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Administracion {
    WebDriver driver;
    PaginaLogin login;
    CrearUsuario addUser;

    String driverPath = "..\\\\Estructuras\\\\Drivers\\\\chromedriver.exe";
    String url = "http://35.89.243.252:81/#/action-3";

    @BeforeSuite
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeOptions options=new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(url);
        login = new PaginaLogin(driver);
        addUser = new CrearUsuario(driver);
    }


    //LOGIN
    @Test (priority = 0)
    public void irRegistroLogin() {
        login.enterEmail("admin@ibl.mx", "rootroot.");
    }

    //SELECCIONAR MODULO
    @Test(priority = 1)
    public void irTablero() throws InterruptedException {
        addUser.selectModulo();
    }

    //CREAR UNA ESTRUCTURA
    @Test(priority = 2)
    public void agregarAdmin () throws InterruptedException {
        addUser.addAdmin();

    }

    @Test (priority = 3)
    public void crearAdmin() throws InterruptedException {
        addUser.crearAdminP1();
        addUser.crearAdminP2();
        //addUser.crearAdminP3();
    }
}
