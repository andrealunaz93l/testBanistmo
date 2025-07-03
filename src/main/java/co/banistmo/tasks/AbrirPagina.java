package co.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;


public class AbrirPagina implements Task {

    private final String url;

    public AbrirPagina(String url) {
        this.url = url;
    }

    public static AbrirPagina desde(String url) {
        return new AbrirPagina(url);
    }

    @Override
    @Step("{0} abre la página de inicio #url")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }
}