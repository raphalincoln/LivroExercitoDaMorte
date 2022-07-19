package aventuralivrojogo;

import java.util.Scanner;

public class TextoLivro {

    int opcaoTexto;

    public void introducao() {
        System.out.println("Fama e fortuna são as duas coisas que a maioria dos aventureiros mais deseja. Tendo sobrevivido à infame Masmorra da Morte do Barão Sukumvit, você agora possui ambas. Parecia impossível que alguém pudesse atravessar o mortífero calabouço de Fang, mas, de alguma forma, você sobreviveu e clamou a bolsa com 20.000 peças de ouro do Desafio dos Campeões.");
        System.out.println("");
        System.out.println("Agora, sempre que caminha por Fang, você é festejado, e nas tavernas onde bebe, as pessoas perguntam sobre sua perigosa jornada através da mas morra. \"Havia um diabo de ossos na masmorra?\",  \"Você viu a linda sereia?\", \"Como você venceu a Rainha Lich?\", \"E como é o garra fria?\", \"Qual a cor do sangue de um orc mutante?\". Todos têm grande respeito por você e querem saber sobre a maligna masmorra. Mas toda essa atenção logo se torna cansativa e você resolve partir em uma nova aventura tão cedo quanto possível. Além disso, há uma nova ameaça para Allansia reunindo forças no leste. Antes de partir, você decide gastar parte do dinheiro do prêmio. Você encomenda a construção de um pequeno castelo na margem sul do Rio Kok enquanto você está em missão; com as 6.000 peças de ouro restantes, decide contratar soldados para formar um exército! Recentemente, tem havido avistamentos de um grande número de orcs e goblins na Floresta dos Demônios. Há rumores de que seu líder é Agglax, o Demônio das Sombras. ");
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("Demônios das sombras são servos dos Príncipes Demônios e comandantes das Legiões dos Amaldiçoados. Desde que foram banidos para o vazio depois da Primeira Batalha de Titä, entretanto, pensava-se que os Príncipes Demônios haviam sido derrotados para sempre. Mas, mesmo assim, um de seus servos parece ter sido avistado. A história vem de um velho mascate chamado Drek, que descobriu um templo abandonado perto de Zengis. Vasculhando o templo em busca de alguma coisa que pudesse vender, Drek encontrou um pote de barro negro, tampado e fechado com cera igualmente negra. Sua curiosidade se mostrou demasiada quando ele quebrou o pote em uma pedra, na esperança de que contivesse ouro ou joias. Mas sua emoção logo se transformou em pavor com o que aconteceu a seguir. Tão logo o pote negro se quebrou, Drek se viu ensurdecido pelo grito mais horrível e maligno que ele já tinha ouvido. Uma névoa começou a se formar lentamente, ficando cada vez maior e mais escura, até que se juntasse na forma de mantos ao redor de um corpo invisível, mas com olhos bastante visíveis e de um vermelho pulsante. Drek gritou amedrontado, mas o demônio das sombras que ele havia libertado simplesmente se virou e desapareceu. Era chegada a hora das crias do caos voltarem a ganhar força em Titã. ");
        Scanner teclado0 = new Scanner(System.in);
        System.out.println("");
        Scanner teclado1 = new Scanner(System.in);
        System.out.println(" Com o peso da história de Drek, você deixa avisos de recrutamento por toda a cidade de Fang. A honra de lutar ao lado de alguém com a sua fama - e ainda com o bônus do pagamento em ouro - forma uma longa fila de guerreiros do lado de fora da taverna onde você pensa em contratar seus soldados. Muitos vêm sozinhos, outros em grupo, mas todos estão ansiosos por se alistar em seu exército. Alguns contam antigas aventuras, outros falam de monstros que destruíram. Mas você sabe o que procura e, antes de o sol se pôr, suas tropas são escolhi das. Sem saber que perigos o esperam, você decide não contratar todos os guerreiros que apareceram, para guardar algum ouro para a viagem. Você faz as contas e descobre que contratou 100 guerreiros, 50 anões, 50 arqueiros élficos e 20 cavaleiros. De manhã você compra mantimentos, provisões e mulas para carregar tudo isso. Quando tudo está pago, você fica com 700 peças de ouro, que guarda em um baú de madeira e amarra em uma das mulas. Você então avança para o centro da cidade, onde seu pequeno exército está reunido. Cada líder de pelotão recebe uma flâmula amarela adornada com o símbolo de uma espada flamejante. Sob os festejos dos cidadãos de Fang, você lidera seu exército através do portão leste, rumo a um inimigo ainda desconhecido, porém mortífero.  ");
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("");
        //System.out.println(" TEXTO ");
        Scanner teclado3 = new Scanner(System.in);
        System.out.println("");
        Scanner teclado4 = new Scanner(System.in);
        System.out.println("Que a Aventura ComeÇe");
    }

    // 2 saidas
    void trecho001() {
        int trecho001a = 37;
        int trecho001b = 225;
        String validador = "Não Validado";
        System.out.printf("Vocês não marcharam nem duzentos metros quando um homem gordo e barbudo, bufando e respirando rápido, corre para alcançá-los. Está vestido como um capitão de navio, embora seu uniforme e sujo e amarrotado, e seu chapéu esteja igualmente esteja amassado. \"Com a sua licença\", arfa o imundo e o capitão, “será que você poderia ouvir minha proposta”, Acabei de atracar meu navio em Fang e descobri todo mundo está animado. Parece que você é a  causa. Disseram que você está viajando para o leste para enfrentar algum demônio ou coisa do gênero. Bom, eu não sei nada de demônios, mas posso levar você e seus homens no meu navio até Zengis, por um pequeno preço, é claro. Pense em todas milhas que você não vai precisar percorrer. Suba o Rio Kok no Tucano Voador, o bom navio do capitão Bammock. E tudo que peço pela luxuosa passagem são 50 peças de ouro. Não é um bom negócio?\", diz o velho cão do mar. Se quiser navegar no Tucano Voador, vá para %d. Se preferir continuar marchando, vá para %d", trecho001a, trecho001b);
        System.out.printf("Vá para : %d ou %d " + "\n", trecho001a, trecho001b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho001a || opcao == trecho001b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho001a, trecho001b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
        System.out.println("");
    }

// 2 saidas
    void trecho002() {
        int trecho002a = 386;
        int trecho002b = 140;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Com o escudo acima da cabeça, você começa a escalada. O glob pula de um lado para o outro nos galhos, procurando uma abertura para disparar contra você. Com apenas uma mão livre para escalar, você de repente perde o equilíbrio. Teste a sorte. Se for sortudo, vá para %d. Se for azarado, vá para %d.\n", trecho002a, trecho002b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho002a || opcao == trecho002b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho002a, trecho002b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// 2 saidas	
    void trecho003() {
        int trecho003a = 18;
        int trecho003b = 152;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Não tenho interesse em conversa\", diz o ladino com firmeza. \"Agora cale-se e vá embora\". Se qui ser fazer como ele diz e ir para outra mesa, onde três vagabundos estão sentados, vá para 18. Se preferir continuar falando, vá para %d." + "\n", trecho003a, trecho003b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho003a || opcao == trecho003b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho003a, trecho003b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho004() {
        int trecho004a = 316;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Cada elfo dispara duas flechas nos cinquenta demonios de fogo. Para descobrir quantos demônios de fogo caem do céu, multiplique o número de elfos em seu exército por dois, e então diminua o total de dois dados, rolados para descobrir a quantidade de tiros que erraram o alvo. Contra os demônios de fogo restantes, você deve conduzir uma escaramuça com trinta guerreiros. Se vencer, vá para %d.\n", trecho004a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho004a;
        opcaoTexto = opcao;
    }

// 2 saidas
    void trecho005() {
        int trecho005a = 270;
        int trecho005b = 211;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("A mochila atinge o alvo, fazendo a espada cair no chão com um barulho alto. A elfa começa a chorar aliviada quando você corta as cordas que a prendem. \"Obrigada\", geme ela. \"Obrigada por salvar minha vida\". Ela então tira um anel do dedo e diz: \"Por favor, fique com este anel como um símbolo de minha gratidão. Ele vai trazer-lhe boa sorte\". Se quiser ficar com o anel, vá para %d. Se preferir recusar o presente, pegar sua mochila e voltar a seus homens do lado de fora, vá para %d.\n", trecho005a, trecho005b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho005a || opcao == trecho005b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho005a, trecho005b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho006() {
        int trecho006a = 48;
        int trecho006b = 369;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Seu exército marcha pela trilha em uma coluna de dois homens de largura e avança rápido. A trilha termina em outra clareira. Aqui, você vê muitas lanças fincadas no chão, suas pontas para cima, com crânios humanos cravados nelas. Se quiser atravessar a clareira, vá para %d. Se preferir fazer a volta pela margem da clareira sob a proteção das árvores, vá para %d.\n", trecho006a, trecho006b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho006a || opcao == trecho006b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho006a, trecho006b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho007() {
        int trecho004a = 366;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Suas perdas foram maiores do que você imaginava. Dez guerreiros e dez elfos morreram a bordo do Tucano Voador, e cinco anões e quinze cavaleiros se afogaram no rio, afundando sob o peso de suasar maduras. Perca 1 ponto de SORTE. Os sobreviventes parecem mais confiantes agora que mais uma vez têm terra firme sob seus pés, e parecem prontos para marchar. Você decide partir de imediato, na esperança de chegar a Zengis no próximo dia. Vá para %d.\n", trecho004a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho004a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho008() {
        int trecho008a = 224;
        int trecho008b = 108;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("\"Boa resposta, meu amigo\", diz o oráculo. \"Agora, o teste final. Quero que você faça um truque mágico para mim. Você pode me ouvir, mas não pode me ver. Acho que deveríamos ficar em pé de igualdade. Torne-se invisível!\". Se tiver um saltador de estimação, vá para %d. Se não tiver tal criatura, vá para %d.\n", trecho008a, trecho008b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho008a || opcao == trecho008b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho008a, trecho008b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho009() {
        int trecho009a = 220;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho009a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho009a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho010() {
        int trecho010a = 297;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Todas as flechas erram o alvo, que sobe rápido, e logo o wyvern e seu cavaleiro não são mais do um ponto no céu, voando rumo ao horizonte leste. Consciente de que Agglax pode enviar mais assassinos, você dá a ordem para marchar para Garra, mas com suas tropas em uma formação muito mais fechada. Vá para %d.\n", trecho010a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho010a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho011() {
        int trecho011a = 221;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você não se sente diferente por ter bebido a água embora sinta-se mais refrescado. Nem envenenado nem com suas energias renovadas, você atravessa a caverna desapontado e desce o corredor na parede do outro lado. Vá para %d.\n", trecho011a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho011a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho012() {
        int trecho012a = 246;
        int trecho012b = 267;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Não muito depois da meia-noite, alguma coisa perturba seu sono e você acorda para ver um céu brilhante, iluminado pela lua. Mal movendo a cabeça você olha para a esquerda e para a direita e vê uma sombra se movendo perto de alguns barris amarrados no centro do navio. Não há nenhum sinal da sentinela na ponte e você sente perigo de imediato. Sacando a espada, você avança furtivo para os barris, caminhando agachado. Alguma coisa brilha, refletindo a luz da lua, e, sem nenhum aviso, é de repente arremessada contra você. Você se esquiva por instinto. Role dois dados. Se o resultado for igual ou menor que sua HABILIDADE, vá para %d. Se for maior, vá para %d.\n", trecho012a, trecho012b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho012a || opcao == trecho012b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho012a, trecho012b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho013() {
        int trecho013MonstroEne = 10;
        int trecho013MonstroHab = 9;
        String trecho013MonstroNome = ("Troll das Colinas");
        int trecho013a = 142;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Há um barulho alto de metal batendo em metal quando os dois exércitos se encontram. A luta é feroz e sangrenta e, embora em número muito menor, vocês ganham terreno. No centro da batalha, você se vê lutando com um dos maiores trolls de todos, o troll das colinas. Se vencer vá para¨%d.\n", trecho013a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho013a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho014() {
        int trecho014a = 388;
        int trecho014b = 60;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você é o único desafiante, pois ninguém mais tem vontade de enfrentar Barrigudão. O anão lhe diz que há uma bolsa com 100 peças de ouro para a pes soa que derrotar Barrigudão, e que a taxa de entrada é de 10 peças de ouro. Você paga a taxa e senta à mesa para esperar o retorno do campeão. Outro grito de aclamação parte da multidão quando o homem enorme volta à mesa. Dois outros anões surgem, cada um vestindo roupas de cozinheiro e carregando bandejas com tortas enormes ainda soltando fumaça. Barrigudão senta à mesa e puxa a cadeira para a frente, espremendo o estômago entre a mesa e a cadeira. Uma torta então é colocada à sua frente e você torce o nariz com o aroma misto de peixe e pudim de ovos. Você recebe uma colher de madeira e o anão então grita: \"Prontos! Atenção! Vai!\". Você enfia a colher na torta e começa a comer.\n" +
"Para determinar o vencedor, role um dado, some o resultado à sua HABILIDADE e anote o total. Depois, role o dado de novo e some o resultado à habilida de comer tortas de Barrigudão, que é 13. Anote o resultado também. Role o dado de novo e some o resultado ao seu valor atual e faça o mesmo para Barrigudão. Continue até que o valor de Barrigudão chegue a 40 primeiro (vá para %d) ou o seu próprio valor chegue a 40 primeiro (vá para %d). \n", trecho014a, trecho014b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho014a || opcao == trecho014b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho014a, trecho014b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho015() {
        int trecho015a = 87;
        int trecho015b = 181;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Por uma falha entre os arbustos, você vê a entrada de uma pequena caverna não muito longe da trilha. Se quiser dar uma olhada dentro da caverna, vá para %d. Se preferir continuar marchando, vá para %d.\n", trecho015a, trecho015b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho015a || opcao == trecho015b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho015a, trecho015b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho016() {
        int trecho016a = 350;
        int trecho016b = 49;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("A sentinela também consegue vencer seu atacante e agradece-lhe por dar o alarme. Você avisa para ele manter os olhos abertos tanto para a terra quanto para o rio. As outras sentinelas não reportam nada estranho, então você volta ao cobertor para dormir. Vocês continuam marchando de manhã cedo, esperando chegar a Zengis antes do cair da noite. Depois de uma hora e pouco, você encontra um velho vindo na direção contrária. \"Você é o tal que vai enfrentar Agglax, não é?\", diz ele, corajoso. \"Então sugiro que, quando chegar a uma bifurcação no rio, siga o braço que vai para o norte até chegar à aldeia de Garra. Há vários homens das colinas por lá, prontos para se juntar a seu exército\". Você agradece ao velho pela informação e aperta o passo para o leste. Depois de uma hora, você chega à bifurcação no rio que o velho comentou. Se quiser seguir pelo braço que vai para o norte, vá para %d. Se preferir cruzar o novo braço e seguir o rio principal para o leste, vá para %d.\n", trecho016a, trecho016b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho016a || opcao == trecho016b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho016a, trecho016b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho017() {
        int trecho017a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.println("Você faz uma curva no corredor e vê a silhueta de algo bloqueando o caminho. Parece uma forma humana, com mantos cobrindo a cabeça. Quando você se aproxima para dar uma olhada, a figura puxa o capuz, revelando o rosto de uma mulher com serpentes dançando no lugar de cabelo. Mirando os olhos vermelhos dela, você é pego pelo olhar da medusa. Seus membros se enrijecem de imediato e, pouco depois, você não passa de pedra sólida.\n");
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho017a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho018() {
        int trecho018a = 395;
        int trecho018b = 35;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você senta-se à mesa com os três vagabundos e eles se apresentam como Enk, Laz e Jip. Eles perguntam o que você está fazendo em Zengis. Se quiser contar sobre sua missão, vá para %d. Se preferir dizer que está em Zengis visitando um primo, vá para %d.\n", trecho018a, trecho018b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho018a || opcao == trecho018b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho018a, trecho018b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho019() {
        int trecho019a = 347;
        int trecho019b = 212;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("A moça sorri enquanto lhe alcança o prêmio e diz: \"Que tal uma gorjeta para uma garota trabalhadora?\". Se quiser jogar uma peça de ouro para ela, vá para %d. Se preferir deixar o salão de jogos, vá para %d.\n", trecho019a, trecho019b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho019a || opcao == trecho019b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho019a, trecho019b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho020() {
        int trecho020a = 341;
        int trecho020b = 263;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("\"Excelente!\", diz a voz do oráculo quando você tira o vaso da mochila. \"Agora vou fazer uma pergunta, mas vou deixar o destino decidir a dificuldade dela. Deixe-me jogar os dados\". Teste a sorte. Se for sortudo, vá para %d. Se for azarado, vá para %d.\n", trecho020a, trecho020b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho020a || opcao == trecho020b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho020a, trecho020b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho021() {
        int trecho021a = 159;
        int trecho021b = 74;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Antes que os salteadores do rio possam se aproximar do seu navio, a catapulta dispara outra bola de fogo. Se for sortudo , vá para %d. Se for azarado para %d.\n", trecho021a, trecho021b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho021a || opcao == trecho021b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho021a, trecho021b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho022() {
        int trecho022MonstroEne = 10;
        int trecho022MonstroHab = 10;
        String trecho022MonstroNome = ("Muda Formas");
        int trecho022a = 361;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Quando você entra no estábulo, o muda-formas joga o anão no chão e volta suas garras para você. Se vencer, vá para %d.\n", trecho022a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho022a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho023() {
        int trecho023a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("A uma distância tão curta, a rocha é mortal. Ela acerta a sua cabeça e você cai entre os outros bravos soldados que morreram para salvar Allansia. Desmoralizado, seu exército foge. Agglax é vitorioso.\n",trecho023a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho023a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho024() {
        int trecho024a = 220;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("O goblin cai da sela e desaba no chão, morrendo com o impacto. Uma busca nos bolsos dele revela uma corda de arco e cinco pontas de flecha, que não têm nenhuma utilidade para você, mas você também encontra um pingente de osso com o número \"8\" inscrito na base. Fique com o pingente se quiser, antes de dar a ordem para marchar para Garra. Vá para %d.\n", trecho024a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho024a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho025() {
        int trecho025a = 198;
        int trecho025b = 315;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você segura a corda e deixa o elfo descer pelo buraco escuro, segurando uma tocha entre os dentes. Você observa enquanto ele chega ao chão de uma câmara grande. \"Não há nada aqui\", diz ele lá de baixo, \"exceto pelo fedor horrível de fezes de animais. Há um túnel que sai da caverna, mas não consigo ver para onde ele vai. Quer que eu siga por ele?\". Se quiser que o elfo siga pelo túnel, vá para %d. Se pre ferir ordenar-lhe que suba de volta pela corda para que vocês possam deixar a clareira, vá para %d.\n", trecho025a, trecho025b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho025a || opcao == trecho025b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho025a, trecho025b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho026() {
        int trecho026a = 382;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você poupa a vida do taverneiro e permite que ele cambaleie até seus amigos. Então você se vira para a multidão e diz: \"Estou aqui em busca de guerreiros para se juntar a meu exército e lutar contra o demônio das sombras que traz morte para Allansia. Meu pagamento é de 10 peças de ouro, mas quero apenas os melhores\". Em meia hora, quinze guerreiros se alistam; você diz a eles onde devem ir. Eles devem se encontrar com Lexon, que fará os pagamentos (perca 150 peças de ouro de sua ficha de aventura). Como não encontra mais ninguém de interesse, você deixa o \"Dragão Negro\" para ver o que mais pode encontrar em Zengis. Vá para %d.\n", trecho026a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho026a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho027() {
        int trecho027a = 319;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("\"Bom, se você não quer visitar o oráculo, não há muitos motivos para ir até as Cavernas das Pedras das Estrelas. Há algum outro lugar aonde você gostaria de ir?\". Você responde dizendo que gostaria de atravessar a Floresta dos Demônios. Vá para %d.\n", trecho027a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho027a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho028() {
        int trecho028a = 182;
        int trecho028b = 143;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Dez dos elfos o acompanham enquanto você esgueira-se furtivo pela mata, espada na mão. Agora você consegue ouvir claramente gritos pedindo ajuda, enquanto corre rápido de trás de uma árvore para trás da próxima. De repente, à sua frente você vê uma gaiola suspensa por uma corda, pendurada em um galho. Você vê outra bem perto, com dois braços saindo por entre as grades de madeira. Você conta onze gaiolas no total, cada uma prendendo um homem. Se quiser se revelar aos homens nas gaiolas, vá para %D. Se preferir recuar silencioso para fora da mata e reunir-se a suas tropas, vá para %d.\n", trecho028a, trecho028b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho028a || opcao == trecho028b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho028a, trecho028b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho029() {
        int trecho029a = 130;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você vinga a morte de suas tropas com um golpe rápido da espada. Você ordena a seus guerreiros que retornem à trilha e continuem a marcha. Vá para %d.\n", trecho029a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho029a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho030() {
        int trecho030a = 358;
        int trecho030b = 390;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você paga 100 peças de ouro ao líder dos nortistas e ordena que ele e seus homens subam no navio. Quando vocês partem mais uma vez, o líder caminha na sua direção; apesar do olhar em seus olhos azuis como o gelo, você sente que pode confiar nele, \"Meu nome é Laas\", ele diz com um sorriso caloroso. \"Você me permitiria entregar-lhe um presente?\". Se quiser aceitar o presente, vá para %d. Se preferir recusar com educação, vá para %d.\n", trecho030a, trecho030b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho030a || opcao == trecho030b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho030a, trecho030b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho031() {
        int trecho031a = 232;
        int trecho031b = 300;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você desce peela escada de metal presa na lateral do muno até chegar no esgoto abaixo. O fedor horrivel subindo do lodo flutuando devagar quase o faz desistir e ir embora. Olhando esgoto abaixo, você ve o que parece ser a chama serpenteante de uma vela e consegue ouvir o som de uma voz sussurrante, Hoc está convencido de que deve haver mais goblins do esgoto à frente. Se quiser descer pelo esgoto, vá para %d. Se preferir voltar pela escada, vá para %d.\n", trecho031a, trecho031b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho031a || opcao == trecho031b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho031a, trecho031b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho032() {
        int trecho032a = 280;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("\"Você não é muito perspicaz, meu amigo\", o oráculo informa solenemente. \"Sou incapaz de ajudar qualquer um que não seja digno de meus poderes. Adeus\". Os olhos do rosto de pedra se fecham de novo e você fica ponderando sobre o que fazer a seguir. Você ouve um rangido às suas costas; virando-se para examinar, vê que uma seção da parede está deslizando de novo. Você não tem alternativa a não ser partir pelo túnel que apareceu. Vá para %d.\n", trecho032a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho032a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho033() {
        int trecho033a = 392;
        int trecho033b = 256;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Muitos homens esforçam-se através do pântano para ajudá-lo, atacando o moedor de barro por todos os lados. Mas seu couro é difícil de perfurar e tudo que você pode fazer é se defender. Você percebe que terá de atacar o abdome macio da criatura, então avança com a espada enquanto o moedor de barro se ergue nas patas de trás para atacar alguns anões à esquerda. Role dois dados. Se o total for igual ou menor que sua HABILIDADE, vá para %d. Se for maior, vá para %d.\n", trecho033a, trecho033b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho033a || opcao == trecho033b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho033a, trecho033b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho034() {
        int trecho034a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vinte guerreiros cruzam com segurança antes que você mesmo pise na ponte. Você está quase na metade quando de repente uma corda arrebenta, derrubando todos da ponte rumo à morte no fundo do abismo.\n", trecho034a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho034a;
        opcaoTexto = opcao;
    }

// Tres Saidas
    void trecho035() {
        int trecho035a = 92;
        int trecho035b = 223;
        int trecho035c = 311;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf("\"Estranho\", diz Enk. \"Muitas pessoas parecem vir a Zengis para visitar seus primos. Ninguém nunca parece vir aqui a negócios - não que a gente não acredite em você, nada disso. Onde mora o seu primo? Talvez a gente possa ajudar com indicações\". Você vai responder:\n" +
                            "Na Rua do Cascalho? Vá para %d\n" +
                            "Que não é da conta deles? Vá para %d\n" +
                            "Que você precisa ir? Vá para %d\n", trecho035a, trecho035b, trecho035c);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho035a || opcao == trecho035b || opcao == trecho035c) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d. ", trecho035a, trecho035b, trecho035c);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }

// uma saida
    void trecho036() {
        int trecho036a = 180;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("\"Vamos, siga-me\", Thog diz jovialmente, para elevar o moral das tropas. \"Não há nada além de algumas árvores e alguns macacos\". Aventurando-se pela floresta, a luz do dia vai ficando mais fraca rapidamente, com as grossas copas de árvores acima e o lugar inteiro está quieto como a morte. \"As criaturas estão nos observando\", sussurra Thog. \"Mas os pequenos ao longo da borda da floresta não no farão mal. Precisamos nos preocupar é com os que vamos encontrar mais tarde. Vamos direto por aqu para evitar os homens-árvore\". Seu exército avança pela floresta, rumo às profundezas mais escuras. Va para %d.\n", trecho036a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho036a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho037() {
        int trecho037a = 145;
        int trecho037b = 346;
        String validador = "Não Validado";
        System.out.printf("Seguindo o Capitão Barnock, você lidera seus ho mens pelas docas onde o Tucano Voador está atracado. É um navio velho e, como o capitão, está em condições deploráveis. Mas isso dificilmente o surpreende, pois nada de muito valor costuma sair de Porto Areia Negra. Você ordena a seus homens que subam no navio e paga 50 peças de ouro ao Capitão Barnock . O capitão grita as ordens para partir, e você observa a tripulação da ponte enquanto eles recolhem as cordas, sobem pelos cordames e abrem as velas. Vinte minutos depois, Fang já desapareceu da vista e sua jornada está começando. Todos estão animados e até mesmo os elfos e anões esquecem suas diferenças e conversam entre si, unidos por seu desejo de livrar Allansia do demônio das sombras. Na proa você vê um grupo de guerreiros inclinando-se por cima da amurada do navio, observando o rio. Um deles de repente aponta rio acima e grita: \"Vejam! Um barril flutuando na nossa direção\". Você olha e vê o barril grande, fechado, flutuando pela água. Se quiser ordenar a seus homens que mergulhem para recolher o barril, vá para %d. Se preferir navegar sem parar, vá para %d. ", trecho037a, trecho037b );
        //System.out.printf("Vá para : %d ou %d " + "\n", trecho037a, trecho037b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho037a || opcao == trecho037b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Seguindo o Capitão Barnock, você lidera seus ho mens pelas docas onde o Tucano Voador está atracado. É um navio velho e, como o capitão, está em condições deploráveis. Mas isso dificilmente o surpreende, pois nada de muito valor costuma sair de Porto Areia Negra. Você ordena a seus homens que subam no navio e paga 50 peças de ouro ao Capitão Barnock . O capitão grita as ordens para partir, e você observa a tripulação da ponte enquanto eles recolhem as cordas, sobem pelos cordames e abrem as velas. Vinte minutos depois, Fang já desapareceu da vista e sua jornada está começando. Todos estão animados e até mesmo os elfos e anões esquecem suas diferenças e conversam entre si, unidos por seu desejo de livrar Allansia do demônio das sombras. Na proa você vê um grupo de guerreiros inclinando-se por cima da amurada do navio, observando o rio. Um deles de repente aponta rio acima e grita: \"Vejam! Um barril flutuando na nossa direção\". Você olha e vê o barril grande, fechado, flutuando pela água. Se quiser ordenar a seus homens que mergulhem para recolher o barril, vá para %d. Se preferir navegar sem parar, vá para %d.\n", trecho037a, trecho037b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho038() {
        int trecho038a = 266;
        int trecho038b = 331;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você encontra uma trilha apagada que leva na direção norte-sul. Você decide segui-la para o sul e logo chega a uma placa que também aponta para o sul que diz: \"Karn - 8 quilômetros\". Se quiser continuar para o sul rumo a Karn, vá para %d. Se preferir rumar na direção sudeste, vá para %d.\n", trecho038a, trecho038b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho038a || opcao == trecho038b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho038a, trecho038b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho039() {
        int trecho039a = 254;
        int trecho039MonstroEne = 10;
        int trecho039MonstroHab = 10;
        String trecho039MonstroNome = ("Fanatico de Elite");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Agglax encolhe-se na cadeira quando ve o cristal de luz em suas mãos. Cobrindo o rosto com as mãos, ele de repente salta da cadeira e foge, gritando ordens para um grupo próximo de sua elite de fanáticos vestidos de negro. Um deles bloqueia seu caminho até Agglax; a espada de lâmina curva dele está erguida acima da cabeça, segura com as duas mãos, com o assassino mais do que disposto a morrer para salvar seu mestre. \"Tanaka San diz que vocês morrem!\", ele grita enquanto dardeja à frente para matá-lo.\n" +
"FANATICO DE ELITE\n" +
"HABILIDADE 10 \n" +
"ENERGIA 10\n" +
"Se vencer, vá para %d.\n", trecho039a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho039a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho040() {
        int trecho040a = 382;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você diz ao taverneiro que não tem tempo nem vontade de se fazer de bobo para seus clientes com truques de bêbado, e que você está aqui para contratar guerreiros bravos que desejem lutar contra Agglax, o demônio das sombras. O taverneiro franze as sobrancelhas espessas e negras e de repente se mostra muito interessado no que você está dizendo. \"Bom, por que você não me disse isso logo de cara?\", diz ele com um sorriso que de repente ilumina sua face. \"Conheço todos os melhores guerreiros da cidade e a maioria deles está aqui agora mesmo!\". Em meia hora, quinze guerreiros se alistam; você diz a eles onde devem ir para se juntar a seu exército que o espera; eles devem se encontrar com Lexon, que fará os pagamentos (perca 150 peças de ouro de sua ficha de aventura). Você finalmente cumprimenta o enorme taverneiro e deixa o \"Dragão Negro\" para procurar por outras coisas e pessoas de interesse em Zengis. Vá para %d.\n", trecho040a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho040a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho041() {
        int trecho041a = 382;
        int trecho041MonstroEne = 11;
        int trecho041MonstroHab = 7;
        String trecho041MonstroNome = ("Max");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você está de pé no centro do aposento, espada na mão, para enfrentar a guerreira. Sem aviso, ela de repente se joga para frente, cortando para baixo com a espada. Você ergue a espada por instinto para proteger-se do golpe. \n" +
"MAX\n" +
"HABILIDADE 11 \n" +
"ENERGIA 7\n" +
"Se for o primeiro a acertar um golpe, vá para %d. Se Max acertar o primeiro golpe, vá para %d.\n", trecho041a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho041a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho042() {
        int trecho042a = 206;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Beber a Água dos Deuses o salvou de uma morte horrível. O brilho radiante vai se esvaindo devagar e logo você volta ao normal. Você dá uma olhada ao redor da caverna e não encontra nenhuma saída. O rosto de um homem foi esculpido na parede rochosa, com os olhos fechados e a boca aberta. Quando você se aproxima para examiná-lo mais de perto, os olhos se abrem e uma voz profunda retumba da boca, dizendo: \"Sou o oráculo. Embora você não seja bem-vindo aqui, admiro sua determinação e esforço. Não importa o quão nobre seja sua causa, você deve pagar pelas respostas. Também farei perguntas. Responda qualquer uma delas de maneira incorreta e pagará com a vida. Começarei os procedimentos, pois sei de tudo, Primeiro, você vai começar a me dar presentes. Você esteve em Zengis recentemente. Espero que tenha tirado um tempo para comprar uma coruja de latão, e preciso saber quanto você pagou por ela\". Se tiver uma coruja de latão, tente lembrar de quantas peças de ouro pagou por ela e vá para o parágrafo de número correspon dente. Se não tiver uma coruja de latão, vá para %d.\n", trecho042a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho042a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho043() {
        int trecho043a = 188;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Agora, muitos de seus homens já estão acordados; nenhum deles parece ter se ferido, com exceção da sentinela cuja cabeça está sendo cuidada, tendo sido atacada pelas costas por um salteador noturno. Um homem adicional é colocado de sentinela enquanto todos os outros ajeitam-se para voltar a dormir. Não muito depois do amanhecer, o Capitão Barnock dá a ordem de continuar viagem rio acima. Vá para %d.\n", trecho043a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho043a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho044() {
        int trecho044a = 297;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("\"Você está com sorte, meu amigo\", continua o oráculo. \"Mas sou muito ambicioso e quero mais alguma coisa. Você tem um vaso verde que poderia me dar?\". Se tiver um vaso verde e conseguir se lembrar de quantas peças de ouro ele custou, vá para a referência de mesmo número. Se não tiver um vaso verde, vá para 297.\n", trecho044a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho044a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho045() {
        int trecho045a = 130;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("O anel serve no dedo e você olha espantado quando o punho cerrado começa a abrir devagar. Brilhando no centro da mão de pedra há um bonito cristal. Os labios do rei de repente abrem e uma voz retumba \"Eu lhe dou o cristal de luz!\". Você pega o cristal. Corre de volta para as tropas que o esperam, completamente animado. Depois de mostrar-lhes o te souro, vocês marcham pela trilha. Vá para%d.\n", trecho045a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho045a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho046() {
        int trecho046a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("A chave gira e você ouve um clique baixo. Você então ouve um sibilo e inala um pouco do gás que está escapando da fechadura. Trata-se de um veneno mortal e você desaba no chão, agarrando a garganta e tentando respirar. Sua missão acabou.\n", trecho046a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho046a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho047() {
        int trecho047a = 245;
        int trecho047b = 218;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("\"Tenho certeza que este corvo será uma ótima com panhia. Seu nome é Billy e ele até compreende as palavras do idioma ore. Dez peças de ouro é um óti mo preço por ele\". Se quiser comprar o corvo, vá para %d. Se preferir deixar a loja, vá para %d.\n", trecho047a, trecho047b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho047a || opcao == trecho047b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho047a, trecho047b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho048() {
        int trecho048a = 98;
        int trecho048b = 315;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Um calafrio corre por sua espinha enquanto você avança por entre as lanças. No centro da clareira você encontra um monte de terra recém revirada e uma pá. Se quiser cavar no monte de terra, vá para %d. Se preferir continuar caminhando, vá para %d.\n", trecho048a, trecho048b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho048a || opcao == trecho048b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho048a, trecho048b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho049() {
        int trecho049a = 128;
        int trecho049b = 279;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("O resto do dia passa sem nenhum incidente e, quando a luz começa sumir, você dá a ordem para preparar um acampamento em um ponto defensável a não mais de vinte quilômetros de distância de Zengis. Enquanto se ajeita para dormir, depois de ter jantado coelho cozido, sua mente repassa os eventos do dia, mas em segundos você pega no sono. Se estiver usando um amuleto de besouro no pescoço, vá para %d. Se não estiver usando este amuleto, vá para %d.\n", trecho049a, trecho049b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho049a || opcao == trecho049b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho049a, trecho049b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho050() {
        int trecho050a = 219;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Cedo no outro dia você acorda seus homens e logo vocês estão marchando para o sudeste. No final da tarde você vê uma fila de colinas ao longe. \"As Cavernas das Pedras das Estrelas\", diz um homem de Zengis. Você chega antes do anoitecer e decide entrar sozinho. Com uma vela em uma mão e a espada na outra, você adentra na caverna enorme e escura. Vá para %d.\n", trecho050a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho050a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho051() {
        int trecho051a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Ninguém tem beladona. Uma hora depois você está tremendo incontrolavelmente com uma febre horrível. Começam a nascer pelos em seus braços e bochechas, e seu rosto começa a se transformar até parecer com o do lobisomem que o mordeu. Observando horrorizados, seus soldados tomam a angustiante decisão de acabar com seu sofrimento. Com o líder morto o moral se vai, e seu exército então abandona a cruzada contra Agglax.\n", trecho051a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho051a;
        opcaoTexto = opcao;
    }

// Tres Saidas
    void trecho052() {
        int trecho052a = 197;
        int trecho052b = 378;
        int trecho052c = 18;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf("Dois minutos depois, você vê uma tabuleta torta pendurada sobre a porta de um prédio velho, O desenho tosco de um dragão está pintado nela, acima das palavras \"Dragão Negro\". Há muitas risadas e gritaria vindo de dentro da taverna e você decide entrar. Você sobe alguns degraus bastante usados e empurra a pesada porta de carvalho. Embora seja dia, a taverna está escura do lado de dentro e há velas acesas, pois as janelas pequenas e sujas não permitem a entrada de muita luz. Da entrada você vé que a taverna está agitada, embora ninguém pareça muito amigável. Grupos de vagabundos encapuzados estão sentados em cantos escuros, enquanto ladinos animados, de comportamento ainda pior devido a toda a cerveja que já beberam, estão senta dos no meio da taverna, insultando todos que passam por eles, incluindo as garçonetes que precisam se espremer entre as mesas carregando as bandejas cheias. Você olha de mesa em mesa, decidindo onde sentar. Você vai:\n" +
"\n" +
"Sentar-se ao bar? Vá para %d\n" +
"Sentar com um ladino bêbado? Vá para %d \n" +
"Sentar-se com três vagabundos? Vá para %d.\n", trecho052a, trecho052b, trecho052c);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho052a || opcao == trecho052b || opcao == trecho052c) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d. ", trecho052a, trecho052b, trecho052c);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }

// uma saida
    void trecho053() {
        int trecho053a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você logo chega a um beco sem saída e, sentindo perigo, vira-se e corre. Mas antes que você possa alcançar a entrada da boca, um dente de pedra do teto desliza para bloquear a saída. Preso dentro de túnel, a morte por inanição o espera.\n", trecho053a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho053a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho054() {
        int trecho054a = 209;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Meia hora depois de comer as maçãs, alguns dos soldados começam a ficar doentes, você entre eles. Perca 2 pontos de ENERGIA e 1 de HABILIDADE. Sua saúde começa a deteriorar-se rápido, e dois deles morrem. Antes do fim do dia, cinco estão mortos, Faça as deduções apropriadas em sua ficha de aventura e também perca 1 ponto de SORTE. Você se arrepende da decisão de dar as maçãs para seus homens e resolve não se deixar distrair de seu objetivo principal no futuro. Vá para %d .\n", trecho054a);
        System.out.printf("Vá para %d .\n", trecho054a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho054a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho055() {
        int trecho055a = 114;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("O servo de Agglax jaz imóvel no chão, sua espada tendo penetrado no único ponto macio de seu corpo, uma pequena seção do estômago duro como pedra. Satisfeito que o homem de pedra não continuara lutando pelo lado do mal de novo, você dá a ordem para continuar a marcha. Vá para %d .\n", trecho055a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho055a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho056() {
        int trecho056a = 382;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Sem saber se tomou a decisão correta ao confiar no vagabundo, você entrega as 100 peças de ouro. Laz tira um mapa de dentro dos mantos e coloca-o sobre a mesa. Zengis está bem no meio, e para o sul está marcada a vila de Karn. Mais para o sudeste ficam as Cavernas das Pedras das Estrelas. Para o leste de Zengis fica a Floresta dos Demônios, que começa onde o Rio Kok se bifurca e corre para o leste, quase na borda do mapa. Laz pega um lápis e mar ca uma cruz grande na borda do mapa, bem onde termina a Floresta dos Demônios. \"É aqui que você vai encontrá-lo\", diz Laz. Você guarda o mapa no bolso de sua túnica. \"Sua única esperança de der rotar Agglax reside em visitar o oráculo\", sussurra Jip. \"Mas se o oráculo vai falar com você ou não é outro problema. Depende do humor dele e dos presentes você lhe trouxer. Você vai encontrá-lo nas Cavernas das Pedras das Estrelas\". Você agradece aos vagabundos pela informação e sai da taverna para explorar Zengis um pouco mais, perguntando -se quem é o oráculo. Vá para %d.\n", trecho056a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho056a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho057() {
        int trecho057a = 144;
        int trecho057b = 27;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("\"Então você é apenas outro tolo que deseja ver o oráculo, é isso?\". Se decidir responder \"Sim\", vá para %d. Se preferir responder \"Não\", vá para %d.\n", trecho057a, trecho057b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho057a || opcao == trecho057b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho057a, trecho057b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho058() {
        int trecho058a = 274;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você de repente vê uma sacola suja escondida entre o capim. Você abre caminho com a espada e, para sua surpresa e alegria, encontra 10 peças de ouro na sacola. Você grita animado para seus homens, dizendo-lhes que está na hora de continuar, e em dez minutos vocês estão marchando mais uma vez Vá para %d .\n", trecho058a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho058a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho059() {
        int trecho059a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Com os números diminuindo a cada minuto que passa, suas tropas perdem o moral por completo. A apenas alguns metros de distância das linhas inimigas, eles viram e fogem desordenadamente. Você grita para eles ficarem e lutarem, mas não consegue evitar que eles fujam. Quando isso acontece, várias mãos o agarram e você é levado acorrentado até Agglax, para ser executado.\n", trecho059a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho059a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho060() {
        int trecho060a = 165;
        int trecho060b = 95;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("A multidão fica em silêncio quando você deixa cair a colher na tigela vazia em sinal de vitória. Barrigudão, com a boca cheia de torta, derruba a tigela de torta da mesa, quebrando-a para mostrar a irritação. Balançando a cabeça incrédulo, o anão lhe entrega a bolsa com 100 peças de ouro. Se quiser subir na mesa e fazer um discurso sobre Agglax e sobre seu desejo de contratar dez guerreiros em troca do ouro que acabou de ganhar, vá para %d. Se preferir ir embora com o ouro, vá para %d.\n", trecho060a, trecho060b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho060a || opcao == trecho060b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho060a, trecho060b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho061() {
        int trecho061a = 378;
        int trecho061b = 18;;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você balança a cabeça e consegue recuperar o equi líbrio a tempo de ouvir uma gargalhada alta do taverneiro atrás de você. Você desaba em uma cadeira na mesa mais próxima de você, meio abalado pela bebida. Perca 1 ponto de ENERGIA. Role um dado. Se o resultado for 1 a 3, você se encontra sentado com um ladino bêbado (vá para %d). Se for 4 a 6, você se encontra sentado com três vagabundos (vá para %d).\n", trecho061a, trecho061b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho061a || opcao == trecho061b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho061a, trecho061b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho062() {
        int trecho062a = 153;
        int trecho062b = 339;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Outro goblin o vê avançar para o guerreiro prepara do para a batalha. Reconhecendo-o como o líder, o goblin aponta a besta na sua direção, mira com cuidado e então dispara. Se tiver contratado os Saque adores de Max em Zengis, vá para %d. Se não tiver contratado os homens da guerreira, vá para %d.\n", trecho062a, trecho062b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho062a || opcao == trecho062b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho062a, trecho062b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Tres Saidas
    void trecho063() {
        int trecho063a = 124;
        int trecho063b = 255;
        int trecho063c = 314;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf("A porta da rua dá para um aposento único, no centro do qual dois homens estão praticando esgrima com espadas de madeira, São observados por sete outros homens. No fundo do aposento, uma loira estonteante trajando armadura de couro grita instruções para os dois combatentes. \"Parem!\", ela grita de repente. \"Descansem enquanto eu vejo o que o forasteiro quer\". Ela caminha até você e diz: \"Sou Max e esses são os meus garotos. Quer se juntar a eles ou contratá-los?\". Você responde que pode es tar interessado em contratá-los. \"Meus garotos são os melhores. Duzentas peças de ouro e todos os dez são seus\". Você vai:\n" +
                        "Pagar a Max o preço que ela pede? Vá para %d\n" +
                        "Negociar o preço? Vá para %d\n" +
                        " Recusar-se a pagar e ir embora? Vá para %d\n", trecho063a, trecho063b, trecho063c);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho063a || opcao == trecho063b || opcao == trecho063c) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d. ", trecho063a, trecho063b, trecho063c);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }

// uma saida
    void trecho064() {
        int trecho064a = 52;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("O guarda grita para você parar, mas você corre tanto quanto pode, mantendo um olho aberto para uma taverna à qual você avança. Vá para %d .\n", trecho064a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho064a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho065() {
        int trecho065a = 113;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("A rua faz uma curva fechada para a esquerda e você logo se vê de volta aos portões principais de entra da de Zengis. Lembrando-se de sua promessa a Lexon, você decide voltar ao exército que lhe espera. Vá para %d .\n", trecho065a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho065a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho066() {
        int trecho066a = 362;
        int trecho066MonstroEne = 11;
        int trecho066MonstroHab = 9;
        String trecho066MonstroNome = ("Urso Nandi");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você consegue libertar uma das mãos e golpeia a fera brutal no pé com sua espada. Ela ruge de dor e meio segundo depois, você está livre e de pé. Vocé agora tem uma chance melhor de lutar contra esse devorador de carne.\n" +
                            "URSO NANDI\n" +
                            "HABILIDADE     9\n" +
                            "ENERGIA        11\n" +
                            "Se vencer, vá para %d.\n", trecho066a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho066a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho067() {
        int trecho067a = 213;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("O ágil homem das colinas de repente faz seu movimento e, antes que você tenha tempo de reagir você é derrubado por uma voadora com os dois pés. Você cai de cara no chão e sente uma dor cortante nos braços quando eles são torcidos às suas costas em um aprensamento firme. Você tenta se libertam mas lutar apenas aumenta a dor e você é obrigado a se entregar a Vine. Vá para %d.\n", trecho067a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho067a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho068() {
        int trecho068a = 252;
        int trecho068b = 312;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você chega a uma clareira ampla na floresta, onde há uma enorme rocha. A clareira está coberta de ossos e a rocha está manchada de sangue seco. Se quiser esperar com seu exército na borda da clareira para ver se alguém ou alguma coisa vai voltar para cá, vá para %d. Se preferir atravessar a clareira, vá para %d\n", trecho068a, trecho068b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho068a || opcao == trecho068b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho068a, trecho068b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho069() {
        int trecho069a = 188;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Dez de seus guerreiros caem vítimas das moscas ar pão, seus corpos servindo de alimento nas semanas por vir para as larvas que vão chocar dentro deles. As moscas arpão acabam indo embora e você conduz seus homens desanimados de volta ao navio. Perca 1 ponto de SORTE. O Capitão Barnock percebe que você não está com ânimo para um bate-papo matinal e dá as ordens para o navio continuar rio acima. Vá para %d.\n", trecho069a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho069a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho070() {
        int trecho070a = 323;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("O lobisomem vê seu amuleto e congela, ficando imóvel onde está, duro de medo. Sem nenhuma luta, você acaba com o lobisomem com apenas um golpe da espada. Mas você vê que a sentinela está morta. O resto da noite passa sem qualquer incidente e de manhã você conduz seu exército para fora da floresta, para uma nova planície. Vá para %d .\n", trecho070a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho070a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho071() {
        int trecho071a = 26;
        int trecho071b = 227;
        int trecho071MonstroEne = 7;
        int trecho071MonstroHab = 9;
        String trecho071MonstroNome = ("Taverneiro");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("O taverneiro olha para você com assombro, então pega um porrete de madeira de trás do balcão. Ele salta para a frente do bar, gritando: \"Vou ensinar uma lição a esse jovenzinho\". Você levanta-se do banco e saca a espada para enfrentar o enorme bruto enquanto a multidão se amontoa ao redor para ver a luta. \"Acabe com ele, Gordo!\", grita uma voz na multidão. \"Rápido, Gordo, preciso de mais uma bebida!\", ruge outra voz. Então a luta tem início. \n" +
                            "TAVERNEIRO\n" +
                            "HABILIDADE 9\n" +
                            "ENERGIA 7 \n" +
                            "Se você for o primeiro a vencer três rodadas de combate, vá para %d. Se o taverneiro for o primeiro a vencer três rodadas de combate, vá para %d. \n", trecho071a, trecho071b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho071a || opcao == trecho071b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho071a, trecho071b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho072() {
        int trecho072a = 284;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Mais meia hora passa e a paralisia começa a perder a força. A sensação começa a voltar a seus mem bros e você logo é capaz de se mover livremente. Vá para %d .\n", trecho072a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho072a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho073() {
        int trecho073a = 171;
        int trecho073b = 130;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você ergue seu escudo rápido para bloquear o dardo. O globin se vira para fugir e desaparece entre os arbustos. Se quiser persegui-lo, vá para %d. Se pre ferir chamar suas tropas de volta à trilha e continuar marchando, vá para %d. \n", trecho073a, trecho073b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho073a || opcao == trecho073b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho073a, trecho073b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho074() {
        int trecho074a = 192;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("A bola de fogo atinge o mastro principal, que desaba sobre o convés, matando cinco de seus homens. Dois anões se movem rápido para apagar a bola de fogo com cobertores molhados, evitando um incêndio a bordo. Vá para %d.\n", trecho074a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho074a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho075() {
        int trecho075a = 238;
        int trecho075b = 180;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Enquanto seus guerreiros se recuperam, você pondera que planos Agglax está tramando; em algum ponto além da Floresta dos Demônios ele espera por você e seu exército. Quando seus guerreiros estão finalmente bem o suficiente para continuar marchando, você decide ir direto para Agglax, então vira seu exército para o leste, rumo à Floresta dos Demônios. Depois de cruzar um dos afluentes que alimentam o Rio Kok, você chega à borda da sombria floresta. Árvores negras e retorcidas crescem alto, formando uma muralha ameaçadora; um sussurro de incerteza corre entre as fileiras de seu exército. Você quebra o silêncio gritando ordens para marchar para dentro da floresta; a luz do dia rapidamente se vai debaixo das grossas copas das árvores acima. Só os guinchos estridentes de macacos assustados às vezes quebram o silêncio da floresta. Depois de meia hora, um batedor reporta que avistou um grupo de cabanas de madeira, quase escondidas pela vegetação alta. Se quiser ir com dez homens à aldeia, vá para %d. Se preferir continuar marchando com seu exército, vá para %d.\n", trecho075a, trecho075b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho075a || opcao == trecho075b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho075a, trecho075b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Tres Saidas
    void trecho076() {
        int trecho076a = 204;
        int trecho076b = 273;
        int trecho076c = 354;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf("O corredor dá para outra caverna, embora esta es teja completamente vazia. Entretanto, você pode escolher por onde sair. Na parede do outro lado você vê as bocas de três túneis, cada uma esculpida para parecer a boca de uma estranha criatura que você nunca viu. Você percebe que três dos dentes na mandíbula superior de cada uma das cabeças escul pidas trazem números entalhados. Escolha o túnel que quiser e vá para o parágrafo de mesmo número.\n" +
                            "Esquerda – %d\n" +
                            "Centro – %d\n" +
                            "Direita – %d.\n", trecho076a, trecho076b, trecho076c);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho076a || opcao == trecho076b || opcao == trecho076c) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d. ", trecho076a, trecho076b, trecho076c);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }

// Tres Saidas
    void trecho077() {
        int trecho077a = 154;
        int trecho077b = 205;
        int trecho077c = 320;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf(" A velha porta de madeira é rígida e você tem de bater com o ombro nela para abri-la. Quando a porta abre, você ouve o grito penetrante de uma voz feminina e fica surpreso com o que vê. Uma jovem elfa está amarrada sobre uma mesa, que está aparafusada ao chão no centro da cabana repleta de palha dois metros acima do estômago da elfa há uma es pada pendurada, suspensa por apenas um barbante de algodão, amarrado na ponta de uma estaca de ferro; esta se projeta na horizontal de uma trave de madeira levando para um buraco nas fracas tábuas do chão. \"Não se mova!\", grita a elfa. \"Uma das tábuas do chão vai soltar a espada caso você pise nela\". Você precisa decidir se vai ou não salvar a elfa. Você vai:\n" +
                            "Correr e agarrar a espada? Vá para %d\n" +
                            "Jogar sua mochila na espada? Vá para %d\n" +
                            "Deixar a elfa e ir embora?Vá para %d.\n", trecho077a, trecho077b, trecho077c);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho077a || opcao == trecho077b || opcao == trecho077c) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d. ", trecho077a, trecho077b, trecho077c);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }

// Duas Saidas
    void trecho078() {
        int trecho078a = 253;
        int trecho078b = 240;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você desce a rua rápido, antes de atrair a atenção de mais alguém. Você sente alguma coisa grande dentro da roupa e lembra da bolsa de couro. Você a pega e desamarra a corda que a mantém fechada. Virando-a de cabeça para baixo, você esvazia o conteúdo em sua mão e fica chocado ao descobrir um escorpião na palma de sua mão. Teste a sorte. Se for sortudo, vá para %d. \n" +
"Se for azarado, vá para %d.\n", trecho078a, trecho078b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho078a || opcao == trecho078b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho078a, trecho078b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho079() {
        int trecho079a = 301;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Sentindo que você está com problemas, Agglax se prepara para seu momento de triunfo. Vá para %d.\n", trecho079a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho079a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho080() {
        int trecho080a = 3;
        int trecho080b = 18;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("A mosca varejeira hesita por um segundo antes de partir para a geleia que você escolheu. Some 1 ponto de SORTE. O homem abre o broche e o alcança para você sem dizer uma palavra sequer, seu rosto sem expressão, Você examina o belo broche, que mostra um dragão cuspindo fogo. Você o vira e descobre o número \"89\" riscado na parte de trás. Você memoriza o número e prende o broche em sua túnica. Se quiser perguntar ao ladino seu nome, vá para %d. Se preferir deixá-lo em paz e avançar para a outra mesa para sentar com os três vagabundos, vá para %d.\n", trecho080a, trecho080b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho080a || opcao == trecho080b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho080a, trecho080b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho081() {
        int trecho081a = 376;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("\"Desculpe\", diz ele. \"Eu falo demais, não é?\". Ele lhe alcança a chave e você sobe as escadas para o seu quarto. Vá para %d.\n", trecho081a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho081a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho082() {
        int trecho082a = 130;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você vinga a morte de suas tropas com um movimento rápido da espada. Você desce da árvore e ordena a seus guerreiros que voltem à trilha e continuem marchando. Vá para %d.\n", trecho082a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho082a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho083() {
        int trecho083a = 188;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Cinco de seus guerreiros caem vítimas das moscas arpão, seus corpos servindo de alimento nas semanas por vir para as larvas que vão chocar dentro deles. As moscas arpão acabam indo embora e você conduz seus homens desanimados de volta ao navio. Perca 1 ponto de SORTE. O Capitão Barnock nã perde tempo e faz o navio partir direto rio acima sentindo seu desejo de ir embora deste lugar amal. diçoado. Vá para %d.\n", trecho083a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho083a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho084() {
        int trecho084a = 155;
        int trecho084b = 120;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("O exército marcha para o leste ao longo da margem do Rio Kok até alcançar uma grande divisão. A sua frente se ergue uma muralha de árvores negras retorcidas: a sinistra Floresta dos Demônios. Você marcha para o norte por um tempo até chegar a uma parte segura para cruzar o afluente. Há mui tos sussurros entre suas fileiras enquanto marcham para dentro da floresta, quando a luz do dia rapidamente se vai debaixo das grossas copas das árvores acima. Só os guinchos estridentes de macacos assustados às vezes quebram o estranho silêncio da floresta. À medida que vocês penetram mais fundo, as árvores se tornam mais densas, e seu exército demora para passar por entre elas. Se quiser apertar o passo, vá para %d. Se quiser enviar um batedor para procurar um caminho mais fácil por entre a floresta, vá para %d.\n", trecho084a, trecho084b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho084a || opcao == trecho084b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho084a, trecho084b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho085() {
        int trecho085a = 299;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("O chão do túnel vai ficando mais íngreme, e o caminhar vai se tornando um esforço cada vez maior. Mas suas pernas de repente parecem cheias de velocidade quando você vê um facho de luz branca à frente. O ar parece mais fresco; você logo está fora da caverna e sob a luz do dia a apenas cem metros de seus homens. Eles estão sentados em um círculo, esperando pacientes que você apareça da caverna que entrou não muito tempo atrás. Você chama por eles e corre para onde eles estão sentados para contar-lhes de sua aventura subterrânea. Você decide retornar a seu exército sem mais delongas. Mas a jornada de retorno começa com um encontro nada agradável. Você vê uma nuvem de pó se aproximando e logo ouve o som de cascos galopando. Dez centauros hostis investem em carga contra você. Você deve lutar uma escaramuça. Se vencer, vá para %d.\n", trecho085a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho085a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho086() {
        int trecho086a = 340;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Assim que suas espadas são sacadas, quinze homens das colinas aparecem do nada. Vestindo o couro de animais e armados com machados e porretes de madeira, os homens de cabelo comprido avançam correndo na sua direção com as pernas musculosas, gritando com vontade. Você deve lutar uma escaramuça. Se vencer, vá para %d.\n", trecho086a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho086a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho087() {
        int trecho087a = 275;
        int trecho087MonstroEne = 8;
        int trecho087MonstroHab = 7;
        String trecho087MonstroNome = ("Aranha Gigante");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Assim que você adentra a penumbra da caverna, suas pernas roçam em alguns fios pegajosos. Como se um alarme tivesse soado, uma enorme aranha peluda rasteja para fora das profundezas da caverna para enlaçar a vítima que acredita ter invadido seu covil. Você precisa lutar por sua vida.\n" +
                            "ARANHA GIGANTE\n" +
                            "HABILIDADE 7\n" +
                            "ENERGIA 8\n" +
                            "Se vencer, vá para %d.\n", trecho087a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho087a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho088() {
        int trecho088a = 259;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você ouve um farfalhar vindo de arbustos densos às suas costas e de repente dez enormes criaturas parecidas com goblins saltam brandindo machados. Com quase dois metros e meio de altura, os garks de pele marrom avançam para atacar. Você precisa lutar uma escaramuça. Se vencer, vá para %d.\n", trecho088a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho088a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho089() {
        int trecho089a = 280;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("\"Muito obrigado\", diz o oráculo. \"E agora, como posso ajudá-lo?\". Você explica que acredita que ele pode ajudá-lo a vencer Agglax, e pergunta se isso é verdade. \"Então você deseja destruir o demônio das sombras? Que bom que você tem um exército consigo, pois nunca conseguiria alcançar Agglax sozinho. Suas forças são grandes demais para passar despercebido por elas. Você precisa abrir caminho até ele lutando. Você vai encontrar uma trilha de destruição a leste da Floresta dos Demônios. Siga essa trilha e você logo vai alcançar o exército da morte do demónio das sombras. Mesmo que destrua o exercito dele, Agglax lutará sozinho. Suas armas não podem feri-lo. Apenas uma magia do vazio pode oblitera o demônio. Você precisa encontrar o cristal de luz Quando estiver a menos de dois metros de Agglax segure o cristal com ambas as mãos e diga Très dois, um-vá. É assim que você vai livrar estas terras do demônio das sombras. Adeus e boa sorte\". olhos do rosto de pedra se fecham e você ouve um rangido às suas costas, Olhando ao redor, você vê que uma seção da parede está deslizando. Confiante, você avança pelo túnel que se revela. Vá para %d.\n", trecho089a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho089a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho090() {
        int trecho090a = 270;
        int trecho090b = 211;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você não aciona a soltura da espada e consegue pegá-la e jogá-la de lado. A elfa começa a chorar aliviada quando você corta as cordas que a prendem \"Obrigada\", geme ela. \"Obrigada por salvar minha vida\". Ela então tira um anel do dedo e diz: \"Por favor, fique com este anel como um símbolo de minha gratidão. Ele vai trazer-lhe boa sorte\". Se quiser ficar com o anel, vá para %d. Se preferir recusar presente educadamente, pegar sua mochila e voltar a seus homens do lado de fora, vá para %d \n", trecho090a, trecho090b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho090a || opcao == trecho090b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho090a, trecho090b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho091() {
        int trecho091a = 178;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Seus anões lutam valorosamente contra os guerreiros do caos, mas estão em franca desvantagem. Recusando-se a ceder terreno, eles postam-se firmes e lutam até que os últimos dois deles fiquem de costas um para o outro contra seus fanáticos adversários. Então um deles cai com o golpe de uma maça com cravos e o outro é perfurado por uma lança nas costas. Seus ouvidos doem com os gritos atormentados dos vitoriosos guerreiros do caos. Você grita novas ordens de batalha, esperando que os guerreiros do caos ataquem, mas eles se viram e trotam de volta às suas linhas. Você decide que o ataque é a melhor defesa e dá ordens para seu exército marchar contra a linha de frente dos trolls. Vá para %d .\n", trecho091a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho091a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho092() {
        int trecho092a = 133;
        int trecho092MonstroEne01 = 7;
        int trecho092MonstroHab01 = 8;
        String trecho092MonstroNome01 = ("Enk");
        int trecho092MonstroEne02 = 7;
        int trecho092MonstroHab02 = 7;
        String trecho092MonstroNome02 = ("Laz");
        int trecho092MonstroEne03 = 8;
        int trecho092MonstroHab03 = 7;
        String trecho092MonstroNome03 = ("Jip");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("\"Rua do Cascalho?\", continua Enk. \"É bem perto da rua onde eu moro. Nós vamos levá-lo lá\". Incapaz de pensar em uma boa desculpa, você concorda. Você os segue para fora da taverna, caminha pela rua por cinco minutos, então vira à direita em um beco. Os três homens de repente param e viram, suas mãos segurando adagas. \"Rua do Cascalho! Não há Rua do Cascalho em Zengis\", diz Enk, alegre. \"Vamos pegar o forasteiro, rapazes; os bolsos dele parecem estar abarrotados de ouro!\". Você saca a espada rápido enquanto os três vagabundos descem sobre você. Lute com um de cada vez.\n" +
                            "	Habilidade		Energia\n" +
                            "Enk	8			7       \n" +
                            "Laz	7			7	\n" +
                            "Jip	7			8	\n" +
                            "Se vencer, vá para %d .\n", trecho092a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho092a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho093() {
        int trecho093a = 235;
        int trecho093b = 381;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("A chave gira e você ouve um clique baixo. Com um rangido áspero, a rocha desliza para dentro da rede e você pode seguir pela passagem. Entretanto ela logo termina em outra bifurcação. Se quiser seguir para a esquerda, vá para %d. Se preferir ir para a direita, vá para %d. \n", trecho093a, trecho093b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho093a || opcao == trecho093b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho093a, trecho093b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho094() {
        int trecho094a = 234;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("O guerreiro deixa o homem para ser levado pela corrente até o mar e um túmulo de água. Ele nada de volta ao navio e logo vocês continuam a viagem Vá para %d .\n", trecho094a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho094a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho095() {
        int trecho095a = 352;
        int trecho095b = 177;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("À sua esquerda você vê um beco, no fundo do qual há uma pilha de barris. Se quiser entrar no beco para investigar, vá para %d. Se preferir subir a rua vá para %d.\n", trecho095a, trecho095b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho095a || opcao == trecho095b) {
                validador = "Validado";
            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho095a, trecho095b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho096() {
        int trecho096a = 138;
        int trecho096b = 310;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você chega a uma parte mais estreita do abismo onde um enorme pedaço de rocha foi colocado como se fosse uma ponte. Se quiser que seu exército atravesse a ponte, vá para %d. Se preferir continuar marchando, vá para %d.\n", trecho096a, trecho096b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho096a || opcao == trecho096b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho096a, trecho096b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho097() {
        int trecho097a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você é consumido pela bola de fogo antes mesmo que seu exército possa alcançá-lo.\n", trecho097a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho097a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho098() {
        int trecho098a = 184;
        int trecho098b = 315;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você é consumido pela bola de fogo antes mesmo que suas tropas possam alcançá-lo. O buraco que você está cavando já tem um metro de profundidade quando sua pá bate em alguma coisa de metal. Você tira a terra, revelando um pedaço grande de ferro. Se quiser continuar cavando, vá para %d. Se preferir encher o buraco de novo e deixar a clareira, vá para %d.\n", trecho098a, trecho098b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho098a || opcao == trecho098b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho098a, trecho098b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho099() {
        int trecho099a = 137;
        int trecho099b = 177;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("\"Você disse as Cavernas da Pedra da Lua? Sim, já estive lá. Lugarzinho perigoso, cheio de armadilhas. Elas foram colocadas lá pelo oráculo, que odeia visitantes. Mas o oráculo fala com a maioria das pessoas que puderem sobreviver às suas armadilhas e alcançarem o santuário interno. Entenda; trata-se de um desafio. Ele odeia perder tempo. Só perde tempo com pessoas que realmente precisam dele, mas assim mesmo ele vai querer alguns presentes, dependendo da informação que você procura. Sugiro que consiga um guia. Vá para Karn. É o único lugar onde você vai encontrar um\". Você agradece ao caçador de recompensas e volta com ele pelo túnnel. Deixando-o para recolher provas da morte dos goblins do esgoto, você pondera sobre o que fazer a seguir. Se ainda não tiver feito isso, você pode investigar os barris (vá para %d) ou voltar pelo beco e virar à esquerda na rua (vá para %d).\n", trecho099a, trecho099b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho099a || opcao == trecho099b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho099a, trecho099b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho100() {
        int trecho100a = 19;
        int trecho100b = 173;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Você entra em um salão abarrotado de gente, repleto de mesas de jogo e apostadores vorazes. O lugar inteiro está animado. Você observa uma garota girar uma enorme roda da fortuna e ouvir os rugidos e aclamações das pessoas ao redor dela quando o número 33 finalmente para na lingueta. Você observa algumas mãos de cartas em várias mesas, mas final mente decide jogar uma partida de \"alto-baixo\". A garota segurando os dados lhe explica o jogo. Você deve jogar dois dados, mas antes de fazê-lo deve adivinhar se o resultado rolado será \"alto\" (8 a 12) ou \"baixo\" (2 a 6). O número 7 significa derrota. Ela explica que você pode apostar até 50 peças de ouro e ela lhe pagará o mesmo valor caso você adivinhe corretamente. Se quiser apostar uma vez, vá para %d. Se perder, vá para %d.\n", trecho100a, trecho100b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho100a || opcao == trecho100b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho100a, trecho100b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

    void trecho101() {
        int trecho101a = 281;
        int trecho101b = 64;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Enquanto pega o machado dele, você vê uma bolsa de couro no cinto do homem com o machado; antes que você possa abri-la, você vê dois guardas da cidade subindo a rua correndo na sua direção Se quiser abrir a bolsa de couro e arriscar ser preso, vá para %d. Se preferir fugir apenas com o anel de ouro, vá para %d.\n", trecho101a, trecho101b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho101a || opcao == trecho101b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho101a, trecho101b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho102() {
        int trecho102a = 113;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("A rua faz uma curva fechada para a esquerda, então para a esquerda de novo e você logo se vê de volta aos portões principais da entrada de Zengis. Lem brando de sua promessa para Lexon, você decide voltar ao exército que lhe espera. Vá para %d.\n", trecho102a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho102a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho103() {
        int trecho103a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho103a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho103a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho104() {
        int trecho104a = 49;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho104a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho104a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho105() {
        int trecho105a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho105a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho105a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho106() {
        int trecho106a = 269;
        int trecho106b = 62;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho106a, trecho106b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho106a || opcao == trecho106b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho106a, trecho106b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho107() {
        int trecho107a = 209;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho107a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho107a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho108() {
        int trecho108a = 280;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho108a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho108a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho109() {
        int trecho109a = 24;
        int trecho109b = 135;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho109a, trecho109b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho109a || opcao == trecho109b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho109a, trecho109b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho110() {
        int trecho110a = 50;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho110a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho110a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho111() {
        int trecho111a = 297;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho111a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho111a;
        opcaoTexto = opcao;
    }

    // Duas Saidas
    void trecho112() {
        int trecho112a = 47;
        int trecho112b = 369;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho112a, trecho112b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho112a || opcao == trecho112b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho112a, trecho112b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho113() {
        int trecho113a = 262;
        int trecho113b = 84;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho113a, trecho113b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho113a || opcao == trecho113b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho113a, trecho113b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho114() {
        int trecho114a = 241;
        int trecho114b = 327;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho114a, trecho114b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho114a || opcao == trecho114b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho114a, trecho114b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho115() {
        int trecho115a = 28;
        int trecho115b = 295;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho115a, trecho115b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho115a || opcao == trecho115b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho115a, trecho115b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho116() {
        int trecho116a = 85;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho116a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho116a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho117() {
        int trecho117a = 213;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho117a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho117a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho118() {
        int trecho118a = 178;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho118a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho118a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho119() {
        int trecho119a = 318;
        int trecho119b = 94;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho119a, trecho119b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho119a || opcao == trecho119b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho119a, trecho119b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho120() {
        int trecho120a = 238;
        int trecho120b = 180;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho120a, trecho120b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho120a || opcao == trecho120b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho120a, trecho120b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho121() {
        int trecho121a = 17;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho121a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho121a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho122() {
        int trecho122a = 190;
        int trecho122b = 272;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho122a, trecho122b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho122a || opcao == trecho122b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho122a, trecho122b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho123() {
        int trecho123a = 220;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho123a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho123a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho124() {
        int trecho124a = 314;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho124a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho124a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho125() {
        int trecho125a = 166;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho125a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho125a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho126() {
        int trecho126a = 371;
        int trecho126b = 302;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho126a, trecho126b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho126a || opcao == trecho126b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho126a, trecho126b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho127() {
        int trecho127a = 323;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho127a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho127a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho128() {
        int trecho128a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho128a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho128a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho129() {
        int trecho129a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho129a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho129a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho130() {
        int trecho130a = 114;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho130a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho130a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho131() {
        int trecho131a = 21;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho131a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho131a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho132() {
        int trecho132a = 377;
        int trecho132MonstroEne = 8;
        int trecho132MonstroHab = 9;
        String trecho132MonstroNome = ("Calacorm");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho132a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho132a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho133() {
        int trecho133a = 264;
        int trecho133b = 382;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho133a, trecho133b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho133a || opcao == trecho133b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho133a, trecho133b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho134() {
        int trecho134a = 202;
        int trecho134b = 55;
        int trecho134MonstroEne = 6;
        int trecho134MonstroHab = 10;
        String trecho134MonstroNome = ("Homem Rocha");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho134a, trecho134b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho134a || opcao == trecho134b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho134a, trecho134b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho135() {
        int trecho135a = 220;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho135a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho135a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho136() {
        int trecho136a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho136a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho136a;
        opcaoTexto = opcao;
    }

// Tres Saidas
    void trecho137() {
        int trecho137a = 328;
        int trecho137b = 177;
        int trecho137c = 31;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf("Vá para %d ou %d ou %d .\n", trecho137a, trecho137b, trecho137c);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho137a || opcao == trecho137b || opcao == trecho137c) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d. ", trecho137a, trecho137b, trecho137c);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }

// uma saida
    void trecho138() {
        int trecho138a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho138a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho138a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho139() {
        int trecho139a = 384;
        int trecho139b = 215;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho139a, trecho139b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho139a || opcao == trecho139b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho139a, trecho139b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho140() {
        int trecho140a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho140a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho140a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho141() {
        int trecho141a = 217;
        int trecho141b = 95;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho141a, trecho141b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho141a || opcao == trecho141b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho141a, trecho141b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho142() {
        int trecho142a = 208;
        int trecho142MonstroEne = 7;
        int trecho142MonstroHab = 8;
        String trecho142MonstroNome = ("Orc da Montanha");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho142a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho142a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho143() {
        int trecho143a = 242;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho143a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho143a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho144() {
        int trecho144a = 219;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho144a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho144a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho145() {
        int trecho145a = 329;
        int trecho145b = 107;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho145a, trecho145b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho145a || opcao == trecho145b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho145a, trecho145b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho146() {
        int trecho146a = 368;
        int trecho146Monstro1Ene = 6;
        int trecho146Monstro1Hab = 7;
        String trecho146Monstro1Nome = ("Assaltante 1");
        int trecho146Monstro2Ene = 7;
        int trecho146Monstro2Hab = 7;
        String trecho146Monstro2Nome = ("Assaltante 2");
        int trecho146Monstro3Ene = 6;
        int trecho146Monstro3Hab = 8;
        String trecho146Monstro3Nome = ("Assaltante 3");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho146a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho146a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho147() {
        int trecho147a = 220;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho147a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho147a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho148() {
        int trecho148a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho148a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho148a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho149() {
        int trecho149a = 113;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho149a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho149a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho150() {
        int trecho150a = 101;
        int trecho150MonstroEne = 8;
        int trecho150MonstroHab = 8;
        String trecho150MonstroNome = ("Homem com Machado");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho150a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho150a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho151() {
        int trecho151a = 280;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho151a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho151a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho152() {
        int trecho152a = 276;
        int trecho152MonstroEne = 8;
        int trecho152MonstroHab = 7;
        String trecho152MonstroNome = ("Ladino");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho152a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho152a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho153() {
        int trecho153a = 379;
        int trecho153Monstro1Ene = 5;
        int trecho153Monstro1Hab = 5;
        String trecho153Monstro1Nome = ("Primeiro Goblin");
        int trecho153Monstro2Ene = 6;
        int trecho153Monstro2Hab = 5;
        String trecho153Monstro2Nome = ("Segundo Goblin");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho153a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho153a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho154() {
        int trecho154a = 90;
        int trecho154b = 387;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho154a, trecho154b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho154a || opcao == trecho154b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho154a, trecho154b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho155() {
        int trecho155a = 290;
        int trecho155MonstroEne = 8;
        int trecho155MonstroHab = 8;
        String trecho1553MonstroNome = ("Homem Arvore");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho155a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho155a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho156() {
        int trecho156a = 38;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho156a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho156a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho157() {
        int trecho157a = 382;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho157a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho157a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho158() {
        int trecho158a = 238;
        int trecho158b = 180;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho158a, trecho158b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho158a || opcao == trecho158b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho158a, trecho158b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho159() {
        int trecho159a = 192;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho159a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho159a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho160() {
        int trecho160a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho160a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho160a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho161() {
        int trecho161a = 231;
        int trecho161b = 80;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho161a, trecho161b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho161a || opcao == trecho161b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho161a, trecho161b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho162() {
        int trecho162a = 315;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho162a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho162a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho163() {
        int trecho163a = 78;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho163a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho163a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho164() {
        int trecho164a = 278;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho164a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho164a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho165() {
        int trecho165a = 293;
        int trecho165b = 122;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho165a, trecho165b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho165a || opcao == trecho165b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho165a, trecho165b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho166() {
        int trecho166a = 132;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho166a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho166a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho167() {
        int trecho167a = 229;
        int trecho167b = 399;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho167a, trecho167b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho167a || opcao == trecho167b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho167a, trecho167b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho168() {
        int trecho168a = 365;
        int trecho168b = 105;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho168a, trecho168b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho168a || opcao == trecho168b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho168a, trecho168b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

    // uma saida
    void trecho169() {
        int trecho169a = 130;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho169a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho169a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho170() {
        int trecho170a = 43;
        int trecho170b = 375;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho170a, trecho170b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho170a || opcao == trecho170b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho170a, trecho170b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Tres Saidas
    void trecho171() {
        int trecho171a = 2;
        int trecho171b = 257;
        int trecho171c = 130;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf("Vá para %d ou %d ou %d .\n", trecho171a, trecho171b, trecho171c);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho171a || opcao == trecho171b || opcao == trecho171c) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d. ", trecho171a, trecho171b, trecho171c);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }

// Duas Saidas
    void trecho172() {
        int trecho172a = 249;
        int trecho172b = 40;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho172a, trecho172b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho172a || opcao == trecho172b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho172a, trecho172b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

    // uma saida
    void trecho173() {
        int trecho173a = 50;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho173a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho173a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho174() {
        int trecho174a = 278;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho174a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho174a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho175() {
        int trecho175a = 292;
        int trecho175b = 52;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho175a, trecho175b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho175a || opcao == trecho175b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho175a, trecho175b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho176() {
        int trecho176a = 196;
        int trecho176MonstroEne = 9;
        int trecho176MonstroHab = 8;
        String trecho176MonstroNome = ("Lagarto Gigante");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho176a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho176a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho177() {
        int trecho177a = 63;
        int trecho177b = 314;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho177a, trecho177b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho177a || opcao == trecho177b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho177a, trecho177b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho178() {
        int trecho178a = 59;
        int trecho178b = 13;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho178a, trecho178b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho178a || opcao == trecho178b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho178a, trecho178b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho179() {
        int trecho179a = 209;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho179a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho179a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho180() {
        int trecho180a = 325;
        int trecho180b = 68;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho180a, trecho180b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho180a || opcao == trecho180b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho180a, trecho180b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

    // uma saida
    void trecho181() {
        int trecho181a = 114;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho181a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho181a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho182() {
        int trecho182a = 143;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho182a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho182a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho183() {
        int trecho183a = 230;
        int trecho183b = 81;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho183a, trecho183b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho183a || opcao == trecho183b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho183a, trecho183b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho184() {
        int trecho184a = 315;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho184a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho184a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho185() {
        int trecho185a = 274;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho185a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho185a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho186() {
        int trecho186a = 278;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho186a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho186a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho187() {
        int trecho187a = 72;
        int trecho187b = 129;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho187a, trecho187b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho187a || opcao == trecho187b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho187a, trecho187b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Tres Saidas
    void trecho188() {
        int trecho188a = 277;
        int trecho188b = 353;
        int trecho188c = 139;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf("Vá para %d ou %d ou %d .\n", trecho188a, trecho188b, trecho188c);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho188a || opcao == trecho188b || opcao == trecho188c) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d. ", trecho188a, trecho188b, trecho188c);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }

// uma saida
    void trecho189() {
        int trecho189a = 130;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho189a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho189a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho190() {
        int trecho190a = 95;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho190a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho190a;
        opcaoTexto = opcao;
    }

    // uma saida
    void trecho191() {
        int trecho191a = 312;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho191a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho191a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho192() {
        int trecho192a = 380;
        int trecho192b = 258;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho192a, trecho192b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho192a || opcao == trecho192b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho192a, trecho192b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho193() {
        int trecho193a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho193a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho193a;
        opcaoTexto = opcao;
    }	// uma saida

// Duas Saidas
    void trecho194() {
        int trecho194a = 373;
        int trecho194b = 117;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho194a, trecho194b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho194a || opcao == trecho194b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho194a, trecho194b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho195() {
        int trecho195a = 314;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho195a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho195a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho196() {
        int trecho196a = 5;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho196a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho196a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho197() {
        int trecho197a = 172;
        int trecho197b = 71;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho197a, trecho197b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho197a || opcao == trecho197b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho197a, trecho197b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho198() {
        int trecho198a = 239;
        int trecho198b = 315;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho198a, trecho198b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho198a || opcao == trecho198b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho198a, trecho198b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho199() {
        int trecho199a = 33;
        int trecho199MonstroEne = 12;
        int trecho199MonstroHab = 11;
        String trecho199MonstroNome = ("Moedor");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho199a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho199a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho200() {
        int trecho200a = 164;
        int trecho200b = 34;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho200a, trecho200b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho200a || opcao == trecho200b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho200a, trecho200b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho201() {
        int trecho201a = 137;
        int trecho201b = 177;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho201a, trecho201b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho201a || opcao == trecho201b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho201a, trecho201b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho202() {
        int trecho202a = 336;
        int trecho202b = 244;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho202a, trecho202b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho202a || opcao == trecho202b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho202a, trecho202b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho203() {
        int trecho203a = 337;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho203a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho203a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho204() {
        int trecho204a = 53;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho204a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho204a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho205() {
        int trecho205a = 5;
        int trecho205b = 306;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho205a, trecho205b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho205a || opcao == trecho205b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho205a, trecho205b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho206() {
        int trecho206a = 44;
        int trecho206b = 151;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho206a, trecho206b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho206a || opcao == trecho206b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho206a, trecho206b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Tres Saidas
    void trecho207() {
        int trecho207a = 304;
        int trecho207b = 344;
        int trecho207c = 147;
        int trecho207d = 283;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf("Vá para %d ou %d ou %d ou %d .\n", trecho207a, trecho207b, trecho207c, trecho207d);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho207a || opcao == trecho207b || opcao == trecho207c || opcao == trecho207d) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d %d. ", trecho207a, trecho207b, trecho207c, trecho207d);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }

// Tres Saidas
    void trecho208() {
        int trecho208a = 106;
        int trecho208b = 216;
        int trecho208c = 316;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf("Vá para %d ou %d ou %d .\n", trecho208a, trecho208b, trecho208c);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho208a || opcao == trecho208b || opcao == trecho208c) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d. ", trecho208a, trecho208b, trecho208c);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }

// Duas Saidas
    void trecho209() {
        int trecho209a = 286;
        int trecho209b = 131;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho209a, trecho209b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho209a || opcao == trecho209b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho209a, trecho209b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

    // uma saida
    void trecho210() {
        int trecho210a = 68;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho210a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho210a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho211() {
        int trecho211a = 115;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho211a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho211a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho212() {
        int trecho212a = 50;
        int trecho212MonstroEne = 10;
        int trecho2120MonstroHab = 8;
        String trecho212MonstroNome = ("Ogro");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho212a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho212a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho213() {
        int trecho213a = 49;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho213a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho213a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho214() {
        int trecho214a = 116;
        int trecho214b = 383;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho214a, trecho214b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho214a || opcao == trecho214b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho214a, trecho214b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho215() {
        int trecho215a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho215a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho215a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho216() {
        int trecho216a = 269;
        int trecho216b = 62;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho216a, trecho216b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho216a || opcao == trecho216b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho216a, trecho216b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho217() {
        int trecho217a = 14;
        int trecho217b = 95;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho217a, trecho217b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho217a || opcao == trecho217b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho217a, trecho217b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho218() {
        int trecho218a = 287;
        int trecho218b = 141;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho218a, trecho218b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho218a || opcao == trecho218b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho218a, trecho218b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho219() {
        int trecho219a = 17;
        int trecho219b = 121;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho219a, trecho219b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho219a || opcao == trecho219b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho219a, trecho219b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho220() {
        int trecho220a = 261;
        int trecho220b = 86;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho220a, trecho220b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho220a || opcao == trecho220b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho220a, trecho220b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho221() {
        int trecho221a = 76;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho221a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho221a;
        opcaoTexto = opcao;
    }

// Tres Saidas
    void trecho222() {
        int trecho222a = 285;
        int trecho222b = 25;
        int trecho222c = 315;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf("Vá para %d ou %d ou %d .\n", trecho222a, trecho222b, trecho222c);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho222a || opcao == trecho222b || opcao == trecho222c) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d. ", trecho222a, trecho222b, trecho222c);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }

// Duas Saidas
    void trecho223() {
        int trecho223a = 395;
        int trecho223b = 311;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho223a, trecho223b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho223a || opcao == trecho223b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho223a, trecho223b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho224() {
        int trecho224a = 303;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho224a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho224a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho225() {
        int trecho225a = 58;
        int trecho225b = 185;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho225a, trecho225b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho225a || opcao == trecho225b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho225a, trecho225b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho226() {
        int trecho226a = 134;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho226a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho226a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho227() {
        int trecho227a = 382;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho227a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho227a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho228() {
        int trecho228a = 364;
        int trecho228b = 260;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho228a, trecho228b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho228a || opcao == trecho228b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho228a, trecho228b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho229() {
        int trecho229a = 5;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho229a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho229a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho230() {
        int trecho230a = 399;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho230a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho230a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho231() {
        int trecho231a = 376;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho231a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho231a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho232() {
        int trecho232a = 99;
        int trecho232b = 201;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho232a, trecho232b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho232a || opcao == trecho232b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho232a, trecho232b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho233() {
        int trecho233a = 176;
        int trecho233b = 15;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho233a, trecho233b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho233a || opcao == trecho233b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho233a, trecho233b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho234() {
        int trecho234a = 298;
        int trecho234b = 203;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho234a, trecho234b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho234a || opcao == trecho234b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho234a, trecho234b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho235() {
        int trecho235a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho235a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho235a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho236() {
        int trecho236a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho236a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho236a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho237() {
        int trecho237a = 104;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho237a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho237a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho238() {
        int trecho238a = 168;
        int trecho238b = 88;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho238a, trecho238b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho238a || opcao == trecho238b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho238a, trecho238b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho239() {
        int trecho239a = 362;
        int trecho239MonstroEne = 11;
        int trecho239MonstroHab = 8;
        String trecho239MonstroNome = ("Urso Nandi");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho239a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho239a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho240() {
        int trecho240a = 52;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho240a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho240a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho241() {
        int trecho241a = 248;
        int trecho241b = 148;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho241a, trecho241b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho241a || opcao == trecho241b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho241a, trecho241b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho242() {
        int trecho242a = 295;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho242a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho242a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho243() {
        int trecho243a = 270;
        int trecho243b = 211;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho243a, trecho243b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho243a || opcao == trecho243b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho243a, trecho243b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho244() {
        int trecho244a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho244a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho244a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho245() {
        int trecho245a = 218;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho245a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho245a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho246() {
        int trecho246a = 43;
        int trecho246b = 375;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho246a, trecho246b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho246a || opcao == trecho246b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho246a, trecho246b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho247() {
        int trecho247a = 189;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho247a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho247a;
        opcaoTexto = opcao;
    }

// Tres Saidas
    void trecho248() {
        int trecho248a = 174;
        int trecho248b = 291;
        int trecho248c = 391;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf("Vá para %d ou %d ou %d .\n", trecho248a, trecho248b, trecho248c);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho248a || opcao == trecho248b || opcao == trecho248c) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d. ", trecho248a, trecho248b, trecho248c);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }

// Duas Saidas
    void trecho249() {
        int trecho249a = 61;
        int trecho249b = 157;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho249a, trecho249b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho249a || opcao == trecho249b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho249a, trecho249b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho250() {
        int trecho250a = 224;
        int trecho250b = 108;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho250a, trecho250b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho250a || opcao == trecho250b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho250a, trecho250b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho251() {
        int trecho251a = 31;
        int trecho251b = 137;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho251a, trecho251b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho251a || opcao == trecho251b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho251a, trecho251b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho252() {
        int trecho252a = 191;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho252a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho252a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho253() {
        int trecho253a = 52;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho253a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho253a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho254() {
        int trecho254a = 79;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho254a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho254a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho255() {
        int trecho255a = 41;
        int trecho255b = 124;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho255a, trecho255b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho255a || opcao == trecho255b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho255a, trecho255b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho256() {
        int trecho256a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho256a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho256a;
        opcaoTexto = opcao;
    }

// Tres Saidas
    void trecho257() {
        int trecho257a = 29;
        int trecho257b = 247;
        int trecho257c = 169;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf("Vá para %d ou %d ou %d .\n", trecho257a, trecho257b, trecho257c);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho257a || opcao == trecho257b || opcao == trecho257c) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d. ", trecho257a, trecho257b, trecho257c);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }

// uma saida //12
    void trecho258() {
        int trecho258a = 309;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho258a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho258a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho259() {
        int trecho259a = 180;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho259a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho259a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho260() {
        int trecho260a = 127;
        int trecho260b = 51;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho260a, trecho260b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho260a || opcao == trecho260b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho260a, trecho260b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho261() {
        int trecho261a = 86;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho261a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho261a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho262() {
        int trecho262a = 75;
        int trecho262b = 296;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho262a, trecho262b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho262a || opcao == trecho262b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho262a, trecho262b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho263() {
        int trecho263a = 108;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho263a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho263a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho264() {
        int trecho264a = 382;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho264a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho264a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho265() {
        int trecho265a = 73;
        int trecho265b = 330;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho265a, trecho265b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho265a || opcao == trecho265b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho265a, trecho265b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho266() {
        int trecho266a = 357;
        int trecho266b = 100;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho266a, trecho266b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho266a || opcao == trecho266b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho266a, trecho266b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho267() {
        int trecho267a = 397;
        int trecho267b = 170;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho267a, trecho267b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho267a || opcao == trecho267b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho267a, trecho267b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho268() {
        int trecho268a = 338;
        int trecho268b = 102;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho268a, trecho268b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho268a || opcao == trecho268b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho268a, trecho268b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho269() {
        int trecho269a = 288;
        int trecho269b = 23;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho269a, trecho269b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho269a || opcao == trecho269b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho269a, trecho269b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho270() {
        int trecho270a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho270a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho270a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho271() {
        int trecho271a = 5;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho271a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho271a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho272() {
        int trecho272a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho272a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho272a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho273() {
        int trecho273a = 372;
        int trecho273b = 393;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho273a, trecho273b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho273a || opcao == trecho273b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho273a, trecho273b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho274() {
        int trecho274a = 199;
        int trecho274b = 342;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho274a, trecho274b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho274a || opcao == trecho274b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho274a, trecho274b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho275() {
        int trecho275a = 398;
        int trecho275b = 181;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho275a, trecho275b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho275a || opcao == trecho275b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho275a, trecho275b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho276() {
        int trecho276a = 382;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho276a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho276a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho277() {
        int trecho277a = 384;
        int trecho277b = 215;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho277a, trecho277b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho277a || opcao == trecho277b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho277a, trecho277b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho278() {
        int trecho278a = 70;
        int trecho278b = 374;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho278a, trecho278b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho278a || opcao == trecho278b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho278a, trecho278b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho279() {
        int trecho279a = 292;
        int trecho279b = 52;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho279a, trecho279b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho279a || opcao == trecho279b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho279a, trecho279b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho280() {
        int trecho280a = 243;
        int trecho280b = 166;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho280a, trecho280b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho280a || opcao == trecho280b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho280a, trecho280b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho281() {
        int trecho281a = 163;
        int trecho281b = 324;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho281a, trecho281b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho281a || opcao == trecho281b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho281a, trecho281b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho282() {
        int trecho282a = 278;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho282a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho282a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho283() {
        int trecho283a = 109;
        int trecho283b = 326;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho283a, trecho283b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho283a || opcao == trecho283b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho283a, trecho283b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho284() {
        int trecho284a = 31;
        int trecho284b = 177;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho284a, trecho284b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho284a || opcao == trecho284b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho284a, trecho284b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho285() {
        int trecho285a = 345;
        int trecho285b = 315;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho285a, trecho285b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho285a || opcao == trecho285b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho285a, trecho285b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho286() {
        int trecho286a = 21;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho286a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho286a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho287() {
        int trecho287a = 141;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho287a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho287a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho288() {
        int trecho288a = 379;
        int trecho288MonstroEne = 8;
        int trecho288MonstroHab = 9;
        String trecho288MonstroNome = ("Troll das Colinas");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho288a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho288a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho289() {
        int trecho289a = 220;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho289a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho289a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho290() {
        int trecho290a = 180;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho290a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho290a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho291() {
        int trecho291a = 327;
        int trecho291b = 148;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho291a, trecho291b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho291a || opcao == trecho291b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho291a, trecho291b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Tres Saidas
    void trecho292() {
        int trecho292a = 333;
        int trecho292b = 126;
        int trecho292c = 150;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf("Vá para %d ou %d ou %d .\n", trecho292a, trecho292b, trecho292c);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho292a || opcao == trecho292b || opcao == trecho292c) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d. ", trecho292a, trecho292b, trecho292c);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }

// uma saida
    void trecho293() {
        int trecho293a = 95;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho293a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho293a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho294() {
        int trecho294a = 166;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho294a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho294a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho295() {
        int trecho295a = 16;
        int trecho295MonstroEne = 7;
        int trecho295MonstroHab = 7;
        String trecho295MonstroNome = ("Homem Peixe");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho295a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho295a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho296() {
        int trecho296a = 156;
        int trecho296b = 38;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho296a, trecho296b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho296a || opcao == trecho296b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho296a, trecho296b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho297() {
        int trecho297a = 280;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho297a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho297a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho298() {
        int trecho298a = 30;
        int trecho298b = 203;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho298a, trecho298b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho298a || opcao == trecho298b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho298a, trecho298b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho299() {
        int trecho299a = 36;
        int trecho299b = 158;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho299a, trecho299b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho299a || opcao == trecho299b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho299a, trecho299b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho300() {
        int trecho300a = 137;
    int trecho300b = 177;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho300a, trecho300b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho300a || opcao == trecho300b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho300a, trecho300b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho301() {
        int trecho301a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho301a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho301a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho302() {
        int trecho302a = 101;
    int trecho302MonstroEne = 8;
    int trecho302MonstroHab = 8;
    String trecho302MonstroNome = ("Homem com Machado");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho302a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho302a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho303() {
        int trecho303a = 108;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho303a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho303a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho304() {
        int trecho304a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho304a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho304a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho305() {
        int trecho305a = 323;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho305a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho305a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho306() {
        int trecho306a = 243;
    int trecho306b = 320;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho306a, trecho306b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho306a || opcao == trecho306b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho306a, trecho306b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho307() {
        int trecho307a = 194;
    int trecho307b = 67;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho307a, trecho307b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho307a || opcao == trecho307b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho307a, trecho307b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
       
        opcaoTexto = opcao;
    }
    
// uma saida
    void trecho308() {
        int trecho308a = 162;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho308a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho308a;
        opcaoTexto = opcao;
    }

    void trecho309() {
        int trecho309a = 119;
    int trecho309b = 234;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho309a, trecho309b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho309a || opcao == trecho309b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho309a, trecho309b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho310() {
        int trecho310a = 186;
    int trecho310b = 282;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho310a, trecho310b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho310a || opcao == trecho310b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho310a, trecho310b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho311() {
        int trecho311a = 382;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho311a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho311a;
        opcaoTexto = opcao;
    }

// Tres Saidas
    void trecho312() {
        int trecho312a = 349;
    int trecho312b = 233;
    int trecho312c = 6;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf("Vá para %d ou %d ou %d .\n", trecho312a, trecho312b, trecho312c);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho312a || opcao == trecho312b || opcao == trecho312c) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d. ", trecho312a, trecho312b, trecho312c);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }

// uma saida
    void trecho313() {
        int trecho313a = 366;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho313a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho313a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho314() {
        int trecho314a = 368;
    int trecho314b = 146;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho314a, trecho314b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho314a || opcao == trecho314b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho314a, trecho314b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho315() {
        int trecho315a = 265;
    int trecho315b = 130;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho315a, trecho315b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho315a || opcao == trecho315b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho315a, trecho315b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

//Duas Saidas
    void trecho316() {
        int trecho316a = 359;
    int trecho316b = 91;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho316a, trecho316b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho316a || opcao == trecho316b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho316a, trecho316b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho317() {
        int trecho317a = 351;
        int trecho317MonstroEne = 11;
        int trecho317MonstroHab = 10;
        String trecho317MonstroNome = ("Guerreiro do Caos");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho317a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho317a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho318() {
        int trecho318a = 234;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho318a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho318a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho319() {
        int trecho319a = 180;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho319a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho319a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho320() {
        int trecho320a = 211;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho320a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho320a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho321() {
        int trecho321a = 400;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho321a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho321a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho322() {
        int trecho322a = 382;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho322a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho322a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho323() {
        int trecho323a = 386;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho323a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho323a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho324() {
        int trecho324a = 271;
        int trecho324b = 363;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho324a, trecho324b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho324a || opcao == trecho324b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho324a, trecho324b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho325() {
        int trecho325a = 210;
    int trecho325b = 136;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho325a, trecho325b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho325a || opcao == trecho325b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho325a, trecho325b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho326() {
        int trecho326a = 289;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho326a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho326a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho327() {
        int trecho327a = 200;
    int trecho327b = 96;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho327a, trecho327b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho327a || opcao == trecho327b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho327a, trecho327b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho328() {
        int trecho328a = 284;
    int trecho328b = 187;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho328a, trecho328b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho328a || opcao == trecho328b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho328a, trecho328b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Tres Saidas
    void trecho329() {
        int trecho329a = 179;
    int trecho329b = 367;
    int trecho329c = 54;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf("Vá para %d ou %d ou %d .\n", trecho329a, trecho329b, trecho329c);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho329a || opcao == trecho329b || opcao == trecho329c) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d. ", trecho329a, trecho329b, trecho329c);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }

// uma saida
    void trecho330() {
        int trecho330a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho330a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho330a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho331() {
        int trecho331a = 110;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho331a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho331a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho332() {
        int trecho332a = 377;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho332a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho332a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho333() {
        int trecho333a = 52;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho333a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho333a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho334() {
        int trecho334a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho334a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho334a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho335() {
        int trecho335a = 218;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho335a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho335a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho336() {
        int trecho336a = 114;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho336a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho336a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho337() {
        int trecho337a = 69;
    int trecho337b = 83;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho337a, trecho337b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho337a || opcao == trecho337b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho337a, trecho337b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho338() {
        int trecho338a = 22;
        int trecho338b = 149;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho338a, trecho338b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho338a || opcao == trecho338b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho338a, trecho338b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho339() {
        int trecho339a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho339a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho339a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho340() {
        int trecho340a = 49;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho340a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho340a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho341() {
        int trecho341a = 32;
    int trecho341b = 250;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho341a, trecho341b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho341a || opcao == trecho341b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho341a, trecho341b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho342() {
        int trecho342a = 77;
    int trecho342b = 211;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho342a, trecho342b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho342a || opcao == trecho342b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho342a, trecho342b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho343() {
        int trecho343a = 125;
    int trecho343b = 294;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho343a, trecho343b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho343a || opcao == trecho343b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho343a, trecho343b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho344() {
        int trecho344a = 220;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho344a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho344a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho345() {
        int trecho345a = 66;
    int trecho345b = 103;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho345a, trecho345b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho345a || opcao == trecho345b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho345a, trecho345b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho346() {
        int trecho346a = 209;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho346a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho346a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho347() {
        int trecho347a = 50;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho347a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho347a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho348() {
        int trecho348a = 161;
    int trecho348b = 3;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho348a, trecho348b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho348a || opcao == trecho348b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho348a, trecho348b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho349() {
        int trecho349a = 226;
    int trecho349b = 134;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho349a, trecho349b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho349a || opcao == trecho349b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho349a, trecho349b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho350() {
       int trecho350a = 167;
    int trecho350b = 399;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho350a, trecho350b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho350a || opcao == trecho350b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho350a, trecho350b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho351() {
        int trecho351a = 178;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho351a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho351a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho352() {
        int trecho352a = 251;
    int trecho352Monstro1Ene = 5;
    int trecho352Monstro1Hab = 6;
    String trecho352Monstro1Nome = ("Primeiro Goblin do Esgoto");
    int trecho352Monstro2Ene = 5;
    int trecho352Monstro2Hab = 6;
    String trecho352Monstro2Nome = ("Segundo Goblin do Esgoto");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho352a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho352a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho353() {
        int trecho353a = 175;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho353a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho353a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho354() {
       int trecho354a = 53;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho354a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho354a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho355() {
        int trecho355a = 213;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho355a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho355a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho356() {
        int trecho356a = 269;
    int trecho356b = 62;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho356a, trecho356b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho356a || opcao == trecho356b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho356a, trecho356b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho357() {
        int trecho357a = 319;
    int trecho357b = 57;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho357a, trecho357b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho357a || opcao == trecho357b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho357a, trecho357b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho358() {
        int trecho358a = 203;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho358a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho358a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho359() {
        int trecho359a = 118;
    int trecho359b = 317;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho359a, trecho359b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho359a || opcao == trecho359b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho359a, trecho359b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Tres Saidas
    void trecho360() {
        int trecho360a = 304;
    int trecho360b = 344;
    int trecho360c = 147;
    int trecho360d = 283;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf("Vá para %d ou %d ou %d ou %d.\n", trecho360a, trecho360b, trecho360c, trecho360d);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho360a || opcao == trecho360b || opcao == trecho360c) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d. ", trecho360a, trecho360b, trecho360c);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }

// uma saida
    void trecho361() {
        int trecho361a = 149;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho361a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho361a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho362() {
        int trecho362a = 315;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho362a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho362a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho363() {
        int trecho363a = 78;
    int trecho363Monstro1Ene = 7;
    int trecho363Monstro1Hab = 8;
    String trecho363Monstro1Nome = ("Primeiro Guarda da Cidade");
    int trecho363Monstro2Ene = 8;
    int trecho363Monstro2Hab = 8;
    String trecho363Monstro2Nome = ("Segundo Guarda da Cidade");  
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho363a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho363a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho364() {
        int trecho364a = 323;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho364a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho364a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho365() {
        int trecho365a = 88;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho365a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho365a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho366() {
        int trecho366a = 279;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho366a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho366a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho367() {
        int trecho367a = 209;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho367a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho367a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho368() {
        int trecho368a = 81;
    int trecho368b = 183;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho368a, trecho368b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho368a || opcao == trecho368b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho368a, trecho368b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho369() {
        int trecho369a = 355;
    int trecho369b = 218;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho369a, trecho369b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho369a || opcao == trecho369b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho369a, trecho369b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Tres Saidas
    void trecho370() {
        int trecho370a = 29;
    int trecho370b = 247;
    int trecho370c = 169;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf("Vá para %d ou %d ou %d .\n", trecho370a, trecho370b, trecho370c);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho370a || opcao == trecho370b || opcao == trecho370c) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d. ", trecho370a, trecho370b, trecho370c);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }

// uma saida
    void trecho371() {
        int trecho371a = 52;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho371a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho371a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho372() {
        int trecho372a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho372a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho372a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho373() {
        int trecho373a = 237;
    int trecho373b = 355;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho373a, trecho373b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho373a || opcao == trecho373b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho373a, trecho373b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho374() {
        int trecho374a = 305;
    int trecho374b = 228;
    int trecho374MonstroEne = 9;
    int trecho374MonstroHab = 8;
    String trecho374MonstroNome = ("Lobisomen");
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho374a, trecho374b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho374a || opcao == trecho374b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho374a, trecho374b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho375() {
        int trecho375a = 188;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho375a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho375a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho376() {
        int trecho376a = 65;
    int trecho376b = 268;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho376a, trecho376b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho376a || opcao == trecho376b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho376a, trecho376b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho377() {
        int trecho377a = 85;
    int trecho377b = 214;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho377a, trecho377b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho377a || opcao == trecho377b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho377a, trecho377b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Tres Saidas
    void trecho378() {
        int trecho378a = 3;
    int trecho378b = 18;
    int trecho378c = 348;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf("Vá para %d ou %d ou %d .\n", trecho378a, trecho378b, trecho378c);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho378a || opcao == trecho378b || opcao == trecho378c) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d. ", trecho378a, trecho378b, trecho378c);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }

// Duas Saidas
    void trecho379() {
        int trecho379a = 193;
    int trecho379b = 394;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho379a, trecho379b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho379a || opcao == trecho379b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho379a, trecho379b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho380() {
        int trecho380a = 309;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho380a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho380a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho381() {
        int trecho381a = 11;
    int trecho381b = 221;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho381a, trecho381b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho381a || opcao == trecho381b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho381a, trecho381b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho382() {
        int trecho382a = 112;
    int trecho382b = 218;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho382a, trecho382b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho382a || opcao == trecho382b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho382a, trecho382b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho383() {
        int trecho383a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho383a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho383a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho384() {
        int trecho384a = 7;
    int trecho384b = 313;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho384a, trecho384b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho384a || opcao == trecho384b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho384a, trecho384b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho385() {
        int trecho385a = 314;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho385a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho385a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho386() {
        int trecho386a = 316;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho386a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho386a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho387() {
        int trecho387a = 243;
    int trecho387b = 320;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho387a, trecho387b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho387a || opcao == trecho387b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho387a, trecho387b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho388() {
        int trecho388a = 95;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho388a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho388a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho389() {
        int trecho389a = 162;
    int trecho389b = 308;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho389a, trecho389b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho389a || opcao == trecho389b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho389a, trecho389b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho390() {
        int trecho390a = 203;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho390a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho390a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho391() {
        int trecho391a = 327;
    int trecho391b = 148;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho391a, trecho391b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho391a || opcao == trecho391b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho391a, trecho391b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho392() {
        int trecho392a = 115;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho392a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho392a;
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho393() {
        int trecho393a = 42;
    int trecho393b = 160;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho393a, trecho393b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho393a || opcao == trecho393b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho393a, trecho393b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Tres Saidas
    void trecho394() {
        int trecho394a = 236;
    int trecho394b = 39;
    int trecho394c = 301;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf("Vá para %d ou %d ou %d .\n", trecho394a, trecho394b, trecho394c);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho394a || opcao == trecho394b || opcao == trecho394c) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d. ", trecho394a, trecho394b, trecho394c);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }

// Duas Saidas
    void trecho395() {
        int trecho395a = 322;
    int trecho395b = 56;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho395a, trecho395b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho395a || opcao == trecho395b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho395a, trecho395b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// Duas Saidas
    void trecho396() {
         int trecho396a = 82;
    int trecho396b = 370;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para : %d ou %d " + "\n", trecho396a, trecho396b);
        System.out.print("Quero ir para: ");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        //Com If e While
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho396a || opcao == trecho396b) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido.\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d.\n", trecho396a, trecho396b);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;
    }

// uma saida
    void trecho397() {
        int trecho397a = 0;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho397a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho397a;
        opcaoTexto = opcao;
    }

// uma saida
    void trecho398() {
        int trecho398a = 181;
        String validador = "Não Validado";
        System.out.println("");
        System.out.printf("Vá para %d .\n", trecho398a);
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String pausa = teclado.nextLine();
        int opcao = trecho398a;
        opcaoTexto = opcao;
    }

// Tres Saidas
    void trecho399() {
        int trecho399a = 97;
    int trecho399b = 207;
    int trecho399c = 360;
        String validador = "Não Validado";
        System.out.print("");
        System.out.printf("Vá para %d ou %d ou %d .\n", trecho399a, trecho399b, trecho399c);
        System.out.print("Quero ir para: ");
        System.out.print("");
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        while ("Não Validado".equals(validador)) {
            if (opcao == trecho399a || opcao == trecho399b || opcao == trecho399c) {
                validador = "Validado";

            } else {
                System.out.printf("A opção %d não é um caminho valido. Escolha um caminho valido\n", opcao);
                System.out.printf("Digite a opção correta. %d ou %d ou %d. ", trecho399a, trecho399b, trecho399c);
                int opcao1 = teclado.nextInt();
                opcao = opcao1;
                validador = "Não Validado";
            }

        }
        opcaoTexto = opcao;

    }
    
    void trecho400() {
        System.out.println("Fim");

    }

    public int getOpcaoTexto() {
        return opcaoTexto;
    }

    public void setOpcao(int opcaoTexto) {
        this.opcaoTexto = opcaoTexto;
    }
}