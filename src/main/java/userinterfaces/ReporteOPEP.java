package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReporteOPEP {
    public static final Target PDF = Target.the("Descarga de pdf").located(By.xpath("//*[@id='main-content']/div[2]/div[1]/div/div[1]/p[15]/a"));
}
