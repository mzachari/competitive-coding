/*
Given numRows, generate the first numRows of Pascal’s triangle.
Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.
https://www.interviewbit.com/problems/pascal-triangle/
*/
public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> pascalTriangle = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> initial = new ArrayList<Integer>();
        if(A == 0){
            return pascalTriangle;
        }  
        initial.add(1);
        pascalTriangle.add(initial);
        for(int i = 2; i <= A; i++){
            ArrayList<Integer> prev = pascalTriangle.get(i-1-1);
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(1);
            for(int j=2; j<=prev.size();j++){
                int sum = prev.get(j-1-1) + prev.get(j-1);
                temp.add(sum);
            }
            temp.add(1);
            pascalTriangle.add(temp);
        }
        return pascalTriangle;
    }
}
