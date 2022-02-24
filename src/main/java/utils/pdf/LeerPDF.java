package utils.pdf;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.File;
import java.io.IOException;


import static utils.constants.Constants.*;

public class LeerPDF {

    private static String texto;

    public static String lecturaPDF(){
        PdfReader reader;

        try {

            reader = new PdfReader(RUTA_PDF);

            texto = PdfTextExtractor.getTextFromPage(reader, UNO);


            reader.close();
            File pdf = new File(RUTA_PDF);
            pdf.delete();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return texto;

    }
}
