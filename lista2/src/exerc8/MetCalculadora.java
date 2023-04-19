package exerc8;

public class MetCalculadora {

	
	static void calcula(double n1, double n2, int op){
		switch(op) {
		case 1:
		System.out.println(n1 + "+" + n2 + " = " + (n1+n2));
		break;
		case 2:
		System.out.println(n1 + "-" + n2 + " = " + (n1-n2));
		break;
		case 3:
		System.out.println(n1 + "*" + n2 + " = " + (n1*n2));
		break;
		case 4:
		System.out.println(n1 + "/" + n2 + " = " + (n1/n2));
		break;
		case 5:
		System.out.println(n1 + "^" + n2 + " = " + (Math.pow(n1, n2)));
		break;
		default:
		System.out.println("Operacao invalida!");
		}
		}
	
	
	public static void main(String[] args) {
		calcula(2.0, 3.0, 1); 
        calcula(4.0, 2.0, 2);
        calcula(5.0, 6.0, 3); 
        calcula(9.0, 3.0, 4); 
        calcula(2.0, 5.0, 5); 
        calcula(1.0, 1.0, 6);    
        }
	}
	
	
	
