package gitHub;
import java.util.Scanner;

public class flujo1 {
	public static void main(String arg[])	
	{
	  Scanner sc=new Scanner(System.in);
 
	  System.out.print("Enter amount:");
 
	  double amount=sc.nextDouble();
 
	  System.out.print("Enter commission percentage:");
 
          double commissionPercentage=sc.nextDouble();
 
	  double commission=(commissionPercentage/100)*amount;  	   
 
      	  System.out.println("Commission amount="+commission);
 
	}
}