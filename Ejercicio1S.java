package Switch;

import java.util.Scanner;

public class Ejercicio1S {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int exponente = 0;
		int opcion = 0;
		int resultado = 0;
		
		System.out.println("Digite un numero para calcular su potencia: ");
		num = sc.nextInt();
		System.out.println("Digite un numero para haller la potencia del " + num);
		exponente = sc.nextInt();
		
		if(exponente > 0) {
			opcion = 1;
		}else if(exponente == 0) {
			opcion = 2;
		}else {
			opcion = 3;
		}
	
	switch(opcion) {
	
		case 1:
			resultado = (int) Math.pow(num, exponente);
			System.out.println("El resultado es: " + resultado);
			break;
		
		case 2:
			resultado = 1;
			System.out.println("El resultado es: " + resultado);
			break;
		case 3:
			resultado = (int) (1 / Math.pow(num, -exponente));
			System.out.println("El resuldato es: " + resultado);
			break;
	}
		
		
	}

}
