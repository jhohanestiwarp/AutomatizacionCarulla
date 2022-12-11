package com.carulla.StepDefinitions;


import com.carulla.Steps.PaginaPrincipalStep;
import com.carulla.Steps.ValidacionStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class LoginStepDefinitions {

    @Steps
    PaginaPrincipalStep paginaPrincipalStep;

    @Steps
    ValidacionStep validacionStep;


    @Dado("^que el usuario se encuentre en la pagina de la carulla$")
    public void queElUsuarioSeEncuentreEnLaPaginaDeLacarulla() {
        paginaPrincipalStep.AbrirNavegador();

    }


    @Cuando("^El ingrese con el usuario y la clave$")
    public void elIngreseConElUsuarioYLaClave() throws IOException {
        paginaPrincipalStep.cuenta();
        paginaPrincipalStep.ingresarDatos();

    }

    @Entonces("^El visualizara un mensaje de bienvenido\\(a\\)$")
    public void elVisualizaraUnMensajeDeBienvenidoA() throws IOException {
        validacionStep.validarIniciodesesion();

    }
}
