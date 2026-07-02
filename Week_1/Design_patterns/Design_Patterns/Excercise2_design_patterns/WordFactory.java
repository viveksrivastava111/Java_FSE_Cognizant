package Excercise2_design_patterns;
class WordFactory extends DocumentFactory {
    Document createDocument() {
        return new WordDocument();
    }
}