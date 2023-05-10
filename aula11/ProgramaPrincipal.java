package aula11;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramaPrincipal {
    
	public static void main(String[] args) throws IOException {
	    Conta conta = new Conta(1, 100.0, 5, false);
	    conta.mostraExtrato(); // Mostra extrato inicial
	    conta.setReserva(3);
	    conta.setDiaria(90.0);
	    conta.setDias(7);
	    conta.setGaragem(true);
	    conta.adicionarRefeicao(20.0);
	    File file = new File ("Cliente ");
		if (!file.exists()) {
	        try ( FileWriter f = new FileWriter("Cliente")) {
				f.write(conta.mostraExtrato()); // Mostra extrato final );
				f.close();}
	        catch (Exception e) {
		}
		}
			
		else { System.out.println(" arquivo já existe");
		System.exit(0);}
	}
}
