package co.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.banistmo.ui.PaginarReporte.BTN_DESCARGAR_PDF;

public class DescargarReporte implements Task {

    public static DescargarReporte ahora() {
        return new DescargarReporte();
    }

    @Override
    @Step("{0} descarga el informe en PDF")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_DESCARGAR_PDF)
        );
    }
}
