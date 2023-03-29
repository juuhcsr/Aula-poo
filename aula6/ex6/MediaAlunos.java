package ex6;

import javax.swing.JOptionPane;

public class MediaAlunos {

    public static double calculaMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Digite a quantidade de alunos:");
        int qtdAlunos = Integer.parseInt(s);

        double[] notas = new double[qtdAlunos];
        for (int i = 0; i < qtdAlunos; i++) {
            String sNota = JOptionPane.showInputDialog("Digite a nota do aluno " + (i + 1) + ":");
            double nota = Double.parseDouble(sNota);
            notas[i] = nota;
        }

        double media = calculaMedia(notas);
        System.out.println("Média da Sala: " + media);
    }
}

