package aula_2_dia_mes_e_ano;

public class DataTeste {
	public static void main(String[] args) {
		// TODO auto-generated method stub
			Data d1 = new Data (21,4,1976);
		Data d2 = new Data (19,3,2002);
		System.out.println("data 1 :" +d1 );
		System.out.println("data 2 :" +d2 );
		d1.trocarCom(d2);
		System.out.println("Após troca" );
		System.out.println("data 1 :" +d1 );
		System.out.println("data 2 :" +d2 );
	}
}
