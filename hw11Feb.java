package hw_Geekster;
import java.util.*;

public class hw11Feb {

	public static void main(String[] args) {
		
		int[] arr = { 2, 3, 5, 7,5, 8};
		int n=arr.length;
		int[] arr1= { 2, 3, 5, 7,5, 8};
		int[] arr2= {};
		
		System.out.println("\nOriginal array: "+Arrays.toString(arr));
		findMaxProduct(arr);
		
		System.out.println(unique(arr));
		
		System.out.println(checkPermutation(arr,arr1));
		
		middleArray(arr);

	}
	
	
	public static void findMaxProduct(int[] nums)
	{
		int max_pair_product = Integer.MIN_VALUE;
		int maxi= -1, maxj = -1;

		for (int i = 0; i < nums.length - 1; i++)
		{
			for (int j = i + 1; j < nums.length; j++)
			{
				if (max_pair_product < nums[i] * nums[j])
				{
					max_pair_product = nums[i] * nums[j];
					maxi = i;
					maxj = j;
				}
			}
		}

		System.out.print("Pair is " + nums[maxi] +" " + nums[maxj]+"\n");
	}
	
	public static boolean unique(int[] arr){
		
		boolean unique=true;
	    for (int i = 0; i < arr.length-1; i++) {
	        for (int j = i+1; j < arr.length; j++) {
	             if (arr[i] == arr[j]) {
	                 return false;
	             }
	        }
	    }              
	    return true;          
	}
	
	public static boolean checkPermutation(int[] array1, int[] array2){

	     boolean checkPer=false;
	     
	     if (array1.length != array2.length)
	        return false;

	     Arrays.sort(array1);

	     
	     Arrays.sort(array2);

	     for(int i = 0; i  <  array1.length; i++){
	           if(array1[i] != array2[i])
	              return false;       
	     }
	     
	     return true;
	 }
	
	public static void middleArray(int[]arr) {
		
		int[] arr3= new int[arr.length-2];
		
		for(int i=1;i<arr.length-1;i++) {
			arr3[i-1]=arr[i];
		}
		
		System.out.println(Arrays.toString(arr3));
		
		
	}

}
