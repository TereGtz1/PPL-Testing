package Pruebas;

import Paginas.Login.Clases.PaginaLogin;
import Paginas.Rol.Clases.PaginaRol;
import Paginas.Rol.Clases.CrearRol;
import Paginas.Rol.Clases.EliminarRol;
import Paginas.Rol.Clases.ActualizarRol;
import Paginas.Rol.Clases.AdministrarUsuarios;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static Estructuras.Functions.esperar;
import static Estructuras.Functions.waitFor;


public class Rol {
    WebDriver driver;
    PaginaLogin login;
    PaginaRol rol;
    CrearRol createR;
    EliminarRol deleteR;
    ActualizarRol updateR;
    AdministrarUsuarios adminUser;
    Login generalLogin;

    String driverPath = "..\\\\Estructuras\\\\Drivers\\\\chromedriver.exe";
    String url = "http://35.89.243.252:81/#/action-3";

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
        rol = new PaginaRol(driver);
        createR = new CrearRol(driver);
        deleteR = new EliminarRol(driver);
        updateR = new ActualizarRol(driver);
        adminUser = new AdministrarUsuarios(driver);
    }

    //Realiza inicio de sesión
    @Test
    public void irRegistroLogin() {
        login.enterEmail("admin@ibl.mx", "rootroot.");
    }

    //Selecciona el modulo rol
    @Test(priority = 1)
    public void irRol() {
        rol.selectRol();
    }

    //Oculta la barra de navegacion
    @Test(priority = 2)
    public void ocultarNavBar(){
        rol.navBar();
    }

    /*
    //Test para eliminar rol
    @Test(priority = 3, enabled = false)
    public void eliminarRol() {
        deleteR.modalEliminar();
        deleteR.deleteRol();
    }

    //Test actualizar nombre del rol
    @Test(priority = 3, enabled = false)
    public void opcionesRol() {
        updateR.opciones("prueba2");
    }


    //test ver usuarios agregados al rol

    @Test(priority = 3, enabled = false)
    public void detalles() {
        adminUser.verDetalles(driver);
        adminUser.modalCapturista();
        adminUser.agregarUsuario();  //pendiente de seleccionar del dropdown usuarios, no funciona en la página
    }


    //test poder eliminar usuarios agregados al rol desde el modal
    @Test(priority = 3, enabled = false)
    public void detalles2() {
        adminUser.verDetalles(driver);
        adminUser.modalCapturista();
    }

    //test poder eliminar usuarios desde la card del rol

    @Test(priority = 3, enabled = false)
    public void detalles3() {
        esperar(1000);
        adminUser.verDetalles(driver);
        adminUser.eliminarUsuario();
    }


    //test para regresar al home
    @Test(priority = 4, enabled = false)
    public void goHome() {
        esperar(1000);
        rol.irHome();
    }
    */


    /*
    //Test para el cierre del navegador
    @AfterSuite
    public void cierreNavegador(){
        esperar(1000);
        driver.close();
    }*/


    //ESCENARIOS DE PRUEBA

    //Happy path crear rol con chek en miembros de estructuras.

    @Test(priority = 3)
    public void crearRol() {
        createR.openModal();
        waitFor(driver);
        createR.createRol("Prueba " + Math.floor(Math.random()*10), driver);
        waitFor(driver);
        rol.checkBox.click(); //checkbox para miembro de estructuras
        waitFor(driver);
        rol.permissions.click();
        Actions action = new Actions(driver);
        //action.dragAndDrop(from, to).build().perform();
        action.doubleClick(rol.from).build().perform();
        rol.btnGuardar.click();
    }


    //Happy path crear rol sin chek en miembros de estructuras.

    @Test(priority = 4, enabled = false)
    public void crearRol2() {
        createR.openModal();
        waitFor(driver);
        createR.createRol("Prueba " + Math.floor(Math.random()*10), driver);
        waitFor(driver);
        rol.permissions.click();
        Actions action = new Actions(driver);
        //action.dragAndDrop(from, to).build().perform();
        action.doubleClick(rol.from).build().perform();
        rol.btnGuardar.click();
    }



    //Escenario 1 crear rol solo asignando nombre

    @Test(priority = 5, enabled = false)
    public void escenario1(){
        createR.openModal();
        waitFor(driver);
        createR.createRol("Prueba " + Math.floor(Math.random()*10), driver);
        rol.btnGuardar.click();
    }


    //Escenario 2 crear rol sin asignar nombre

    @Test(priority = 6, enabled = false)
    public void escenario2(){
        createR.openModal();
        waitFor(driver);
        rol.btnGuardar.click();
        esperar(1000);
        String txtMsg = rol.msgIngresaNombre.getText();
        String msgEsperado = "¡Ingresa !";
        Assert.assertEquals(txtMsg, msgEsperado);
    }

    

    //Escenario 3 crear rol asignando nombre y permisos desde botón 1 click

    @Test(priority = 7, enabled = false)
    public void escenario3() {
        createR.openModal();
        waitFor(driver);
        createR.createRol("Prueba " + Math.floor(Math.random()*10), driver);
        waitFor(driver);
        rol.permissions.click();
        waitFor(driver);
        rol.btnGuardar.click();
    }


    //Escenario 4 crear rol sin nombre y permisos doble click

    @Test(priority = 8, enabled = false)
    public void escenario4() {
        createR.openModal();
        waitFor(driver);
        createR.createRol("Prueba " + Math.floor(Math.random()*10), driver);
        waitFor(driver);
        Actions action = new Actions(driver);
        //action.dragAndDrop(from, to).build().perform();
        action.doubleClick(rol.from).build().perform();
        rol.btnGuardar.click();
    }


    //Escenario 5 crear rol sin asignar nombre y con permisos 1 click

    @Test(priority = 9, enabled = false)
    public void escenario5() {
        createR.openModal();
        waitFor(driver);
        rol.permissions.click();
        rol.btnGuardar.click();
        esperar(1000);
        String txtMsg = rol.msgIngresaNombre.getText();
        String msgEsperado = "¡Ingresa !";
        Assert.assertEquals(txtMsg, msgEsperado);
    }


    //Escenario 6 crear rol con nombre, checkbox y sin permisos

    @Test(priority = 10, enabled = false)
    public void escenario6() {
        createR.openModal();
        waitFor(driver);
        createR.createRol("Prueba " + Math.floor(Math.random()*10), driver);
        waitFor(driver);
        rol.checkBox.click(); //checkbox para miembro de estructuras
        rol.btnGuardar.click();
    }

}
