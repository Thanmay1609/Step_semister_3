import java.util.*;

abstract class Plot {
    String name;

    Plot(String name) {
        this.name = name;
    }

    abstract double area();

    String shape() {
        return "";
    }
}

class Circle extends Plot {
    double r;

    Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    double area() {
        return Math.PI * r * r;
    }

    String shape() {
        return "CIRCLE";
    }
}

class Rectangle extends Plot {
    double l, w;

    Rectangle(String name, double l, double w) {
        super(name);
        this.l = l;
        this.w = w;
    }

    double area() {
        return l * w;
    }

    String shape() {
        return "RECTANGLE";
    }
}

class Triangle extends Plot {
    double b, h;

    Triangle(String name, double b, double h) {
        super(name);
        this.b = b;
        this.h = h;
    }

    double area() {
        return 0.5 * b * h;
    }

    String shape() {
        return "TRIANGLE";
    }
}

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            Plot p;

            if (type.equals("CIRCLE")) {
                p = new Circle(name, sc.nextDouble());
            } else if (type.equals("RECTANGLE")) {
                p = new Rectangle(name, sc.nextDouble(),
                                  sc.nextDouble());
            } else {
                p = new Triangle(name, sc.nextDouble(),
                                 sc.nextDouble());
            }

            System.out.printf("%s (%s): %.2f%n",
                              p.name, p.shape(), p.area());
            total += p.area();
        }

        System.out.printf("Total Area: %.2f%n", total);
        sc.close();
    }
}