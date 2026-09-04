public class L5 {

    static int[] rotateArray(int[] nums, int k) {

        k = k % nums.length;

        int a[] = new int[nums.length];

        for(int i=0;i<nums.length;i++)
            a[(i+k)%nums.length] = nums[i];

        return a;
    }

    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,6,7};

        a = rotateArray(a,3);

        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
    }
}