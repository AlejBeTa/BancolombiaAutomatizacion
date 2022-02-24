package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class HomeActualidadEconomica {
    public static Target REPORTE;
    public static final Target VER_MAS = Target.the("Ver más reportes").located(By.id("verMas"));

    public static void NOMBRE_REPORTE(int fila){
        REPORTE=Target.the("Nombre del reporte").located(By.xpath("//*[@id='capital_inteligente']/div[1]/div["+fila+"]/div[2]/h2/a"));
    }
}
