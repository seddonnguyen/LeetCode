package BinarySearch;

public class BinarySearch {
    
    //        Input: nums = [-1,0,3,5,9,12], target = 9
    //        Output: 4

    //        Input: nums = [-1,0,3,5,9,12], target = 2
    //        Output: -1

    static int binarySearch(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int middle = (right + left) / 2;

            if (nums[middle] > target) {
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] == target) {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        final int[] nums = {-1, 0, 3, 5, 9, 12};
        int target2 = 2;
        int target9 = 9;

        System.out.printf("Find target %d\n\tSolution: %d\n", target2, binarySearch(nums, target2));
        System.out.printf("Find target %d\n\tSolution: %d\n", target9, binarySearch(nums, target9));
    }
}