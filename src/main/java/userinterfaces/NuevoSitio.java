package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NuevoSitio {
    public static final Target URL_SITIOVIEJO = Target.the("Link sitio viejo").located(By.xpath("//*[@id='layoutContainers']/div/div[2]/div/div[4]/section/div[3]/section/div/div/div/div[1]/p/a"));
}
