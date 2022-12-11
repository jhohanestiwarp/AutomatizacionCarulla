package com.carulla.Steps;

import com.carulla.PageObject.PaginaAgregaralcarritoPageObject;
import com.carulla.PageObject.PaginaPrincipalPageObject;
import com.carulla.Utils.DatosExcelListas;
import com.carulla.Utils.EsperaImplicita;
import com.carulla.Utils.Scroll;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class PaginaAgregaralcarritoStep {

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();
    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();
    PaginaAgregaralcarritoPageObject paginaAgregaralcarritoPageObject = new PaginaAgregaralcarritoPageObject();
    EsperaImplicita esperaImplicita = new EsperaImplicita();
    Scroll scroll = new Scroll();

    @Step
    public void Novedades() throws IOException {


      /*  paginaPrincipalPageObject.getDriver().findElement(paginaAgregaralcarritoPageObject.getBtnvernovedades())
                .click();
        esperaImplicita.esperaImplicita(3);

        scroll.scrollElemento(paginaPrincipalPageObject.getDriver(), paginaAgregaralcarritoPageObject.getBtnChew());
        esperaImplicita.esperaImplicita(2);*/

    }

    @Step
    public void Buscar()throws IOException{
        leerExcel= DatosExcelListas.readExcel("DatosListaIniciodeSesion.xlsx","Infocarullas");
        paginaPrincipalPageObject.getDriver().findElement(paginaAgregaralcarritoPageObject.getTxtBuscar())
                .sendKeys(leerExcel.get(0).get("Nombre del carulla"));
        esperaImplicita.esperaImplicita(2);

        paginaPrincipalPageObject.getDriver().findElement(paginaAgregaralcarritoPageObject.getBtnBuscar())
                .click();

        esperaImplicita.esperaImplicita(3);
        scroll.scrollElemento(paginaPrincipalPageObject.getDriver(), paginaAgregaralcarritoPageObject.getBtnocultarfiltros());


    }

    @Step
    public void carullaEscogido() throws IOException {
        paginaPrincipalPageObject.getDriver().findElement(paginaAgregaralcarritoPageObject.getBtncarullareina())
                .click();
        esperaImplicita.esperaImplicita(5);
    }

    @Step
    public void Agregarcarrito() throws IOException {
        paginaPrincipalPageObject.getDriver().findElement(paginaAgregaralcarritoPageObject.getBtnAgregaralcarrito())
                .click();
        esperaImplicita.esperaImplicita(5);
    }

    @Step
    public void Carritodecompras() throws IOException {
        paginaPrincipalPageObject.getDriver().findElement(paginaAgregaralcarritoPageObject.getBtnVerCarritodeCompras())
                .click();
        esperaImplicita.esperaImplicita(3);
    }


}
