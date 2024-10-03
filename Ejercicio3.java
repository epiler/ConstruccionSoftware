package Ejercicioss;
import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valorI;
		double valorF;
		double edad;
		int porcentaje =  0;
		
		System.out.println("Digite el valor de su compra: ");
		valorI = sc.nextInt();
		
		System.out.println("Digite su edad: ");
		edad = sc.nextInt();
		
		
		if (valorI >= 20000 && edad >= 18 && edad <= 30) {
			valorF = (valorI * 0.2);
			porcentaje = 20;
		}else if(valorI >= 20000 && edad > 30 ) {
			valorF = (valorI * 0.3);
			porcentaje = 30;
			
		}else if (valorI >= 20000 && edad < 18) {
			valorF =  (valorI * 0.25);
			porcentaje = 25;
		}else {
			valorF = valorI;
		}
		
		System.out.println("El total a pagar sin descuento es de: " + valorI);
		System.out.println("El total con descuento es de: " + (valorI - valorF));
		System.out.println("El descuento total es de: " + (valorF) );
		System.out.println("El porcentaje descontado es: " + porcentaje + "%");
		
		
		
		
		
	}

}
