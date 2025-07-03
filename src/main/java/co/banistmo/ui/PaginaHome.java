package co.banistmo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaHome {

    public static final Target BTN_CORPORATIVOS = Target.the("Botón Corporativos")
            .located(By.xpath("//a[contains(text(), 'Corporativos')]"));

    public static final Target LNK_CAPITAL_INTELIGENTE = Target.the("Enlace Capital Inteligente")
            .located(By.xpath("//a[contains(text(), 'Capital Inteligente')]"));
}

