/* 

Desafio:
Desenvolva um programa que receba um número inteiro N como entrada e gere uma matriz NxN preenchida com valores inteiros sequenciais. O programa deve calcular a soma dos valores da diagonal principal da matriz e imprimir o resultado na saída padrão.

Dica: Os números que compõe a diagonal principal são aqueles que estão na posição linha = coluna

Entrada:
Um número inteiro N (1 <= N <= 100).

Saída:
Um número inteiro representando a soma dos valores da diagonal principal da matriz.

---------------

Exemplos:

Entrada:
2
Saída:
5

---------------

Entrada:
4
Saída:
34

---------------

Entrada:
5

Saída:
505
*/

import java.util.Scanner;

public class SomaDaDiagonalPrincipal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Crie um número inteiro n da entrada padrão e uma matriz quadrada de tamanho nxn:
            System.out.println("(2 == matriz[2][2]), (4 == matriz[4][4])...");
            System.out.print("Digite a matriz desejada: ");
            int n = sc.nextInt();
            int[][] matriz = new int[n][n];

            // Preencha a matriz com valores crescentes:
            int valor = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = valor;
                    valor++;
                }
            }

            // Calcule a soma dos elementos da diagonal principal da matriz:
            int soma = 0;
            for (int i = 0; i < n; i++) {
                soma += matriz[i][i];
            }

            // Imprima a soma dos elementos da diagonal principal da matriz:
            System.out.println("A soma dos elementos da diagonal principal é: " + soma);
        }
    }
}
