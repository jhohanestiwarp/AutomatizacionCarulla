package com.carulla.PageObject;

import org.openqa.selenium.By;

public class PaginaAgregaralcarritoPageObject {
    By txtBuscar= By.xpath("//header//input[@formcontrolname='buscar']");

    By btnBuscar= By.xpath("//header//a[@href='/categoria/carullas/busqueda/carullas/LA%20REINA%20SU%20VIDA%20']");
    By btnvernovedades = By.xpath("//a[contains(text(),'Ver todas las novedades')]");

    By btnocultarfiltros= By.xpath("//span[contains(text(),'Ocultar Filtros')]");
    By btncarullareina = By.xpath("//a[contains(text(),'LA REINA SU VIDA')]");

    By btnChew = By.xpath("//a[contains(text(),' CHEW INTEGRAL 1 ')]");

    By btnAgregaralcarrito = By.xpath("//button[contains(text(),'Añadir al carrito')]");

    By btnVerCarritodeCompras = By.xpath("//button[contains(text(),'Ver Carrito de Compras')]");



    public By getTxtBuscar() {
        return txtBuscar;
    }

    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getBtnvernovedades() {
        return btnvernovedades;
    }

    public By getBtnocultarfiltros() {
        return btnocultarfiltros;
    }

    public By getBtncarullareina() {
        return btncarullareina;
    }

    public By getBtnChew() {
        return btnChew;
    }

    public By getBtnAgregaralcarrito() {
        return btnAgregaralcarrito;
    }

    public By getBtnVerCarritodeCompras() {
        return btnVerCarritodeCompras;
    }

}
