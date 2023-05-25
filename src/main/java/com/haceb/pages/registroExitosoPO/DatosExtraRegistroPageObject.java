package com.haceb.pages.registroExitosoPO;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DatosExtraRegistroPageObject extends PageObject {

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Ingrese su documento de identidad *']")
    public WebElementFacade textoCedula;

    @FindBy(how = How.XPATH, using = "//input[@value='Enviar']")
    public WebElementFacade buttonEnviar;

    @FindBy(how = How.XPATH, using = "//select[@id='gigya-dropdown-153944062160082270']")
    public WebElementFacade selectGenero;

    @FindBy(how = How.XPATH, using = "//input[@id='gigya-textbox-29430652596742216']")
    public WebElementFacade inputFecha;

    @FindBy(how = How.XPATH, using = "//select[@id='gigya-dropdown-92626747568210580']")
    public WebElementFacade selectDepartamento;

    @FindBy(how = How.XPATH, using = "//select[@id='gigya-dropdown-68670919361457840']")
    public WebElementFacade selectCiudad;

}
