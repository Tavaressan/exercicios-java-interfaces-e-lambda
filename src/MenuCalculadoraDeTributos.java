import Models.CalculadorasDeTributos.*;
import java.util.Scanner;

public class MenuCalculadoraDeTributos {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean menu = true;
        while (menu) {
            mostraMenuPrincipal();
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "0" -> {
                    menu = false;
                    System.out.println("Você saiu do programa");
                }
                case "1", "2", "3", "4" -> {
                    System.out.println("Digite o valor do produto:");
                    double valor = Double.parseDouble(scanner.nextLine());

                    switch (opcao) {
                        case "1" -> {
                            CalculadoraTributoAlimentacao calc = new CalculadoraTributoAlimentacao();
                            System.out.printf("Tributo de Alimentação: R$ %.2f%n", calc.calculaTributo(valor));
                        }
                        case "2" -> {
                            CalculadoraTributoCultura calc = new CalculadoraTributoCultura();
                            System.out.printf("Tributo de Cultura: R$ %.2f%n", calc.calculaTributo(valor));
                        }
                        case "3" -> {
                            CalculadoraTributoVestuario calc = new CalculadoraTributoVestuario();
                            System.out.printf("Tributo de Vestuário: R$ %.2f%n", calc.calculaTributo(valor));
                        }
                        case "4" -> {
                            CalculadoraTributoSaudeBemEstar calc = new CalculadoraTributoSaudeBemEstar();
                            System.out.printf("Tributo de Saúde e Bem-estar: R$ %.2f%n", calc.calculaTributo(valor));
                        }
                    }
                }
                default -> System.out.println("Insira uma opção válida.");
            }
        }
    }

    public static void mostraMenuPrincipal() {
        System.out.println("\nCalculadora de Tributos");
        System.out.println("1 - Calcular tributo de Alimentação (1%)");
        System.out.println("2 - Calcular tributo de Cultura (4%)");
        System.out.println("3 - Calcular tributo de Vestuário (2.5%)");
        System.out.println("4 - Calcular tributo de Saúde e Bem-estar (1.5%)");
        System.out.println("0 - Sair");
    }
}
