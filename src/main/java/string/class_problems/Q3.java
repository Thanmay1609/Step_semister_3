package string.class_problems;

public class Q3 {

    static String getBmiStatus(double b) {

        if(b<18.5)
            return "Underweight";
        else if(b<25)
            return "Normal";
        else if(b<30)
            return "Overweight";
        else
            return "Obese";
    }

    static void printWellnessReport(double h[],double w[]) {

        for(int i=0;i<h.length;i++) {

            double b=w[i]/(h[i]*h[i]);

            System.out.printf("Person %d | %.2f | %.0f | %.2f | %s\n",
                i+1,h[i],w[i],b,getBmiStatus(b));
        }
    }

    public static void main(String[] args) {

        double h[]={1.75,1.60};
        double w[]={70,90};

        printWellnessReport(h,w);
    }
}
