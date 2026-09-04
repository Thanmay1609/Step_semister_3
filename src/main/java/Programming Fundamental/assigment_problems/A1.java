import java.util.Scanner;
import java.util.Arrays;

public class A1 {

    static int[] productExceptSelf(int[] arr) {
        int len = arr.length;
        int[] res = new int[len];

        res[0] = 1;
        for (int i = 1; i < len; i++) {
            res[i] = res[i - 1] * arr[i - 1];
        }

        int temp = 1;
        for (int i = len - 1; i >= 0; i--) {
            res[i] = res[i] * temp;
            temp = temp * arr[i];
        }

        return res;
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

        int[] output = productExceptSelf(arr);
        System.out.println(Arrays.toString(output));

        sc.close();
    }
}