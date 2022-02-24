package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.HomeActualidadEconomica;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomeActualidadEconomica.REPORTE;
import static userinterfaces.HomeActualidadEconomica.VER_MAS;
import static utils.constants.Constants.*;

public class BuscarReporte implements Interaction {
    private String reporte=NOMBRE_REPORTE;
    private HomeActualidadEconomica cambiarReporte;
    private int reporteActual=UNO;
    private boolean reporteVisible;

    public void BuscarReporte (){this.reporte=NOMBRE_REPORTE;reporteActual=UNO;cambiarReporte.NOMBRE_REPORTE(reporteActual); reporteVisible=FALSE;}
    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(VER_MAS, WebElementStateMatchers.isVisible()).forNoMoreThan(SESENTA).seconds();
        while(TRUE){
            for (int i = CERO; i < NUEVE; i++) {
                reporteActual=reporteActual+i;
                cambiarReporte.NOMBRE_REPORTE(reporteActual);
                WaitUntil.the(REPORTE, WebElementStateMatchers.isVisible()).forNoMoreThan(SESENTA).seconds();
                if(REPORTE.resolveFor(actor).getText().equals(reporte)){
                    reporteVisible=TRUE;
                    break;
                }
                else{
                    actor.attemptsTo(Click.on(VER_MAS));
                    reporteActual++;

                }
            }
            if (reporteVisible){
                break;
            }

        }


    }
    public static BuscarReporte buscar(){
        return instrumented(BuscarReporte.class);}
}
