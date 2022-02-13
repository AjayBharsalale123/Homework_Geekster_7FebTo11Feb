package hw_Geekster;
import java.util.Arrays;
import java.util.Scanner;

public class hw7Feb {
	  public static void main(String[] args){
		  
		  Scanner sc = new Scanner(System.in);
//		  System.out.println("Enter first String :");
//		  String str=sc.nextLine();
//		  
//	        reverseWordString(str);
//	        
//	      System.out.println("Enter second String :");
//		  String str1=sc.nextLine();
//	         System.out.println(compress(str1));
	         
//	      System.out.println("Enter third String :");
//	      String str2=sc.nextLine();
//          System.out.println(OccuringChar(str2));
		  
//		  System.out.println("Enter two String :");
//	      String str3=sc.nextLine();
//	      String str4=sc.nextLine();
//          System.out.println(equalOrNot(str3,str4));
		  
		  System.out.println("Enter two String :");
	      String str5=sc.nextLine();
	      String str6=sc.nextLine();
          System.out.println(checkPermutation(str5,str6));
	        
	    }

	
	
	    static void reverseWordString(String str)
	    {
	        String[] words = str.split(" ");
	         
	        String rSt = "";
	         
	        for (int i = 0; i < words.length; i++) 
	        {
	            String word = words[i];
	             
	            String reverseWord = "";
	             
	            for (int j = word.length()-1; j >= 0; j--) 
	            {
	                reverseWord = reverseWord + word.charAt(j);
	            }
	             
	            rSt = rSt + reverseWord + " ";
	        }
	         
	       
	         
	        System.out.println(rSt);
	         
	        
	    }
	    
	    public static String compress(String str) {
	        String result = " ";

	        int index = 0;

	        while (index < str.length()) {
	            char c = str.charAt(index);
	            int count = count(str, index);
	            if (count == 1)
	                result += " " + c;
	            else
	                result += " " + count + c;
	            index += count;
	        }

	        return result;
	    }

	    public static int count(String text, int index) {
	        char c = text.charAt(index);
	        int i = 1;
	        while (index + i < text.length() && text.charAt(index + i) == c)
	            i++;
	        return i;
	    }
	    
	    
	  public static char OccuringChar(String str)
	    {
	        
	        int []count = new int[1000];
	      
	        
	        int len = str.length();
	        for (int i=0; i<len; i++)
	            count[str.charAt(i)]++;
	      
	        int max = -1;  
	        char result = ' ';  
	        for (int i = 0; i < len; i++) {
	            if (max < count[str.charAt(i)]) {
	                max = count[str.charAt(i)];
	                result = str.charAt(i);
	            }
	        }
	      
	        return result;
	    }
	  
	  
	  public static boolean equalOrNot(String str, String str1) {
		  
		  boolean isEqual=false;
		  
		  if(str.equals(str1)) {
			  return true;
		  }
		return isEqual;
	  }
	  
	  public static boolean checkPermutation(String str1, String str2)
	  {
	      
	      int n1 = str1.length();
	      int n2 = str2.length();
	   
	      
	      if (n1 != n2)
	      return false;
	      char ch1[] = str1.toCharArray();
	      char ch2[] = str2.toCharArray();
	   
	      
	      Arrays.sort(ch1);
	      Arrays.sort(ch2);
	   
	      // Compare sorted strings
	      for (int i = 0; i < n1; i++)
	      if (ch1[i] != ch2[i])
	          return false;
	   
	      return true;
	  }

	     
	  
	}