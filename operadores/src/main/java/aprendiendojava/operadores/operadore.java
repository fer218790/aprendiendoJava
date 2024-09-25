package aprendiendojava.operadores;

import javax.swing.JOptionPane;

public class operadore {
    public static void main(String args[]) {
        
        double a,b;
        a = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer valor: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el 2do número: "));
        
        JOptionPane.showMessageDialog(null,"Suma: "+(a+b));
        JOptionPane.showMessageDialog(null, "Resta: "+(a-b));
        JOptionPane.showMessageDialog(null, "Multiplicación: "+(a*b));
        JOptionPane.showMessageDialog(null, "División: "+(a/b));
        JOptionPane.showMessageDialog(null, "Resto: "+(a%b));
    }
}
