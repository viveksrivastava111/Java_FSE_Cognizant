import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static Product linearSearch(Product[] products, int id) {
        for (Product p : products) {
            if (p.productId == id) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int id) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (products[mid].productId == id) {
                return products[mid];
            } else if (products[mid].productId < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(103, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(105, "Mobile", "Electronics"),
                new Product(102, "Watch", "Accessories"),
                new Product(104, "Bag", "Fashion")
        };

        System.out.println("Linear Search Result:");
        Product result1 = linearSearch(products, 105);

        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product not found");
        }

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.println("\nBinary Search Result:");
        Product result2 = binarySearch(products, 105);

        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product not found");
        }
    }
}