package tasks;

import interactions.CambiarDePestana;
import interactions.SitioViejo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AccederBancolombia implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SitioViejo.click());
        actor.attemptsTo(CambiarDePestana.cambiar());
    }
    public static AccederBancolombia acceder(){return instrumented(AccederBancolombia.class);}
}
