package homework.PartOther.task05prefixSums;


import java.util.Arrays;

public class findMinSubArraySum {

    public static void main(String[] args) {
        Integer[] a = {3, 5, 4, 5, 3, 2, 2};    // [3, 8, 12, 17, 20, 22, 24]
        System.out.println(findMinSubarraySum(a));
    }

    public static int findMinSubarraySum(Integer[] arr) {
        int minSum = Integer.MAX_VALUE;
        int[] prefixSum = new int[arr.length + 1];
        for (int i = 1; i <= arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }
        for (int i = 0; i < prefixSum.length; i++) {
            for (int j = 0; j < i; j++) {
                int s = prefixSum[i] - prefixSum[j];
                boolean f = Arrays.asList(arr).contains(s);
                if (f) {
                    if (s < minSum) {
                        minSum = s;
                    }
                }
            }
        }
        return minSum;
    }
}

