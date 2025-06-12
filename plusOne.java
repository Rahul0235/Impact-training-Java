public class plusOne {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] result = plus(nums); 
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] plus(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i]++;      
                return nums;   
            }
            nums[i] = 0;       
        }

        int[] newNumber = new int[nums.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
