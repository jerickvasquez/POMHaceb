package com.haceb.pages.registroExitosoPO;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegistroExitosoPageObject extends PageObject {

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Correo electrónico *']")
    public WebElementFacade textoCorreo;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Nombre *']")
    public WebElementFacade textoNombre;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Apellido *']")
    public WebElementFacade textoApellido;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Contraseña *']")
    public WebElementFacade textoClave;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Confirma la contraseña *']")
    public WebElementFacade textoClaveConfirmacion;

    @FindBy(how = How.XPATH, using = "//label[@for='gigya-checkbox-70031539084410860']/label[@class='gigya-required-display gigya-reset']")
    public WebElementFacade checkboxTerminos;

    @FindBy(how = How.XPATH, using = "//label[text() = 'Si Autorizo']")
    public WebElementFacade radioButtonAutorizo;

    @FindBy(how = How.XPATH, using = "//input[@value='REGISTRARME']")
    public WebElementFacade buttonRegistrarme;


}
