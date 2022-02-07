import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
    	 
    	 String original, reverse = "";
         
         Scanner in = new Scanner(System.in);
    	 
         System.out.println("Enter a word of your choice: ");

         original =in.nextLine();

         int length = original.length();

         for(int i=length-1; i>=0; i--){
             reverse =reverse + original.charAt(i);
        	 if (originalequals(reverse)){
        		System.out.println("Entered word is a palindrome.");
        	 }
        	 else {
        		 System.out.println("Entered word is not a palindrome.");
          }
       }	
    }
  }