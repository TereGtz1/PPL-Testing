package Paginas.Administracion.Clases;

import Paginas.Administracion.Componentes.ComponentAdmin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.Random;

import static Estructuras.Functions.*;

public class CrearUsuario  extends ComponentAdmin{

    public CrearUsuario(WebDriver driver) {PageFactory.initElements( new AjaxElementLocatorFactory(driver, 20), this);}

    public void selectModulo() throws InterruptedException {
        mEstructuras.click();
        Thread.sleep(2000);
    }

    public void addAdmin() {
        addAdmin.click();
    }

    public void crearAdminP1() throws InterruptedException {
        rolPrivil.click();
        esperar(1000);

        WebElement option = rolPrivil.findElement(By.xpath("//div//li[text()='coordinador de casilla']"));
        option.click();

        noID.sendKeys(" " + getDecimalRandomNumber());

        department.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement option2 = department.findElement(By.xpath("//div//li[text()='ventas']"));
        option2.click();

        btnSiguientep1.click();
    }

    public int getDecimalRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(9999 - 0 + 1);
    }

    public void crearAdminP2() {
        txtName.clear();
        txtName.sendKeys("Prueba");

        txtLastName.clear();
        txtLastName.sendKeys("prueba1");

        txtSecondLastName.clear();
        txtSecondLastName.sendKeys("prueba2");

        txtEmail.clear();
        txtEmail.sendKeys("micorreo" + getDecimalRandomNumber() + "@correo.com");

        optionGender.click();
        esperar(1000);
        WebElement option2 = optionGender.findElement(By.xpath("//div//li[text()='FEMENINO']"));
        option2.click();

        txtNumber.clear();
        txtNumber.sendKeys("" + getDecimalRandomNumber2());

        curp.clear();
        curp.sendKeys("prueba123456789012");

        btnSiguientep2.click();

    }

    public int getDecimalRandomNumber2() {
        double fiveDigits = 1000000000 + Math.random() * 900000000;
        return (int) fiveDigits;
    }

    public void crearAdminP3() throws InterruptedException {

        Thread.sleep(2000);
        txtColonia.clear();
        txtColonia.sendKeys("Observatorio");
        /*txtCode.clear();
        txtCode.sendKeys("" + getDecimalRandomNumber3());
        txtExtNumber.clear();
        txtExtNumber.sendKeys("");
        txtIntNumber.clear();
        txtIntNumber.sendKeys("" + getDecimalRandomNumber3());

        }
        public int getDecimalRandomNumber3() {
        double fiveDigits = 100 + Math.random() * 90;
        return (int) fiveDigits;
        }*/
    }
}
