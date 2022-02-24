package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeCapitalInteligente {
    public static final Target ACTUALIDAD_ECONOMICA = Target.the("Capital inteligente").located(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[2]/a"));
}
