package exerc5;




public class CalculadorArea {
	
	public static double areaQuadrado(double lado) {
		return lado*lado;
		}
	
	public static double areaTrianguloReto(double cateto) {
		return (cateto*cateto)/2;
		}
	
	public static double areaParalelogramo(double base, double altura) {
		return base*altura;
		}
	
	public static double custoMetal(double cm2) {
		return cm2*2.5;
		}
	
	public static double custoPlastico(double cm2) {
		return cm2*1.5;
		}
	
	public static void main(String[] args) {
	//System.out.println("Calculador de áreas de quadrado."+areaQuadrado(2.5));
	//System.out.println("Calculador de áreas de triângulo."+areaTrianguloReto(4));	
	//System.out.println("Calculador de áreas de Paralelogramo."+areaParalelogramo(4,2.5));
	//System.out.println("Calculador de preço de Metal."+custoMetal(16));
		 double tri3 = custoPlastico(areaTrianguloReto(5)*3);
	System.out.println("preço de 3 triangulos em plástico ="+tri3);
		 double pararelo2 =custoPlastico(areaParalelogramo(7.1,2.7)*2);
    System.out.println("preço de 2 Paralelogramo em plástico ="+pararelo2);
    	 double quadrado =custoMetal(areaQuadrado(4));
	System.out.println("preço de 1 quadrado em metal ="+quadrado);
		 double triangulometal = custoMetal(areaTrianguloReto(4));
	System.out.println("preço de 1 triangulos em metal ="+triangulometal);
	double total = tri3 + pararelo2 + quadrado + triangulometal;
	System.out.println("preço total  ="+total);
}
}
