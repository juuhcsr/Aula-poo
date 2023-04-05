package ex5;

import javax.swing.JOptionPane;

public class ProdutoPorSoma {

    public static int calculaProduto(int num1, int num2) {
        int resultado = 0;
        for (int i = 0; i < num2; i++) {
            resultado += num1;
        }
        return resultado;
    }

    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String s2 = JOptionPane.showInputDialog("Digite o segundo número:");
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        int produto = calculaProduto(num1, num2);
        System.out.println("Produto: " + produto);
    }
}

