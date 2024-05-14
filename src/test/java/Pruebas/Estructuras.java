package Pruebas;

import Paginas.Estructuras.Componentes.*;
import Paginas.Estructuras.Clases.*;
import Paginas.Login.Clases.PaginaLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import static Estructuras.Functions.*;

public class Estructuras {

	WebDriver driver;
	PaginaLogin login;
	PaginaEstructuras estructuras;
	//Salir SalirM;
	CrearEstructuras crearestructuras;
	EliminarEstructura eliminarestructuras;
	EditarEstructuras editar;
	AgregarSubEstructuras SubEstructuras;
	MoverEstructuras Mover;
	VerMas VerMas;

	String driverPath = "..\\\\Estructuras\\\\Drivers\\\\chromedriver.exe";
	String url = "http://35.89.243.252:81/#/action-3";

	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
		login = new PaginaLogin(driver);
		estructuras = new PaginaEstructuras(driver);
		crearestructuras = new CrearEstructuras(driver);
		eliminarestructuras = new EliminarEstructura(driver);
		//SalirM = new Salir(driver);
		editar = new EditarEstructuras(driver);
		SubEstructuras = new AgregarSubEstructuras(driver);
		Mover = new MoverEstructuras(driver);
		VerMas = new VerMas(driver);
	}

	@Test(priority = 0 ) //LOGIN
	public void irRegistroLogin() {
		login.enterEmail("admin@ibl.mx", "rootroot.");
		esperar(2000); 
	}

	@Test(priority = 1) //ENTRAR_MODULO_ESTRUCTURAS
	public void irToEstructure() {
		estructuras.selectTablero();
		esperar(2000); 
	}

	@Test(priority = 2, enabled = false) //CREAR_UNA_ESTRUCTURA
	public void crearEstructuras() {
		System.out.println("Iniciando el método crear");
		crearestructuras.openModal();
		crearestructuras.modalsendInfo("Prueba05", "587");
		esperar(2000); 
		System.out.println("Terminado el método crear");
	}

	@Test(priority = 3, enabled = false) //AGREGAR_SUB_ESTRUCTURAS
	public void SubEstructuras() {
		System.out.println("Iniciando el método crear sub");
		SubEstructuras.selectTablero();
		SubEstructuras.mandardatos("Sub1", "333");
		esperar(3000);
		System.out.println("Termianado el método crear sub");
	}

	@Test(priority = 4, enabled = false) //EDITAR_ESTRUCTURAS
	public void editar() {
		System.out.println("Iniciando el método editar");
		editar.selectTablero();
		editar.mandardatos("TEST", "876");
		esperar(2000); 
		System.out.println("Terminando el método editar");
	}

	@Test(priority = 5, enabled = false) //MOVER_ESTRUCTURAS
	public void MoverEstructura() {
		System.out.println("Iniciando el método mover");
		Mover.openModal();
		Mover.modalsendInfo();
		esperar(2000); 
		System.out.println("Terminando el método mover");
	}

	@Test(priority = 6, enabled = false) //ELIMINAR_UNA_ESTRUCTURA
	public void eliminarEstructuras() {
		System.out.println("Iniciando el método eliminar");
		eliminarestructuras.openModale();
		eliminarestructuras.eliminar();
		System.out.println("Fin del método eliminar");
	}

	@Test(priority = 7) //ELIMINAR_UNA_ESTRUCTURA
	public void VerMas() {
		System.out.println("Iniciando el método vermas");
		VerMas.open();
		System.out.println("Fin del método vermas");
	}

}
