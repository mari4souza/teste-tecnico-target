public class Questao3 {
    public static void main(String[] args) {
        System.out.println("a) " + proximoElementoA(7));
        System.out.println("b) " + proximoElementoB(64));
        System.out.println("c) " + proximoElementoC(36));
        System.out.println("d) " + proximoElementoD(64));
        System.out.println("e) " + proximoElementoE(5,8));
        System.out.println("f) " + proximoElementoF(19));
    }

    public static int proximoElementoA(int ultimoTermo) {
        return ultimoTermo + 2;
    }

    public static int proximoElementoB(int ultimoTermo) {
        return ultimoTermo * 2;
    }

    public static int proximoElementoC(int ultimoTermo) {
        int raizQuadrada = (int) Math.sqrt(ultimoTermo); // math.sqrt retorna a raiz quadrada de um numero, e o int na frente é para transformar em inteiro
        return (raizQuadrada + 1) * (raizQuadrada + 1);
    }
    // Entendendo: a raiz quadrada de 9 é 3, adicionamos 1 e temos o valor 4 (que é o proximo numero natural). ai o multiplicamos por ele mesmo, para obter o quadrado, que é 16

    public static int proximoElementoD(int ultimoTermo) {
        int raizQuadrada = (int) Math.sqrt(ultimoTermo);
        return (raizQuadrada + 2) * (raizQuadrada + 2); // mesma lógica do anterior, porém adicionando 2 ao numero natural.
    }
    //Exemplo: raiz quadrada de 9 é 3, somando 2 da 5, que multiplicado por ele mesmo é 25(roximo numero da sequencia)

    public static int proximoElementoE(int penultimo, int ultimo) {
        return penultimo + ultimo;
    }
    // Fibonacci

    public static int proximoElementoF(int ultimoTermo) { // calcula o resto da divisão do ultimo termo por 6
        return ultimoTermo + ((ultimoTermo % 6 == 1 || ultimoTermo % 6 == 4) ? 8 : (ultimoTermo % 6 == 2 || ultimoTermo % 6 == 5) ? 2 : 4);
    } // Se restou 1 ou 4, incrementa 8. Se restou 2 ou 5, incrementa 2. Caso nao seja nenhuma das opcoes, incrementa 4.
    // O resultado aqui será a soma do ultimo termo com o valor determinado elos operadores ternários
    //Exemplo: ultimoTermo = 18, 18 % 6 = 0, entao retorna ultimoTermo = 18+4=20 (que é o proximo termo)
}
