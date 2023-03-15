package aula4Correntista;
import java.util.ArrayList;
import java.util.List;

public class RegistroContas2 {
    private List<Conta> contas;

    public RegistroContas2() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    public static void main(String[] args) {
        RegistroContas registro = new RegistroContas();

        Correntista correntista1 = new Correntista("111.111.111-11", "Fulano");
        Correntista correntista2 = new Correntista("222.222.222-22", "Ciclano");

        Conta conta1 = new Conta(1, correntista1, new Data(1, 1, 2022));
        Conta conta2 = new Conta(2, correntista2, new Data(1, 1, 2022));

        registro.adicionarConta(conta1);
        registro.adicionarConta(conta2);

        conta1.depositar(500);
        conta1.sacar(300);
        conta1.transferir(conta2, 100);

        registro.listarContas();
    }
}
