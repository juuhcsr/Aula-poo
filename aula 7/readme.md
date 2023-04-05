(TAREFA DIRIGIDA) Para treinar a construção de algoritmos em Java, vamos construir um programa que sabe calcular o custo de peças no estilo Tangram (https://pt.wikipedia.org/wiki/Tangram) . Para isso, precisamos calcular a área de diferentes formas geométricas e também o custo que teriam as peças construídas com essas formas, dependendo do tipo de material utilizado. Responda às questões seguintes. Caso tenha dúvida em um item, veja o gabarito, e então tente fazer o item seguinte sem olhá-lo. Repita até o final da atividade.

5. Para começar, crie a classe CalculadorArea abaixo e salve o arquivo.

class CalculadorArea {
public static void main(String[] args) { 
System.out.println("Calculador de áreas.");
}

a. I. Como deve ser o nome do arquivo? 

b. Crie um primeiro método estático, areaQuadrado, para calcular a área de um quadrado dado o tamanho do seu lado (uma variável do tipo double), em centímetros, conforme o código abaixo. 

public static double areaQuadrado(double lado) { 
return lado*lado;
}

I. Onde deve ser colocado o método AreaQuadrado no seu código? 

II. Modifique o seu main para imprimir a área de um quadrado com lado de tamanho 2.5.

III. É possível usar o método Math.pow para implementar o cálculo da área do quadrado. Como seria a chamada a esse método?


c. Crie um segundo método estático, areaTrianguloReto, para calcular a área de um triângulo reto cujos catetos têm a mesma medida (variável cateto, do tipo double), em centímetros. Coloque esse método no seu código e imprima a área de um retângulo reto de cateto 4 cm.


d. Crie um terceiro método estático, areaParalelogramo, para calcular a área de um paralelogramo dada a área da base e a altura (variáveis do tipo double), em centímetros. Coloque esse método no seu código e imprima a área de um paralelogramo com base 4 cm e altura 2.5.

e. Agora podemos calcular o custo de algumas peças. 

I. Na sua classe, defina dois atributos static do tipo double: custoMetal e custoPlastico, que correspondem ao custo por área de metal e plástico. Vamos assumir que o custo por cm2 para metal é de 2.5 e que para plástico é de 1.5. Obs.: como qualquer atributo, lembre-se de colocar essas variáveis fora de qualquer método do programa.

II. Calcule o custo de fazer um Tangram inteiramente de metal, nas dimensões 16 cm x 16 cm. Imprima o resultado.

III. Calcule o custo total para produzir as seguintes peças de reposição de Tangram: 3 triângulos de 5 cm de cateto cada, em plástico; 2 paralelogramos de base 7.1 cm e altura 2.7 cm, em plástico; 1 quadrado de lado 4 cm, em metal; e 1 triângulo de cateto 4 cm, também em metal. Imprima o resultado.

f. Adicione ao seu programa uma funcionalidade: ele solicita ao usuário que forneça os valores de custo por área de borracha (variável do tipo double). Então, ele usa esses valores para calcular o custo de um Tangram inteiramente de borracha, com dimensões 10.5x10.5 cm. Para ler entrada do usuário, use a classe Scanner (veja Seção 2.5 do livro-texto) e o método nextDouble().

6. Escreva um método que converta um valor em real (recebido em um parâmetro) para dólar e retorne o valor em dólar. A taxa de conversão real para dólar também será um parâmetro de entrada desse método. O valor em real, a taxa de conversão e o valor em dólar deverão ser do tipo float.

7. Escreva um método que determine quanto tempo leva para um corpo cair de determinada altura a partir do repouso. Este método receberá como parâmetro um valor do tipo double contendo a altura em centímetros em que o corpo está, e deverá retornar um valor do tipo double contendo o tempo da queda em segundos. Considere que a força da gravidade é igual a 9, 8m/s2. Use o método Math.sqrt()1 para obter a raiz quadrada.

8. A CBF resolveu cobrar uma multa para os jogadores que, no campeonato brasileiro, receberem cartões amarelos e vermelhos. Dados quatro números inteiros, representando o time, o número do jogador, o número de cartões amarelos e vermelhos do jogador, calcule o valor da multa, escrevendo a resposta na tela. Considere que a multa por cartão amarelo é de R$1000,20 e por cartão vermelho é de R$4523,75.

9. Escreva um aplicativo que solicite ao usuário inserir dois inteiros. Obtenha do usuário esses números e imprima sua soma, produto, diferença e quociente (divisão). Utilize as técnicas mostradas na Figura 2.7 do livro-texto.

10. Escreva um aplicativo para separar os dígitos de um número inteiro de 5 dígitos. Para isso, ele deve pedir que o usuário forneça um número consistindo em cinco dígitos, separar o número em seus dígitos individuais e imprimir os dígitos separados uns dos outros por três espaços. Por exemplo, se o usuário digitar o número 42339, o programa deve imprimir 4 2 3 3 9. Dica: use o comando “a % b”, que dá o resto da divisão de a por b.
