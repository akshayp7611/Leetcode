class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 1;
        int n = numbers.length;
        int j = n;
        while (i < j) {
            int sum = numbers[i-1] + numbers[j-1];
            if (sum == target) {
                return new int[] { i, j };
            }
            if (sum < target) {
                i++;
            } else {
                j--;

            }

        }
        return new int[0];
    }
}