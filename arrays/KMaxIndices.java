/*
Given an array and a value k, find the indices of the k largest numbers of the array.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in =new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		int k;
		for(int i=0; i<N; i++){
		    arr[i] = in.nextInt();
		}
		k = in.nextInt();
		findIndicesOfKMaximumNumbers(arr, k, N);
	}
	
	public static void findIndicesOfKMaximumNumbers(int[] arr, int k, int N){
	    int[] arr_copy = Arrays.copyOfRange(arr,0,N);
	    Arrays.sort(arr);
	    int[] kMax = Arrays.copyOfRange(arr,N-k,N); 
	    for(int i = 0;i <N; i++){
	        if(binarySearch(kMax, arr_copy[i])){
	            System.out.print(i + " ");
	        }
	    }
	}
	
    public static boolean binarySearch(int[] a, int n){
        int start = 0, end = a.length -1, mid;
        while(start <= end){
            mid = (start+end)/2;
            if(a[mid] == n) return true;
            else if(a[mid] < n){
                start = mid+1;
                continue;
            }
            else{
                end = mid-1;
                continue;
            }
        }
        return false;
    }
}
