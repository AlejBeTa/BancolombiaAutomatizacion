package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.NuevoSitio.URL_SITIOVIEJO;
import static utils.constants.Constants.SESENTA;

public class SitioViejo implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(URL_SITIOVIEJO, WebElementStateMatchers.isVisible()).forNoMoreThan(SESENTA).seconds();
        actor.attemptsTo(Click.on(URL_SITIOVIEJO));
    }
    public static SitioViejo click(){return instrumented(SitioViejo.class);}
}
