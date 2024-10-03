package Actividad;

import java.util.Scanner;

public class PuntoUnoAct3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Ejercicio 1\n2. Ejercicio 2\n3. Ejercicio 3\n4. Ejercicio 4\n5. Salir");
            System.out.print("Digite la opción que quiera realizar: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Digite un número entero: ");
                    int num = sc.nextInt();

                    for (int i = 1; i <= num; i++) {
                        int aa = 2 * i - 1;
                        for (int j = 1; j <= i; j++) {
                            System.out.print(aa + " ");
                            aa -= 2;
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Digite un número entero positivo: ");
                    int num2 = sc.nextInt();

                    for (int i = num2; i >= 0; i--) {
                        System.out.print(i + (i > 0 ? " , " : ""));
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Digite un número entero: ");
                    int num3 = sc.nextInt();
                    int factorial = 1;

                    System.out.print(num3 + "! = ");
                    for (int i = num3; i > 0; i--) {
                        factorial *= i;
                        System.out.print(i);
                        if (i > 1) {
                            System.out.print(" x ");
                        }
                    }
                    System.out.print(" = " + factorial);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Ejercicio 4 no implementado.");
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);

     
    }
}
