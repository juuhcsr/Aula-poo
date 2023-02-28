package aula_2_dia_mes_e_ano;

public class Data {
		private int dia;
	    private int mes;
	    private int ano;

	    public Data(int dia, int mes, int ano) {
	        this.dia = dia;
	        this.mes = mes;
	        this.ano = ano;
	    }
	    
	    public void setData(int dia, int mes, int ano) {
	    	this.dia = dia;
	        this.mes = mes;
	        this.ano = ano;
	    }
	    
	    public String toString() {
	        return dia + "/" + mes + "/" + ano;
	    }
	    public int getDia() {
	    	return dia;
	    }
	    public int getMes() {
	    	return mes;
	    }
	    public int getAno() {
	    	return ano;
	    }
	    public void trocarCom(Data d2) {
	    	Data aux = new Data(this.dia, this.mes, this.ano);
	    	this.setData(d2.dia, d2.mes, d2.ano);
	    	d2.setData(aux.dia, aux.mes, aux.ano);
	    }
	    public void trocarComErrado(Data d2) {
	    	Data temp = this;
	    	this.setData(d2.dia, d2.mes, d2.ano);
	}
	    

	
	
}
