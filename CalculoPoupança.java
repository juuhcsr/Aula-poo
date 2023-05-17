import javax.swing.*;

public class CalculoPoupança {
  public static void main(String[] args) {
    try {
      double juros = Double.valueOf(
          JOptionPane.showInputDialog(null, "Informe a taxa de juros mensal (%):", "Poupex",
              JOptionPane.INFORMATION_MESSAGE));
      int anos = Integer.valueOf(
          JOptionPane.showInputDialog(null, "Informe o número de anos:", "Poupex", JOptionPane.INFORMATION_MESSAGE));
      double dep_mensal = Double.valueOf(
          JOptionPane.showInputDialog(null, "Informe o depósito mensal:", "Poupex", JOptionPane.INFORMATION_MESSAGE));

      JOptionPane.showMessageDialog(null, "O total é: " + calculaPoupanca(juros, anos, dep_mensal), "Resultado",
          JOptionPane.INFORMATION_MESSAGE);

    } catch (NumberFormatException ex) {
      JOptionPane.showMessageDialog(null, "Formato inválido", "Erro", JOptionPane.ERROR_MESSAGE);
    }
  }

  public static double calculaPoupanca(double juros, int anos, double dep_mensal) {
    int num_pagamentos = anos * 12;
    double total = 0;
    for (int i = 0; i < num_pagamentos; i++) {
      total = total + dep_mensal;
      total = total + total * (juros / 100);
    }
    return total;
  }
}
