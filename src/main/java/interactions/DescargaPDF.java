package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import tasks.AccederReporte;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.ReporteOPEP.PDF;
import static utils.constants.Constants.SESENTA;

public class DescargaPDF implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(PDF, WebElementStateMatchers.isClickable()).forNoMoreThan(SESENTA).seconds();
        actor.attemptsTo(Click.on(PDF));
    }
    public static DescargaPDF click(){return instrumented(DescargaPDF.class);}
}

