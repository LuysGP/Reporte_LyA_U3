package u3_optimizacion;
import java.util.Scanner;
public class Ej3_Global {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Escriba el segundo entero:");
        int numero2 = entrada.nextInt();
        System.out.print("Escriba el primer entero:");
        int numero1 = entrada.nextInt();
        if(numero1 == numero2)
            System.out.printf("%d == %d\n",numero1, numero2);
        else if(numero1 < numero2)
            System.out.printf("%d < %d\n",numero1, numero2);
        else
            System.out.println(numero1 +">" +numero2);
    }
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package operadores;
//
//import java.util.Scanner;
//
//public class Operadores {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        Scanner entrada = new Scanner (System.in);
//        int numero1;
//        int numero2;
//        System.out.print("Escriba el segundo entero");
//        numero2 = entrada.nextInt();
//        System.out.print("Escriba el primer entero:");
//        numero1 = entrada.nextInt();
//        if(numero1 == numero2)
//            System.out.printf("%d == %d\n",numero1, numero2);
//        if(numero1 != numero2)
//            System.out.printf(numero1 +"!=" +numero2);
//            System.out.printf("\n");
//        if(numero1 < numero2)
//            System.out.printf("%d < %d\n",numero1, numero2);
//        if(numero1 > numero2)
//            System.out.printf(numero1 +">" +numero2);
//            System.out.printf("\n");
//        if(numero1 <= numero2)
//            System.out.printf("%d <= %d\n",numero1, numero2);
//        if(numero1 >= numero2)
//            System.out.printf(numero1 +">=" +numero2);
//            System.out.printf("\n");      
//    }
//}
