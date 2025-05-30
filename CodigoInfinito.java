import java.util.Scanner;

public class CodigoInfinito {

    static Scanner scanner = new Scanner(System.in);
    static String nomeJogador = "";
    static boolean acertouDePrimeira = true;

    public static void main(String[] args) {
        exibirBoasVindas();
        menu();
        scanner.close();
    }

    static void exibirBoasVindas() {
        System.out.println("=========================================");
        System.out.println("Bem-vindo à Maldição do Código Infinito");
        System.out.println("=========================================");
        System.out.println("\nIntrodução:");
        System.out.println("Você é um jovem programador contratado pela enigmática empresa INFINITY TECH.");
        System.out.println("Ao chegar para o primeiro dia, percebe algo estranho: os funcionários estão presos em loops eternos.");
        System.out.println("Cabe a você resolver enigmas e quebrar os códigos para libertá-los da maldição...\n");
    }

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
                    System.out.println("\nCRÉDITOS:");
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

    static void iniciarJogo() {
        acertouDePrimeira = true;

        System.out.print("\nDigite o nome do seu personagem: ");
        nomeJogador = scanner.nextLine();

        System.out.println("\nBem-vindo, " + nomeJogador + ".");
        System.out.println("Você entra na empresa e ouve vozes pedindo ajuda de todos os lados...");
        System.out.println("Prepare-se para quebrar os códigos e libertar as almas presas no sistema!");

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

    static void mostrarFinal() {
        System.out.println("\n================= FIM DA JORNADA =================");
        if (acertouDePrimeira) {
            System.out.println("Parabéns, " + nomeJogador + "! Você quebrou a maldição de primeira!");
            System.out.println("Todos os funcionários foram libertados e a INFINITY TECH voltou ao normal!");
        } else {
            System.out.println("Infelizmente, " + nomeJogador + ", você cometeu alguns erros nos desafios.");
            System.out.println("Agora você também está preso no loop eterno da INFINITY TECH...");
        }
    }

    static int lerOpcaoComResultadoCorreto(int respostaCorreta) {
        int tentativa = lerOpcao();
        if (tentativa == respostaCorreta) {
            System.out.println("Resposta correta!");
        } else {
            System.out.println("Resposta incorreta!");
            acertouDePrimeira = false;
        }
        return tentativa;
    }

    static int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    static void desafio1() {
        System.out.println("DESAFIO 1: O Loop do E-mail Infinito");
        // Exemplo de loop infinito usando while(true), que nunca termina
        System.out.println("while (true) { System.out.println(\"Enviando e-mail...\"); }");
        int opcao;
        do {
            System.out.println("\nComo você quebra esse laço infinito?");
            System.out.println("1 - Usando break quando a condição for atendida"); // Correto
            System.out.println("2 - Deixando rodar para sempre");
            System.out.println("3 - Colocando if sem break");
            System.out.print("Escolha a opção correta: ");
            opcao = lerOpcaoComResultadoCorreto(1);
        } while (opcao != 1);
    }

    static void desafio2() {
        System.out.println("DESAFIO 2: O Robô Contador");
        // Estrutura de loop for clássica para contar até 4
        System.out.println("for (int i = ___; i ___ ___; i___)");
        int opcao;
        do {
            System.out.println("\nQual a combinação correta?");
            System.out.println("1 - int i = 0; i < 5; i++"); // Correto: vai de 0 a 4
            System.out.println("2 - int i = 1; i <= 5; i--");
            System.out.println("3 - int i = 0; i > 5; i++");
            System.out.print("Escolha a opção correta: ");
            opcao = lerOpcaoComResultadoCorreto(1);
        } while (opcao != 1);
    }

    static void desafio3() {
        System.out.println("DESAFIO 3: A Porta com Código Secreto");
        // Estrutura do-while garante que o código execute pelo menos uma vez
        System.out.println("int senha = 1234; do { System.out.println(\"Digite a senha\"); } while (input != senha);");
        int opcao;
        do {
            System.out.println("\nQual estrutura representa corretamente o funcionamento do laço acima?");
            System.out.println("1 - while (input == senha)");
            System.out.println("2 - do...while garante execução pelo menos uma vez"); // Correto
            System.out.println("3 - input == senha no começo impede execução");
            System.out.print("Escolha a opção correta: ");
            opcao = lerOpcaoComResultadoCorreto(2);
        } while (opcao != 2);
    }

    static void desafio4() {
        System.out.println("DESAFIO 4: A Matriz Fantasma");
        // Para percorrer uma matriz 3x3, são necessários dois loops for aninhados
        int opcao;
        do {
            System.out.println("\n1 - Um único for");
            System.out.println("2 - Dois for aninhados"); // Correto
            System.out.println("3 - while sem contadores");
            System.out.print("Escolha a opção correta: ");
            opcao = lerOpcaoComResultadoCorreto(2);
        } while (opcao != 2);
    }

    static void desafio5() {
        System.out.println("DESAFIO 5: O Relógio Parado");
        // Representa um relógio de 0 a 23 horas e 0 a 59 minutos
        System.out.println("for (int h = 0; h < 24; h++) { for (int m = 0; m < 60; m++) { ... } }");
        int opcao;
        do {
            System.out.println("\nO que esse código representa?");
            System.out.println("1 - Loop de contagem de tempo em horas e minutos"); // Correto
            System.out.println("2 - Loop de contagem de segundos apenas");
            System.out.println("3 - Um loop infinito");
            System.out.print("Escolha a opção correta: ");
            opcao = lerOpcaoComResultadoCorreto(1);
        } while (opcao != 1);
    }

    static void desafio6() {
        System.out.println("DESAFIO 6: Verificação de número primo");
        // Estrutura comum para verificar se um número é primo
        System.out.println("for (int i = 2; i < num; i++) { if (num % i == 0) return false; }");
        int opcao;
        do {
            System.out.println("\nQual o problema com esse código?");
            System.out.println("1 - Nunca verifica divisores");
            System.out.println("2 - Deveria ir até num + 1");
            System.out.println("3 - Está correto para verificar primalidade"); // Correto
            System.out.print("Escolha a opção correta: ");
            opcao = lerOpcaoComResultadoCorreto(3);
        } while (opcao != 3);
    }

    static void desafio7() {
        System.out.println("DESAFIO 7: Máquina de café infinita");
        // for(;;) é uma forma válida de criar um loop infinito
        System.out.println("for (;;) { System.out.println(\"Servindo café...\"); }");
        int opcao;
        do {
            System.out.println("\nQual é o problema com esse loop?");
            System.out.println("1 - É um loop infinito por falta de condicao."); // Correto
            System.out.println("2 - Está correto, ele servirá 10 cafés.");
            System.out.println("3 - Está incompleto por faltar o tipo do loop.");
            System.out.print("Escolha a opção correta: ");
            opcao = lerOpcaoComResultadoCorreto(1);
        } while (opcao != 1);
    }

    static void desafio8() {
        System.out.println("DESAFIO 8: Gerador de ímpares bugado");
        // continue faz o loop pular os números pares
        System.out.println("for (int i = 0; i < 5; i++) { if (i % 2 == 0) continue; System.out.println(i); }");
        int opcao;
        do {
            System.out.println("\nO que esse código imprime?");
            System.out.println("1 - 1 3"); // Correto: apenas ímpares são impressos
            System.out.println("2 - 0 1 2 3 4");
            System.out.println("3 - 2 4");
            System.out.print("Escolha a opção correta: ");
            opcao = lerOpcaoComResultadoCorreto(1);
        } while (opcao != 1);
    }

    static void desafio9() {
        System.out.println("DESAFIO 9: Contador Regressivo");
        // Loop decrescente de 10 até 1
        System.out.println("for (int i = 10; i >= 1; i--) { System.out.println(i); }");
        int opcao;
        do {
            System.out.println("\nQual é a saída desse código?");
            System.out.println("1 - Conta de 1 até 10");
            System.out.println("2 - Conta de 10 até 1"); // Correto
            System.out.println("3 - Loop infinito");
            System.out.print("Escolha a opção correta: ");
            opcao = lerOpcaoComResultadoCorreto(2);
        } while (opcao != 2);
    }

    static void desafio10() {
        System.out.println("DESAFIO 10: Acumulador de Pontos");
        // Soma os números de 1 a 5: 1+2+3+4+5 = 15
        System.out.println("int soma = 0; for (int i = 1; i <= 5; i++) { soma += i; } System.out.println(soma);");
        int opcao;
        do {
            System.out.println("\nQual o valor final impresso?");
            System.out.println("1 - 15"); // Correto
            System.out.println("2 - 10");
            System.out.println("3 - 5");
            System.out.print("Escolha a opção correta: ");
            opcao = lerOpcaoComResultadoCorreto(1);
        } while (opcao != 1);
    }

}
