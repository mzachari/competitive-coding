/*
Find the longest increasing subsequence of a given array of integers, A.

In other words, find a subsequence of array in which the subsequence’s elements are in strictly increasing order, and in which the subsequence is as long as possible.
This subsequence is not necessarily contiguous, or unique.
In this case, we only care about the length of the longest increasing subsequence.
https://www.interviewbit.com/problems/longest-increasing-subsequence/
*/
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lis(final List<Integer> A) {
        int n = A.size();
        int[] LIS = new int[n];
        int num = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            num = A.get(i);
            max = 0;
            for(int j = 0;j<i;j++){
                if(A.get(j) < num && (LIS[j] > max)){
                    max = LIS[j];
                }
            }
            LIS[i] = max+1;
        }
        max = 1;
        //System.out.println(Arrays.toString(LIS));
        for(int i = 0; i < n; i++){
            if(LIS[i] > max) max = LIS[i];
        }
        return max;
    }
}
