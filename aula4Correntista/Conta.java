package aula4Correntista;

public class Conta {
    private int numeroConta;
    private double saldo;
    private Data dataAbertura;
    private Correntista correntista;

    public Conta(int numeroConta, Correntista correntista, Data dataAbertura) {
        this.numeroConta = numeroConta;
        this.correntista = correntista;
        this.dataAbertura = dataAbertura;
        this.saldo = 200.0; // saldo inicial de 200 reais
    }

    public Conta(String nome, String cpf, Data dataAbertura2, double saldoInicial) {
		// TODO Auto-generated constructor stub
	}

	public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo - valor >= 0) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (saldo - valor >= 0) {
            saldo -= valor;
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public String toString() {
        return "Conta " + numeroConta + " - " + correntista + ", aberta em " + dataAbertura + ", saldo: " + saldo;
    }

	public int getNumeroConta() {
		// TODO Auto-generated method stub
		return 0;
	}
}

