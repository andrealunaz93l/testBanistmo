package co.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.banistmo.ui.PaginaEnlace.LNK_REPORTE_OPEP;

public class SeleccionReporte implements Task {

    public static SeleccionReporte SeleccionReporte() {
        return new SeleccionReporte();
    }

    @Override
    @Step("{0} selecciona el reporte de la OPEP")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_REPORTE_OPEP)
        );
    }
}
