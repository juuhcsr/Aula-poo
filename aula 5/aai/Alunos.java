package aai;

public class Alunos {
	private double media1;
	private double media2;
	private String nome;
	private String ra;

	public Alunos(){
	media1 = 0.0;
	media2 = 0.0;
	nome ="";
	ra = "";
	}
	
	  public double getMedia1() {
		return media1;
	}

	public void setMedia1(double media1) {
		this.media1 = media1;
	}

	public double getMedia2() {
		return media2;
	}

	public void setMedia2(double media2) {
		this.media2 = media2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public double calculaMediaFinal() {
		    return 0.4 * media1 + 0.6 * media2;
		  }
}


