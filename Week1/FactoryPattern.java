
import java.util.Scanner;

interface Document {

    void open();
}

class WordDocument implements Document {

    public void open() {
        System.out.println("Word document opened.");
    }
}

class PdfDocument implements Document {

    public void open() {
        System.out.println("PDF document opened.");
    }
}

class ExcelDocument implements Document {

    public void open() {
        System.out.println("Excel document opened.");
    }
}

class DocumentFactory {

    public static Document create(String type) {
        switch (type.toLowerCase()) {
            case "word":
                return new WordDocument();
            case "pdf":
                return new PdfDocument();
            case "excel":
                return new ExcelDocument();
            case "WORD":
                return new WordDocument();
            case "PDF":
                return new PdfDocument();
            case "EXCEL":
                return new ExcelDocument();
            default:
                throw new IllegalArgumentException("Unknown type");
        }
    }
}

public class FactoryPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter document type: ");
        String input = sc.nextLine();

        Document doc = DocumentFactory.create(input);
        doc.open();
    }
}
