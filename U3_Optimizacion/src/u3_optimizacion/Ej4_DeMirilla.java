package u3_optimizacion;
import java.util.Scanner;
public class Ej4_DeMirilla {
    public static void main(String[] args){
        int numero;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Escriba el numero:");
        numero = entrada.nextInt();
        
        switch(numero){
            case 1:
                System.out.println("Tengo un lagarto");
                break;
            case 2:
                System.out.println("Tengo un perro");
                break;
            case 3:
                System.out.println("Tengo un gato");
                break;
            case 4:
                System.out.println("Tengo una serpiente");
                break;
            case 5:
                System.out.println("Tengo un loro");
                break;
            default:
                System.out.println("no tengo mascota");
                break;
        }
    }
}




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
//        int numero;
//        Scanner entrada = new Scanner (System.in);
//        System.out.print("Escriba el numero:");
//        numero = entrada.nextInt();
//
//if (numero == 1) {
//    System.out.println("Tengo un lagarto");
//} else if (numero==3) {
//  System.out.println("Tengo un gato");
//} else if (numero==5) {
//  System.out.println("Tengo un loro");
//} else if (numero==4) {
//  System.out.println("Tengo una serpiente");
//} else if (numero==2) {
//  System.out.println("Tengo un perro");
//} else {
//  System.out.println("no tengo mascota");
//}  
//    }
//}
