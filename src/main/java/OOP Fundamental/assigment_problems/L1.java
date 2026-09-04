public class L1 {

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Clean Code";
        b1.price = 650.0;

        System.out.println("Title: " + b1.title + " | Price: Rs " + b1.price);
    }
}

class Book {
    String title;
    double price;
}

