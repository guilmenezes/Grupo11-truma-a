import java.util.Scanner;

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

            opcao = lerOpcao(1, 3);

            if (opcao == 1) {
                iniciarJogo();
            } else if (opcao == 2) {
                exibirInstrucoes();
            } else if (opcao == 3) {
                System.out.println("Encerrando o jogo... Até a próxima!");
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
        System.out.println("Mas algo estranho está acontecendo...");

        primeiroDesafio();
    }

    static void primeiroDesafio() {
        System.out.println("\n📌 Um funcionário se aproxima e diz:");
        System.out.println("\"" + nomeJogador + ", estamos presos em um loop! O café nunca acaba e os e-mails se repetem!\"");
        System.out.println("Você olha para o código no monitor:");
        System.out.println("\nwhile (true) {\n    System.out.println(\"Enviando e-mail...\");\n}");

        System.out.println("\n💡 Como você quebra esse laço infinito?");
        System.out.println("1 - Usando break quando a condição for atendida");
        System.out.println("2 - Deixando rodar pra sempre");
        System.out.println("3 - Colocando if sem break");

        System.out.print("Escolha a opção correta: ");
        int resposta = lerOpcao(1, 3);

        if (resposta == 1) {
            System.out.println("\n✅ Excelente, " + nomeJogador + "! Você quebrou o primeiro loop.");
            System.out.println("Você sente que algo foi libertado... mas há muito mais por vir.");
        } else {
            System.out.println("\n❌ Ops, resposta errada. Os e-mails continuam sendo enviados infinitamente...");
        }
    }

    static int lerOpcao(int minimo, int maximo) {
        int opcao = -1;
        boolean valido = false;

        while (!valido) {
            try {
                opcao = Integer.parseInt(scanner.nextLine().trim());
                if (opcao >= minimo && opcao <= maximo) {
                    valido = true;
                } else {
                    System.out.print("Opção inválida. Digite um número entre " + minimo + " e " + maximo + ": ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Digite um número válido: ");
            }
        }

        return opcao;
    }
}
 
    

