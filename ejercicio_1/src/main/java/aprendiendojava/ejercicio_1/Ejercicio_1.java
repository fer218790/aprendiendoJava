package aprendiendojava.ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        float a, b,c, promedio;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("1° nota: ");
        a = input.nextFloat();
        System.out.print("2° nota: ");
        b = input.nextFloat();
        System.out.print("3° nota: ");
        c = input.nextFloat();
        
        promedio = (a+b+c)/3;
        System.out.println("\nEl promedio es: "+promedio);
    }
}
