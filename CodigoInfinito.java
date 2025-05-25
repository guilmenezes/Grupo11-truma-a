import java.util.Scanner;
     public class CodigoInfinito {


             static Scanner scanner = new Scanner(System.in);
             static String nomeJogador = "";

             public static void main(String[] args) {
                 exibirBoasVindas();
                 menu();
                 scanner.close();
             }

             static void exibirBoasVindas() {
                 System.out.println("=========================================");
                 System.out.println("🧩 Bem-vindo a Maldicao do Codigo Infinito");
                 System.out.println("=========================================");
                 System.out.println("\n📖 Introducao:");

                 // ✍️ Aqui você pode colocar a introdução completa da história
                 System.out.println("Um jovem programador e contratado por uma empresa misteriosa...");
                 System.out.println("Aos poucos, ele percebe que os funcionarios estao presos em loops infinitos.");
                 System.out.println("Agora, cabe a ele usar seus conhecimentos em programacao para libertar a todos.\n");
             }

             static void menu() {
                 int opcao = 0;

                 while (opcao != 4) {
                     System.out.println("\n📁 MENU PRINCIPAL");
                     System.out.println("1 - Iniciar Jornada");
                     System.out.println("2 - Instrucoes");
                     System.out.println("3 - Creditos");
                     System.out.println("4 - Sair");
                     System.out.print("Escolha uma opcao: ");

                     try {
                         opcao = Integer.parseInt(scanner.nextLine());
                     } catch (NumberFormatException e) {
                         System.out.println("Entrada invalida! Digite um numero.");
                         continue;
                     }

                     switch (opcao) {
                         case 1:
                             iniciarJogo();
                             break;
                         case 2:
                             System.out.println("\n📚 INSTRUCOES:\n" +
                                     "Voce e um jovem programador contratado por uma empresa misteriosa.\n" +
                                     "Logo percebe que todos estao presos em lacos de repeticao.\n" +
                                     "Resolva os enigmas usando lacos em Java para liberta-los!");
                             break;
                         case 3:
                             System.out.println("\nJogo criado por, Caio Domingues Pires, Carlos Henrique, Gabriel Teles e Guilherme Menezes.");
                             System.out.println("Mencao Honrosa, Professor Takeo.");
                             break;
                         case 4:
                             System.out.println("Encerrando...");
                             break;
                         default:
                             System.out.println("Opcao invalida!");
                     }
                 }
             }

             static void iniciarJogo() {
                 System.out.print("\nDigite o nome do seu personagem: ");
                 nomeJogador = scanner.nextLine();

                 System.out.println("\n🖥️ Bem-vindo, " + nomeJogador + ".");
                 System.out.println("Voce chega para seu primeiro dia na misteriosa empresa INFINITY TECH.");
                 System.out.println("Mas algo estranho esta acontecendo...");

                 primeiroDesafio();
                 SegundoDesafio();
                 terceiroDesafio();
        
        System.out.println("\n🎉 Parabens, " + nomeJogador + "! Voce superou os desafios iniciais da INFINITY TECH!");
        System.out.println("Ainda ha muito a fazer para libertar todos...");
    }

             static void primeiroDesafio() {
                 System.out.println("\n📌 Um funcionario se aproxima e diz:");
    System.out.println("\"" + nomeJogador + ", estamos presos em um loop! O cafe nunca acaba e os e-mails se repetem!\"");
    System.out.println("Voce olha para o codigo no monitor:");
    System.out.println("\nwhile (true) {\n    System.out.println(\"Enviando e-mail...\");\n}");

    int resposta;
    boolean acertou = false; // Variável para controlar a saída do loop

    do {
        System.out.println("\n💡 Como voce quebra esse laco infinito?");
        System.out.println("1 - Usando break quando a condicao for atendida");
        System.out.println("2 - Deixando rodar para sempre");
        System.out.println("3 - Colocando if sem break");

        System.out.print("Escolha a opcao correta: ");
        resposta = lerOpcao(); 

        if (resposta == 1) {
            System.out.println("\n✅ Excelente, " + nomeJogador + "! Voce quebrou o primeiro loop.");
            acertou = true;
        } else {
            System.out.println("\n❌ Ops, resposta errada. Os e-mails continuam infinitamente...");
            System.out.println("Tente novamente!"); // Mensagem para o jogador tentar de novo
        }
    } while (!acertou); // O loop continua enquanto 'acertou' for falso
}

             static int lerOpcao() {
                 try {
                     return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                     return -1;
            }
             }             

     public static void SegundoDesafio(){
         System.out.println("===================================================================================================================================");
         System.out.println("\nAgora voce chega a um setor onde robos deveriam estar organizando componentes. Um pequeno robo, modelo 'Astro Bot', esta parado.");
    System.out.println("\"Erro de inicializacao do ciclo de contagem!\", ele apita. ziiz-ziiz \"Minha rotina de 'for' esta incompleta!\"");
    System.out.println("Voce olha para o painel do Astro Bot e ve o seguinte trecho de codigo faltando partes essenciais:");
    System.out.println("\nfor (int i = ___; i ___ ___; i___) {");
    System.out.println("\nO robo precisa contar 5 componentes.");
    
         int resposta;
         boolean acertou = false;
    
    do {
        System.out.println("\nVoce precisa completar o laco 'for' para que o Astro Bot execute 5 iteracoes, simulando a contagem de componentes. As lacunas sao: `inicializacao`; `condicao de parada`; `incremento`.,\n" +
"        Qual a combinacao correta para completar o laco 'for'?,");
         System.out.println("1 - int i = 0; i < 5; i++");
         System.out.println("2 - int i = 1; i <= 5; i--");
         System.out.println("3 - int i = 0; i > 5; i++");
         System.out.print("Escolha a opcao correta: ");
        resposta = lerOpcao(); 

        if (resposta == 1) {
            System.out.println("\n✅ Excelente, " + nomeJogador + "! Voce quebrou o segundo loop.");
            acertou = true;
        } else {
            System.out.println("\n❌ Ops, resposta errada. O Astro Bot continua sem conseguir contar");
            System.out.println("Tente novamente!"); // Mensagem para o jogador tentar de novo
        }
    } while (!acertou); // O loop continua enquanto 'acertou' for falso
}
     
     public static void terceiroDesafio() {
        System.out.println("\n===================================================================================================================================");
        System.out.println("\n📄 Voce avanca para o departamento de \"Analise de Dados\" e encontra um colega programador com os olhos arregalados, cercado por pilhas e mais pilhas de papeis impressos.");
        System.out.println("\"Socorro, " + nomeJogador + "! Nosso gerador de relatorios entrou em colapso! Ele esta imprimindo tudo sem parar! Meu codigo esta com um loop aninhado e eu nao sei o que esperar da saida!\"");
        System.out.println("Ele te mostra o trecho de codigo no monitor:");

        System.out.println("for (int i = 0; i < 3; i++) {");
        System.out.println("    for (int j = 0; j < 2; j++) {");
        System.out.println("(\"Gerando relatorio...\");");
        System.out.println("    }");
        System.out.println("}");

        System.out.println("\nO programador aponta para o monitor, desesperado. \"Quantas vezes a mensagem 'Gerando relatorio...' sera impressa? Preciso saber para desligar essa maquina!\"");

        int resposta;
        boolean acertou = false;

        do {
            System.out.println("\nQuantas vezes a mensagem \"Gerando relatorio...\" sera impressa?");
            System.out.println("1 - 3 vezes");
            System.out.println("2 - 2 vezes");
            System.out.println("3 - 6 vezes"); // Resposta Correta
            System.out.println("4 - 5 vezes");
            System.out.print("Escolha a opcao correta: ");

            resposta = lerOpcao();

            if (resposta == 3) {
                System.out.println("\n✅ Impressionante, " + nomeJogador + "! A mensagem sera impressa 6 vezes (3 iteracoes do loop externo * 2 iteracoes do loop interno). Voce parou a impressora!");
                acertou = true;
            } else {
                System.out.println("\n❌ Ops, resposta errada. Os relatorios continuam a ser impressos descontroladamente...");
                System.out.println("Tente novamente!");
            }
        } while (!acertou);
    }
           
            
         
     }
     
     
     
     
     
     
