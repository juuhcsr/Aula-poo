import javax.swing.*;

public class InsertDuplo {
  public static void main(String[] args) {
    try {
      int num = Integer.valueOf(
          JOptionPane.showInputDialog(null, "informe o número", "Calcula Dobro", JOptionPane.INFORMATION_MESSAGE));

      JOptionPane.showMessageDialog(null, "O dobro é: " + num * 2, "Resultado", JOptionPane.INFORMATION_MESSAGE);

    } catch (NumberFormatException ex) {

      JOptionPane.showMessageDialog(null, "Formato inválido", "Error", JOptionPane.ERROR_MESSAGE);

    }

  }
}
