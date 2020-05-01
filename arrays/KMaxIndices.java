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
		
		if(k>N){
		    System.out.println("K Not within array limits");
		    return;
		}
		int[] output = new int[k];
		output = findIndicesOfKMaximumNumbers(arr, k, N);
		for(int i = 0; i<k;i++){
		    System.out.print(output[i] + " ");
		}
	}
	
	public static int[] findIndicesOfKMaximumNumbers(int[] arr, int k, int N){
	    int[] output = new int[k];
	    int[] arr_copy = Arrays.copyOfRange(arr,0,N);
	    Arrays.sort(arr);
	    int[] kMax = Arrays.copyOfRange(arr,N-k,N); 
	    for(int i = 0;i <N; i++){
	        int index = binarySearch(kMax, arr_copy[i]);
	        if(index!=-1){
	            output[k-index-1] = i+1;
	        }
	    }
	    return output;
	}
	
    public static int binarySearch(int[] a, int n){
        int start = 0, end = a.length -1, mid;
        while(start <= end){
            mid = (start+end)/2;
            if(a[mid] == n) return mid;
            else if(a[mid] < n){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
