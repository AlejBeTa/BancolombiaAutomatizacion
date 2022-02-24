package tasks;

import interactions.CambiarDePestana;
import interactions.ClickActualidadEconomica;
import interactions.ClickCapitalInteligente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AccederActualidadEconomica implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickActualidadEconomica.click());
        actor.attemptsTo(CambiarDePestana.cambiar());
    }
    public static AccederActualidadEconomica acceder(){return instrumented(AccederActualidadEconomica.class);}
}
