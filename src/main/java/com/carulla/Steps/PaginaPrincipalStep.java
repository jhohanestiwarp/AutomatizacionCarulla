package com.carulla.Steps;

import com.carulla.PageObject.PaginaPrincipalPageObject;
import com.carulla.Utils.DatosExcelListas;
import com.carulla.Utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class PaginaPrincipalStep {

    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();
    EsperaImplicita espera = new EsperaImplicita();


    @Step

    public void AbrirNavegador() {
        paginaPrincipalPageObject.open();
    }


    @Step
    public void cuenta() throws IOException {

        // leerExcel= DatosExcelListas.readExcel("DatosListaIniciodeSesion.xlsx","Informacion");
        //paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtBuscar())
        //              .sendKeys(leerExcel.get(0).get("Mi cuenta"));


        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtncuenta())
                .click();
        espera.esperaImplicita(2);
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnIniciarSesion())
                .click();
        espera.esperaImplicita(3);


        //paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getHlkMicuenta()).click();

        //paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnVertodosloscarullas()).click();


        //espera.esperaImplicita(1);
    }

    @Step
    public void ingresarDatos() throws IOException {
        leerExcel = DatosExcelListas.readExcel("DatosListaIniciodeSesion.xlsx", "Informacion");

        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnMailyclave())
                .click();
        espera.esperaImplicita(2);

        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtUsuario())
                .sendKeys(leerExcel.get(0).get("Inicio de Sesion"));

        espera.esperaImplicita(1);

        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtClave())
                .sendKeys(leerExcel.get(1).get("Inicio de Sesion"));

        espera.esperaImplicita(1);

        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnIngresar())
                .click();

        espera.esperaImplicita(7);
    }


}
