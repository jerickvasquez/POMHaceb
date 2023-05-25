package com.haceb.steps.registroExitosoSteps;

import com.haceb.pages.registroExitosoPO.PerfilRegistroPageObject;
import com.haceb.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class PerfilRegistroSteps {

    @Page
    PerfilRegistroPageObject perfilRegistroPageObject;

    @Step("Verificar correo")
    public void verificarCorreo(){
        EsperaImplicita.esperaImplicita(7);
        Assert.assertThat(
                "La respuesta: ",
                perfilRegistroPageObject.labelName.isDisplayed(),
                Matchers.is(true)
        );

    }

}
