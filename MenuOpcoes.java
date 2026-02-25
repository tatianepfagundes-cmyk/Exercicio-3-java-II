import java.util.Scanner;

public class MenuOpcoes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;
        double num1, num2, resultado;

        System.out.println("Menu de opções:");
        System.out.println("1 - Somar dois números");
        System.out.println("2 - Número ao quadrado");
        System.out.print("Digite a opção desejada: ");
        opcao = sc.nextInt();

        switch (opcao) {

            case 1:
                System.out.print("Digite o primeiro número: ");
                num1 = sc.nextDouble();

                System.out.print("Digite o segundo número: ");
                num2 = sc.nextDouble();

                resultado = num1 + num2;

                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                System.out.print("Digite um número: ");
                num1 = sc.nextDouble();

                resultado = num1 * num1;

                System.out.println("Resultado: " + resultado);
                break;

            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
