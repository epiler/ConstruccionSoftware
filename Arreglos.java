package Ejercicios;

import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String textoA;
        
        String[] VB = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] VE = {"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "a"};

        
        
        do {
            System.out.println("   Menú  \n 1.Encriptar. \n 2.Desencriptar. \n 3.Salir  \n Digite el numero de la opcion que quiere: ");
            opcion = sc.nextInt();
            sc.nextLine();
           
            
            switch(opcion) {
                case 1:
                	
                	
                	 System.out.println("Digite texto: ");
                     textoA = sc.nextLine();
                	 String[] encriptar = textoA.toLowerCase().split("");
                     for(int i = 0; i < encriptar.length;i++) {
                         String letra = encriptar[i];
                         if (letra.equals(" ")) {
                        	 System.out.print(" ");
                         }else {
                         int ubicacion = 0;
                         for(int j = 0; j< VB.length;j++) {
                             if(VB[j].equals(letra)) {
                                 ubicacion = j;
                             

                            }
                        }
                        System.out.print(VE[ubicacion]);
                         }
                    }
                    System.out.println();
                    break;
                    
                    
                    
                    
                case 2:
                	
                	 System.out.println("Digite texto: ");
                     textoA = sc.nextLine();
                    String[] desencriptar = textoA.toLowerCase().split("");
                    for(int i = 0; i < desencriptar.length;i++) {
                        String letra = desencriptar[i];
                        if (letra.equals(" ")) {
                       	 System.out.print(" ");
                        }else {
                        int ubicacion = 0;
                        for(int j = 0; j< VE.length;j++) {
                            if(VE[j].equals(letra)) {
                                ubicacion = j;
                                break;
                            }
                        }
                        System.out.print(VB[ubicacion]);
                       	 }
                    }
                    System.out.println();
                    break;
                
            }
        }while(opcion != 3 );
    }
}







