package tasks;

import interactions.CambiarDePestana;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import interactions.DescargaPDF;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DescargarPDF  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(DescargaPDF.click());
        actor.attemptsTo(CambiarDePestana.cambiar());
    }
    public static DescargarPDF descargar(){return instrumented(DescargarPDF.class);}
}
