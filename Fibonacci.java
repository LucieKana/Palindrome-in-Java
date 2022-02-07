// Write Fibonnaci series (Links to an external site.) for the first n numbers in the series (n is a user entered value)
 import java.util.Scanner;// import scanner

 public class Fibonacci{
    public static void main(String[] args){
    	
    	int count, num1 =0, num2=1;
    	
    	System.out.println("How many number you want in a sequence: ");
    	Scanner scan = new Scanner(System.in);
    	
        count = scan.nextInt();
        
        scanner.close();
        
        System.out.print("Fibonacci Series of " + count+ " numbers: ");
        
        int i=1;
       
       while(i<=count)
       {
    	 System.out.print(num1+ " ");
    	  int sumOfPrevTWO = num1 + num2;
    	  num1 = num2;
    	  num2 = sumOfPrevTWO ;
    	  i++;
       }
    }   
}
