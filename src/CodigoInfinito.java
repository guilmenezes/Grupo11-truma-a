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

        int[] ordem = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < ordem.length; i++) {
            int j = (int)(Math.random() * ordem.length);
            int temp = ordem[i];
            ordem[i] = ordem[j];
            ordem[j] = temp;
        }

        for (int i = 0; i < ordem.length; i++) {
            executarDesafio(ordem[i]);
        }

        desafioFinal();
    }

    static void executarDesafio(int numero) {
        switch (numero) {
            case 1: desafioUm(); break;
            case 2: desafioDois(); break;
            case 3: desafioTres(); break;
            case 4: desafioQuatro(); break;
            case 5: desafioCinco(); break;
            case 6: desafioSeis(); break;
        }
    }

    static void desafioUm() {
        System.out.println("👩‍💻 Ana, uma analista júnior, mostra o seguinte trecho:");
        System.out.println("\nint i = 0;\nwhile (i < 3) {\n    System.out.println(i);\n    i++;\n}");

        String pergunta = "O que esse código faz?";
        String[] opcoes = {
            "Imprime os números 0, 1 e 2",
            "Entra em loop infinito",
            "Não imprime nada"
        };

        mostrarPergunta(pergunta, opcoes, 0);

        System.out.println("\n✅ Você explicou corretamente e ajudou Ana.");
    }

    static void desafioDois() {
        System.out.println("👨‍💻 Lucas, um desenvolvedor da equipe, mostra um laço incompleto:");
        System.out.println("\nfor (int i = ___; i ___ ___; i___) {");

        String pergunta = "Qual a combinação correta?";
        String[] opcoes = {
            "int i = 0; i < 5; i++",
            "int i = 1; i <= 5; i--",
            "int i = 0; i > 5; i++"
        };

        mostrarPergunta(pergunta, opcoes, 0);

        System.out.println("\n✅ Você ajudou Lucas a escapar do loop!");
    }

    static void desafioTres() {
        System.out.println("📄 Um analista de dados mostra um loop aninhado:");
        System.out.println("for (int i = 0; i < 3; i++) {\n    for (int j = 0; j < 2; j++) {\n        System.out.println(\"Gerando relatório...\");\n    }\n}");

        int resposta;
        boolean acertou = false;

        do {
            System.out.println("\nQuantas vezes a mensagem será impressa?");
            System.out.println("1 - 3 vezes");
            System.out.println("2 - 2 vezes");
            System.out.println("3 - 6 vezes");
            System.out.println("4 - 5 vezes");
            System.out.print("Escolha: ");

            resposta = lerNumero();

            if (resposta == 3) {
                System.out.println("\n✅ Correto! São 6 vezes (3 x 2).");
                acertou = true;
            } else {
                System.out.println("❌ Errado. Tente novamente!");
            }
        } while (!acertou);
    }

    static void desafioQuatro() {
        System.out.println("🧠 Um funcionário mostra o seguinte código:");
        System.out.println("int i = 0;\nwhile (i < 3) {\n    if (i == 1) {\n        System.out.println(\"Meio do loop\");\n    }\n    i++;\n}");

        String pergunta = "O que o código imprime?";
        String[] opcoes = {
            "Imprime 'Meio do loop' uma vez",
            "Imprime 'Meio do loop' três vezes",
            "Nunca imprime nada"
        };

        mostrarPergunta(pergunta, opcoes, 0);

        System.out.println("\n✅ Acertou! Você entende bem as condições!");
    }

    static void desafioCinco() {
        System.out.println("📘 Durante uma reunião com novos colaboradores, um deles pergunta:");
        System.out.println("\"Quando devo usar do-while ao invés de while?\"");

        String pergunta = "Quando usar do-while?";
        String[] opcoes = {
            "Quando o bloco precisa ser executado ao menos uma vez",
            "Quando quero evitar repetições",
            "Quando não há condição para testar"
        };

        mostrarPergunta(pergunta, opcoes, 0);

        System.out.println("\n✅ Agora todos entendem o do-while!");
    }

    static void desafioSeis() {
        System.out.println("📦 Um desenvolvedor te mostra um código:");
        System.out.println("int i = 5;\nwhile (i > 0) {\n    System.out.println(i);\n    i--;\n}");

        String pergunta = "Qual é a saída?";
        String[] opcoes = {
            "5, 4, 3, 2, 1",
            "1, 2, 3, 4, 5",
            "5, 4, 3, 2, 1, 0"
        };

        mostrarPergunta(pergunta, opcoes, 0);

        System.out.println("\n✅ Perfeito! Imprime de 5 até 1.");
    }

    static void desafioFinal() {
        System.out.println("\n🏁 DESAFIO FINAL:");
        System.out.println("\"" + nomeJogador + ", você chegou até o fim... Mas precisa quebrar o último loop!\"");

        String pergunta = "O que acontece se a condição do for nunca for falsa?";
        String[] opcoes = {
            "Ele entra em um loop infinito",
            "Ele não executa nenhuma vez",
            "Ele executa apenas uma vez"
        };

        boolean acertouDePrimeira = mostrarPerguntaFinal(pergunta, opcoes, 0);

        if (acertouDePrimeira) {
            System.out.println("\n🌟 FINAL FELIZ:");
            System.out.println("Você quebrou a maldição do Código Infinito!");
        } else {
            System.out.println("\n😢 FINAL TRISTE:");
            System.out.println("Você falhou de primeira, mas ao menos enfraqueceu a maldição.");
        }
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
                System.out.println("❌ Errado. Tente novamente!");
            }
        }
    }

    static boolean mostrarPerguntaFinal(String pergunta, String[] opcoes, int correta) {
        boolean acertou = false;
        int tentativas = 0;

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
                System.out.println("❌ Errado...");
            }

            tentativas++;
        }

        return tentativas == 1;
    }

    static int lerNumero() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
