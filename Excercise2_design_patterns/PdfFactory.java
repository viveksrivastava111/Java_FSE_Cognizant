package Excercise2_design_patterns;
class PdfFactory extends DocumentFactory {
    Document createDocument() {
        return new PdfDocument();
    }
}