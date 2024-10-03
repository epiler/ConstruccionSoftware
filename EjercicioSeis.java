package co.edu.tdea.EjercicioEvaluativo;
import java.util.Scanner;
public class EjercicioSeis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		
		float notas;
		String respuesta = "";
		float sumaNotas = 0;
		int contador = 0;
		
		
		
		
		do {
			
			System.out.println("Ingrese sus notas: ");
			notas = sc.nextFloat();
			sumaNotas += notas;
			contador ++;
			System.out.println("Desea ingresar otra calificacion?(s/n)");
			respuesta = sc.next();
			
			
			
		}while(respuesta.equals("s"));
		
		
		System.out.println("El promedio de las calificaciones es: " + sumaNotas / contador);
		
		
		
		
		
		
		
		

	}

}
