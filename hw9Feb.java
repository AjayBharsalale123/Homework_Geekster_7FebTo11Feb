package hw_Geekster;

import java.util.Scanner;

public class hw9Feb {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter the Array Elements :");
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {  
			
	         arr[i] = sc.nextInt();  
	      }
		
		 System.out.println("Your Array Elements :");
	      for(int i=0;i<arr.length; i++){
	    	  
	          System.out.println(arr[i]);
	      }
	      System.out.println("Sum of Arrays is:");
	      
	      System.out.println(sumArray(arr));

	
	
		System.out.println("Enter the Array Elements :");
		int[] arr1 = new int[10];
		
		for(int i=0; i<10; i++) {  
			
	         arr[i] = sc.nextInt();  
	      }
		
		 System.out.println("Your Array Elements :");
	      for(int i=0;i<arr1.length; i++){
	    	  
	          System.out.println(arr1[i]);
	      }
		System.out.println("The middle Elements is :"+findMiddleElements(arr1));
		
		
		System.out.println("Enter array Elements :");
		int arr2[]=new int[10];
		
		for(int i=0;i<10;i++) {
			arr2[i]=sc.nextInt();
		}
		
//		System.out.println("Your Array elements is :");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		System.out.println("Positive Numbers are :"+checkPositive(arr2));

	}
	
		public static int sumArray(int [] arr) {
		
		int sum=0;
		for(int i=0; i<10; i++ ) {
			
				sum+=arr[i];
			
			
		}
		return sum;
		
	}
		
	public static int findMiddleElements(int []arr) {
		int middle=0;
		int sIndex=0, lastIndex=arr.length-1;
		
		middle=sIndex+(lastIndex-sIndex)/2;
		return middle;
	}
	
	public static int checkPositive(int[]arr) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				System.out.println(arr[i]);
			}
		}
		return 0;
		
	}


}
