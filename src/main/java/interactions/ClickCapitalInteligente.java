package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomeEmpresas.CAPITAL_INTELIGENTE;
import static utils.constants.Constants.SESENTA;

public class ClickCapitalInteligente implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(CAPITAL_INTELIGENTE, WebElementStateMatchers.isVisible()).forNoMoreThan(SESENTA).seconds();
        actor.attemptsTo(Click.on(CAPITAL_INTELIGENTE));
    }
    public static ClickCapitalInteligente click(){return instrumented(ClickCapitalInteligente.class);}
}
