package aai;


public class TesteAlunos {
	 public static void main(String[] args) {
			Alunos a = new Alunos();
			a.setMedia1(8.5);
			a.setMedia2(7.3);
			a.setNome("julio");
			a.setRa("123456789");
			
			double mediaFinal = a.calculaMediaFinal();
			
			 System.out.println("Nome: " + a.getNome());
			 System.out.println("RA: " + a.getRa());
			 System.out.println("Média 1: " + a.getMedia1());
			 System.out.println("Média 2: " + a.getMedia2());
			 System.out.println("Média final: " + mediaFinal);
			  }
}

