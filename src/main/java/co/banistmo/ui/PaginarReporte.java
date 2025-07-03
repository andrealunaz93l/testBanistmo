package co.banistmo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginarReporte {

    public static final Target BTN_DESCARGAR_PDF = Target.the("Botón para descargar el informe PDF")
            .located(By.xpath("//*[@id=\"main-content\"]/div[2]/div[1]/div/div[1]/p[15]/a"));
}

