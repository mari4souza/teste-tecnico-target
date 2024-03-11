// a) 1, 3, 5, 7, - Regra: somando 2 ao ultimo termo
// b) 2, 4, 8, 16, 32, 64, - Regra: multiplicando o ultimo termo por 2
// c) 0, 1, 4, 9, 16, 25, 36, - Regra: é o quadrado do número natural da sequencia 12345...
// d) 4, 16, 36, 64, - Regra: O quadrado de uma sequencia de numeros naturais (somente pares) 2468..
// e) 1, 1, 2, 3, 5, 8, - Regra: Soma dos dois termos anteriores (Fibonacci)
// f) 2, 10, 12, 16, 17, 18, 19, - Regra: Apenas numeros naturais que começam com 'd'.

import java.util.Arrays;

public class Questao3 {
    public static void main(String[] args) {
        System.out.println("a) " + proximoElementoA(7));
        System.out.println("b) " + proximoElementoB(64));
        System.out.println("c) " + proximoElementoC(36));
        System.out.println("d) " + proximoElementoD(64));
        System.out.println("e) " + proximoElementoE(5, 8));
        System.out.println("f) " + proximoElementoDaSequencia(new int[]{2, 10, 12, 16, 17, 18, 19}));
    }

    public static int proximoElementoA(int ultimoTermo) {
        return ultimoTermo + 2;
    }

    public static int proximoElementoB(int ultimoTermo) {
        return ultimoTermo * 2;
    }

    public static int proximoElementoC(int ultimoTermo) {
        int raizQuadrada = (int) Math.sqrt(ultimoTermo); // math.sqrt retorna a raiz quadrada de um numero, e o int na
                                                         // frente é para transformar em inteiro
        return (raizQuadrada + 1) * (raizQuadrada + 1);
    }
    // Entendendo: a raiz quadrada de 9 é 3, adicionamos 1 e temos o valor 4 (que é
    // o proximo numero natural). ai o multiplicamos por ele mesmo, para obter o
    // quadrado, que é 16

    public static int proximoElementoD(int ultimoTermo) {
        int raizQuadrada = (int) Math.sqrt(ultimoTermo);
        return (raizQuadrada + 2) * (raizQuadrada + 2); // mesma lógica do anterior, porém adicionando 2 ao numero
                                                        // natural.
    }
    // Exemplo: raiz quadrada de 9 é 3, somando 2 da 5, que multiplicado por ele
    // mesmo é 25(roximo numero da sequencia)

    public static int proximoElementoE(int penultimo, int ultimo) {
        return penultimo + ultimo;
    }
    // Fibonacci

    public static int proximoElementoDaSequencia(int [] sequencia) {
        int [] arrayEsperado = {2, 10, 12, 16, 17, 18, 19};
        if (Arrays.equals(sequencia, arrayEsperado)) { // comparando os elementos dos arrays
            return 200;
        }

        return -1;
    }
}
