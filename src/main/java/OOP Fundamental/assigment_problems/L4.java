public class L4 {

    public static void main(String[] args) {
        Product p1 = new Product("P-1042", "Wireless Mouse");

        System.out.println(p1.productId + " - " + p1.productName);
    }
}

class Product {
    String productId;
    String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
}

