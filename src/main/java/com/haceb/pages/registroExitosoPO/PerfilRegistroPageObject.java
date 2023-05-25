package com.haceb.pages.registroExitosoPO;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PerfilRegistroPageObject extends PageObject {

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Nombre *']")
    public WebElementFacade labelName;

}
