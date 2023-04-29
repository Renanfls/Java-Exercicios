/* 

Desafio:
Implemente um algoritmo de ordenação por seleção para ordenar um array de inteiros.

Entrada:
Na primeira linha, informe a quantidade de números que deverá conter o Array. Na segunda linha em diante, informe os números que serão contidos no array.

Saída:
O array de inteiros ordenado.

---------------------

Exemplos:

Entrada:
6
3
6
2
1
9
5

Saída:
[1, 2, 3, 5, 6, 9]

---------------------

Entrada:
3
10
8
6

[6, 8, 10]

---------------------

Entrada:
5
3
4
2
1
5	

[1, 2, 3, 4, 5]
*/

import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoPorSelecao {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Lê o tamanho do array a partir da entrada padrão
            System.out.print("Digite o tamanho do array: ");
            int n = sc.nextInt();

            // Cria um novo array de inteiros com tamanho n
            int[] array = new int[n];

            // Crie um loop para ler n inteiros da entrada padrão e armazená-los no array:

            // Preenche o array com números inteiros lidos da entrada padrão
            System.out.println("Digite " + n + " números inteiros:");
            for (int i = 0; i < n; i++) {
                System.out.print("Digite o " + (i+1) + "º número inteiro: ");
                array[i] = sc.nextInt();
            }

            // Classifique o array em ordem crescente e imprima o array classificado:

            // Classifica o array em ordem crescente
            Arrays.sort(array);
            
            // Imprime o array de inteiros classificado em ordem crescente
            System.out.print("Array de inteiros classificado em ordem crescente: [");
            for (int i = 0; i < n; i++) {
                if (i == n-1) {
                    System.out.print(array[i]);
                } else {
                    System.out.print(array[i] + ", ");
                }
            }
        }
        
        // Crie um número inteiro da entrada padrão e um array de inteiros com tamanho n:
        
        System.out.println("]");
    }
}