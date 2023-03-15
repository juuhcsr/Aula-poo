package aula4Correntista;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RegistroContas {
    private List<Conta> contas;

    public RegistroContas() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta Conta) {
        contas.add(Conta);
        System.out.println("Conta adicionada com sucesso!");
    }

    void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("Não existem contas registradas.");
            return;
        } else {
        	   System.out.println("Lista de contas cadastradas:");
        	    for (Conta conta : contas) {
        	        System.out.println(conta);
        	    }
        	}
        }
  

    public void depositar() {
        int numeroConta = lerInteiro("Digite o número da conta:");
        double valor = lerDouble("Digite o valor a ser depositado:");

        Conta conta = buscarConta(numeroConta);

        if (conta != null) {
            conta.depositar(valor);
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void sacar() {
        int numeroConta = lerInteiro("Digite o número da conta:");
        double valor = lerDouble("Digite o valor a ser sacado:");

        Conta conta = buscarConta(numeroConta);

        if (conta != null) {
            conta.sacar(valor);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void transferir() {
        int numeroContaOrigem = lerInteiro("Digite o número da conta de origem:");
        int numeroContaDestino = lerInteiro("Digite o número da conta de destino:");
        double valor = lerDouble("Digite o valor a ser transferido:");

        Conta contaOrigem = buscarConta(numeroContaOrigem);
        Conta contaDestino = buscarConta(numeroContaDestino);

        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.transferir(contaDestino, valor);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Conta de origem ou conta de destino não encontrada.");
        }
    }

    private Conta buscarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    private int lerInteiro(String mensagem) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(mensagem);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Digite um número inteiro.");
                scanner.next();
            }
        }
    }

    private double lerDouble(String mensagem) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(mensagem);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Digite um número real.");
                scanner.next();
            }
        }
    }

    private void exibirMenu() {
        System.out.println("=== Menu ===");
        System.out.println("1. Adicionar conta");
        System.out.println("2. Listar contas");
        System.out.println("3. Depositar");
        System.out.println("4. Sacar");
        System.out.println("5. Transferir");
        System.out.println("0. Sair");
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarConta(criarConta());
                    break;
                case 2:
                    listarContas();
                    break;
                case 3:
                    depositar();
                    break;
                case 4:
                    sacar();
                    break;
                case 5:
                    transferir();
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println();
        } while (opcao != 0);
    }

    private Conta criarConta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados do correntista:");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Digite os dados da data de abertura da conta:");

        int dia = lerInteiro("Dia: ");
        int mes = lerInteiro("Mês: ");
        int ano = lerInteiro("Ano: ");

        Data dataAbertura = new Data(dia, mes, ano);

        double saldoInicial = 200.0;

        return new Conta(nome, cpf, dataAbertura, saldoInicial);
    }

    public static void main(String[] args) {
        RegistroContas registroContas = new RegistroContas();
        registroContas.executar();
    }



}



