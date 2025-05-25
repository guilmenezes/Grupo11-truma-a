import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class CodigoInfinito {

    static Scanner scanner = new Scanner(System.in);
    static String nomeJogador = "";

    public static void main(String[] args) {
        exibirBoasVindas();
        exibirMenuPrincipal();
        scanner.close();
    }

    static void exibirBoasVindas() {
        System.out.println("=========================================");
        System.out.println("🧩 Bem-vindo à Maldição do Código Infinito");
        System.out.println("=========================================");
        System.out.println("\n📖 Introdução:");
        System.out.println("Você é um jovem programador contratado por uma empresa misteriosa...");
        System.out.println("Aos poucos, percebe que os funcionários estão presos em loops infinitos.");
        System.out.println("Cabe a você usar seus conhecimentos em programação para libertá-los!\n");
    }

    static void exibirMenuPrincipal() {
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n📁 MENU PRINCIPAL");
            System.out.println("1 - Jogar");
            System.out.println("2 - Instruções");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = lerNumero();

            if (opcao == 1) {
                iniciarJogo();
            } else if (opcao == 2) {
                exibirInstrucoes();
            } else if (opcao == 3) {
                System.out.println("Encerrando o jogo... Até a próxima!");
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }

    static void exibirInstrucoes() {
        System.out.println("\n📚 INSTRUÇÕES:");
        System.out.println("Você foi contratado por uma empresa chamada INFINITY TECH.");
        System.out.println("Logo descobre que os funcionários estão presos em laços de repetição.");
        System.out.println("Seu objetivo é usar seus conhecimentos em Java para resolver os enigmas e libertá-los.");
        System.out.println("Preste atenção nas perguntas e escolha a resposta correta!\n");
    }

    static void iniciarJogo() {
        System.out.print("\nDigite o nome do seu personagem: ");
        nomeJogador = scanner.nextLine().trim();

        while (nomeJogador.isEmpty()) {
            System.out.print("Nome inválido. Digite novamente: ");
            nomeJogador = scanner.nextLine().trim();
        }

        System.out.println("\n🖥️ Bem-vindo, " + nomeJogador + "!");
        System.out.println("Você chega para seu primeiro dia na misteriosa empresa INFINITY TECH.");
        System.out.println("Mas algo estranho está acontecendo...\n");

        desafioUm();
        desafioDois();
        desafioTres();
    }

    static void desafioUm() {
        System.out.println("📌 Um funcionário se aproxima e diz:");
        System.out.println("\"" + nomeJogador + ", estamos presos em um loop! O café nunca acaba e os e-mails se repetem!\"");
        System.out.println("Você olha para o código no monitor:");
        System.out.println("\nwhile (true) {\n    System.out.println(\"Enviando e-mail...\");\n}");

        String pergunta = "Como você quebra esse laço infinito?";
        String[] opcoes = {
            "Usando break quando a condição for atendida",
            "Deixando rodar pra sempre",
            "Colocando if sem break"
        };

        mostrarPergunta(pergunta, opcoes, 0);

        System.out.println("\n✅ Excelente, " + nomeJogador + "! Você quebrou o primeiro loop.");
        System.out.println("🎉 Parabéns, você libertou alguns colaboradores desse laço infinito!");
        System.out.println("Você sente que algo foi libertado... mas há muito mais por vir.\n");
    }

    static void desafioDois() {
        System.out.println("👨‍💻 Você encontra seu colega de trabalho, Lucas, parado em frente ao monitor, suando frio.");
        System.out.println("\"" + nomeJogador + ", eu estou preso nesse maldito código de contagem!\"");
        System.out.println("\"Tentei usar um laço 'for' para contar 5 componentes, mas ele está incompleto!\"");
        System.out.println("Você olha para o código na tela e vê:");
        System.out.println("\nfor (int i = ___; i ___ ___; i___) {");
        System.out.println("Lucas precisa que o laço repita 5 vezes para sair do ciclo.");

        String pergunta = "Qual a combinação correta para completar o laço 'for'?";
        String[] opcoes = {
            "int i = 0; i < 5; i++",
            "int i = 1; i <= 5; i--",
            "int i = 0; i > 5; i++"
        };

        mostrarPergunta(pergunta, opcoes, 0);

        System.out.println("\n✅ Lucas: \"Isso! Era isso! O laço vai de 0 a 4!\"");
        System.out.println("🎉 Parabéns, você libertou alguns colaboradores desse laço infinito!\n");
    }

    public static void desafioTres() {
        System.out.println("\n===================================================================================================================================");
        System.out.println("\n📄 Você avança para o departamento de \"Análise de Dados\" e encontra um colega programador com os olhos arregalados, cercado por pilhas e mais pilhas de papéis impressos.");
        System.out.println("\"Socorro, " + nomeJogador + "! Nosso gerador de relatórios entrou em colapso! Ele está imprimindo tudo sem parar! Meu código está com um loop aninhado e eu não sei o que esperar da saída!\"");
        System.out.println("Ele te mostra o trecho de código no monitor:");

        System.out.println("for (int i = 0; i < 3; i++) {");
        System.out.println("    for (int j = 0; j < 2; j++) {");
        System.out.println("        System.out.println(\"Gerando relatório...\");");
        System.out.println("    }");
        System.out.println("}");

        System.out.println("\nO programador aponta para o monitor, desesperado. \"Quantas vezes a mensagem 'Gerando relatório...' será impressa? Preciso saber para desligar essa máquina!\"");

        int resposta;
        boolean acertou = false;

        do {
            System.out.println("\nQuantas vezes a mensagem 'Gerando relatório...' será impressa?");
            System.out.println("1 - 3 vezes");
            System.out.println("2 - 2 vezes");
            System.out.println("3 - 6 vezes");
            System.out.println("4 - 5 vezes");
            System.out.print("Escolha a opção correta: ");

            resposta = lerNumero();

            if (resposta == 3) {
                System.out.println("\n✅ Impressionante, " + nomeJogador + "! A mensagem será impressa 6 vezes (3 iterações do loop externo * 2 iterações do loop interno). Você parou a impressora!");
                acertou = true;
            } else {
                System.out.println("\n❌ Ops, resposta errada. Os relatórios continuam a ser impressos descontroladamente...");
                System.out.println("Tente novamente!");
            }
        } while (!acertou);
    }

    static void mostrarPergunta(String pergunta, String[] opcoes, int correta) {
        boolean acertou = false;

        while (!acertou) {
            System.out.println("\n💡 " + pergunta);

            ArrayList<Integer> indices = new ArrayList<>();
            for (int i = 0; i < opcoes.length; i++) {
                indices.add(i);
            }
            Collections.shuffle(indices);

            for (int i = 0; i < indices.size(); i++) {
                System.out.println((i + 1) + " - " + opcoes[indices.get(i)]);
            }

            System.out.print("Escolha: ");
            int resposta = lerNumero();

            if (resposta >= 1 && resposta <= opcoes.length && indices.get(resposta - 1) == correta) {
                acertou = true;
            } else {
                System.out.println("❌ Resposta errada. ❗ Você errou, mas não desista!");
                System.out.println("Tente novamente!");
            }
        }
    }

    static int lerNumero() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}