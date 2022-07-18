package aventuralivrojogo;

import java.util.Random;
import java.util.Scanner;

public class Jogador {

    String nomeJogador;
    int sorteJogador;
    String statusJogador;
    int energiaJogador;
    int habilidadeJogador;
    int ouroJogador;
    int soldadosTotal;
    int soldadoCavaleiro = 20;
    int soldadoElfo = 50;
    int soldadoAnao = 50;
    int soldadoGuerreiro = 100;

    void lerNomeJogador() {
        System.out.print("Vamos ecolher um nome para Seu Personagem: ");
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
        nomeJogador = nome;
    }

    void definirEnergiaJogador() {
        System.out.println("Para definir a energia, vamos rolar 2 dados e somar 12 a eles.");

        Random dado1a = new Random();
        int dado1 = dado1a.nextInt(6) + 1;
        System.out.printf("O Primeiro dado foi: %d\n", dado1);

        Random dado2a = new Random();
        int dado2 = dado2a.nextInt(6) + 1;
        System.out.printf("O Segundo dado foi: %d\n",  dado2);

        energiaJogador = dado1 + dado2 + 12;
        System.out.println("Sua Energia inicial é de: " + energiaJogador );
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();

    }

     void definirHabilidadeJogador() {
        System.out.println("Para definir a Habilidade, vamos rolar 1 dado e somar 6 a ele.");
        Random dado1a = new Random();
        int dado1 = dado1a.nextInt(6) + 1;
        System.out.println("O dado foi: " + dado1);
        habilidadeJogador = dado1 + 6;
        System.out.println("Sua Habilidade inicial é de: " + habilidadeJogador );
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
     }

    void definirSorteJogador() {
        System.out.println("Para definir a Sorte, vamos rolar 1 dado e somar 6 a ele.");
        Random dado1a = new Random();
        int dado1 = dado1a.nextInt(6) + 1;
        System.out.println("O dado foi: " + dado1);
        sorteJogador = dado1 + 6;
        System.out.println("Sua Sorte inicial é de: " + sorteJogador );
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
    }

    void definirStatusJogador() {
        if (energiaJogador > 0) {
            statusJogador = ("Vivo");
        } else {
            statusJogador = ("Morto");
        }

    }

    void cabecalho() {
        System.out.println("___Jogo Livro - Cabeçalho_____");
        System.out.println("Nome do Personagem:    " + this.nomeJogador);
        System.out.println("Pontos de Energia:     " + this.energiaJogador);
        System.out.println("Pontos de Habilidade:  " + this.habilidadeJogador);
        System.out.println("Pontos de Sorte:       " + this.sorteJogador);
        System.out.println("Você está :            " + this.statusJogador);
        System.out.println("Quantia de Ouro:       " + this.ouroJogador);
        System.out.println("Tamanho do Exercito:   " + this.soldadosTotal);
        System.out.println("______________________________");
        System.out.println("");
    }

    void definirOuro() {
        ouroJogador = 700;
    }

    void exercito() {
        soldadosTotal = soldadoAnao + soldadoCavaleiro + soldadoElfo + soldadoGuerreiro;
    }

}