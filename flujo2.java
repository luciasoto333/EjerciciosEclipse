package gitHub;
import java.util.Scanner;

public class flujo2 {
	public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);
		System.out.println("Ingrese su edad: ");
		int age = value.nextInt();
		
		
		if ( age>=60 ) {
			System.out.println("55% discount");
			}
			else if( age<=5 ) {
				System.out.println("60% discount");
			} else{
				System.out.println("7 Euros");
			}

	}
}