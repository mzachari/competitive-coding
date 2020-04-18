/*
Given an array of size n, find the majority element. The majority element is the element that appears more than floor(n/2) times.

You may assume that the array is non-empty and the majority element always exist in the array.
https://www.interviewbit.com/problems/majority-element/
*/
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int n = A.size();
        int minCount = (int)Math.floor(n/2);
        int currNum = 0;
        
        for(int i = 0;i < n; i++){
            currNum = A.get(i);
            if(!map.containsKey(currNum)) map.put(currNum, 1);
            else {
                map.put(currNum, map.get(currNum) + 1);
            }
            if(map.get(currNum) > minCount) return currNum;
        }
        return -1;
        // ArrayList<Integer> newA = new ArrayList(A);
        // Collections.sort(newA);
        // // System.out.println("List after the use of" + 
        // //                   " Collection.sort()  :\n" + 
        // //                   newA); 
        // int n = newA.size();
        // int minCount = (int)Math.floor(n/2);
        // int currCount = 0;
        // int i;
        // for(i = 0; i<n; i++){
        //     if( (i == 0) || (newA.get(i) != newA.get(i-1))){
        //         currCount = 1;
        //     }
        //     if(i>0 && newA.get(i) >=newA.get(i-1)) System.out.println("Err with sort");
        //     else currCount++;
        //     if(currCount > 1){
        //         //System.out.println(currCount + " " + A.get(i));
        //     }
        // }
        // return -1;
        
    }
}
