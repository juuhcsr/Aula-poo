package ex4;

public class Idades_teste {

	public static void main(String[] args) {
	    Idades idades = new Idades();
	    idades.lerIdades();
	    System.out.println("Idade da pessoa mais nova: " + idades.idadeMaisNova());
	    System.out.println("Idade média das 40 pessoas: " + idades.idadeMedia());
	    System.out.println("% de pessoas entre 24 e 30 anos: " + idades.porcentagemEntre24e30() + "%");
	}

}
