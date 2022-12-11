package com.carulla.Steps;

import com.carulla.PageObject.PaginaAgregaralcarritoPageObject;
import com.carulla.PageObject.PaginaPrincipalPageObject;
import com.carulla.PageObject.PaginaValidacionPageObject;
import com.carulla.Utils.DatosExcelListas;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ValidacionStep {

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();

    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();
    PaginaAgregaralcarritoPageObject paginaAgregaralcarritoPageObject = new PaginaAgregaralcarritoPageObject();
    PaginaValidacionPageObject paginaValidacionPageObject = new PaginaValidacionPageObject();


    @Step
    public void validarMensaje() throws IOException {

        Assert.assertThat(paginaPrincipalPageObject.getDriver().findElement(paginaValidacionPageObject.getMsjValidacionproducto())
                .isDisplayed(), Matchers.is(true));
    }

    @Step
    public void validarIniciodesesion() throws IOException {
        leerExcel = DatosExcelListas.readExcel("DatosListaIniciodeSesion.xlsx", "Informacion");
        String Verificacion = paginaPrincipalPageObject.getDriver().findElement(paginaValidacionPageObject.getMsjValidacioniniciodesesion())
                .getText();
        Assert.assertEquals("Hola, " + leerExcel.get(0).get("Verificacion"), Verificacion);


    }

}
