import java.util.Scanner;

public class Assign4 {

    private static double rowAverage(int[] row) {
        int sum = 0;
        for (int value : row) {
            sum = sum + value;
        }
        double average = (double) sum / row.length;
        return average;
    }

    static String classifyMatches(int[][] runsPerOver, int threshold) {
        String result = "";

        for (int i = 0; i < runsPerOver.length; i++) {
            double avg = rowAverage(runsPerOver[i]);

            String status = "";
            if (avg >= threshold) {
                status = "Power Surge";
            } else {
                status = "Normal";
            }

            result = result + "Match " + i + ": " + status;

            if (i != runsPerOver.length - 1) {
                result = result + " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of matches: ");
        int matches = sc.nextInt();

        int[][] runsPerOver = new int[matches][];

        for (int i = 0; i < matches; i++) {
            System.out.print("Enter overs for match " + i + ": ");
            int overs = sc.nextInt();
            runsPerOver[i] = new int[overs];

            for (int j = 0; j < overs; j++) {
                runsPerOver[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter threshold: ");
        int threshold = sc.nextInt();

        System.out.println(classifyMatches(runsPerOver, threshold));

        sc.close();
    }
}