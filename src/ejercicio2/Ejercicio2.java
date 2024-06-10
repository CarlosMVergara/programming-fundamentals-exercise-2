package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int numero, suma = 0, residuo;
        
        System.out.println("Ingrese un número: ");
        numero = leer.nextInt();
        
        while(numero > 0){
            residuo = numero%10;
            numero = numero/10;
            suma = suma + residuo;
        }
        
        System.out.println("La suma de los digitos es: " + suma);
        
    }
    
}
