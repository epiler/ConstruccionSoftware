package Ejercicioss;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String dia = "";
		
		System.out.println("Digite un numero: del 1 al 7: ");
		num = sc.nextInt();
		
	
		
		switch (num) {
		
		case 1:
			dia = "Lunes";
			break;
		case 2:
			dia = "Martes";
			break;
		case 3:
			dia = "Miercoles";
			break;
		case 4:
			dia = "Jueves";
			break;
		case 5:
			dia = "Viernes";
			break;
		case 6:
			dia = "Sabado";
			break;
		case 7:
			dia = "Domingo";
			break;
			
		}
		
		System.out.println("El dia correspondiente al numero " + num + " es " + dia );
		
	}

}
