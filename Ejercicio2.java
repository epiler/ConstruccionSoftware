package Ejercicioss;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		double c;
		double xP;
		double xN;
		
		
		System.out.println("Digite el valor de a: ");
		a = sc.nextDouble();
		System.out.println("Digite el valor de b: ");
		b = sc.nextDouble();
		System.out.println("Digite el valor de c: ");
		c = sc.nextDouble();
		
		
		
		xP = (-b + 1) + Math.pow(b, 2) - 4 * a * c /  (2 * a) ;
		
		xN = (-b - 1) - Math.pow(b, 2) - (4 * a * c) / (2 * a) ;
		
		
		System.out.println(xP);
		System.out.println(xN);
		
		
	}

}
