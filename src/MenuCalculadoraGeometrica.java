import Models.CalculadorasGeometricas.CalculadoraFormasGeometricas;
import java.util.Scanner;

public class MenuCalculadoraGeometrica {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CalculadoraFormasGeometricas calculadora = new CalculadoraFormasGeometricas();
        boolean menu = true;

        while (menu) {
            mostraMenuPrincipal();
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "0" -> {
                    menu = false;
                    System.out.println("Você saiu do programa");
                }
                case "1" -> {
                    System.out.println("Digite o lado do quadrado:");
                    float lado = Float.parseFloat(scanner.nextLine());
                    System.out.printf("Área do quadrado: %.2f%n", calculadora.calculaAreaQuadrado(lado));
                }
                case "2" -> {
                    System.out.println("Digite a base do retângulo:");
                    float base = Float.parseFloat(scanner.nextLine());
                    System.out.println("Digite a altura do retângulo:");
                    float altura = Float.parseFloat(scanner.nextLine());
                    System.out.printf("Área do retângulo: %.2f%n", calculadora.calculaAreaRetangulo(base, altura));
                }
                case "3" -> {
                    System.out.println("Digite o raio do círculo:");
                    float raio = Float.parseFloat(scanner.nextLine());
                    System.out.printf("Área do círculo: %.2f%n", calculadora.calculaAreaCirculo(raio));
                }
                default -> System.out.println("Insira uma opção válida.");
            }
        }
    }

    public static void mostraMenuPrincipal() {
        System.out.println("\n=== Calculadora de Formas Geométricas ===");
        System.out.println("1 - Calcular área do quadrado");
        System.out.println("2 - Calcular área do retângulo");
        System.out.println("3 - Calcular área do círculo");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }
}
