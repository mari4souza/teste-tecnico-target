public class Questao1 {
    public static void main(String[] args) {
        int i = 13;
        int soma = 0;
        int k = 0;

        while (k < i) {
            k = k + 1;
            soma = soma + k; // soma acumula os valores de k
        }

        System.out.println(soma); // ao final, o resultado será a soma dos numeros de 1 a 13, que é 91
    }
}

// Entendendo:
// k1, soma = k
// k2, soma = 3
// k3, soma = 6
// k4, soma = 10
// k5, soma = 15
// k6, soma = 21
// k7, soma = 28
// k8, soma = 36
// k9, soma = 45
// k10, soma = 55
// k11, soma = 66
// k12, soma = 78
// k13, soma = 91 //