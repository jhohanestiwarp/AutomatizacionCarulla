package com.carulla.Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//se copia del gradle login.feature
@CucumberOptions(features = "src\\test\\resources\\features\\Agregaralcarrito.feature",
        tags = "@Agregaralcarrito",
        //se copia de la carpeta StepDefinitions
        glue = "com.carulla.StepDefinitions",
        snippets = SnippetType.CAMELCASE


)


public class AgregaralcarritoRunner {
}
