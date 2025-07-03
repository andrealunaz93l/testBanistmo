package co.banistmo.questions;

import net.serenitybdd.screenplay.Question;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;

public class ValidarPDF {
    public static Question<Boolean> contieneTextoEsperado(String textoEsperado) {
        return actor -> {
            try {
                File carpetaDescargas = new File(System.getProperty("user.home") + "/Downloads");
                File[] archivos = carpetaDescargas.listFiles((dir, name) -> name.endsWith(".pdf"));
                if (archivos == null || archivos.length == 0) return false;

                File archivoPDF = archivos[0];
                PDDocument documento = PDDocument.load(archivoPDF);
                String contenido = new PDFTextStripper().getText(documento);
                documento.close();

                System.out.println("===== CONTENIDO DEL PDF =====");
                System.out.println(contenido);
                System.out.println("===== FIN DEL CONTENIDO =====");

                return contenido.contains(textoEsperado);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        };
    }
    }