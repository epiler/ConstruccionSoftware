package Actividad;

import java.util.Scanner;

public class PuntoTress {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cantidadEst;
		float notas = 0;
		float promedio;
		float suma = 0;
		
		System.out.println("Digite la cantidad de estudiantes: ");
		cantidadEst = sc.nextInt();
		
		
		for (int i = 1; i <=cantidadEst;i++ ) {
			System.out.println("Digite la notas del estudiante " + i  + ": ");
			suma = 0;
			
			
			for(int j = 1;j <= 4;j++) {
				
				System.out.println("Nota " + j + ": ");
				notas = sc.nextFloat();
				suma += notas;
				
			}
			
			promedio = suma /4;
			System.out.println("promedio estudiante " + i + ": " + promedio);
			
		}
		
		
		
		

	}

}
