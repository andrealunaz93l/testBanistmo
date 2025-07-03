package co.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.banistmo.ui.PaginaEnlace.LNK_ACTUALIDAD_ECONOMICA;
import static co.banistmo.ui.PaginaHome.BTN_CORPORATIVOS;
import static co.banistmo.ui.PaginaHome.LNK_CAPITAL_INTELIGENTE;

public class AbrirEnlace implements Task {

    public static AbrirEnlace enElMenu() {
        return new AbrirEnlace();
    }

    @Override
    @Step("{0} navega hasta la sección Capital Inteligente")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CORPORATIVOS),
                Click.on(LNK_CAPITAL_INTELIGENTE),
                Click.on(LNK_ACTUALIDAD_ECONOMICA)
        );
    }
}