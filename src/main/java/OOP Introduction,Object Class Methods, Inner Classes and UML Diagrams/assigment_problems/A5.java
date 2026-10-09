import java.util.*;

abstract class Appliance {
    double hours;

    Appliance(double hours) {
        this.hours = hours;
    }

    abstract double power();

    double units() {
        return power() * hours / 1000;
    }

    double cost() {
        return units() * 8;
    }
}

interface Saver {
    double savedUnits();
}

class Fridge extends Appliance {
    Fridge(double hours) {
        super(hours);
    }

    double power() {
        return 150;
    }
}

class AC extends Appliance implements Saver {
    AC(double hours) {
        super(hours);
    }

    double power() {
        return 1500;
    }

    public double savedUnits() {
        return units() * 0.75;
    }
}

class TV extends Appliance {
    TV(double hours) {
        super(hours);
    }

    double power() {
        return 100;
    }
}

class Washer extends Appliance implements Saver {
    Washer(double hours) {
        super(hours);
    }

    double power() {
        return 500;
    }

    public double savedUnits() {
        return units() * 0.75;
    }
}

public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double hours = sc.nextDouble();
            boolean saver = sc.hasNext("SAVER");

            if (saver)
                sc.next();

            Appliance a;

            if (type.equals("FRIDGE"))
                a = new Fridge(hours);
            else if (type.equals("AC"))
                a = new AC(hours);
            else if (type.equals("TV"))
                a = new TV(hours);
            else
                a = new Washer(hours);

            if (saver && !(a instanceof Saver)) {
                System.out.println(type + ": saver mode not supported");
            } else {
                double units;

                if (saver)
                    units = ((Saver) a).savedUnits();
                else
                    units = a.units();

                double cost = units * 8;

                System.out.printf(
                    "%s: Units=%.2f Cost=%.2f%n",
                    type, units, cost
                );

                total += cost;
            }
        }

        System.out.printf("Total Cost: %.2f%n", total);
        sc.close();
    }
}