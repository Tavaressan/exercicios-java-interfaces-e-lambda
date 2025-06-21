import Models.Remetentes.Computador;

import java.util.Scanner;

public class MenuMensagem {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bem vindo ao menu de envio de mensagens!");

        Computador computador = new Computador();

        boolean menu = true;
        while (menu) {
            mostraMenu();
            String opcao = scanner.nextLine();
            switch (opcao){
                case "1" -> computador.enviaMensagemSMS(escreveMensagem());
                case "2" -> computador.enviaMensagemEmail(escreveMensagem());
                case "3" -> computador.enviaMensagemRedesSociais(escreveMensagem());
                case "4" -> computador.enviaMensagemWhatsapp(escreveMensagem());
                case "0" -> {
                    menu = false;
                    System.out.println("Você saiu do menu");
                }
                default -> System.out.println("Insira uma opção válida.");
            }
        }
    }
    public static void mostraMenu () {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Enviar mensagem por SMS.");
        System.out.println("2 - Enviar mensagem por E-mail.");
        System.out.println("3 - Enviar mensagem pelas Redes Sociais.");
        System.out.println("4 - Enviar mensagem por Whatsapp.");
        System.out.println("0 - Sair.");
    }

    public static String escreveMensagem () {
        System.out.println("Qual é a sua mensagem?");
        return scanner.nextLine();
    }
}
