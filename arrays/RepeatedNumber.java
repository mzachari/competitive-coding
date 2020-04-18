/*
Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.

Sample Input:

[3 4 1 4 1]
Sample Output:

1
If there are multiple possible answers ( like in the sample case above ), output any one.

If there is no duplicate, output -1
https://www.interviewbit.com/problems/find-duplicate-in-array/
*/
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int repeatedNumber(final List<Integer> A) {
        Set<Integer> hashSet = new HashSet<Integer>();
        int repeatedVal = -1;
        for(int i = 0; i< A.size();i++){
           if(hashSet.contains(A.get(i))) {
               repeatedVal = A.get(i);
               break;
           }
           else hashSet.add(A.get(i));
        }
        return repeatedVal;
    }
}
