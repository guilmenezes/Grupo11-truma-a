/*Carlos Henrique, 
Caio Domingues, 
Gabriel Teles, 
Guilherme Menezes do Nascimento
 * 
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections; 
public class CodigoInfinitoRpg {

    static Scanner scanner = new Scanner(System.in);
    static String nomeJogador = "";
    static boolean acertouDePrimeira = true;
    static int experiencia = 0;
    static int pontos = 0;
    static int nivel = 1;
    static int xpParaProximoNivel = 100;
    static boolean[] habilidadeAdquirida = new boolean[5]; 
    static int bonusXpPassivo = 0; 

    
    static List<Integer> desafiosErrados = new ArrayList<>(); 
    static boolean recompilacaoTemporalAdquirida = false;
    public static void main(String[] args) {
        exibirBoasVindas();
        menu();
        scanner.close();
    }

    static void exibirBoasVindas() {
        System.out.println("=========================================");
        System.out.println("         Bem-vindo à Maldição do         ");
        System.out.println("         >> CÓDIGO INFINITO <<         ");
        System.out.println("=========================================");
        System.out.println("\n📖 Introdução:");
        System.out.println("Você é um(a) jovem programador(a) recém-contratado(a) pela enigmática empresa SENACT TECH.");
        System.out.println("No seu primeiro dia, uma estranha névoa digital paira sobre os corredores.");
        System.out.println("O zumbido dos servidores se mistura com sussurros de código e gritos de desespero.");
        System.out.println("Você percebe: seus novos colegas estão presos em **loops eternos**, seus olhos vidrados em telas...");
        System.out.println("Uma maldição de código tomou conta da empresa!");
        System.out.println("Cabe a você, o(a) novo(a) herói(ina) da programação, resolver os enigmas e");
        System.out.println("quebrar os loops para libertá-los e restaurar a ordem na SENACT!");
        System.out.println("\nPrepare-se para depurar seu caminho para a glória!");
    }

    static void menu() {
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1 - Jogar");
            System.out.println("2 - Instruções");
            System.out.println("3 - Créditos");
            System.out.println("4 - Sair do Sistema");
            System.out.println("5 - Loja de Habilidades"); 
            System.out.print("Escolha sua opção, programador(a): ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("🚫 Entrada inválida! Por favor, digite um número correspondente à opção.");
                continue;
            }

            switch (opcao) {
                case 1:
                    iniciarJogo();
                    break;
                case 2:
                    System.out.println("\n--- INSTRUÇÕES DO JOGO---");
                    System.out.println("Sua missão é identificar e corrigir os laços de repetição (for, while, do-while)");
                    System.out.println("que estão aprisionando seus colegas na SENACT TECH. Leia o código com atenção!");
                    System.out.println("Cada laço quebrado corretamente concede-lhe **Experiência (XP)** e **Pontos de Debug**.");
                    System.out.println("Use seus **Pontos de Debug** para adquirir habilidades valiosas na Loja!");
                    System.out.println("Acertar de primeira é crucial para a vitória total! Boa sorte!");
                    break;
                case 3:
                    System.out.println("\n--- 🎮 CRÉDITOS DO PROJETO 'CÓDIGO INFINITO' 🎮 ---");
                    System.out.println("Uma criação de mentes brilhantes:");
                    System.out.println("- Caio Domingues");
                    System.out.println("- Carlos Henrique");
                    System.out.println("- Gabriel Teles");
                    System.out.println("- Guilherme Menezes");
                    System.out.println("Agradecimentos especiais ao nosso mentor: Professor Takeo, o Mestre dos Loops!");
                    break;
                case 4:
                    System.out.println("Encerrando o sistema da SENACT TECH... Desconectando.");
                    break;
                case 5:
                    lojaDeHabilidades();
                    break;
                default:
                    System.out.println("❌ Opção inválida! O que você digitou não faz sentido neste terminal.");
            }
        }
    }

    static void iniciarJogo() {
        
        acertouDePrimeira = true;
        experiencia = 0;
        pontos = 0;
        nivel = 1;
        xpParaProximoNivel = 100;
        bonusXpPassivo = 0; 
        desafiosErrados.clear();
        recompilacaoTemporalAdquirida = false; 
        for (int i = 0; i < habilidadeAdquirida.length; i++) {
            habilidadeAdquirida[i] = false;
        }

        System.out.print("\n>>> DIGITE SEU NOME DE PROGRAMADOR(A) : ");
        nomeJogador = scanner.nextLine();

        System.out.println("\n🖥️ Bem-vindo(a), grande " + nomeJogador + ".");
        System.out.println("A jornada começa agora. Você pisa na sede da SENACT TECH, o ar denso com a energia de códigos quebrados...");
        System.out.println("Vozes pedindo ajuda ecoam de todos os lados. Seus dedos formigam para depurar!");
        System.out.println("Prepare-se para quebrar os códigos mais traiçoeiros e libertar as almas presas no sistema!");

        
        System.out.println("\n=========================================");
        desafio1();
        System.out.println("\n=========================================");
        desafio2();
        System.out.println("\n=========================================");
        desafio3();
        System.out.println("\n=========================================");
        desafio4();
        System.out.println("\n=========================================");
        desafio5();
        System.out.println("\n=========================================");
        desafio6();
        System.out.println("\n=========================================");
        desafio7();
        System.out.println("\n=========================================");
        desafio8();
        System.out.println("\n=========================================");
        desafio9();
        System.out.println("\n=========================================");
        desafio10();

        mostrarFinal();
    }

    static void exibirHUD() {
        System.out.println("\n--- STATUS DO(A) PROGRAMADOR(A) " + nomeJogador.toUpperCase() + " ---");
        System.out.println("Nível: " + nivel + " | XP: " + experiencia + "/" + xpParaProximoNivel + " | Pontos de Debug: " + pontos);
        System.out.println("------------------------------------------");
    }

    static void verificarNivel() {
        if (experiencia >= xpParaProximoNivel) {
            nivel++;
            experiencia -= xpParaProximoNivel;
            xpParaProximoNivel = (int) (xpParaProximoNivel * 1.5);
            System.out.println("\n🎉🎉 PARABÉNS, " + nomeJogador.toUpperCase() + "! VOCÊ ALCANÇOU O NÍVEL " + nivel + "! 🎉🎉");
            System.out.println("Seu conhecimento de depuração cresceu exponencialmente!");
            System.out.println("Próximo nível em " + xpParaProximoNivel + " XP.");
        }
    }

    static void recompensarJogador(int xpGanho, int pontosGanhos) {
        xpGanho += bonusXpPassivo;
        experiencia += xpGanho;
        pontos += pontosGanhos;
        System.out.println("✅ Recompensa: Você ganhou " + xpGanho + " XP e " + pontosGanhos + " Pontos de Debug!");
        verificarNivel();
    }

    
    static int lerOpcaoComResultadoCorreto(int respostaCorreta, int numeroDesafio) {
        int tentativa;
        do {
            tentativa = lerOpcao();
            if (tentativa == respostaCorreta) {
                System.out.println("✅ **SUCESSO!** Você encontrou a solução para o loop!");
                return tentativa;
            } else {
                System.out.println("❌ **FALHA!** Essa não é a solução. O loop persiste.");
                acertouDePrimeira = false; 
                
                if (!desafiosErrados.contains(numeroDesafio)) {
                    desafiosErrados.add(numeroDesafio);
                }
                System.out.println("Pense bem. A vida do seu colega digital depende disso!");
                System.out.print("Tente novamente: ");
            }
        } while (tentativa != respostaCorreta); 
        return tentativa;
    }

    static int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("🚫 Entrada inválida! Por favor, digite apenas o número da opção.");
            return -1; 
        }
    }

    
    static void lojaDeHabilidades() {
        int escolhaHabilidade = 0;
        while (escolhaHabilidade != 9) {
            System.out.println("\n--- LOJA DE HABILIDADES DE DEPURADOR ---");
            System.out.println("Pontos de Debug Atuais: " + pontos);
            System.out.println("---------------------------------------");
            System.out.println("Escolha uma habilidade para desbloquear:");

           
            if (!habilidadeAdquirida[0]) {
                System.out.println("1 - [5 Pontos] Dica Básico: Receba uma dica sobre o TIPO de loop do próximo desafio.");
            } else {
                System.out.println("1 - [ADQUIRIDA] Dica Básico");
            }

            
            if (!habilidadeAdquirida[1]) {
                System.out.println("2 - [10 Pontos] Visão de Variáveis: Obtenha uma dica sobre as VARIÁVEIS mais importantes do desafio.");
            } else {
                System.out.println("2 - [ADQUIRIDA] Visão de Variáveis");
            }

            
            if (!habilidadeAdquirida[2]) {
                System.out.println("3 - [20 Pontos] Otimização de Código: Ganhe um bônus de +5 XP por desafio resolvido (permanente).");
            } else {
                System.out.println("3 - [ADQUIRIDA] Otimização de Código (Ativa)");
            }

            
            if (habilidadeAdquirida[0] && !habilidadeAdquirida[3]) {
                 System.out.println("4 - [15 Pontos] Dica Avançada: Receba uma dica mais DIRETA sobre a solução de um desafio.");
            } else if (!habilidadeAdquirida[0]) {
                 System.out.println("4 - [REQUER DICA BÁSICO] Dica Avançada");
            } else {
                 System.out.println("4 - [ADQUIRIDA] Dica Avançada");
            }

            
            if (!recompilacaoTemporalAdquirida) {
                System.out.println("5 - [50 Pontos] RECOMPILAÇÃO TEMPORAL: Permite revisitar e corrigir os desafios que você errou no final do jogo.");
            } else {
                System.out.println("5 - [ADQUIRIDA] RECOMPILAÇÃO TEMPORAL");
            }

            System.out.println("---------------------------------------");
            System.out.println("9 - Voltar ao Menu Principal");
            System.out.print("Sua escolha: ");

            try {
                escolhaHabilidade = Integer.parseInt(scanner.nextLine());
                switch (escolhaHabilidade) {
                    case 1:
                        comprarHabilidade(0, 5, "Dica Básico");
                        break;
                    case 2:
                        comprarHabilidade(1, 10, "Visão de Variáveis");
                        break;
                    case 3:
                        comprarHabilidade(2, 20, "Otimização de Código");
                        break;
                    case 4:
                        if (habilidadeAdquirida[0]) { 
                            comprarHabilidade(3, 15, "Dica Avançada");
                        } else {
                            System.out.println("🚫 Você precisa da habilidade 'Dica Básico' para desbloquear 'Dica Avançada'!");
                        }
                        break;
                    case 5: 
                        comprarHabilidadeRecompilacaoTemporal(50);
                        break;
                    case 9:
                        System.out.println("Voltando ao menu principal...");
                        break;
                    default:
                        System.out.println("🚫 Opção inválida de habilidade!");
                }
            } catch (NumberFormatException e) {
                System.out.println("🚫 Entrada inválida! Digite um número.");
            }
        }
    }

    static void comprarHabilidade(int indiceHabilidade, int custo, String nomeHabilidade) {
        if (habilidadeAdquirida[indiceHabilidade]) {
            System.out.println("Você já possui a habilidade '" + nomeHabilidade + "'.");
            return;
        }

        if (pontos >= custo) {
            pontos -= custo;
            habilidadeAdquirida[indiceHabilidade] = true;
            System.out.println("🎉 Habilidade '" + nomeHabilidade + "' adquirida com sucesso!");
            System.out.println("Pontos de Debug restantes: " + pontos);

            
            if (nomeHabilidade.equals("Otimização de Código")) {
                bonusXpPassivo = 5; 
                System.out.println("Sua eficiência de depuração aumentou permanentemente! (+5 XP por desafio)");
            }

        } else {
            System.out.println("🚫 Pontos de Debug insuficientes para adquirir '" + nomeHabilidade + "'. Você precisa de mais " + (custo - pontos) + " pontos.");
        }
    }

    
    static void comprarHabilidadeRecompilacaoTemporal(int custo) {
        if (recompilacaoTemporalAdquirida) {
            System.out.println("🚫 Você já possui a habilidade 'Recompilação Temporal'!");
            return;
        }

        if (pontos >= custo) {
            pontos -= custo;
            recompilacaoTemporalAdquirida = true;
            System.out.println("🎉 Habilidade 'Recompilação Temporal' adquirida com sucesso!");
            System.out.println("Você agora pode voltar no tempo para corrigir seus bugs mais persistentes!");
            System.out.println("Pontos de Debug restantes: " + pontos);
        } else {
            System.out.println("🚫 Pontos de Debug insuficientes para adquirir 'Recompilação Temporal'. Você precisa de mais " + (custo - pontos) + " pontos.");
        }
    }

    
    static void desafio1() {
        System.out.println("--- DESAFIO 1: A PRISÃO DO E-MAIL INFINITO ---");
        System.out.println("Você entra na sala de comunicações, onde o ar é pesado com a troca incessante de dados.");
        System.out.println("Um funcionário, Sr. Data, está com a testa suada, digitando freneticamente no teclado.");
        System.out.println("Sua tela exibe em letras garrafais: `Enviando e-mail... Enviando e-mail...` sem parar.");
        System.out.println("Sr. Data: 'Por todos os códigos! Estou preso neste `while (true)`! Não consigo parar de enviar spam para o mundo todo!'");
        System.out.println("Ele aponta para o trecho de código em sua tela:");
        System.out.println("```java");
        System.out.println("while (true) { System.out.println(\"Enviando e-mail...\"); }");
        System.out.println("```");
        
        exibirHUD(); 
        
        System.out.println("\nComo você quebra esse laço infinito para libertar o Sr. Data?");
        System.out.println("1 - Implementando uma condição de parada e um 'break' para sair do loop.");
        System.out.println("2 - Deixando o loop rodar para sempre, pois ele eventualmente para sozinho.");
        System.out.println("3 - Adicionando um 'if' sem um 'break' para tentar burlar a condição.");
        System.out.print("Sua escolha, " + nomeJogador + ": ");
        
        lerOpcaoComResultadoCorreto(1, 1); 
        recompensarJogador(20, 2);
        System.out.println("Sr. Data suspira aliviado, a tela apaga a mensagem de erro. 'Você é um gênio! Obrigado por me salvar da sobrecarga de e-mails!'");
    }

    static void desafio2() {
        System.out.println("--- DESAFIO 2: O ROBÔ CONTADOR ZUMBI ---");
        System.out.println("No laboratório de automação, um pequeno robô 'Contador' está correndo em círculos sem parar, seus olhos vermelhos piscando descontroladamente.");
        System.out.println("A engenheira de robótica, Sra. Loopana, grita: 'Ele deveria contar até 5 e parar! Mas seu `for` está bagunçado! Ajude-me!'");
        System.out.println("O código projetado para o robô é:");
        System.out.println("```java");
        System.out.println("for (int i = ___; i ___ ___; i___)");
        System.out.println("```");

        exibirHUD();
        

        System.out.println("\nQual a combinação correta para que o robô conte de 0 a 4 e pare?");
        System.out.println("1 - `int i = 0; i < 5; i++`");
        System.out.println("2 - `int i = 1; i <= 5; i--`");
        System.out.println("3 - `int i = 0; i > 5; i++`");
        System.out.print("Sua escolha, " + nomeJogador + ": ");

        lerOpcaoComResultadoCorreto(1, 2);
        recompensarJogador(25, 3);
        System.out.println("O robô Contador para abruptamente, fazendo um som de 'bip' feliz. Sra. Loopana sorri: 'Você é um mestre da sintaxe!'");
    }

    static void desafio3() {
        System.out.println("--- DESAFIO 3: A PORTA COM CÓDIGO SEGREDO INATINGÍVEL ---");
        System.out.println("Você chega à sala de arquivos ultrassecretos. Um guarda virtual, Sr.Bryan está preso no cicloo while` insano.");
        System.out.println("A porta à sua frente pergunta a senha repetidamente, mesmo após a entrada correta. Sr. Byte geme: 'A condição está invertida! Eu não consigo sair!'");
        System.out.println("O trecho de código da porta é:");
        System.out.println("```java");
        System.out.println("int senha = 1234; do { System.out.println(\"Digite a senha\"); } while (input != senha);");
        System.out.println("```");

        exibirHUD();
        
        System.out.println("\nQual característica do `do...while` faz com que o Sr. Byte esteja preso, apesar da senha?");
        System.out.println("1 - A condição `while (input == senha)` impediria a execução inicial.");
        System.out.println("2 - O `do...while` garante que o bloco seja executado pelo menos uma vez, e a condição `input != senha` o mantém preso se a senha ainda não for a correta.");
        System.out.println("3 - A variável `input == senha` no começo impede qualquer execução.");
        System.out.print("Sua escolha, " + nomeJogador + ": ");

        lerOpcaoComResultadoCorreto(2, 3); 
        recompensarJogador(30, 4);
        System.out.println("A porta se abre com um 'clique' suave. Sr. Byte se desmaterializa e reaparece ao seu lado: 'Obrigado por entender os mistérios do `do-while`!'");
    }

    static void desafio4() {
        System.out.println("--- DESAFIO 4: A MATRIZ FANTASMA ---");
        System.out.println("No centro de controle, uma matriz holográfica de 3x3 pisca com erros. A Chefe de Projetos, Dra. Antonia esta frustada.");
        System.out.println("Dra.Antonia precisamos varrer está matriz e identificar os bugs mais não consio encontrar a estrutura  do loop correta!'");

        exibirHUD();
        
        System.out.println("\nQual é a forma eficiente de varrer todos os elementos de uma matriz 3x3?");
        System.out.println("1 - Utilizando um único loop `for`.");
        System.out.println("2 - Utilizando dois loops `for` aninhados (um para linhas, outro para colunas).");
        System.out.println("3 - Utilizando um `while` sem contadores específicos.");
        System.out.print("Sua escolha, " + nomeJogador + ": ");

        lerOpcaoComResultadoCorreto(2, 4); // Passa '4' como número do desafio
        recompensarJogador(35, 5);
        System.out.println("A matriz holográfica estabiliza, os erros somem. Dra. Array aperta sua mão: 'Sua lógica de iteração é impecável!'");
    }

    static void desafio5() {
        System.out.println("--- DESAFIO 5: O RELÓGIO PARADO NO TEMPO ---");
        System.out.println("Na torre do relógio da SENACT TECH, o tempo parou. Um antigo engenheiro, Sr. Time, está congelado no lugar.");
        System.out.println("Seu terminal mostra um código de loop, mas o relógio não avança. 'Eu tentei simular o tempo, mas ele não se move!', murmura ele.");
        System.out.println("O código em questão é:");
        System.out.println("```java");
        System.out.println("for (int h = 0; h < 24; h++) { for (int m = 0; m < 60; m++) { /*...*/ } }");
        System.out.println("```");

        exibirHUD();
     

        System.out.println("\nO que esse código representa corretamente em termos de simulação de tempo?");
        System.out.println("1 - Um loop que simula a passagem do tempo em horas e minutos ao longo de um dia.");
        System.out.println("2 - Um loop que simula apenas a contagem de segundos.");
        System.out.println("3 - Um loop infinito que nunca termina, prendendo o tempo.");
        System.out.print("Sua escolha, " + nomeJogador + ": ");

        lerOpcaoComResultadoCorreto(1, 5); // Passa '5' como número do desafio
        recompensarJogador(40, 6);
        System.out.println("O ponteiro do relógio volta a girar. Sr. Time sorri aliviado: 'Você me libertou do limbo temporal!'");
    }

    static void desafio6() {
        System.out.println("--- DESAFIO 6: O CRISTAL DA PRIMALIDADE ---");
        System.out.println("No cofre de dados da SENACT TECH, um cristal de segurança brilha, mas sua luz é fraca. O guardião, Mestre Primal, está perplexo.");
        System.out.println("Mestre Primal: 'Este cristal verifica números primos para proteger os dados, mas algo está errado. Ele não funciona como deveria!'");
        System.out.println("O trecho de código para verificação é:");
        System.out.println("```java");
        System.out.println("for (int i = 2; i < num; i++) { if (num % i == 0) return false; }");
        System.out.println("```");

        exibirHUD();
       
        System.out.println("\nQual é o problema (ou a falta dele) com esse código para verificar a primalidade de um número `num`?");
        System.out.println("1 - Ele nunca verifica se `num` é divisível por 1 ou por ele mesmo.");
        System.out.println("2 - O loop deveria ir até `num + 1` para ser completo.");
        System.out.println("3 - O código está **correto** para verificar a primalidade, pois ele procura divisores entre 2 e `num - 1`.");
        System.out.print("Sua escolha, " + nomeJogador + ": ");

        lerOpcaoComResultadoCorreto(3, 6);
        recompensarJogador(45, 7);
        System.out.println("O cristal de segurança brilha intensamente! Mestre Primal faz uma reverência: 'Sua perspicácia com a lógica matemática é louvável!'");
    }

    static void desafio7() {
        System.out.println("--- DESAFIO 7: A MÁQUINA DE CAFÉ SEM FIM ---");
        System.out.println("Você entra na copa. A máquina de café está cuspindo jatos de café sem parar, inundando o chão. A Barista, Sra. Caffeine, está deprimida.");
        System.out.println("A máquina enlouqueceu! Ela não para de fazer café!'");
        System.out.println("O código da máquina de café é:");
        System.out.println("```java");
        System.out.println("for (;;) { System.out.println(\"Servindo café...\"); }");
        System.out.println("```");

        exibirHUD();
        

        System.out.println("\nQual é a falha fundamental com este loop da máquina de café?");
        System.out.println("1 - É um loop infinito porque não há uma condição de parada ou incremento definido.");
        System.out.println("2 - Está correto, ele irá servir exatamente 10 cafés e depois parar.");
        System.out.println("3 - Está incompleto por não especificar o tipo de loop (for, while, do-while).");
        System.out.print("Sua escolha, " + nomeJogador + ": ");

        lerOpcaoComResultadoCorreto(1, 7);
        recompensarJogador(50, 8);
        System.out.println("O jorro de café para, e a máquina volta a seu estado normal. Sra. Caffeine sorri: 'Você salvou a cozinha da  SENACT TECH!'");
    }

    static void desafio8() {
        System.out.println("--- DESAFIO 8: O GERADOR DE ÍMPARES REBELDE ---");
        System.out.println("No departamento de Estatísticas, o Analista, Sr. Gil, esta chateado porque o seu computador está fazndo imprimindo os números pares em vez dos ímpares.");  
        System.out.println("Sr.Gil'Eu queria apenas os números ímpares de 0 a 4! O `continue` não está fazendo o que eu espero!'");
        System.out.println("O código do gerador é:");
        System.out.println("```java");
        System.out.println("for (int i = 0; i < 5; i++) { if (i % 2 == 0) continue; System.out.println(i); }");
        System.out.println("```");

        exibirHUD();
        

        System.out.println("\nQual será a saída exata deste código quando executado?");
        System.out.println("1 - Irá imprimir os números: `1` e `3`.");
        System.out.println("2 - Irá imprimir os números: `0`, `1`, `2`, `3`, `4`.");
        System.out.println("3 - Irá imprimir os números: `2` e `4`.");
        System.out.print("Sua escolha, " + nomeJogador + ": ");

        lerOpcaoComResultadoCorreto(1, 8);
        recompensarJogador(55, 9);
        System.out.println("O console limpa, mostrando apenas os ímpares. Sr. DataFlow agradece: 'Você dominou o fluxo de controle!'");
    }

    static void desafio9() {
        System.out.println("--- DESAFIO 9: O TEMPORIZADOR REGRESSIVO EMPACADO ---");
        System.out.println("No centro de lançamento de foguetes, o Contador, Sr. Caiostá preso em um pesadelo de tempo.");
        System.out.println("O temporizador deveria fazer uma contagem regressiva, mas algo o impede. 'Socorro! O lançamento não vai acontecer se eu não reverter este loop!', ele grita.");
        System.out.println("O código do temporizador é:");
        System.out.println("```java");
        System.out.println("for (int i = 10; i >= 1; i--) { System.out.println(i); }");
        System.out.println("```");

        exibirHUD();
        

        System.out.println("\nQual é a saída esperada deste código, e como ele funciona?");
        System.out.println("1 - Irá contar de 1 até 10 (crescente).");
        System.out.println("2 - Irá contar de 10 até 1 (decrescente).");
        System.out.println("3 - Será um loop infinito.");
        System.out.print("Sua escolha, " + nomeJogador + ": ");

        lerOpcaoComResultadoCorreto(2, 9);
        recompensarJogador(60, 10);
        System.out.println("O temporizador começa a contagem regressiva perfeita! Sr. Caio salta de alegria. Você salvou a minha Sexta- feira");
    }

    static void desafio10() {
        System.out.println("--- DESAFIO 10: O ACUMULADOR DE PONTOS MALDITO ---");
        System.out.println("Finalmente, você chega ao topo da torre, onde o CEO da SENACT TECH, Sr.Bruno ,está preso em um loop de soma.");
        System.out.println("Ele está preso, tentando somar pontos, mas o resultado nunca é o que deveria ser. 'Meu acumulador! Ele não soma corretamente!', ele murmura.");
        System.out.println("O código em sua tela é:");
        System.out.println("```java");
        System.out.println("int soma = 0; for (int i = 1; i <= 5; i++) { soma += i; } System.out.println(soma);");
        System.out.println("```");

        exibirHUD();
        

        System.out.println("\nQual o valor final que será impresso por este código, somando os números de 1 a 5?");
        System.out.println("1 - 15");
        System.out.println("2 - 10");
        System.out.println("3 - 5");
        System.out.print("Sua escolha, " + nomeJogador + ": ");

        lerOpcaoComResultadoCorreto(1, 10);
        recompensarJogador(70, 15);
        System.out.println("O servidor principal zumbiu, e o Sr Bruno sorriu aliviado: 'Você é um verdadeiro herói dos loops! A SENACT TECH está salva!'");
        System.out.println("'Você me salvou, jovem programador(a)! O conhecimento de loops que você demonstrou é incomparável!'");
    }

    static void mostrarFinal() {
        System.out.println("\n================= FIM DA JORNADA ==================");

        
        if (!acertouDePrimeira && recompilacaoTemporalAdquirida) {
            System.out.println("\n===================================================");
            System.out.println("✨ SUA HABILIDADE 'RECOMPILAÇÃO TEMPORAL' FOI ATIVADA! ✨");
            System.out.println("Você tem a chance de voltar no tempo e corrigir os loops que te aprisionaram!");

            if (desafiosErrados.isEmpty()) {
                System.out.println("Parece que, apesar de não ter completado de primeira, não há bugs para revisar.");
                System.out.println("Talvez você não conseguiu atingir o 'Final Perfeito' na primeira tentativa, mas não há loops pendentes.");
            } else {
                Collections.sort(desafiosErrados);
                System.out.println("Você errou os seguintes desafios e agora pode revisá-los: " + desafiosErrados + ".");
                System.out.print("Deseja tentar corrigir esses desafios agora para buscar o 'Final Perfeito'? (s/n): ");
                String escolha = scanner.nextLine().toLowerCase();

                if (escolha.equals("s")) {
                    System.out.println("\nIniciando a Recompilação Temporal...");
                    
                    boolean acertouTudoNaRecompilacao = true;
                    List<Integer> desafiosParaRefazer = new ArrayList<>(desafiosErrados); 
                    desafiosErrados.clear(); 

                    for (Integer desafioNumero : desafiosParaRefazer) {
                        System.out.println("\n--- REVISITANDO DESAFIO " + desafioNumero + " (Rodada de Correção) ---");
                        
                        switch (desafioNumero) {
                            case 1: desafio1(); break;
                            case 2: desafio2(); break;
                            case 3: desafio3(); break;
                            case 4: desafio4(); break;
                            case 5: desafio5(); break;
                            case 6: desafio6(); break;
                            case 7: desafio7(); break;
                            case 8: desafio8(); break;
                            case 9: desafio9(); break;
                            case 10: desafio10(); break;
                        }
                        
                        if (desafiosErrados.contains(desafioNumero)) {
                            acertouTudoNaRecompilacao = false;
                            System.out.println("Ainda há bugs persistentes neste desafio mesmo após a tentativa de correção!");
                        }
                    }

                    if (acertouTudoNaRecompilacao && desafiosErrados.isEmpty()) { 
                        System.out.println("\n🎉🎉 VOCÊ RECOMPILOU O TEMPO COM SUCESSO! 🎉🎉");
                        System.out.println("Todos os loops foram corrigidos! A maldição foi completamente desfeita!");
                        System.out.println("A INFINITY TECH e todos os seus colegas estão agora totalmente livres, graças à sua persistência e à Recompilação Temporal!");
                        recompensarJogador(100, 25);
                        acertouDePrimeira = true; 
                    } else {
                        System.out.println("\n💀 Você tentou corrigir, mas alguns loops ainda teimaram em persistir...");
                        System.out.println("A maldição ainda não foi completamente quebrada. Continue tentando em um novo jogo!");
                        acertouDePrimeira = false; 
                    }
                } else {
                    System.out.println("Você decide não usar a Recompilação Temporal. A maldição persiste como está...");
                }
            }
            System.out.println("===================================================");
        } else if (!acertouDePrimeira && !recompilacaoTemporalAdquirida) {
            System.out.println("\nConsidere adquirir a habilidade 'Recompilação Temporal' em uma próxima jornada para uma segunda chance!");
            System.out.println("Ela poderia ter salvado a situação e permitido a correção dos bugs!");
        }

        
        if (acertouDePrimeira) {
            System.out.println("\n🎉 **VITÓRIA COMPLETA!** Parabéns, " + nomeJogador + "!");
            System.out.println("Seu intelecto brilhante e sua habilidade com loops salvaram a INFINITY TECH!");
            System.out.println("Você é agora uma lenda entre os depuradores! Seu nome será ecoado pelos loops!");
        } else {
            System.out.println("\n💀 **MALDIÇÃO PERSISTE!** Infelizmente, " + nomeJogador + ", você cometeu alguns erros cruciais nos desafios.");
            System.out.println("As maldições dos loops se fortaleceram e, agora, você também está preso(a) no loop eterno da INFINITY TECH...");
            System.out.println("Seu teclado continua digitando sozinho. Seus olhos se vidram na tela. O jogo nunca termina...");
            System.out.println("Tente novamente para quebrar o ciclo e salvar a si mesmo(a) e os outros!");
        }
        
        System.out.println("\n--- SEUS RESULTADOS FINAIS ---");
        System.out.println("Nível Final: " + nivel);
        System.out.println("Experiência Total: " + experiencia + " XP");
        System.out.println("Pontos de Debug Totais: " + pontos + " Pontos");
        System.out.println("==================================================");
    }
}