package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomeCapitalInteligente.ACTUALIDAD_ECONOMICA;
import static utils.constants.Constants.SESENTA;

public class ClickActualidadEconomica implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(ACTUALIDAD_ECONOMICA, WebElementStateMatchers.isVisible()).forNoMoreThan(SESENTA).seconds();
        actor.attemptsTo(Click.on(ACTUALIDAD_ECONOMICA));
    }
    public static ClickActualidadEconomica click(){return instrumented(ClickActualidadEconomica.class);}
}
