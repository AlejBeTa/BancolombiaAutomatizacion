package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import utils.pdf.LeerPDF;

public class VerificarPDF implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return LeerPDF.lecturaPDF();
    }
    public static VerificarPDF Texto(){return new VerificarPDF();}
}
