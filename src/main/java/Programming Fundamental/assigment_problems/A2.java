import java.util.Scanner;

public class A2 {

    static int maxSubArray(int[] arr) {
        int sum = arr[0];
        int best = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (sum < 0) {
                sum = arr[i];
            } else {
                sum = sum + arr[i];
            }

            if (sum > best) {
                best = sum;
            }
        }

        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int sz = sc.nextInt();

        int[] arr = new int[sz];
        System.out.println("Enter values:");
        for (int i = 0; i < sz; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxSubArray(arr));

        sc.close();
    }
}