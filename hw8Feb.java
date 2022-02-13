package hw_Geekster;
import java.util.*;

public class hw8Feb {

	public static void main(String[] args) {
		
		 String str = "Geekster-The%school:where+you@code:your-success$stories";
	        removeSpecialCharacter(str);
	        
	        
	        String str1=new String("hello");  
	        String str2="hello";  
	        String str3=str1.intern();//returns string from pool, now it will be same as s2  
	        System.out.println(str1==str2);//false because reference variables are pointing to different instance  
	        System.out.println(str2==str3);//true because reference variables are pointing to same instance  
	        
	        
	        String str4 = "We are Proud to be an India";
	          
	        countType(str4);
	}
	    public static void removeSpecialCharacter(String s)
	    {
	        for (int i = 0; i < s.length(); i++)
	        {
	            if (s.charAt(i) < 'A' || s.charAt(i) > 'Z' &&
	                    s.charAt(i) < 'a' || s.charAt(i) > 'z')
	            {
	                s = s.substring(0, i) + s.substring(i + 1);
	                i--;
	                
	            }
	        }
	        System.out.println(s+" ");
	    }
	    
	    
//	    public static String mobNum(String str) {
//	    	
//	    	
//	    	
//	    }
	    
	    
	    
	   public static void countType(String str)
	    {
	        int vowels = 0, consonant = 0;
	      
	        
	        for (int i = 0; i < str.length(); i++) {
	              
	            char ch = str.charAt(i);
	      
	            if ( (ch >= 'a' && ch <= 'z') || 
	                (ch >= 'A' && ch <= 'Z') ) {
	      
	                // To handle upper case letters
	                ch = Character.toLowerCase(ch);
	      
	                if (ch == 'a' || ch == 'e' || ch == 'i' ||
	                    ch == 'o' || ch == 'u')
	                    vowels++;
	                else
	                    consonant++;
	            }
	            
	        }
	          
	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonant: " + consonant);
	       
	    }
	      
	      
	    
}
	  

