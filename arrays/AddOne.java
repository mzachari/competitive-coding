/*
Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

Example:

If the vector has [1, 2, 3]

the returned vector should be [1, 2, 4]

as 123 + 1 = 124.

 NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer.
For example, for this problem, following are some good questions to ask :
Q : Can the input have 0’s before the most significant digit. Or in other words, is 0 1 2 3 a valid input?
A : For the purpose of this question, YES
Q : Can the output have 0’s before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.
https://www.interviewbit.com/problems/add-one-to-number/
*/
public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        //remove leading zeroes
        while(A.size() > 1){
            if(A.get(0) == 0){
                A.remove(0);
            }
            else{
                break;
            }
        }
        int length = A.size();
        int digit;
        for(int i = length-1; i >=0; i--){
            digit = A.get(i);
            if(digit < 9) {
                A.set(i,digit+1);
                break;
            }
            else{
                if(i==0){
                    Collections.fill(A, 0);
                    A.add(0,1);
                    break;
                }
                else{
                    A.set(i,0);
                }
            }
           
        }
        return A;
        
    }
}
