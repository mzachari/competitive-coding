/*
You are climbing a stair case and it takes A steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
https://www.interviewbit.com/problems/stairs/
*/

public class Solution {
    public int climbStairs(int A) {
        if((A == 0) || (A==1) || (A==2)) return A;
        int[] noOfSteps = new int[A+1];
        noOfSteps[0] = 0;
        noOfSteps[1] = 1;
        noOfSteps[2] = 2;
        
        for(int i = 3; i<=A;i++){
            noOfSteps[i] = noOfSteps[i-1] + noOfSteps[i-2];
        }
        return noOfSteps[A];
    }
}
