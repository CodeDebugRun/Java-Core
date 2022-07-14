package Day22_ArraysTasks;

import java.util.Arrays;

public class C01_FindPair {
    /*Given an unsorted integer array, find a pair with the given sum in it.
    For example,
    Input:
    nums = [8, 7, 2, 5, 3, 1]
    target = 10
    */
    public static void main(String[] args) {

        int[] nums = {8,8,7,2,5,3,1};
        int target = 10;
        findPairs(nums, target);
        findPair(nums,target);



    }

    private static void findPairs(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    System.out.println("Total of " + nums[i] + " and " + nums[j] + " is " + target);
                    return;
                }
            }
        }
        System.out.println("Pair not found");
    }
    public static void findPair(int[] nums, int target)
    {
        // sort the array in ascending order
        Arrays.sort(nums);

        // maintain two indices pointing to endpoints of the array
        int low = 0;
        int high = nums.length - 1;

        // reduce the search space `nums[low…high]` at each iteration of the loop

        // loop till the search space is exhausted
        while (low < high)
        {
            // sum found
            if (nums[low] + nums[high] == target)
            {
                System.out.println("Pair found (" + nums[low] + "," +
                        nums[high] + ")");
                return;
            }

            // increment `low` index if the total is less than the desired sum;
            // decrement `high` index if the total is more than the desired sum
            if (nums[low] + nums[high] < target) {
                low++;
            }
            else {
                high--;
            }
        }

        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }
}
