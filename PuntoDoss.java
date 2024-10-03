package Actividad;
import java.util.Scanner;

public class PuntoDoss {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		
		
		do {
			
			System.out.println("Digite un numero natural: ");
			num = sc.nextInt();
			
			
			if (num %2 != 0) {
				System.out.println("El numero " + num + " es impar");
				
				if (num % 9 == 0) {
					System.out.println("El numero "+num + "el multiplo de 9");
				}
				
			}
			
			
		}while(num % 5 != 0);
		
		
	}

}
