package aprendiendojava.intro2;

import javax.swing.JOptionPane;

public class Intro2 {

    public static void main(String[] args) {
        String cadenita;
        int entero;
        char letra;
        double real;
                
        //entrada de datos con JOptionPane.showInputDialog("cadena");
        cadenita = JOptionPane.showInputDialog("Digita una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digita un entero: "));
        letra = JOptionPane.showInputDialog("Digita una caracter: ").charAt(0);
        real = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el número real: "));
        
        //salida de datos con JOptionPane.showMessageDialog(null, "La cadena a mostrar");
        JOptionPane.showMessageDialog(null, "La cadena es: "+cadenita);
        JOptionPane.showMessageDialog(null,"El número entero es: "+entero);
        JOptionPane.showMessageDialog(null, "El caracter es: "+letra);
        JOptionPane.showMessageDialog(null, "El real es: "+real);        
  }   
}