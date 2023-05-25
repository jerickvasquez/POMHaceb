package com.haceb.steps.agregarProductoSteps;

import com.haceb.pages.agregarProductoPO.InicioProductoPageObject;
import com.haceb.utils.Excel;
import com.haceb.utils.IndiceAleatorio;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class InicioProductoSteps {

    @Page
    InicioProductoPageObject inicioProductopageObject;

    @Step("Abrir navegador")
    public void abrirUrl() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Datos.xlsx", "Url");
        String url=data.get(0).get("Sitio Web");
        inicioProductopageObject.openUrl(url);
    }

    @Step("Click en el menu")
    public void clickMenu() {
        inicioProductopageObject.buttonMenu.waitUntilClickable().click();
    }

    @Step("Click en la categoria")
    public void clickCategoria() {

        int indiceDeLaCategoria = IndiceAleatorio.generarIndiceAleatorio(inicioProductopageObject.hoverCategoria.size() - 10) + 1;

        Actions actions = new Actions(inicioProductopageObject.getDriver());
        actions.moveToElement(inicioProductopageObject.hoverCategoria.get(indiceDeLaCategoria)).perform();

        int indiceRefrigeracion = IndiceAleatorio.generarIndiceAleatorio(inicioProductopageObject.buttonRefrigeracion.size());

        int indiceLavadoras = IndiceAleatorio.generarIndiceAleatorio(inicioProductopageObject.buttonLavadoras.size());

        int indiceCocina = IndiceAleatorio.generarIndiceAleatorio(inicioProductopageObject.buttonCocina.size());

        int indiceAires = IndiceAleatorio.generarIndiceAleatorio(inicioProductopageObject.buttonAires.size());

        int indiceCalentadores = IndiceAleatorio.generarIndiceAleatorio(inicioProductopageObject.buttonCalentadores.size());

        switch (inicioProductopageObject.hoverCategoria.get(indiceDeLaCategoria).getText()) {
            case "AIRES ACONDIONADOS":
                inicioProductopageObject.buttonAires.get(indiceAires).click();
                break;
            case "CALENTADORES":
                inicioProductopageObject.buttonCalentadores.get(indiceCalentadores).click();
                break;
            case "REFRIGERACIÓN":
                inicioProductopageObject.buttonRefrigeracion.get(indiceRefrigeracion).click();
                break;
            case "LAVADORAS":
                inicioProductopageObject.buttonLavadoras.get(indiceLavadoras).click();
                break;
            case "ELECTRODOMÉSTICOS DE COCINA":
                inicioProductopageObject.buttonCocina.get(indiceCocina).click();
                break;
            default:
                break;

        }
    }
}
