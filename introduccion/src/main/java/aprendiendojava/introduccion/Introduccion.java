package aprendiendojava.introduccion;

import java.util.Scanner;

public class Introduccion {

    public static void main(String[] args) {
        //Primero asignamos la clase Scanner en una variable
        Scanner input = new Scanner(System.in);
        //Definimos una variable de tipo entera
        int entero;
        double real;
        String cadenita;
        char letra;
        
        System.out.println("Ingresa una cadena: ");
        cadenita = input.nextLine(); //next -> Solo guarda hasta el primer espacio
        
        System.out.println("Ingresa una letrita: ");
        letra = input.next().charAt(0); //charAt(0) -> indica que vamos a guardar solo la primera letra
        
        //Pedimos que se ingrese un valor por consola:
        System.out.print("Ingresa el número entero: ");
        //ese valor lo asignamos a numero:
        entero = input.nextInt();
        
        System.out.print("Ingresa el número real: ");
        real = input.nextDouble();
        
        
        
        
        //presentamos el valor en pantalla
        System.out.println("El número es: "+entero);
        System.out.println("El número real es: "+real);
        System.out.println("El valor de la cadena es: "+cadenita);
        System.out.println("El valor de la primera letra es: "+letra);        
        
        
    }
}