package aventuralivrojogo;

import java.util.Scanner;

public class JogoExercitosDaMorte {

    public static void main(String[] args) {

        String validador = ("Não Validado");
        int opcaoGeral = 0;
        //Apresentação
        System.out.println("Livro Jogo - *Exercitos da Morte*");
        //Introdução
        TextoLivro jogo001 = new TextoLivro();
        jogo001.introducao();
        Scanner pausa001 = new Scanner(System.in);
        String teste = pausa001.nextLine();

        //Definição do Personagem
        System.out.println("1º Passo: Criação do Personagem");
        Jogador player01 = new Jogador();

        player01.lerNomeJogador();
        player01.definirEnergiaJogador();
        player01.definirSorteJogador();
        player01.definirStatusJogador();
        player01.definirHabilidadeJogador();
        player01.definirOuro();
        player01.exercito();
        player01.cabecalho();
        Scanner pausa = new Scanner(System.in);
        String teste002 = pausa.nextLine();

        //Inicio da História
        jogo001.trecho001();
        opcaoGeral = jogo001.getOpcaoTexto();

        //jogo001.getTrecho001a()
        do {

            opcaoGeral = jogo001.getOpcaoTexto();

            switch (opcaoGeral) {
                case 0 -> {
                    System.out.println("Morreu");
                    break;
                    //opcaoGeral = -1;
                }
                case 1 -> {
                    jogo001.trecho001();
                    break;
                }
                case 2 -> {
                    jogo001.trecho002();
                    break;
                }
                case 3 -> {
                    jogo001.trecho003();
                    break;
                }
                case 4 -> {
                    jogo001.trecho004();
                    break;
                }
                case 5 -> {
                    jogo001.trecho005();
                    break;
                }
                case 6 -> {
                    jogo001.trecho005();
                    break;
                }
                case 7 -> {
                    jogo001.trecho007();
                    break;
                }
                case 8 -> {
                    jogo001.trecho008();
                    break;
                }
                case 9 -> {
                    jogo001.trecho009();
                    break;
                }
                case 10 -> {
                    jogo001.trecho010();
                    break;
                }
                default -> {
                    System.out.println("Opção invalida");
                    opcaoGeral = 0;

                    break;
                }
                case 11 -> {
                    jogo001.trecho011();
                    break;
                }
                case 12 -> {
                    jogo001.trecho012();
                    break;
                }
                case 13 -> {
                    jogo001.trecho013();
                    break;
                }
                case 14 -> {
                    jogo001.trecho014();
                    break;
                }
                case 15 -> {
                    jogo001.trecho015();
                    break;
                }
                case 16 -> {
                    jogo001.trecho016();
                    break;
                }
                case 17 -> {
                    jogo001.trecho017();
                    break;
                }
                case 18 -> {
                    jogo001.trecho018();
                    break;
                }
                case 19 -> {
                    jogo001.trecho019();
                    break;
                }
                case 20 -> {
                    jogo001.trecho020();
                    break;
                }
                case 21 -> {
                    jogo001.trecho021();
                    break;
                }
                case 22 -> {
                    jogo001.trecho022();
                    break;
                }
                case 23 -> {
                    jogo001.trecho023();
                    break;
                }
                case 24 -> {
                    jogo001.trecho024();
                    break;
                }
                case 25 -> {
                    jogo001.trecho025();
                    break;
                }
                case 26 -> {
                    jogo001.trecho026();
                    break;
                }
                case 27 -> {
                    jogo001.trecho027();
                    break;
                }
                case 28 -> {
                    jogo001.trecho028();
                    break;
                }
                case 29 -> {
                    jogo001.trecho029();
                    break;
                }
                case 30 -> {
                    jogo001.trecho030();
                    break;
                }
                case 31 -> {
                    jogo001.trecho031();
                    break;
                }
                case 32 -> {
                    jogo001.trecho032();
                    break;
                }
                case 33 -> {
                    jogo001.trecho033();
                    break;
                }
                case 34 -> {
                    jogo001.trecho034();
                    break;
                }
                case 35 -> {
                    jogo001.trecho035();
                    break;
                }
                case 36 -> {
                    jogo001.trecho036();
                    break;
                }
                case 37 -> {
                    jogo001.trecho037();
                    break;
                }
                case 38 -> {
                    jogo001.trecho038();
                    break;
                }
                case 39 -> {
                    jogo001.trecho039();
                    break;
                }
                case 40 -> {
                    jogo001.trecho040();
                    break;
                }
                case 41 -> {
                    jogo001.trecho041();
                    break;
                }
                case 42 -> {
                    jogo001.trecho042();
                    break;
                }
                case 43 -> {
                    jogo001.trecho043();
                    break;
                }
                case 44 -> {
                    jogo001.trecho044();
                    break;
                }
                case 45 -> {
                    jogo001.trecho045();
                    break;
                }
                case 46 -> {
                    jogo001.trecho046();
                    break;
                }
                case 47 -> {
                    jogo001.trecho047();
                    break;
                }
                case 48 -> {
                    jogo001.trecho048();
                    break;
                }
                case 49 -> {
                    jogo001.trecho049();
                    break;
                }
                case 50 -> {
                    jogo001.trecho050();
                    break;
                }
                case 51 -> {
                    jogo001.trecho051();
                    break;
                }
                case 52 -> {
                    jogo001.trecho052();
                    break;
                }
                case 53 -> {
                    jogo001.trecho053();
                    break;
                }
                case 54 -> {
                    jogo001.trecho054();
                    break;
                }
                case 55 -> {
                    jogo001.trecho055();
                    break;
                }
                case 56 -> {
                    jogo001.trecho056();
                    break;
                }
                case 57 -> {
                    jogo001.trecho057();
                    break;
                }
                case 58 -> {
                    jogo001.trecho058();
                    break;
                }
                case 59 -> {
                    jogo001.trecho059();
                    break;
                }
                case 60 -> {
                    jogo001.trecho060();
                    break;
                }
                case 61 -> {
                    jogo001.trecho061();
                    break;
                }
                case 62 -> {
                    jogo001.trecho062();
                    break;
                }
                case 63 -> {
                    jogo001.trecho063();
                    break;
                }
                case 64 -> {
                    jogo001.trecho064();
                    break;
                }
                case 65 -> {
                    jogo001.trecho065();
                    break;
                }
                case 66 -> {
                    jogo001.trecho066();
                    break;
                }
                case 67 -> {
                    jogo001.trecho067();
                    break;
                }
                case 68 -> {
                    jogo001.trecho068();
                    break;
                }
                case 69 -> {
                    jogo001.trecho069();
                    break;
                }
                case 70 -> {
                    jogo001.trecho070();
                    break;
                }
                case 71 -> {
                    jogo001.trecho071();
                    break;
                }
                case 72 -> {
                    jogo001.trecho072();
                    break;
                }
                case 73 -> {
                    jogo001.trecho073();
                    break;
                }
                case 74 -> {
                    jogo001.trecho074();
                    break;
                }
                case 75 -> {
                    jogo001.trecho075();
                    break;
                }
                case 76 -> {
                    jogo001.trecho076();
                    break;
                }
                case 77 -> {
                    jogo001.trecho077();
                    break;
                }
                case 78 -> {
                    jogo001.trecho078();
                    break;
                }
                case 79 -> {
                    jogo001.trecho079();
                    break;
                }
                case 80 -> {
                    jogo001.trecho080();
                    break;
                }
                case 81 -> {
                    jogo001.trecho081();
                    break;
                }
                case 82 -> {
                    jogo001.trecho082();
                    break;
                }
                case 83 -> {
                    jogo001.trecho083();
                    break;
                }
                case 84 -> {
                    jogo001.trecho084();
                    break;
                }
                case 85 -> {
                    jogo001.trecho085();
                    break;
                }
                case 86 -> {
                    jogo001.trecho086();
                    break;
                }
                case 87 -> {
                    jogo001.trecho087();
                    break;
                }
                case 88 -> {
                    jogo001.trecho088();
                    break;
                }
                case 89 -> {
                    jogo001.trecho089();
                    break;
                }
                case 90 -> {
                    jogo001.trecho090();
                    break;
                }
                case 91 -> {
                    jogo001.trecho091();
                    break;
                }
                case 92 -> {
                    jogo001.trecho092();
                    break;
                }
                case 93 -> {
                    jogo001.trecho093();
                    break;
                }
                case 94 -> {
                    jogo001.trecho094();
                    break;
                }
                case 95 -> {
                    jogo001.trecho095();
                    break;
                }
                case 96 -> {
                    jogo001.trecho096();
                    break;
                }
                case 97 -> {
                    jogo001.trecho097();
                    break;
                }
                case 98 -> {
                    jogo001.trecho098();
                    break;
                }
                case 99 -> {
                    jogo001.trecho099();
                    break;
                }
                case 100 -> {
                    jogo001.trecho100();
                    break;
                }
                case 101 -> {
                    jogo001.trecho101();
                    break;
                }
                case 102 -> {
                    jogo001.trecho102();
                    break;
                }
                case 103 -> {
                    jogo001.trecho103();
                    break;
                }
                case 104 -> {
                    jogo001.trecho104();
                    break;
                }
                case 105 -> {
                    jogo001.trecho105();
                    break;
                }
                case 106 -> {
                    jogo001.trecho106();
                    break;
                }
                case 107 -> {
                    jogo001.trecho107();
                    break;
                }
                case 108 -> {
                    jogo001.trecho108();
                    break;
                }
                case 109 -> {
                    jogo001.trecho109();
                    break;
                }
                case 110 -> {
                    jogo001.trecho110();
                    break;
                }
                case 111 -> {
                    jogo001.trecho111();
                    break;
                }
                case 112 -> {
                    jogo001.trecho112();
                    break;
                }
                case 113 -> {
                    jogo001.trecho113();
                    break;
                }
                case 114 -> {
                    jogo001.trecho114();
                    break;
                }
                case 115 -> {
                    jogo001.trecho115();
                    break;
                }
                case 116 -> {
                    jogo001.trecho116();
                    break;
                }
                case 117 -> {
                    jogo001.trecho117();
                    break;
                }
                case 118 -> {
                    jogo001.trecho118();
                    break;
                }
                case 119 -> {
                    jogo001.trecho119();
                    break;
                }
                case 120 -> {
                    jogo001.trecho120();
                    break;
                }
                case 121 -> {
                    jogo001.trecho121();
                    break;
                }
                case 122 -> {
                    jogo001.trecho122();
                    break;
                }
                case 123 -> {
                    jogo001.trecho123();
                    break;
                }
                case 124 -> {
                    jogo001.trecho124();
                    break;
                }
                case 125 -> {
                    jogo001.trecho125();
                    break;
                }
                case 126 -> {
                    jogo001.trecho126();
                    break;
                }
                case 127 -> {
                    jogo001.trecho127();
                    break;
                }
                case 128 -> {
                    jogo001.trecho128();
                    break;
                }
                case 129 -> {
                    jogo001.trecho129();
                    break;
                }
                case 130 -> {
                    jogo001.trecho130();
                    break;
                }
                case 131 -> {
                    jogo001.trecho131();
                    break;
                }
                case 132 -> {
                    jogo001.trecho132();
                    break;
                }
                case 133 -> {
                    jogo001.trecho133();
                    break;
                }
                case 134 -> {
                    jogo001.trecho134();
                    break;
                }
                case 135 -> {
                    jogo001.trecho135();
                    break;
                }
                case 136 -> {
                    jogo001.trecho136();
                    break;
                }
                case 137 -> {
                    jogo001.trecho137();
                    break;
                }
                case 138 -> {
                    jogo001.trecho138();
                    break;
                }
                case 139 -> {
                    jogo001.trecho139();
                    break;
                }
                case 140 -> {
                    jogo001.trecho140();
                    break;
                }
                case 141 -> {
                    jogo001.trecho141();
                    break;
                }
                case 142 -> {
                    jogo001.trecho142();
                    break;
                }
                case 143 -> {
                    jogo001.trecho143();
                    break;
                }
                case 144 -> {
                    jogo001.trecho144();
                    break;
                }
                case 145 -> {
                    jogo001.trecho145();
                    break;
                }
                case 146 -> {
                    jogo001.trecho146();
                    break;
                }
                case 147 -> {
                    jogo001.trecho147();
                    break;
                }
                case 148 -> {
                    jogo001.trecho148();
                    break;
                }
                case 149 -> {
                    jogo001.trecho149();
                    break;
                }
                case 150 -> {
                    jogo001.trecho150();
                    break;
                }
                case 151 -> {
                    jogo001.trecho151();
                    break;
                }
                case 152 -> {
                    jogo001.trecho152();
                    break;
                }
                case 153 -> {
                    jogo001.trecho153();
                    break;
                }
                case 154 -> {
                    jogo001.trecho154();
                    break;
                }
                case 155 -> {
                    jogo001.trecho155();
                    break;
                }
                case 156 -> {
                    jogo001.trecho156();
                    break;
                }
                case 157 -> {
                    jogo001.trecho157();
                    break;
                }
                case 158 -> {
                    jogo001.trecho158();
                    break;
                }
                case 159 -> {
                    jogo001.trecho159();
                    break;
                }
                case 160 -> {
                    jogo001.trecho160();
                    break;
                }
                case 161 -> {
                    jogo001.trecho161();
                    break;
                }
                case 162 -> {
                    jogo001.trecho162();
                    break;
                }
                case 163 -> {
                    jogo001.trecho163();
                    break;
                }
                case 164 -> {
                    jogo001.trecho164();
                    break;
                }
                case 165 -> {
                    jogo001.trecho165();
                    break;
                }
                case 166 -> {
                    jogo001.trecho166();
                    break;
                }
                case 167 -> {
                    jogo001.trecho167();
                    break;
                }
                case 168 -> {
                    jogo001.trecho168();
                    break;
                }
                case 169 -> {
                    jogo001.trecho169();
                    break;
                }
                case 170 -> {
                    jogo001.trecho170();
                    break;
                }
                case 171 -> {
                    jogo001.trecho171();
                    break;
                }
                case 172 -> {
                    jogo001.trecho172();
                    break;
                }
                case 173 -> {
                    jogo001.trecho173();
                    break;
                }
                case 174 -> {
                    jogo001.trecho174();
                    break;
                }
                case 175 -> {
                    jogo001.trecho175();
                    break;
                }
                case 176 -> {
                    jogo001.trecho176();
                    break;
                }
                case 177 -> {
                    jogo001.trecho177();
                    break;
                }
                case 178 -> {
                    jogo001.trecho178();
                    break;
                }
                case 179 -> {
                    jogo001.trecho179();
                    break;
                }
                case 180 -> {
                    jogo001.trecho180();
                    break;
                }
                case 181 -> {
                    jogo001.trecho181();
                    break;
                }
                case 182 -> {
                    jogo001.trecho182();
                    break;
                }
                case 183 -> {
                    jogo001.trecho183();
                    break;
                }
                case 184 -> {
                    jogo001.trecho184();
                    break;
                }
                case 185 -> {
                    jogo001.trecho185();
                    break;
                }
                case 186 -> {
                    jogo001.trecho186();
                    break;
                }
                case 187 -> {
                    jogo001.trecho187();
                    break;
                }
                case 188 -> {
                    jogo001.trecho188();
                    break;
                }
                case 189 -> {
                    jogo001.trecho189();
                    break;
                }
                case 190 -> {
                    jogo001.trecho190();
                    break;
                }
                case 191 -> {
                    jogo001.trecho191();
                    break;
                }
                case 192 -> {
                    jogo001.trecho192();
                    break;
                }
                case 193 -> {
                    jogo001.trecho193();
                    break;
                }
                case 194 -> {
                    jogo001.trecho194();
                    break;
                }
                case 195 -> {
                    jogo001.trecho195();
                    break;
                }
                case 196 -> {
                    jogo001.trecho196();
                    break;
                }
                case 197 -> {
                    jogo001.trecho197();
                    break;
                }
                case 198 -> {
                    jogo001.trecho198();
                    break;
                }
                case 199 -> {
                    jogo001.trecho199();
                    break;
                }
                case 200 -> {
                    jogo001.trecho200();
                    break;
                }
                case 201 -> {
                    jogo001.trecho201();
                    break;
                }
                case 202 -> {
                    jogo001.trecho202();
                    break;
                }
                case 203 -> {
                    jogo001.trecho203();
                    break;
                }
                case 204 -> {
                    jogo001.trecho204();
                    break;
                }
                case 205 -> {
                    jogo001.trecho205();
                    break;
                }
                case 206 -> {
                    jogo001.trecho206();
                    break;
                }
                case 207 -> {
                    jogo001.trecho207();
                    break;
                }
                case 208 -> {
                    jogo001.trecho208();
                    break;
                }
                case 209 -> {
                    jogo001.trecho209();
                    break;
                }
                case 210 -> {
                    jogo001.trecho210();
                    break;
                }
                case 211 -> {
                    jogo001.trecho211();
                    break;
                }
                case 212 -> {
                    jogo001.trecho212();
                    break;
                }
                case 213 -> {
                    jogo001.trecho213();
                    break;
                }
                case 214 -> {
                    jogo001.trecho214();
                    break;
                }
                case 215 -> {
                    jogo001.trecho215();
                    break;
                }
                case 216 -> {
                    jogo001.trecho216();
                    break;
                }
                case 217 -> {
                    jogo001.trecho217();
                    break;
                }
                case 218 -> {
                    jogo001.trecho218();
                    break;
                }
                case 219 -> {
                    jogo001.trecho219();
                    break;
                }
                case 220 -> {
                    jogo001.trecho220();
                    break;
                }
                case 221 -> {
                    jogo001.trecho221();
                    break;
                }
                case 222 -> {
                    jogo001.trecho222();
                    break;
                }
                case 223 -> {
                    jogo001.trecho223();
                    break;
                }
                case 224 -> {
                    jogo001.trecho224();
                    break;
                }
                case 225 -> {
                    jogo001.trecho225();
                    break;
                }
                case 226 -> {
                    jogo001.trecho226();
                    break;
                }
                case 227 -> {
                    jogo001.trecho227();
                    break;
                }
                case 228 -> {
                    jogo001.trecho228();
                    break;
                }
                case 229 -> {
                    jogo001.trecho229();
                    break;
                }
                case 230 -> {
                    jogo001.trecho230();
                    break;
                }
                case 231 -> {
                    jogo001.trecho231();
                    break;
                }
                case 232 -> {
                    jogo001.trecho232();
                    break;
                }
                case 233 -> {
                    jogo001.trecho233();
                    break;
                }
                case 234 -> {
                    jogo001.trecho234();
                    break;
                }
                case 235 -> {
                    jogo001.trecho235();
                    break;
                }
                case 236 -> {
                    jogo001.trecho236();
                    break;
                }
                case 237 -> {
                    jogo001.trecho237();
                    break;
                }
                case 238 -> {
                    jogo001.trecho238();
                    break;
                }
                case 239 -> {
                    jogo001.trecho239();
                    break;
                }
                case 240 -> {
                    jogo001.trecho240();
                    break;
                }
                case 241 -> {
                    jogo001.trecho241();
                    break;
                }
                case 242 -> {
                    jogo001.trecho242();
                    break;
                }
                case 243 -> {
                    jogo001.trecho243();
                    break;
                }
                case 244 -> {
                    jogo001.trecho244();
                    break;
                }
                case 245 -> {
                    jogo001.trecho245();
                    break;
                }
                case 246 -> {
                    jogo001.trecho246();
                    break;
                }
                case 247 -> {
                    jogo001.trecho247();
                    break;
                }
                case 248 -> {
                    jogo001.trecho248();
                    break;
                }
                case 249 -> {
                    jogo001.trecho249();
                    break;
                }
                case 250 -> {
                    jogo001.trecho250();
                    break;
                }
                case 251 -> {
                    jogo001.trecho251();
                    break;
                }
                case 252 -> {
                    jogo001.trecho252();
                    break;
                }
                case 253 -> {
                    jogo001.trecho253();
                    break;
                }
                case 254 -> {
                    jogo001.trecho254();
                    break;
                }
                case 255 -> {
                    jogo001.trecho255();
                    break;
                }
                case 256 -> {
                    jogo001.trecho256();
                    break;
                }
                case 257 -> {
                    jogo001.trecho257();
                    break;
                }
                case 258 -> {
                    jogo001.trecho258();
                    break;
                }
                case 259 -> {
                    jogo001.trecho259();
                    break;
                }
                case 260 -> {
                    jogo001.trecho260();
                    break;
                }
                case 261 -> {
                    jogo001.trecho261();
                    break;
                }
                case 262 -> {
                    jogo001.trecho262();
                    break;
                }
                case 263 -> {
                    jogo001.trecho263();
                    break;
                }
                case 264 -> {
                    jogo001.trecho264();
                    break;
                }
                case 265 -> {
                    jogo001.trecho265();
                    break;
                }
                case 266 -> {
                    jogo001.trecho266();
                    break;
                }
                case 267 -> {
                    jogo001.trecho267();
                    break;
                }
                case 268 -> {
                    jogo001.trecho268();
                    break;
                }
                case 269 -> {
                    jogo001.trecho269();
                    break;
                }
                case 270 -> {
                    jogo001.trecho270();
                    break;
                }
                case 271 -> {
                    jogo001.trecho271();
                    break;
                }
                case 272 -> {
                    jogo001.trecho272();
                    break;
                }
                case 273 -> {
                    jogo001.trecho273();
                    break;
                }
                case 274 -> {
                    jogo001.trecho274();
                    break;
                }
                case 275 -> {
                    jogo001.trecho275();
                    break;
                }
                case 276 -> {
                    jogo001.trecho276();
                    break;
                }
                case 277 -> {
                    jogo001.trecho277();
                    break;
                }
                case 278 -> {
                    jogo001.trecho278();
                    break;
                }
                case 279 -> {
                    jogo001.trecho279();
                    break;
                }
                case 280 -> {
                    jogo001.trecho280();
                    break;
                }
                case 281 -> {
                    jogo001.trecho281();
                    break;
                }
                case 282 -> {
                    jogo001.trecho282();
                    break;
                }
                case 283 -> {
                    jogo001.trecho283();
                    break;
                }
                case 284 -> {
                    jogo001.trecho284();
                    break;
                }
                case 285 -> {
                    jogo001.trecho285();
                    break;
                }
                case 286 -> {
                    jogo001.trecho286();
                    break;
                }
                case 287 -> {
                    jogo001.trecho287();
                    break;
                }
                case 288 -> {
                    jogo001.trecho288();
                    break;
                }
                case 289 -> {
                    jogo001.trecho289();
                    break;
                }
                case 290 -> {
                    jogo001.trecho290();
                    break;
                }
                case 291 -> {
                    jogo001.trecho291();
                    break;
                }
                case 292 -> {
                    jogo001.trecho292();
                    break;
                }
                case 293 -> {
                    jogo001.trecho293();
                    break;
                }
                case 294 -> {
                    jogo001.trecho294();
                    break;
                }
                case 295 -> {
                    jogo001.trecho295();
                    break;
                }
                case 296 -> {
                    jogo001.trecho296();
                    break;
                }
                case 297 -> {
                    jogo001.trecho297();
                    break;
                }
                case 298 -> {
                    jogo001.trecho298();
                    break;
                }
                case 299 -> {
                    jogo001.trecho299();
                    break;
                }
                case 300 -> {
                    jogo001.trecho300();
                    break;
                }
                case 301 -> {
                    jogo001.trecho301();
                    break;
                }
                case 302 -> {
                    jogo001.trecho302();
                    break;
                }
                case 303 -> {
                    jogo001.trecho303();
                    break;
                }
                case 304 -> {
                    jogo001.trecho304();
                    break;
                }
                case 305 -> {
                    jogo001.trecho305();
                    break;
                }
                case 306 -> {
                    jogo001.trecho306();
                    break;
                }
                case 307 -> {
                    jogo001.trecho307();
                    break;
                }
                case 308 -> {
                    jogo001.trecho308();
                    break;
                }
                case 309 -> {
                    jogo001.trecho309();
                    break;
                }
                case 310 -> {
                    jogo001.trecho310();
                    break;
                }
                case 311 -> {
                    jogo001.trecho311();
                    break;
                }
                case 312 -> {
                    jogo001.trecho312();
                    break;
                }
                case 313 -> {
                    jogo001.trecho313();
                    break;
                }
                case 314 -> {
                    jogo001.trecho314();
                    break;
                }
                case 315 -> {
                    jogo001.trecho315();
                    break;
                }
                case 316 -> {
                    jogo001.trecho316();
                    break;
                }
                case 317 -> {
                    jogo001.trecho317();
                    break;
                }
                case 318 -> {
                    jogo001.trecho318();
                    break;
                }
                case 319 -> {
                    jogo001.trecho319();
                    break;
                }
                case 320 -> {
                    jogo001.trecho320();
                    break;
                }
                case 321 -> {
                    jogo001.trecho321();
                    break;
                }
                case 322 -> {
                    jogo001.trecho322();
                    break;
                }
                case 323 -> {
                    jogo001.trecho323();
                    break;
                }
                case 324 -> {
                    jogo001.trecho324();
                    break;
                }
                case 325 -> {
                    jogo001.trecho325();
                    break;
                }
                case 326 -> {
                    jogo001.trecho326();
                    break;
                }
                case 327 -> {
                    jogo001.trecho327();
                    break;
                }
                case 328 -> {
                    jogo001.trecho328();
                    break;
                }
                case 329 -> {
                    jogo001.trecho329();
                    break;
                }
                case 330 -> {
                    jogo001.trecho330();
                    break;
                }
                case 331 -> {
                    jogo001.trecho331();
                    break;
                }
                case 332 -> {
                    jogo001.trecho332();
                    break;
                }
                case 333 -> {
                    jogo001.trecho333();
                    break;
                }
                case 334 -> {
                    jogo001.trecho334();
                    break;
                }
                case 335 -> {
                    jogo001.trecho335();
                    break;
                }
                case 336 -> {
                    jogo001.trecho336();
                    break;
                }
                case 337 -> {
                    jogo001.trecho337();
                    break;
                }
                case 338 -> {
                    jogo001.trecho338();
                    break;
                }
                case 339 -> {
                    jogo001.trecho339();
                    break;
                }
                case 340 -> {
                    jogo001.trecho340();
                    break;
                }
                case 341 -> {
                    jogo001.trecho341();
                    break;
                }
                case 342 -> {
                    jogo001.trecho342();
                    break;
                }
                case 343 -> {
                    jogo001.trecho343();
                    break;
                }
                case 344 -> {
                    jogo001.trecho344();
                    break;
                }
                case 345 -> {
                    jogo001.trecho345();
                    break;
                }
                case 346 -> {
                    jogo001.trecho346();
                    break;
                }
                case 347 -> {
                    jogo001.trecho347();
                    break;
                }
                case 348 -> {
                    jogo001.trecho348();
                    break;
                }
                case 349 -> {
                    jogo001.trecho349();
                    break;
                }
                case 350 -> {
                    jogo001.trecho350();
                    break;
                }
                case 351 -> {
                    jogo001.trecho351();
                    break;
                }
                case 352 -> {
                    jogo001.trecho352();
                    break;
                }
                case 353 -> {
                    jogo001.trecho353();
                    break;
                }
                case 354 -> {
                    jogo001.trecho354();
                    break;
                }
                case 355 -> {
                    jogo001.trecho355();
                    break;
                }
                case 356 -> {
                    jogo001.trecho356();
                    break;
                }
                case 357 -> {
                    jogo001.trecho357();
                    break;
                }
                case 358 -> {
                    jogo001.trecho358();
                    break;
                }
                case 359 -> {
                    jogo001.trecho359();
                    break;
                }
                case 360 -> {
                    jogo001.trecho360();
                    break;
                }
                case 361 -> {
                    jogo001.trecho361();
                    break;
                }
                case 362 -> {
                    jogo001.trecho362();
                    break;
                }
                case 363 -> {
                    jogo001.trecho363();
                    break;
                }
                case 364 -> {
                    jogo001.trecho364();
                    break;
                }
                case 365 -> {
                    jogo001.trecho365();
                    break;
                }
                case 366 -> {
                    jogo001.trecho366();
                    break;
                }
                case 367 -> {
                    jogo001.trecho367();
                    break;
                }
                case 368 -> {
                    jogo001.trecho368();
                    break;
                }
                case 369 -> {
                    jogo001.trecho369();
                    break;
                }
                case 370 -> {
                    jogo001.trecho370();
                    break;
                }
                case 371 -> {
                    jogo001.trecho371();
                    break;
                }
                case 372 -> {
                    jogo001.trecho372();
                    break;
                }
                case 373 -> {
                    jogo001.trecho373();
                    break;
                }
                case 374 -> {
                    jogo001.trecho374();
                    break;
                }
                case 375 -> {
                    jogo001.trecho375();
                    break;
                }
                case 376 -> {
                    jogo001.trecho376();
                    break;
                }
                case 377 -> {
                    jogo001.trecho377();
                    break;
                }
                case 378 -> {
                    jogo001.trecho378();
                    break;
                }
                case 379 -> {
                    jogo001.trecho379();
                    break;
                }
                case 380 -> {
                    jogo001.trecho380();
                    break;
                }
                case 381 -> {
                    jogo001.trecho381();
                    break;
                }
                case 382 -> {
                    jogo001.trecho382();
                    break;
                }
                case 383 -> {
                    jogo001.trecho383();
                    break;
                }
                case 384 -> {
                    jogo001.trecho384();
                    break;
                }
                case 385 -> {
                    jogo001.trecho385();
                    break;
                }
                case 386 -> {
                    jogo001.trecho386();
                    break;
                }
                case 387 -> {
                    jogo001.trecho387();
                    break;
                }
                case 388 -> {
                    jogo001.trecho388();
                    break;
                }
                case 389 -> {
                    jogo001.trecho389();
                    break;
                }
                case 390 -> {
                    jogo001.trecho390();
                    break;
                }
                case 391 -> {
                    jogo001.trecho391();
                    break;
                }
                case 392 -> {
                    jogo001.trecho392();
                    break;
                }
                case 393 -> {
                    jogo001.trecho393();
                    break;
                }
                case 394 -> {
                    jogo001.trecho394();
                    break;
                }
                case 395 -> {
                    jogo001.trecho395();
                    break;
                }
                case 396 -> {
                    jogo001.trecho396();
                    break;
                }
                case 397 -> {
                    jogo001.trecho397();
                    break;
                }
                case 398 -> {
                    jogo001.trecho398();
                    break;
                }
                case 399 -> {
                    jogo001.trecho399();
                    break;
                }
                case 400 -> {
                    jogo001.trecho400();
                    break;
                }
            }
        } while (opcaoGeral != 0);

    }
}
