package co.edu.tdea.EjercicioEvaluativo;

import java.util.Scanner;

public class EjercicioUno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int suma = 0;
		
		System.out.println("Digite el primer numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite el segundo numero: ");
		num2 = sc.nextInt();
		
		
		for(int i = num1; i <= num2;i++) {
			
			if(i % 2 == 0) {
				
				suma += i;
				
			}
			
			
		}
		
		System.out.println("La suma es: " + suma);
		
		
		
		
		
		

	}

}
