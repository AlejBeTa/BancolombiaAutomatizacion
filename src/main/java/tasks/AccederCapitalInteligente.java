package tasks;

import interactions.CambiarDePestana;
import interactions.ClickCapitalInteligente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AccederCapitalInteligente implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickCapitalInteligente.click());
        actor.attemptsTo(CambiarDePestana.cambiar());
    }
    public static AccederCapitalInteligente acceder(){return instrumented(AccederCapitalInteligente.class);}
}
