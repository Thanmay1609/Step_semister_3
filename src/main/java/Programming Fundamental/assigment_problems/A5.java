import java.util.Scanner;

public class A5 {

    static int findMin(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return arr[start];
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

        System.out.println(findMin(arr));

        sc.close();
    }
}