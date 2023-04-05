package aai;

public class Alunos_if {
	private double media1;
	private double media2;
	private String nome;
	private String ra;

	public Alunos_if(){
	media1 = 0.0;
	media2 = 0.0;
	nome ="";
	ra = "";
	}
	
	public double getMedia1(){
	return media1;
	}
	public void setMedia1(double media){
	media1 = media;
	}
	public double getMedia2() {
		return media2;
	}
	public void setMedia2(double media2) {
		if (media2 >= 0.0 && media2 <= 10.0) {
		      this.media2 = media2;
		    } else {
		      System.out.println("O valor da média 2 deve estar entre 0.0 e 10.0");
		    }
		  }
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
	    String novoNome = "";
		if (novoNome.length() > 3) {
	        nome = novoNome;
	      } else {
	        System.out.println("Erro: nome deve ter pelo menos 4 caracteres");
	      }
	    }
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
	    String novoRa = "";
		if (novoRa.length() > 8) {
	        ra = novoRa;
	      } else {
	        System.out.println("Erro: RA deve ter pelo menos 9 caracteres");
	      }
	    }
	  public double calculaMediaFinal() {
		    return 0.4 * media1 + 0.6 * media2;
		  }

}

