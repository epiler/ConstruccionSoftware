package Switch;

import java.util.Scanner;

/*Cree un programa en java que ingresado un número del 1 al 20 muestre su correspondiente en número romano.
Si el numero es negativo debe mostrar un mensaje de error que lo indique y que el programa no puede continuar.
Si el número es mayor de 20 Debe mostrar un mensaje que indique que es mayor a lo esperado y debe mostrar solo 
el rango de números validos.*/

public class Ejercicio2S {
	
	public static void main(String[]args) {
		
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Ingrese un numero del 1 al 20: ");
		num = sc.nextInt();
		
		if (num < 1) {
			System.out.println("Error, numero negativo no se podrá continuar.");
		}else if(num > 20) {
			System.out.println("Error, numero sale del rango indicado (1 al 20)");
		}else {
			switch(num) {
			case 1:
				System.out.println("I");
				break;
			case 2:
				System.out.println("II");
				break;
			case 3:
				System.out.println("III");
				break;
			case 4:
				System.out.println("IV");
				break;
			case 5:
				System.out.println("V");
				break;
			case 6:
				System.out.println("VI");
				break;
			case 7:
				System.out.println("VII");
				break;
			case 8:
				System.out.println("VIII");
				break;
			case 9:
				System.out.println("IX");
				break;
			case 10:
				System.out.println("X");
				break;
			case 11:
				System.out.println("XI");
				break;
			case 12:
				System.out.println("XII");
				break;
			case 13:
				System.out.println("XIII");
				break;
			case 14:
				System.out.println("XIV");
				break;
			case 15:
				System.out.println("XV");
				break;
			case 16:
				System.out.println("XVI");
				break;
			case 17:
				System.out.println("XVII");
				break;
			case 18:
				System.out.println("XVIII");
				break;
			case 19:
				System.out.println("XIX");
				break;
			case 20:
				System.out.println("XX");
				break;
			}
		}
		
		
		
		
	}

}
