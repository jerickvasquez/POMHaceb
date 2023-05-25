package com.haceb.pages.agregarProductoPO;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class AgregarProductoPageObject extends PageObject{

    @FindBy(how = How.XPATH, using = "//span[text() = 'Ver producto']")
    public List<WebElementFacade> buttonProducto;

}
