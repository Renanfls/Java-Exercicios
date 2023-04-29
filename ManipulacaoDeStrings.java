/* 
Desafio
Desenvolva um programa que receba uma string S como entrada e retorne a mesma string S com as vogais em caixa alta e as consoantes em caixa baixa. O programa deve imprimir a string gerada na saída padrão.

Entrada
Uma string qualquer.

Saída
A string informada com as vogais em caixa alta e as consoantes em caixa baixa.

------------------------

Exemplos:

Entrada:
Hello World

Saída:
hEllO wOrld

------------------------

Entrada:
Java eh a melhor linguagem de programacao

Saída:
jAvA Eh A mElhOr lIngUAgEm dE prOgrAmAcAO

------------------------

Entrada:
Kotlin eh a melhor linguagem de programacao depois do Java

Saída:
kOtlIn Eh A mElhOr lIngUAgEm dE prOgrAmAçãO dEpOIs dO jAvA
*/

import java.util.Scanner;

public class ManipulacaoDeStrings {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite uma string: ");
            String entrada = sc.nextLine();
            
            String saida = "";

            for (int i = 0; i < entrada.length(); i++) {
                char c = entrada.charAt(i);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    saida += Character.toUpperCase(c);
                } else {
                    saida += Character.toLowerCase(c);
                }
            }

            System.out.println("Saída: " + saida);

            sc.close();
        }
    }
}
