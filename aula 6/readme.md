1) Desenvolva classe e métodos, necessários para receber um número inteiro e positivo, escolhido pelo usuário, e apresentar os resultados da tabuada baseada no mesmo. Exemplo: Tabuada: Entrada: 5 (número escolhido pelo usuário) Saída: Tabuada do 5:
5 x 0 = 0
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45

2) Desenvolva classe e métodos, necessários para apresentar os 20 primeiros termos da Seqüência de Fibonacci. Cada termo desta seqüência é determinado pela soma dos dois termos anteriores, com exceção dos 2 primeiros (iguais a 1). Exemplo: Fibonacci: Termo: 1º 2º 3º 4º 5º 6º 7º 8º 9º ... 20º
Valor: 1, 1, 2, 3, 5, 8, 13, 21, 34, .. ?

Para saber um pouco mais a respeito da Seqüência de Fibonacci pesquise.

3) Crie uma classe Fatorial com um método calculaFatorial(int x) que calcula retorna o fatorial de x se este for um número inteiro positivo e -1 se x for negativo (fatorial(n) = n*(n-1)*(n-2)*(n-3)*(n-4)*....*3*2*1). Exemplos: Entrada:-1 Entrada: 0 Entrada: 1 Entrada: 2 Entrada: 3 Entrada: 4
Saída: -1 Saída: 1 Saída: 1 Saída: 2 Saída: 6 Saída: 24

4) Desenvolva classe e métodos, necessários para receber as idades de 40 pessoas e após isto, apresentar a idade da pessoa mais nova, a idade média das 40 pessoas e a porcentagem de pessoas com idade entre 24 e 30 anos, incluindo-os. Dados: 
- Idade Média das 40 pessoas = (Idade 1 + Idade 2 + Idade 3 + ... + Idade 40) / 40
- % Idade entre 24 e 30 anos = ( Quantidade de pessoas entre 24 e 30 anos / 40 ) * 100

5) Desenvolva classe e métodos, necessários para receber 2 números inteiros e positivos e apresentar o produto entre eles, porém, este cálculo sendo realizado, obrigatoriamente, através de somas sucessivas. Sendo: 3 x 5 = 3 + 3 + 3 + 3 + 3 = 15 e 5 x 3 = 5 + 5 + 5 = 15

Exemplo: Produto: Entradas: 3 e 5 Saída Produto:15

Material de autoria dos professores Carlos Menezes, José Papo e Robson Calvetti, à exceção dos marcados com asterisco (*), que foram retirados do e-book escrito por Alfredo Goldman , Fabio Kon e Paulo J. S. Silva, disponível em: http://introjava.incubadora.fapesp.br/portal/Arquivos/IntroCCcomJavaeOO.pdf

6) Desenvolva classe e métodos, necessários para calcular a média das notas dos alunos de uma sala de aula qualquer, sendo que em primeiro lugar deverá ser solicitada a entrada da quantidade de alunos existentes na sala e, posteriormente, a entrada de todas as notas dos alunos da mesma. sendo: Média = ( N1 + N2 + N3 + N4 + N5 + ... + Nm ) / m

Exemplo: Média da Sala: Entradas: 5 (alunos) e 5.5, 4.5, 3.0, 5.0 e 7.0 (notas)
Saída: Média da Sala: 5.0

7) Desenvolva classe e métodos, necessários para calcular o valor do PI ( ¶ ), através da série abaixo. Deverá ser solicitado o múmero de iterações desejada e, posteriormente, apresentado o resultado. Sendo: Iterações: 1 2 3 4 5 ...
Série PI = 4/1 - 4/3 + 4/5 - 4/7 + 4/9 - ...
Observação: Quanto maior for o número de iterações, mais preciso fica o valor do PI ( ¶ ). Para saber um pouco mais a respeito do PI ( ¶ ) acesse: http://www-groups.dcs.st-andrews.ac.uk/~history/HistTopics/Pi_through_the_ages.html

8) *Dado um número verificar se o mesmo possui dois dígitos consecutivos iguais. Para resolver este problema podemos usar um técnica denominada indicador de passagem, para isto, inicialmente vamos supor que o número não contém dígitos iguais. verificaremos cada par de dígitos consecutivos, caso algum deles seja igual saberemos que ele contém dígitos consecutivos iguais. Em outras palavras, vamos inicializar uma variável booleana com falso, vamos testar a condição para todos os dígitos consecutivos, se forem iguais mudamos a condição. Ao final, a resposta vai corresponder ao estado final desta condição.

9) Escreva uma classe e um método que calcule e exiba todos os divisores de um dado número inteiro positivo. Ex.:
a) Os divisores de 10 são: 1, 2, 5, 10.
b) Os divisores de 12 são: 1, 2, 3, 4, 6, 12.
c) Os divisores de 11 são: 1, 11.
DICA: Um número X é divisível por um Y se o resto da divisão de X por Y for zero.
