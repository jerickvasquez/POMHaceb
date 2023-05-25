package com.haceb.pages.registroExitosoPO;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
public class PaginaInicioPageObject extends PageObject {
    @FindBy(how = How.XPATH, using = "//span[@class='icon-user']")
    public WebElementFacade buttonPerfil;

    @FindBy(how = How.XPATH, using = "//a[@class='cdc-fire cdc-register']")
    public WebElementFacade buttonRegistrar;

    @FindBy(how = How.XPATH, using = "//button[@id='vtexIdUI-custom-oauth']")
    public WebElementFacade buttonIngresar;

}
