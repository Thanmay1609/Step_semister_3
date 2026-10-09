import java.util.*;

abstract class LibraryItem {
    String name;
    int days;

    LibraryItem(String name, int days) {
        this.name = name;
        this.days = days;
    }

    abstract double fine();
}

class Book extends LibraryItem {
    Book(String name, int days) {
        super(name, days);
    }

    double fine() {
        return days * 2;
    }
}

class DVD extends LibraryItem {
    DVD(String name, int days) {
        super(name, days);
    }

    double fine() {
        return Math.min(days * 5, 50);
    }
}

class Magazine extends LibraryItem {
    Magazine(String name, int days) {
        super(name, days);
    }

    double fine() {
        return days;
    }
}

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            int days = sc.nextInt();
            LibraryItem item;

            if (type.equals("BOOK"))
                item = new Book(name, days);
            else if (type.equals("DVD"))
                item = new DVD(name, days);
            else
                item = new Magazine(name, days);

            double amount = item.fine();
            System.out.printf("%s: %.2f%n", name, amount);
            total += amount;
        }

        System.out.printf("Total Fines: %.2f%n", total);
        sc.close();
    }
}