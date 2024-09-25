package aprendiendojava.operadores;
public class clasemath {
    public static void main(String args[]) {
        double raiz = Math.sqrt(9);
        
        double base = 5, exponente = 2;
        double potencia = Math.pow(base, exponente);
        
        double numero = 4.56;
        long redondeo = Math.round(numero);
        
        System.out.print("Raiz: "+raiz);
        System.out.println("Potencia: "+potencia);
        System.out.println("Redondeo: "+redondeo);
    }
}
