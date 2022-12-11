package com.carulla.PageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaValidacionPageObject extends PageObject {
    By msjValidacionproducto = By.xpath("//div[contains(text(),'Tu carrito de compras')]");
    By msjValidacioniniciodesesion = By.xpath("//div[contains(text(),'Hola')]");

    public By getMsjValidacionproducto() {
        return msjValidacionproducto;
    }

    public By getMsjValidacioniniciodesesion() {
        return msjValidacioniniciodesesion;
    }
}
