// 5) Escreva um programa que inverta os caracteres de um string.
public class Questao5 {
    public static void main(String[] args) {
        String exemplo = "abcd";
        String resultado = inverter_String(exemplo);
        System.out.println(resultado);
    }

    public static String inverter_String(String s) {
        if (s.length() <= 1) { // Caso base
            return s;
        } else { // Retorna o ultimo caractere da string concatenado com a chamada recursiva
            return s.charAt(s.length() - 1) + inverter_String(s);
        }
    }
}

// Entendendo a recursividade no exercício
// retorna "d"(ultimo caractere) + inverter abc
// retorna "c"(ultimo caractere) + inverter ab
// retorna "b"(ultimo caractere) + inverter a

// inverter "a" retorna "a", pois o comprimento da string é 1
// agora "b" + "a" resulta em "ba"
// agora "c" + "ba" resulta em "cba"
// e finalmente, "d" + "cba" resulta em "dcba"

