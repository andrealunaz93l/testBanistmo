package co.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class PaginaReporte implements Task {

        private final String url;

    public PaginaReporte(String url) {
            this.url = url;
        }

        public static PaginaReporte en(String url) {
            return new PaginaReporte(url);
        }

        @Override
        @Step("{0} abre directamente la página del informe OPEP+")
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Open.url(url));
        }
    }

