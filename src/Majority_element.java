

import java.util.Arrays;

public class Majority_element {

    // Boyer–Moore Voting Algorithm
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2,4,4,4,4,4,4,4,4,4,4,4,4,4,4,42};
      //  int result = majorityElement(nums);
        System.out.println("Majority element: " + majorityElement(nums));
    }
}
