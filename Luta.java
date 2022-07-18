package aventuralivrojogo;

import java.util.Random;
import java.util.Scanner;

public class Luta {

    String nomeMonstro;
    String nomeJogador;
    int turno = 0;
    int dadoMonstroLuta1 = 0;
    int dadoMonstroLuta2 = 0;
    int dadoJogadorLuta1 = 0;
    int dadoJogadorLuta2 = 0;
    int sorteMonstro;
    int sorteJogador;
    int habilidadeMonstro;
    int habilidadeJogador;
    int ataqueMonstro = 0;
    int ataqueJogador = 0;

    int monstroEnergia;
    int jogadorEnergia;

    void luta() {

        System.out.println("*****Hora de Lutar*****");
        System.out.println("Lutando Contra:                  " + nomeMonstro);
        System.out.println("Pontos de Energia do Monstro:    " + monstroEnergia);
        System.out.println("Pontos de Habilidade do Monstro: " + habilidadeMonstro);
        System.out.println("Pontos de Energia do Jogador:    " + jogadorEnergia);
        System.out.println("Pontos de Habilidade do Jogador: " + habilidadeJogador);
    }
    //Trazendo os dados do Monstro

    void turno() {
        do {
            //Contagem de Turno
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            turno = turno + 1;
            System.out.println("Estamos no turno: " + turno);
            System.out.println("");
                
            // Dados do Montros
            Random dadoMonstro1 = new Random();   
            int dadoAtaqueMonstro1 = dadoMonstro1.nextInt();
            
            Random dadoMonstro2 = new Random();   
            int dadoAtaqueMonstro2 = dadoMonstro2.nextInt();
            
            System.out.println("Dado 1 do Monstro: " + dadoAtaqueMonstro1);
            System.out.println("Dado 2 do Monstro: " + dadoAtaqueMonstro2);
            System.out.println("");

            //Dados do Jogador
            
            Random dadoJogador1 = new Random();   
            int dadoAtaqueJogador1 = dadoJogador1.nextInt();
            
            Random dadoJogador2 = new Random();   
            int dadoAtaqueJogador2 = dadoJogador2.nextInt();
            
            System.out.println("Dado 1 do Jogador: " + dadoAtaqueJogador1);
            System.out.println("Dado 2 do Jogador: " + dadoAtaqueJogador2);
            System.out.println("");

            //Exibir dados pre luta
            ataqueJogador = dadoJogadorLuta1 + dadoJogadorLuta2 + habilidadeJogador;
            ataqueMonstro = dadoMonstroLuta1 + dadoMonstroLuta2 + habilidadeMonstro;
            System.out.println("Ataque do Monstro: " + ataqueMonstro);
            System.out.println("Ataque do Jogador: " + ataqueJogador);

            //Calculando o Turno
            if (ataqueMonstro == ataqueJogador) {
                System.out.println("Turno empatado");
                System.out.println("");
            } else {
                if (ataqueMonstro > ataqueJogador) {
                    System.out.println("Vitória do Monstro");
                    System.out.print("Jogador: " + jogadorEnergia + " -2 = " );
                    jogadorEnergia = jogadorEnergia - 2;
                    System.out.println(jogadorEnergia);
                } else if (ataqueMonstro < ataqueJogador) {
                    System.out.println("Vitória do Jogador");
                    System.out.print("Energia de " + nomeMonstro + " " + monstroEnergia + " -2 = " );
                    monstroEnergia = monstroEnergia - 2;
                    System.out.println(monstroEnergia);
                    System.out.println("");
                }
            }
        //Verificando Mortes
        if (jogadorEnergia == 0) {
            System.out.println("Jogador Morreu");
            System.out.println("Inicie uma Nova Aventura");
            //encerrar programa
            System.exit(0);
        } else {
            if (monstroEnergia <= 0) {
                System.out.println("Monstro Morreu - Vamos em Frente!");
                Scanner teclado = new Scanner(System.in);
                //Encerrar Rotina
            } else {
                System.out.println("Monstro ainda vive, vamos para o proximo Turno: ");
                System.out.println("*********************************************");
                Scanner teclado = new Scanner(System.in);
            }
        }
        System.out.println("Energia do Monstro: " + monstroEnergia);
        System.out.println("Energia do Jogador: " + jogadorEnergia); 
        Scanner teclado = new Scanner(System.in);
        String teste = teclado.nextLine();
    }while ((monstroEnergia > 0 && jogadorEnergia > 0) || (monstroEnergia < 0 && jogadorEnergia < 0));
    }

    public String getNomeMonstro() {
        return nomeMonstro;
    }

    public void setNomeMonstro(String nomeMonstro) {
        this.nomeMonstro = nomeMonstro;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getDadoMonstroLuta1() {
        return dadoMonstroLuta1;
    }

    public void setDadoMonstroLuta1(int dadoMonstroLuta1) {
        this.dadoMonstroLuta1 = dadoMonstroLuta1;
    }

    public int getDadoMonstroLuta2() {
        return dadoMonstroLuta2;
    }

    public void setDadoMonstroLuta2(int dadoMonstroLuta2) {
        this.dadoMonstroLuta2 = dadoMonstroLuta2;
    }

    public int getDadoJogadorLuta1() {
        return dadoJogadorLuta1;
    }

    public void setDadoJogadorLuta1(int dadoJogadorLuta1) {
        this.dadoJogadorLuta1 = dadoJogadorLuta1;
    }

    public int getDadoJogadorLuta2() {
        return dadoJogadorLuta2;
    }

    public void setDadoJogadorLuta2(int dadoJogadorLuta2) {
        this.dadoJogadorLuta2 = dadoJogadorLuta2;
    }

    public int getSorteMonstro() {
        return sorteMonstro;
    }

    public void setSorteMonstro(int sorteMonstro) {
        this.sorteMonstro = sorteMonstro;
    }

    public int getSorteJogador() {
        return sorteJogador;
    }

    public void setSorteJogador(int sorteJogador) {
        this.sorteJogador = sorteJogador;
    }

    public int getHabilidadeMonstro() {
        return habilidadeMonstro;
    }

    public void setHabilidadeMonstro(int habilidadeMonstro) {
        this.habilidadeMonstro = habilidadeMonstro;
    }

    public int getHabilidadeJogador() {
        return habilidadeJogador;
    }

    public void setHabilidadeJogador(int habilidadeJogador) {
        this.habilidadeJogador = habilidadeJogador;
    }

    public int getAtaqueMonstro() {
        return ataqueMonstro;
    }

    public void setAtaqueMonstro(int ataqueMonstro) {
        this.ataqueMonstro = ataqueMonstro;
    }

    public int getAtaqueJogador() {
        return ataqueJogador;
    }

    public void setAtaqueJogador(int ataqueJogador) {
        this.ataqueJogador = ataqueJogador;
    }

    public int getMonstroEnergia() {
        return monstroEnergia;
    }

    public void setMonstroEnergia(int monstroEnergia) {
        this.monstroEnergia = monstroEnergia;
    }

    public int getJogadorEnergia() {
        return jogadorEnergia;
    }

    public void setJogadorEnergia(int jogadorEnergia) {
        this.jogadorEnergia = jogadorEnergia;
    }
}
