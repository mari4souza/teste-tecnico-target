// 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores 
// (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele 
// calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int num = scan.nextInt();

        if (verificarFibonacci(num)) { // chamada da funcao 
            System.out.println("O número está na sequencia de Fibonacci");
        } else {
            System.out.println("O número não está na sequencia de Fibonacci");
        }

        scan.close();
    }

    public static boolean verificarFibonacci(int num) {
        int penultimo = 1;
        int antepenultimo = 0;

        while(antepenultimo <= num) { // roda ate antepenultimo atingir o numero recebido
            if (antepenultimo == num) { 
                return true;
            }

            // atualização dos numeros
            int numTemporario = penultimo + antepenultimo; //exemplo 3 e 5, numTemporario sera = 8
            antepenultimo = penultimo; // agora antepenultimo se torna 5
            penultimo = numTemporario; // e penultimo se torna 8
            
        }

        return false;
    }
}

// Entendendo:
// Primeira iteração: antepenultimo = 0 e penultimo = 1, entao numTemporario = 1
// Segunda iteração: antepenultimo = 1 e penultimo = 1, entao numTemporario = 2
// Terceira iteração: antepenultimo = 1 e penultimo = 2, entao numTemporario = 3
// Quarta iteração: antepenultimo = 2 e penultimo = 3, entao numTemporario = 5
// Quinta iteração: antepenultimo = 3 e penultimo = 5, entao numTemporario = 8
// E assim por diante...