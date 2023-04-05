package ex3;

import javax.swing.JOptionPane;
public class Fatorial {

    public static int calculaFatorial(int x) {
        if (x < 0) {
            return -1;
        } else if (x == 0 || x == 1) {
            return 1;
        } else {
            int resultado = 1;
            for (int i = x; i > 0; i--) {
                resultado *= i;
            }
            return resultado;
        }
    }

    public static void main(String[] args) {
    	String s = JOptionPane.showInputDialog("Você quer calcular a fatorial de qual número ?");
        int x = Integer.parseInt(s);
        for (int i = x; i < x+4; i++) {
    	System.out.println("Fatorial de " + i +" é "+ calculaFatorial(i));
     
    }
}
}

