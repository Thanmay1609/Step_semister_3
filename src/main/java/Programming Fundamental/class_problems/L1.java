public class L1 {

    static int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {

                if(nums[i] + nums[j] == target)
                    return new int[]{i,j};
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        int a[] = {2,7,11,15};
        int target = 9;

        int x[] = twoSum(a,target);

        System.out.println("[" + x[0] + ", " + x[1] + "]");
    }
}