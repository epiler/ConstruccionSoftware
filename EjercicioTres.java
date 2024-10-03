package co.edu.tdea.EjercicioEvaluativo;
import java.util.Scanner;

public class EjercicioTres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String contraseña;
		String contraseñaR = "aa12345";
		
		
		
		do {
			
			System.out.println("Digite la contraseña: ");
			contraseña = sc.next();
			
			if(contraseña.equals(contraseñaR)) {
				System.out.println("Contraseña correcta");
			}else {
				System.out.println("Contraseña incorrecta, siga intentando");
			}
			
			
		}while(!contraseña.equals(contraseñaR));
		
		
		
		
		
		
		

	}

}
