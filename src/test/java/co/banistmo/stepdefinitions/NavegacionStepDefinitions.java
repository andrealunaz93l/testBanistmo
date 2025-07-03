package co.banistmo.stepdefinitions;

import co.banistmo.questions.ValidarPDF;
import co.banistmo.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.Matchers.is;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class NavegacionStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    Actor andrea = Actor.named("Andrea");

    @Before
    public void configurarActor() {
        WebDriverManager.chromedriver().setup();
        andrea.can(BrowseTheWeb.with(navegador));
    }

    @Dado("que el usuario accede a la pagina de personas de Bancolombia")
    public void abrirPagina() {
        andrea.attemptsTo(
                AbrirPagina.desde("https://www.bancolombia.com/personas")
        );
    }

    @Cuando("accede directamente al informe de la OPEP+")
    public void accederDirectamente() {
        andrea.attemptsTo(
                PaginaReporte.en("https://www.bancolombia.com/empresas/capital-inteligente/actualidad-economica-sectorial/sector-petroleo/opep-aumentara-oferta-petroleo-julio-2021")
        );
    }

    @Cuando("descarga el informe en PDF")
    public void descargarPDF() {
        andrea.attemptsTo(
                DescargarReporte.ahora()
        );
    }

    @Entonces("valida que el PDF descargado es el correcto")
    public void validarContenidoPDF() {
        andrea.should(
                seeThat(ValidarPDF.contieneTextoEsperado("Tu pago esta Aprobado"), is(true))
        );
    }
}

