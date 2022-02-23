package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomeViejo.EMPRESAS;
import static utils.constants.Constants.SESENTA;

public class MenuEmpresas implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(EMPRESAS, WebElementStateMatchers.isVisible()).forNoMoreThan(SESENTA).seconds();
        actor.attemptsTo(Click.on(EMPRESAS));
    }
    public static MenuEmpresas click(){return instrumented(MenuEmpresas.class);}
}
