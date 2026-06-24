package Excercise1_design_patterns;
public class Main {
    public static void main(String[] args) {
        Logger l1 = Logger.getLogger();
        Logger l2 = Logger.getLogger();
        l1.log("First message");
        l2.log("Second message");
        if (l1 == l2) {
            System.out.println("Same object is used");
        } else {
            System.out.println("Different objects are used");
        }
    }
}