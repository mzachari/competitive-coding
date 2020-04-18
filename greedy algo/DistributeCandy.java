/*There are N children standing in a line. Each child is assigned a rating value.

You are giving candies to these children subjected to the following requirements:

1. Each child must have at least one candy.
2. Children with a higher rating get more candies than their neighbors.
What is the minimum candies you must give?
https://www.interviewbit.com/problems/distribute-candy/
*/
public class Solution {
    public int candy(ArrayList<Integer> A) {
        int n = A.size();
        int prevRating = 1;
        int totalCandies = 0;
        HashMap<Integer,Integer> candiesAlloted = new HashMap<Integer,Integer>();
        int i = 0;
        candiesAlloted.put(i,1);
        for(i = 1; i < n; i++){
            candiesAlloted.put(i,1);
            if((A.get(i) > A.get(i-1)) && (candiesAlloted.get(i) <= candiesAlloted.get(i-1))){
                candiesAlloted.put(i, candiesAlloted.get(i-1) + 1);
            }
            else if((A.get(i) < A.get(i-1)) && (candiesAlloted.get(i) >= candiesAlloted.get(i-1))){
                int j = i;
                while(j>0 && (A.get(j) < A.get(j-1)) && (candiesAlloted.get(j) >= candiesAlloted.get(j-1))){
                    candiesAlloted.put(j-1, candiesAlloted.get(j)+1);
                    j--;
                }
            }
        }
        for (Map.Entry<Integer,Integer> entry : candiesAlloted.entrySet())  {
            // System.out.println("Key = " + entry.getKey() + 
            //                  ", Value = " + entry.getValue()); 
                             totalCandies+=entry.getValue();
        }
            
        return totalCandies;
    }
}
