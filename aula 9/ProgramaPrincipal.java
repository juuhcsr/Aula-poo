package hotel;

public class ProgramaPrincipal {
    
	public static void main(String[] args) {
	    Conta conta = new Conta(1, 100.0, 5, false);
	    conta.mostraExtrato(); // Mostra extrato inicial

	    conta.setReserva(3);
	    conta.setDiaria(90.0);
	    conta.setDias(7);
	    conta.setGaragem(true);
	    conta.adicionarRefeicao(20.0);
	    conta.mostraExtrato(); // Mostra extrato final
	}
}





