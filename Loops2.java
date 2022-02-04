package gitHub;
import java.util.Scanner;

public class Loops2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=0;
        int b=0;
        int n=1;
        int result=1;

        int cont = 1;

        System.out.println("0");
        System.out.println("1");
        do {
            a=b;
            b=result;
            result=a+b;
            System.out.println(result);
            cont++;
        }while(cont<n);
	}
}
