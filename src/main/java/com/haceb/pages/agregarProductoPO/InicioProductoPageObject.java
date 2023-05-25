package com.haceb.pages.agregarProductoPO;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class InicioProductoPageObject extends PageObject {

    @FindBy(how = How.XPATH, using = "//li/a[@class ='nav__link'][@role ='button']")
    public WebElementFacade buttonMenu;

    @FindBy(how = How.XPATH, using = "//ul[@class='cd-secondary-dropdown is-hidden']/div[@class='listItems-category']/li[@class='no-has-children']/a[starts-with(@href, '/refrigeracion/')]")
    public List<WebElementFacade> buttonRefrigeracion;

    @FindBy(how = How.XPATH, using = "//ul[@class='cd-secondary-dropdown is-hidden']/div[@class='listItems-category']/li[@class='no-has-children']/a[starts-with(@href, '/lavadoras')]")
    public List<WebElementFacade> buttonLavadoras;

    @FindBy(how = How.XPATH, using = "//ul[@class='cd-secondary-dropdown is-hidden']/div[@class='listItems-category']/li[@class='no-has-children']/a[starts-with(@href, '/cocina') or starts-with(@href, '/lavapla')]")
    public List<WebElementFacade> buttonCocina;

    @FindBy(how = How.XPATH, using = "//ul[@class='cd-secondary-dropdown is-hidden']/div[@class='listItems-category']/li[@class='no-has-children']/a[starts-with(@href, '/aires')]")
    public List<WebElementFacade> buttonAires;

    @FindBy(how = How.XPATH, using = "//ul[@class='cd-secondary-dropdown is-hidden']/div[@class='listItems-category']/li[@class='no-has-children']/a[starts-with(@href, '/calen')]")
    public List<WebElementFacade> buttonCalentadores;

    @FindBy(how = How.XPATH, using = "//li/a[starts-with(@class,'link-parent')]")
    public List<WebElementFacade> hoverCategoria;

}
