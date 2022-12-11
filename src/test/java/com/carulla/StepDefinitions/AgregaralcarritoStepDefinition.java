package com.carulla.StepDefinitions;

import com.carulla.PageObject.PaginaValidacionPageObject;
import com.carulla.Steps.PaginaAgregaralcarritoStep;
import com.carulla.Steps.PaginaPrincipalStep;
import com.carulla.Steps.ValidacionStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import javax.imageio.IIOException;
import java.io.IOException;

public class AgregaralcarritoStepDefinition {
    @Steps
    PaginaPrincipalStep paginaPrincipalStep;
    @Steps
    PaginaAgregaralcarritoStep paginaAgregaralcarritoStep;
    @Steps

    ValidacionStep validacionStep;


    @Dado("^Que el usuario se encuetre en la plataforma de la carulla$")
    public void queElUsuarioSeEncuetreEnLaPlataformaDeLacarulla() {
        paginaPrincipalStep.AbrirNavegador();
    }


    @Cuando("^el usuario escoga el producto deseado$")
    public void elUsuarioEscogaElProductoDeseado() throws IOException {
       // paginaAgregaralcarritoStep.Novedades();
        paginaAgregaralcarritoStep.Buscar();
        paginaAgregaralcarritoStep.carullaEscogido();
        paginaAgregaralcarritoStep.Agregarcarrito();
        paginaAgregaralcarritoStep.Carritodecompras();


    }

    @Entonces("^Se visualizara que el producto fue agregado al carrito con exito$")
    public void seVisualizaraQueElProductoFueAgregadoAlCarritoConExito() throws IOException {
       validacionStep.validarMensaje();
    }

}
