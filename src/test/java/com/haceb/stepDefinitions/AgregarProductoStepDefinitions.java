package com.haceb.stepDefinitions;

import com.haceb.steps.agregarProductoSteps.AgregarProductoSteps;
import com.haceb.steps.agregarProductoSteps.DetalleProductoSteps;
import com.haceb.steps.agregarProductoSteps.InicioProductoSteps;
import com.haceb.utils.EsperaImplicita;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class AgregarProductoStepDefinitions {

    @Steps
    AgregarProductoSteps agregarProductoSteps;

    @Steps
    InicioProductoSteps inicioProductoSteps;

    @Steps
    DetalleProductoSteps detalleProductoSteps;


    @Dado("que el usuario abra el navegador en la urL")
    public void queElUsuarioAbraElNavegadorEnLaUrl() throws IOException {
        inicioProductoSteps.abrirUrl();
    }

    @Cuando("el usuario de click en el menú categorias")
    public void elUsuarioDeClickEnElMenúCategorias() {
        inicioProductoSteps.clickMenu();
    }

    @Cuando("seleccione una categoría y de click en una subcategoria")
    public void seleccioneUnaCategoría() {
        inicioProductoSteps.clickCategoria();
        EsperaImplicita.esperaImplicita(2);
    }
    @Cuando("seleccione un producto")
    public void seleccioneUnProducto() {
        agregarProductoSteps.clickProducto();
    }

    @Cuando("de click en comprar")
    public void deClickEnComprar() {
        detalleProductoSteps.clickComprarProducto();
    }

    @Entonces("el usuario podra visualizar el producto agregado en el carrito de compras")
    public void elUsuarioPodraVisualizarElProductoAgregadoEnElCarritoDeCompras() {
        detalleProductoSteps.VisualizarProductoEnCarrito();
    }


}
