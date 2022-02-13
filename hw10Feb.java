package hw_Geekster;
import java.util.Scanner;
import java.util.*;

public class hw10Feb {
  
     public static void main(String[] args){
    	 
    	 Scanner sc=new Scanner(System.in);
        int [] arr = {10, 20, 30, 40, 50};
        reverse(arr, arr.length);
        
        int [] arr1 = {5,6,8,4,1,2,9};
        int n=arr1.length;
        
        sortArray(arr1, n);
        
        
        int[] arr2={1,2,3,4,5};
       
        int n1=arr2.length;
//        System.out.println("First element of an array is "+arr2[0]);
//        System.out.println("Last element of an array is " +arr2[n1-1]);
        
        firstElement(arr2, n1);
        lastElement(arr2,n1);
    }
     
     public static void reverse(int a[], int n)
     {
         int[] b = new int[n];
         int j = n;
         for (int i = 0; i < n; i++) {
             b[j - 1] = a[i];
             j = j - 1;
         }
   
         
         System.out.println("Reversed array is: ");
         for (int k = 0; k < n; k++) {
             System.out.print(" "+b[k]);
             
         }
         
         
         
     }
     
     public static int sortArray (int[] arr,int n) {
    	 	
    	 	int temp=0;
    	    for (int i = 0; i < arr.length; i++) {   
                for (int j = i+1; j < arr.length; j++) {   
                   if(arr[i] > arr[j]) {  
                       temp = arr[i];  
                       arr[i] = arr[j];  
                       arr[j] = temp;  
                   }   
                }   
            }
    	    System.out.println("\n Sorted array is: ");
            for (int k = 0; k < n; k++) {
                System.out.print(" "+arr[k]);
            }
			return temp;
            
    	 
     }
     
     public static void firstElement(int []arr,int n) {
    	 
    	
    			System.out.println();
    			System.out.println("First element in array");
    			 System.out.println(arr[0]);
    		 
    		 
    	 
     }
     
     public static void lastElement(int []arr,int n) {
    	 
     	
			System.out.println();
			System.out.println("Last element in array");
			 System.out.println(arr[n-1]);
		 
		 
	 
}
}
