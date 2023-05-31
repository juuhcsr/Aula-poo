package hotel;

import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        try {
            int reserva = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da reserva:", "Hotel", JOptionPane.INFORMATION_MESSAGE));
            double diaria = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o preço da diária:", "Hotel", JOptionPane.INFORMATION_MESSAGE));
            int dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de dias:", "Hotel", JOptionPane.INFORMATION_MESSAGE));
            boolean garagem = JOptionPane.showConfirmDialog(null, "Utilizou a garagem?", "Hotel", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

            Conta conta = new Conta(reserva, diaria, dias, garagem);
            String extrato = conta.mostraExtrato();

            JOptionPane.showMessageDialog(null, extrato, "Extrato da Conta", JOptionPane.INFORMATION_MESSAGE);

            File file = new File("Cliente.txt");
            int count = 1;
            while (file.exists()) {
                String fileName = "Cliente" + count + ".txt";
                file = new File(fileName);
                count++;
            }

            try (FileWriter f = new FileWriter(file)) {
                f.write(extrato);
                JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso: " + file.getName(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Formato inválido", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

