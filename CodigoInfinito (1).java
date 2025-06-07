import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections; // Importado para ordenar a lista de desafios errados

public class CodigoInfinitoRpg {

    static Scanner scanner = new Scanner(System.in);
    static String nomeJogador = "";
    static boolean acertouDePrimeira = true;
    static int experiencia = 0;
    static int pontos = 0;
    static int nivel = 1;
    static int xpParaProximoNivel = 100;
    static boolean[] habilidadeAdquirida = new boolean[5]; // Espaço para 5 habilidades (0 a 4)
    static int bonusXpPassivo = 0; // Para a habilidade "Otimização de Código"

    // NOVOS ATRIBUTOS PARA A HABILIDADE "RECOMPILAÇÃO TEMPORAL"
    static List<Integer> desafiosErrados = new ArrayList<>(); // Lista para armazenar os números dos desafios errados
    static boolean recompilacaoTemporalAdquirida = false; // Flag para controlar se a habilidade foi comprada

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
        System.out.println("Você é um(a) jovem programador(a) recém-contratado(a) pela enigmática empresa INFINITY TECH.");
        System.out.println("No seu primeiro dia, uma estranha névoa digital paira sobre os corredores.");
        System.out.println("O zumbido dos servidores se mistura com sussurros de código e gritos de desespero.");
        System.out.println("Você percebe: seus novos colegas estão presos em **loops eternos**, seus olhos vidrados em telas...");
        System.out.println("Uma maldição de código tomou conta da empresa!");
        System.out.println("Cabe a você, o(a) novo(a) herói(ina) da programação, resolver os enigmas e");
        System.out.println("quebrar os loops para libertá-los e restaurar a ordem na SENACH!");
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
            System.out.println("5 - Loja de Habilidades"); // Nova opção para a loja
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
        // Resetar todas as variáveis para um novo jogo
        acertouDePrimeira = true;
        experiencia = 0;
        pontos = 0;
        nivel = 1;
        xpParaProximoNivel = 100;
        bonusXpPassivo = 0; // Resetar bônus de XP
        desafiosErrados.clear(); // Limpa a lista de erros de jogos anteriores
        recompilacaoTemporalAdquirida = false; // Reseta a habilidade "Recompilação Temporal"
        for (int i = 0; i < habilidadeAdquirida.length; i++) { // Reseta todas as habilidades
            habilidadeAdquirida[i] = false;
        }

        System.out.print("\n>>> DIGITE SEU NOME DE PROGRAMADOR(A) : ");
        nomeJogador = scanner.nextLine();

        System.out.println("\n🖥️ Bem-vindo(a), grande " + nomeJogador + ".");
        System.out.println("A jornada começa agora. Você pisa na sede da SENACT TECH, o ar denso com a energia de códigos quebrados...");
        System.out.println("Vozes pedindo ajuda ecoam de todos os lados. Seus dedos formigam para depurar!");
        System.out.println("Prepare-se para quebrar os códigos mais traiçoeiros e libertar as almas presas no sistema!");

        // Chamada dos desafios
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
            experiencia -= xpParaProximoNivel; // Reseta a XP para o próximo nível
            xpParaProximoNivel = (int) (xpParaProximoNivel * 1.5); // Aumenta a XP necessária para o próximo nível
            System.out.println("\n🎉🎉 PARABÉNS, " + nomeJogador.toUpperCase() + "! VOCÊ ALCANÇOU O NÍVEL " + nivel + "! 🎉🎉");
            System.out.println("Seu conhecimento de depuração cresceu exponencialmente!");
            System.out.println("Próximo nível em " + xpParaProximoNivel + " XP.");
        }
    }

    static void recompensarJogador(int xpGanho, int pontosGanhos) {
        xpGanho += bonusXpPassivo; // Aplica o bônus passivo de XP
        experiencia += xpGanho;
        pontos += pontosGanhos;
        System.out.println("✅ Recompensa: Você ganhou " + xpGanho + " XP e " + pontosGanhos + " Pontos de Debug!");
        verificarNivel(); // Verifica se o jogador subiu de nível
    }

    // MÉTODO ATUALIZADO para registrar o número do desafio
    static int lerOpcaoComResultadoCorreto(int respostaCorreta, int numeroDesafio) {
        int tentativa;
        do {
            tentativa = lerOpcao();
            if (tentativa == respostaCorreta) {
                System.out.println("✅ **SUCESSO!** Você encontrou a solução para o loop!");
                return tentativa; // Sai do loop do-while assim que acerta
            } else {
                System.out.println("❌ **FALHA!** Essa não é a solução. O loop persiste.");
                acertouDePrimeira = false; // Marca que o jogador errou
                // Adiciona o desafio à lista de erros APENAS se ainda não estiver lá
                if (!desafiosErrados.contains(numeroDesafio)) {
                    desafiosErrados.add(numeroDesafio);
                }
                System.out.println("Pense bem. A vida do seu colega digital depende disso!");
                System.out.print("Tente novamente: ");
            }
        } while (tentativa != respostaCorreta); // Continua pedindo até acertar
        return tentativa;
    }

    static int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("🚫 Entrada inválida! Por favor, digite apenas o número da opção.");
            return -1; // Retorna um valor inválido para forçar nova tentativa
        }
    }

    // --- LOJA DE HABILIDADES ---
    static void lojaDeHabilidades() {
        int escolhaHabilidade = 0;
        while (escolhaHabilidade != 9) {
            System.out.println("\n--- LOJA DE HABILIDADES DE DEPURADOR ---");
            System.out.println("Pontos de Debug Atuais: " + pontos);
            System.out.println("---------------------------------------");
            System.out.println("Escolha uma habilidade para desbloquear:");

            // Habilidade 1: Dica Básico (Índice 0)
            if (!habilidadeAdquirida[0]) {
                System.out.println("1 - [5 Pontos] Dica Básico: Receba uma dica sobre o TIPO de loop do próximo desafio.");
            } else {
                System.out.println("1 - [ADQUIRIDA] Dica Básico");
            }

            // Habilidade 2: Visão de Variáveis (Índice 1)
            if (!habilidadeAdquirida[1]) {
                System.out.println("2 - [10 Pontos] Visão de Variáveis: Obtenha uma dica sobre as VARIÁVEIS mais importantes do desafio.");
            } else {
                System.out.println("2 - [ADQUIRIDA] Visão de Variáveis");
            }

            // Habilidade 3: Otimização de Código (Índice 2)
            if (!habilidadeAdquirida[2]) {
                System.out.println("3 - [20 Pontos] Otimização de Código: Ganhe um bônus de +5 XP por desafio resolvido (permanente).");
            } else {
                System.out.println("3 - [ADQUIRIDA] Otimização de Código (Ativa)");
            }

            // Habilidade 4: Dica Avançada (Índice 3) - Requer Dica Básico
            if (habilidadeAdquirida[0] && !habilidadeAdquirida[3]) {
                 System.out.println("4 - [15 Pontos] Dica Avançada: Receba uma dica mais DIRETA sobre a solução de um desafio.");
            } else if (!habilidadeAdquirida[0]) {
                 System.out.println("4 - [REQUER DICA BÁSICO] Dica Avançada");
            } else {
                 System.out.println("4 - [ADQUIRIDA] Dica Avançada");
            }

            // Habilidade 5: Recompilação Temporal (Índice 4) - NOVA HABILIDADE
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
                        if (habilidadeAdquirida[0]) { // Pré-requisito
                            comprarHabilidade(3, 15, "Dica Avançada");
                        } else {
                            System.out.println("🚫 Você precisa da habilidade 'Dica Básico' para desbloquear 'Dica Avançada'!");
                        }
                        break;
                    case 5: // Lógica para a nova habilidade
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

            // Efeito imediato da habilidade
            if (nomeHabilidade.equals("Otimização de Código")) {
                bonusXpPassivo = 5; // Define o bônus de XP
                System.out.println("Sua eficiência de depuração aumentou permanentemente! (+5 XP por desafio)");
            }

        } else {
            System.out.println("🚫 Pontos de Debug insuficientes para adquirir '" + nomeHabilidade + "'. Você precisa de mais " + (custo - pontos) + " pontos.");
        }
    }

    // NOVO MÉTODO: Para comprar a habilidade "Recompilação Temporal"
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

    // --- DESAFIOS COM DIÁLOGOS E CONTEXTO ---

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
        
        exibirHUD(); // Exibe o status do jogador
        // Opção para usar dica
        // usarDica(1); // Se quiser implementar a lógica de usar dica aqui

        System.out.println("\nComo você quebra esse laço infinito para libertar o Sr. Data?");
        System.out.println("1 - Implementando uma condição de parada e um 'break' para sair do loop.");
        System.out.println("2 - Deixando o loop rodar para sempre, pois ele eventualmente para sozinho.");
        System.out.println("3 - Adicionando um 'if' sem um 'break' para tentar burlar a condição.");
        System.out.print("Sua escolha, " + nomeJogador + ": ");
        
        lerOpcaoComResultadoCorreto(1, 1); // Passa '1' como número do desafio
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
        // usarDica(2);

        System.out.println("\nQual a combinação correta para que o robô conte de 0 a 4 e pare?");
        System.out.println("1 - `int i = 0; i < 5; i++`");
        System.out.println("2 - `int i = 1; i <= 5; i--`");
        System.out.println("3 - `int i = 0; i > 5; i++`");
        System.out.print("Sua escolha, " + nomeJogador + ": ");

        lerOpcaoComResultadoCorreto(1, 2); // Passa '2' como número do desafio
        recompensarJogador(25, 3);
        System.out.println("O robô Contador para abruptamente, fazendo um som de 'bip' feliz. Sra. Loopana sorri: 'Você é um mestre da sintaxe!'");
    }

    static void desafio3() {
        System.out.println("--- DESAFIO 3: A PORTA COM CÓDIGO SEGREDO INATINGÍVEL ---");
        System.out.println("Você chega à sala de arquivos ultrassecretos. Um guarda virtual, Sr.Bryan está preso no cicloo while` insano.");
        System.out.println("A porta à sua frente pergunta a senha repetidamente, mesmo após a entrada correta. Sr. Byte geme: 'A condição está invertida! Eu não consigo sair!'");
        System.out.println("O trecho de código da porta é:");
        System.out.println("```java");
        System.out.println("int senha = 1234; do { System.out.println(\"Digite a senha\"); } whi