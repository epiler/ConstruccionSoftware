package co.edu.tdea.EjercicioEvaluativo;
import java.util.Random;
import java.util.Scanner;

public class EjercicioDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int intentos = 0;
		
		
		int numeroSecreto = random.nextInt(100) + 1;
		
		
		
		while(num != numeroSecreto) {
			
			System.out.println("Digite el numero que considere el secreto: ");
			num = sc.nextInt();
			
			if(numeroSecreto > num) {
				System.out.println("Es mayor");
			}
			
			if(numeroSecreto < num) {
				System.out.println("Es menor");
			}
			
			intentos++;
			
		}
		
		
		System.out.println("Su numero de intentos fue: " + intentos);
		
		
		
		
		
		

	}

}
