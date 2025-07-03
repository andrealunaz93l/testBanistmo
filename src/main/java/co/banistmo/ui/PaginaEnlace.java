package co.banistmo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaEnlace {
    public static final Target LNK_ACTUALIDAD_ECONOMICA = Target.the("Enlace Actualidad Económica")
            .located(By.xpath("//a[contains(text(),'Actualidad económica')]"));

    public static final Target LNK_REPORTE_OPEP = Target.the("Reporte OPEP+ julio 2021")
            .located(By.xpath("//a[contains(text(),'OPEP+ aumentará la oferta de petróleo')]"));
}

