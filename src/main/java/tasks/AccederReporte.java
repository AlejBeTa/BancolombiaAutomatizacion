package tasks;

import interactions.BuscarReporte;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomeActualidadEconomica.REPORTE;

public class AccederReporte implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(BuscarReporte.buscar());
        actor.attemptsTo(Click.on(REPORTE));
    }
    public static AccederReporte acceder(){return instrumented(AccederReporte.class);}
}
