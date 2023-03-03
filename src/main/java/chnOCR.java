import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class chnOCR {
    public static void main(String[] args) {
        String imagePath = "ImageWithWords4.jpg"; // specify the path to the input image file
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("tessdata"); // specify the path to the Tesseract OCR data files
        tesseract.setLanguage("chi_sim");
        try {
            // perform OCR on the local image file
            String result = tesseract.doOCR(new File(imagePath));
            System.out.println(result); // print the extracted text to the console
        }
        catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}
