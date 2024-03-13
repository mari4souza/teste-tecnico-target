// 4) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala 
// em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.
// Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada? 

/*
 * Acredito que há duas formas de se resolver este problema: 
 * 
 * 1. Pensando em um caso mais realista, no qual consigo fisicamente sentir a temperatura das lâmpadas: 
 * -> Ligo um dos interruptores
 * -> Aguardo alguns minutos até que a lâmpada esquente
 * -> Desligo este primeiro interruptor
 * -> Ligo o segundo interruptor
 * 
 *      Na primeira ida até a sala,
 *          - A lâmpada que está acesa é controlada pelo segundo interruptor
 *          - A lâmpada que está apagada, mas quente, é controlada pelo primeiro interruptor
 *          - A lâmpada que está apagada e fria, é controlada pelo terceiro interruptor
 * 
 *   Neste caso, eu conseguiria descobrir qual interruptor controla qual lâmpada com apenas uma visita até a sala onde estão as lâmpadas.
 * 
 *  1. Caso eu não tenha a possibilidade de verificar fisicamente, posso resolver com os seguintes passos:
 * -> Ligo um dos interruptores
 * -> Vou até a sala e verifico qual lâmpada este interruptor acende.
 */



import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {


    }
}


