package co.edu.tdea.EjercicioEvaluativo;

import java.util.Scanner;

public class EjercicioSiete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int vocales = 0;
		String texto = "";
		
		
		System.out.println("Digite texto: ");
		texto = sc.nextLine();
		
		
		
		for(int i = 0;i < texto.length();i++) {
			
			
			switch(texto.toLowerCase().charAt(i)) {
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				
				vocales ++;
				break;
			
			}
			
		}

		
		System.out.println("Vocales: " + vocales);
		System.out.println("Consonantes: " + (texto.length() - vocales));
		String textoAlreves = new StringBuilder(texto).reverse().toString();
		System.out.println(textoAlreves);
		
	}

}
