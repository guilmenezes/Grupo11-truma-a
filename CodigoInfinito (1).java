import java.util.Scanner;

public class CodigoInfinito {

    // Scanner usado para capturar entradas do jogador
    static Scanner scanner = new Scanner(System.in);

    // Armazena o nome do jogador para personalizar a narrativa
    static String nomeJogador = "";

    public static void main(String[] args) {
        exibirBoasVindas();  // Exibe a introdução do jogo
        menu();              // Exibe o menu principal
        scanner.close();     // Fecha o scanner no final do programa
    }

    // Método que mostra a introdução do jogo
    static void exibirBoasVindas() {
        System.out.println("=========================================");
        System.out.println("Bem-vindo à Maldição do Código Infinito");
        System.out.println("=========================================");
        System.out.println("\n📖 Introdução:");
        System.out.println("Você é um jovem programador contratado pela enigmática empresa INFINITY TECH.");
        System.out.println("Ao chegar para o primeiro dia, percebe algo estranho: os funcionários estão presos em loops eternos.");
        System.out.println("Cabe a você resolver enigmas e quebrar os códigos para libertá-los da maldição...\n");
    }

    // Método do menu principal, com 4 opções: jogar, instruções, créditos e sair
    static void menu() {
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n MENU PRINCIPAL");
            System.out.println("1 - Iniciar Jornada");
            System.out.println("2 - Instruções");
            System.out.println("3 - Créditos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número.");
                continue;
            }

            // Switch case que lida com a opção escolhida pelo jogador
            switch (opcao) {
                case 1:
                    iniciarJogo();
                    break;
                case 2:
                    System.out.println("\n INSTRUÇÕES:");
                    System.out.println("Você enfrentará desafios com laços de repetição (for, while, do-while).");
                    System.out.println("Escolha as opções corretas para quebrar os loops e libertar os funcionários.");
                    break;
                case 3:
                    System.out.println("\n🎮 CRÉDITOS:");
                    System.out.println("Jogo criado por Caio Domingues, Carlos Henrique, Gabriel Teles e Guilherme Menezes.");
                    System.out.println("Menção honrosa: Professor Takeo.");
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    // Método para iniciar o jogo e chamar os desafios em sequência
    static void iniciarJogo() {
        System.out.print("\nDigite o nome do seu personagem: ");
        nomeJogador = scanner.nextLine();

        // Introdução narrativa do início da jornada
        System.out.println("\n🖥️ Bem-vindo, " + nomeJogador + ".");
        System.out.println("Você entra na empresa e ouve vozes pedindo ajuda de todos os lados...");
        System.out.println("Prepare-se para quebrar os códigos e libertar as almas presas no sistema!");

        // Chamada dos desafios em sequência
        primeiroDesafio();
        segundoDesafio();
        terceiroDesafio();
        quartoDesafio();
        quintoDesafio();
        sextoDesafio();
    }

    // Método auxiliar para ler opções numéricas e evitar erro de entrada inválida
    static int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    // DESAFIO 1: While infinito com e-mails
    static void primeiroDesafio() {
        System.out.println("\n DESAFIO 1: O Loop do E-mail Infinito");
        System.out.println("\"" + nomeJogador + ", estamos presos em um loop! O café nunca acaba e os e-mails se repetem!\"");
        System.out.println("while (true) {\n    System.out.println(\"Enviando e-mail...\");\n}");

        boolean acertou = false;
        do {
            System.out.println("\n Como você quebra esse laço infinito?");
            System.out.println("1 - Usando break quando a condição for atendida");
            System.out.println("2 - Deixando rodar para sempre");
            System.out.println("3 - Colocando if sem break");
            System.out.print("Escolha a opção correta: ");

            if (lerOpcao() == 1) {
                System.out.println("\n Correto! Você quebrou o primeiro loop.");
                acertou = true;
            } else {
                System.out.println("\n Resposta errada. Tente novamente!");
            }
        } while (!acertou);
    }

    // DESAFIO 2: Preenchendo corretamente um for loop
    static void segundoDesafio() {
        System.out.println("\n DESAFIO 2: O Robo Contador");
        System.out.println("Astro Bot: \"Erro de inicialização do ciclo de contagem!\"");
        System.out.println("for (int i = ___; i ___ ___; i___)");

        boolean acertou = false;
        do {
            System.out.println("\nQual a combinação correta?");
            System.out.println("1 - int i = 0; i < 5; i++");
            System.out.println("2 - int i = 1; i <= 5; i--");
            System.out.println("3 - int i = 0; i > 5; i++");

            if (lerOpcao() == 1) {
                System.out.println("\n Astro Bot voltou a contar com precisão!");
                acertou = true;
            } else {
                System.out.println("\n Astro Bot ainda está travado. Tente de novo!");
            }
        } while (!acertou);
    }

    // DESAFIO 3: Entendendo do-while
    static void terceiroDesafio() {
        System.out.println("\n DESAFIO 3: A Porta com Código Secreto");
        System.out.println("A porta mostra o seguinte código:");
        System.out.println("int senha = 1234;\ndo {\n    System.out.println(\"Digite a senha\");\n} while (input != senha);");

        boolean acertou = false;
        do {
            System.out.println("\nQual estrutura representa corretamente o funcionamento do laço acima?");
            System.out.println("1 - while (input == senha)");
            System.out.println("2 - do...while garante execução pelo menos uma vez");
            System.out.println("3 - input == senha no começo impede execução");

            if (lerOpcao() == 2) {
                System.out.println("\n Porta destrancada!");
                acertou = true;
            } else {
                System.out.println("\n Código incorreto! A porta continua trancada.");
            }
        } while (!acertou);
    }

    // DESAFIO 4: Varrer uma matriz com dois laços for
    static void quartoDesafio() {
        System.out.println("\n DESAFIO 4: A Matriz Fantasma");
        System.out.println("Você precisa varrer uma matriz 3x3 para identificar bugs.");
        System.out.println("Qual estrutura você usaria?");

        boolean acertou = false;
        do {
            System.out.println("\n1 - Um único for");
            System.out.println("2 - Dois for aninhados");
            System.out.println("3 - while sem contadores");

            if (lerOpcao() == 2) {
                System.out.println("\n Você varreu a matriz corretamente e encontrou os bugs!");
                acertou = true;
            } else {
                System.out.println("\n Isso não cobre todas as linhas e colunas!");
            }
        } while (!acertou);
    }

    // DESAFIO 5: Loop para contagem de horas e minutos
    static void quintoDesafio() {
        System.out.println("\n DESAFIO 5: O Relógio Parado");
        System.out.println("O relógio da empresa está travado no mesmo horário.");
        System.out.println("for (int h = 0; h < 24; h++) { for (int m = 0; m < 60; m++) { ... } }");

        boolean acertou = false;
        do {
            System.out.println("\nO que esse código representa?");
            System.out.println("1 - Loop de contagem de tempo em horas e minutos");
            System.out.println("2 - Loop de contagem de segundos apenas");
            System.out.println("3 - Um loop infinito");

            if (lerOpcao() == 1) {
                System.out.println("\n O tempo voltou a passar! Você restaurou o relógio.");
                acertou = true;
            } else {
                System.out.println("\n O relógio continua travado. Pense de novo!");
            }
        } while (!acertou);
    }

    // DESAFIO 6: Primalidade com for loop
    static void sextoDesafio() {
        System.out.println("\n DESAFIO 6: O Enigma Final");
        System.out.println("Você precisa detectar se um número é primo, mas o loop está errado:");
        System.out.println("for (int i = 2; i < num; i++) {\n    if (num % i == 0) return false;\n}");

        boolean acertou = false;
        do {
            System.out.println("\nQual o problema com esse código?");
            System.out.println("1 - Ele nunca verifica divisores");
            System.out.println("2 - O loop deveria ir até num + 1");
            System.out.println("3 - Está correto para verificar primalidade");

            if (lerOpcao() == 3) {
                System.out.println("\n Parabéns, " + nomeJogador + "! Você completou todos os desafios e quebrou a maldição da INFINITY TECH!");
                acertou = true;
            } else {
                System.out.println("\n Ainda há bugs no sistema... tente mais uma vez!");
            }
        } while (!acertou);
    }
}
static void desafioSete() {
    System.out.println("\n☕ Voce encontra uma maquina de café que nunca para de servir.");
    System.out.println("Ao lado, um terminal mostra o seguinte código:");
    System.out.println("for (;;) {\n    System.out.println(\"Servindo café...\");\n}");

    int resposta;
    boolean acertou = false;

    do {
        System.out.println("\n💡 Qual é o problema com esse loop?");
        System.out.println("1 - É um loop infinito por falta de condicao.");
        System.out.println("2 - Esta correto, ele servira 10 cafés.");
        System.out.println("3 - Está incompleto por faltar o tipo do loop.");
        System.out.print("Escolha a opção correta: ");
        resposta = lerOpcao();

        if (resposta == 1) {
            System.out.println("\n✅ Boa, " + nomeJogador + "! Esse é um loop infinito.");
            acertou = true;
        } else {
            System.out.println("\n❌ Resposta errada. O café continua jorrando!");
        }
    } while (!acertou);
}
static void desafioOito() {
    System.out.println("\n🌀 Voce entra em uma sala com um gerador de numeros ímpares bugado.");
    System.out.println("O código que você encontra:");
    System.out.println("for (int i = 0; i < 5; i++) {\n    if (i % 2 == 0) continue;\n    System.out.println(i);\n}");

    int resposta;
    boolean acertou = false;

    do {
        System.out.println("\n💡 O que esse código imprime?");
        System.out.println("1 - 1 3");
        System.out.println("2 - 0 1 2 3 4");
        System.out.println("3 - 2 4");
        System.out.print("Escolha a opção correta: ");
        resposta = lerOpcao();

        if (resposta == 1) {
            System.out.println("\n✅ Excelente, " + nomeJogador + "! Só imprime os ímpares.");
            acertou = true;
        } else {
            System.out.println("\n❌ Nao é isso! Lembre-se: `continue` pula para a próxima iteração.");
        }
    } while (!acertou);
}
static void desafioNove() {
    System.out.println("\n🔁 Um alarme está prestes a disparar! Você vê um contador regressivo no código:");
    System.out.println("for (int i = 10; i >= 1; i--) {\n    System.out.println(i);\n}");

    int resposta;
    boolean acertou = false;

    do {
        System.out.println("\n💡 O que acontece com esse loop?");
        System.out.println("1 - Conta de 1 a 10.");
        System.out.println("2 - Conta de 10 até 1.");
        System.out.println("3 - É um loop infinito.");
        System.out.print("Escolha a opção correta: ");
        resposta = lerOpcao();

        if (resposta == 2) {
            System.out.println("\n✅ Ótimo trabalho, " + nomeJogador + "! O contador desce corretamente.");
            acertou = true;
        } else {
            System.out.println("\n❌ Ops! Tente analisar melhor a inicialização e decremento.");
        }
    } while (!acertou);
}
static void desafioDez() {
    System.out.println("\n🔒 O cofre final está protegido por um código baseado na sequência de Fibonacci.");
    System.out.println("O sistema pede os primeiros 6 números da sequência.");
    System.out.println("Sequência esperada: 0, 1, 1, 2, 3, 5");

    int resposta;
    boolean acertou = false;

    do {
        System.out.println("\n💡 Qual dessas opções representa corretamente os 6 primeiros números da sequência?");
        System.out.println("1 - 1, 1, 2, 3, 5, 8");
        System.out.println("2 - 0, 1, 1, 2, 3, 5");
        System.out.println("3 - 0, 2, 2, 4, 6, 10");
        System.out.print("Escolha a opção correta: ");
        resposta = lerOpcao();

        if (resposta == 2) {
            System.out.println("\n🎉 Parabéns, " + nomeJogador + "! Você desbloqueou o cofre final e quebrou a maldição do código infinito!");
            acertou = true;
        } else {
            System.out.println("\n❌ Sequência incorreta. Lembre-se da lógica de Fibonacci: cada número é a soma dos dois anteriores.");
        }
    } while (!acertou);
}




