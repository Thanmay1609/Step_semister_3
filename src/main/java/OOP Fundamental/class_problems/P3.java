import java.util.Arrays;
import java.util.Scanner;

public class P3 {

    static int[] findTopThreeScores(int[] scores) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int current : scores) {
            if (current > first) {
                third = second;
                second = first;
                first = current;
            } else if (current > second) {
                third = second;
                second = current;
            } else if (current > third) {
                third = current;
            }
        }

        int[] top3 = new int[3];
        top3[0] = first;
        top3[1] = second;
        top3[2] = third;

        return top3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int[] result = findTopThreeScores(scores);
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}