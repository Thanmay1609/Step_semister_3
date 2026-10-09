import java.util.*;

abstract class Travel {
    static final double FEE = 50;
    double distance;

    Travel(double distance) {
        this.distance = distance;
    }

    abstract double fare();

    double total() {
        return fare() + FEE;
    }
}

class Bus extends Travel {
    Bus(double distance) {
        super(distance);
    }

    double fare() {
        return distance * 2;
    }
}

class Train extends Travel {
    Train(double distance) {
        super(distance);
    }

    double fare() {
        return distance * 1.5;
    }
}

class Flight extends Travel {
    Flight(double distance) {
        super(distance);
    }

    double fare() {
        return 2500 + distance * 4;
    }
}

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double distance = sc.nextDouble();
            Travel t;

            if (type.equals("BUS"))
                t = new Bus(distance);
            else if (type.equals("TRAIN"))
                t = new Train(distance);
            else
                t = new Flight(distance);

            System.out.printf("%s: %.2f%n", type, t.total());
        }

        sc.close();
    }
}