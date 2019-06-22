
import java.io.FileInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class Main {


    public static void main(String[] args) {
        try {
            PdfReader mine = new PdfReader("C://Users//sAnAm shahedi//Desktop//lab4//src//ttt.pdf");
            int n=mine.getNumberOfPages();
            System.out.println("the numbers of pages :" + n);
            for (int i=1; i<=n; i++) {
                String pageContent = PdfTextExtractor.getTextFromPage(mine, i);
                System.out.println("Content on Page " + i + ": " + pageContent); }

        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
