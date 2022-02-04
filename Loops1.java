package gitHub;
import java.util.Scanner;

public class Loops1 {
	public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
 
        int i = 1;

		while(i<=9) {
			System.out.println(i);
			
			i++;   
        
        System.out.print("Enter any positive integer: ");
        i = console.nextInt();
                
        System.out.println("Multiplication Table of " + i);
        
       //TODO implement While loop to get print result
    }
}
}
