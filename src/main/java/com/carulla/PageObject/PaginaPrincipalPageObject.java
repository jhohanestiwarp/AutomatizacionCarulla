package com.carulla.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://carulla.com/")
public class PaginaPrincipalPageObject extends PageObject {
    By btncuenta = By.xpath("//header//button[contains(text(),'Mi cuenta')]");
    By btnIniciarSesion = By.xpath("//header//a[contains(text(),'Iniciar Sesión')]");

    By btnMailyclave = By.xpath("//div[contains(text(),' Ingresar con Mail y contraseña ')]");

    By txtUsuario = By.xpath("//input[@name='usuario']");

    By txtClave = By.xpath("//input[@name='contrasena']");

    By btnIngresar = By.xpath("//button[contains(text(),'Iniciar sesión')]");

    public By getBtncuenta() {
        return btncuenta;
    }

    public By getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public By getBtnMailyclave() {
        return btnMailyclave;
    }

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnIngresar() {
        return btnIngresar;
    }
}
