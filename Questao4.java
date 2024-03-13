// 4) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala 
// em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.
// Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada? 

/*
 * Resolvendo o problema: 
 * 
 * 1. Pensando em um caso mais realista, no qual consigo fisicamente sentir a temperatura das lâmpadas: 
 * -> Ligo o interruptor A
 * -> Aguardo alguns minutos até que a lâmpada esquente
 * -> Desligo este primeiro interruptor
 * -> Ligo o segundo interruptor B
 * 
 *      Na primeira ida até uma das salas,
 *          - Se a lâmpada daquela sala está acesa, é controlada pelo B
 *          - Se a lâmpada daquela sala está apagada, mas quente, é controlada pelo A
 *          - Se a lâmpada daquela sala está apagada e fria, é controlada pelo terceiro interruptor, C
 * 
 * Neste caso eu conseguiria descobrir qual interruptor controla uma das lâmpadas e eliminaria este da jogada, sendo assim,
 * sobrariam dois outros interruptores.
 * -> Ligo um deles, por exemplo o interruptor B
 * 
 *      Na segunda ida até uma das salas, 
 *          - Se a lampada daquela sala está acesa, ela é controlada pelo interruptor B e consequentemente, a lâmpada da outra sala 
 *            é controlada pelo C.
 *          - Se o cenário for contrário e a lâmpada estiver apagada, então ela é controlada pelo C e a da outra sala pelo B. 
 * 
 * Dessa forma, eu saberia qual interruptor controla qual lâmpada visitando apenas duas das salas. :)     
 *         
 */


import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {


    }
}


