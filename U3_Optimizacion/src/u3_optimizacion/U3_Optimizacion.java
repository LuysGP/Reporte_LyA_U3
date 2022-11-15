package u3_optimizacion;
import java.util.Scanner;
public class U3_Optimizacion {
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           int valor;
           int suma = 0;
           for(int f = 1; f <= 10; f++){
               System.out.print("Ingrese el valor:");
               valor = teclado.nextInt();
               suma = suma + valor;
           }
           int promedio = suma / 10;
           System.out.println("La suma es: " + suma + "\n El promedio es: " + promedio);
    }
}
//      Ejemplo
//2.	package sentenciafor;
//3.	
//4.	import java.util.Scanner;
//5.	
//6.	public class SentenciaFor {
//7.	
//8.	    public static void main(String[] args) {
//9.	        Scanner teclado = new Scanner(System.in);
//10.	        int suma = 0; 
//11.	                int f; 
//12.	                int valor; 
//13.	                int promedio;
//14.	        for (f = 1; f <= 10; f++) {
//15.	            System.out.print("Ingrese valor:");
//16.	            valor = teclado.nextInt();
//17.	            suma = suma + valor;
//18.	        }
//19.	        System.out.print("La suma es:");
//20.	        System.out.println(suma);
//21.	        promedio = suma / 10;
//22.	        System.out.print("El promedio es:");
//23.	        System.out.print(promedio);
//24.	    }
//25.	}
