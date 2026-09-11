import java.util.Scanner;

public class P4 {

    private static double rowAverage(int[] row) {
        int sum = 0;
        for (int value : row) {
            sum = sum + value;
        }
        double average = (double) sum / row.length;
        return average;
    }

    static String classifyRows(int[][] seatingScores, int threshold) {
        String result = "";

        for (int i = 0; i < seatingScores.length; i++) {
            double avg = rowAverage(seatingScores[i]);

            String zone = "";
            if (avg >= threshold) {
                zone = "Buzzing Zone";
            } else {
                zone = "Quiet Zone";
            }

            result = result + "Row " + i + ": " + zone;

            if (i != seatingScores.length - 1) {
                result = result + " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] seatingScores = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter columns for row " + i + ": ");
            int cols = sc.nextInt();
            seatingScores[i] = new int[cols];

            for (int j = 0; j < cols; j++) {
                seatingScores[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter threshold: ");
        int threshold = sc.nextInt();

        System.out.println(classifyRows(seatingScores, threshold));

        sc.close();
    }
}