import java.util.Scanner;
import java.util.HashMap;

public class A4 {

    static int subarraySum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            int diff = sum - k;

            if (map.containsKey(diff)) {
                cnt += map.get(diff);
            }

            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }

        return cnt;
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

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println(subarraySum(arr, k));

        sc.close();
    }
}