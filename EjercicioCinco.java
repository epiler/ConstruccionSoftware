package co.edu.tdea.EjercicioEvaluativo;
import java.util.Scanner;
import java.util.Random;

public class EjercicioCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String intentoPalabra = "";
		int intentos = 0;
		
		String palabra1 = "hola";
		String palabra2 = "adios";
		String palabra3 = "chao";
		
		int numeroP = random.nextInt(3)+1 ;
		String palabra = "";
		
		switch(numeroP) {
		
		case 1:
			palabra = palabra1;
			break;
		case 2:
			palabra = palabra2;
			break;
		case 3:
			palabra = palabra3;
			break;
		}
		
		
		do {
			
			System.out.println("Escriba la palabra secreta: ");
			intentoPalabra = sc.next().toLowerCase();
			intentos++;
			
			
			if(intentoPalabra.equals(palabra)) {
				System.out.println("Correcto");
				
			}else {
				if(intentoPalabra.compareTo(palabra)<0) {
					System.out.println("La palabra ingresada es menor alfabeticamente");
					
				}else {
					System.out.println("la palabra ingresada es mayor alfabeticamente");
				}
			}
			
			
		}while(!intentoPalabra.equals(palabra));
		
		
		
		
		

	}

}
