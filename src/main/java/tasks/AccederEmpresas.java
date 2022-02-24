package tasks;

import interactions.MenuEmpresas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AccederEmpresas implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MenuEmpresas.click());

    }

    public static AccederEmpresas acceder(){return instrumented(AccederEmpresas.class);}
}
