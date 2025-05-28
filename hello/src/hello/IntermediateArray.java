package hello;

public class IntermediateArray {

    public void rotate(int[] nums, int k) {
        if (k > nums.length)
            k = k % nums.length;

        int[] result = new int[nums.length];
        
        // Copy last k elements to the beginning
        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }

        // Copy the rest
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;
        }

        // Copy result back to nums
        System.arraycopy(result, 0, nums, 0, nums.length);
    }

    public static void main(String[] args) {
        IntermediateArray obj = new IntermediateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        obj.rotate(nums, k);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
