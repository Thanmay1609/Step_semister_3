import java.util.Scanner;
import java.util.Arrays;

public class A3 {

    static int[][] threeSum(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int[][] temp = new int[n * n][3];
        int cnt = 0;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int lo = i + 1;
            int hi = n - 1;

            while (lo < hi) {
                int total = arr[i] + arr[lo] + arr[hi];

                if (total == 0) {
                    temp[cnt][0] = arr[i];
                    temp[cnt][1] = arr[lo];
                    temp[cnt][2] = arr[hi];
                    cnt++;

                    lo++;
                    hi--;

                    while (lo < hi && arr[lo] == arr[lo - 1]) {
                        lo++;
                    }
                    while (lo < hi && arr[hi] == arr[hi + 1]) {
                        hi--;
                    }
                } else if (total < 0) {
                    lo++;
                } else {
                    hi--;
                }
            }
        }

        int[][] finalRes = new int[cnt][3];
        for (int i = 0; i < cnt; i++) {
            finalRes[i] = temp[i];
        }

        return finalRes;
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

        int[][] ans = threeSum(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }

        sc.close();
    }
}