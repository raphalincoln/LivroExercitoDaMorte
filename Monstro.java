package aventuralivrojogo;

import java.util.Scanner;

public class Monstro {

    String nomeMonstro;
    String statusMonstro;
    int habilidadeMonstro;
    int sorteMonstro;
    int energiaMonstro;

    void lerNomeMonstro() {
        TextoLivro monstro001 = new TextoLivro();
        //nomeMonstro = monstro001.trecho002MonstroNome;
        //energiaMonstro = monstro001.trecho002MonstroEne;
        //habilidadeMonstro = monstro001.trecho002MonstroHab;
    }

    void lerEnergiaMonstro() {
        
        //Dado dadoEnergiaMonstro1 = new Dado();
        //dadoEnergiaMonstro1.gerarNumero();
        //energiaMonstro = (dadoEnergiaMonstro1.somaDosDados);
    }

    void lerHabilidadeMonstro() {
        /*System.out.print("Qual a Habilidade do Monstro? ");
        Scanner teclado = new Scanner(System.in);
        int habilidadeMonstro01 = teclado.nextInt();
        habilidadeMonstro = habilidadeMonstro01;       */

        //Dado dadoHabilidadeMonstro1 = new Dado();
        //dadoHabilidadeMonstro1.gerarNumero();
        //habilidadeMonstro = (dadoHabilidadeMonstro1.somaDosDados);

        //Entrada de texto para o usuario informar o nome
    }

    void lerStatusMonstro() {
        /*if (energiaMonstro > 0) {
            statusMonstro = ("Vivo");
        } else {
            statusMonstro = ("Morto");
        }
        //System.out.println ("O Monstro Esta " + statusMonstro);*/
    }

    void cabecalhoMonstro() {
        System.out.println("___Jogo Livro - Cabeçalho Monstro_______");
        System.out.println("Nome do Monstro:       " + this.nomeMonstro);
        System.out.println("Pontos de Energia:     " + this.energiaMonstro);
        System.out.println("Pontos de Habilidade:  " + this.habilidadeMonstro);
        //System.out.println("Pontos de Sorte:       " + this.sorteMonstro);
        System.out.println("O Monstro está :       " + this.statusMonstro);
        System.out.println("________________________________________");
    }
}