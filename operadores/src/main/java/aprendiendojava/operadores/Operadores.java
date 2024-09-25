package aprendiendojava.operadores;
import java.util.Scanner;
public class Operadores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Hacer un ejercicio que haga suma, resta, multiplicacion, division, resto
        
        float a,b,suma,resta,multi,divi,resto;
        
        System.out.println("Ingresa 2 numeritos: ");
        a = input.nextFloat();
        b = input.nextFloat();
        
        suma = a+b;
        resta = a-b;
        multi = a*b;
        divi=a/b;
        resto = a%b;
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multi es: "+multi);
        System.out.println("la division es: "+divi);
        System.out.println("El resto es: "+resto);
        
    }
}
