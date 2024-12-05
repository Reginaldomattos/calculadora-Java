import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir os números ao usuário
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Pedir a operação ao usuário
        System.out.println("Escolha a operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        int operacao = scanner.nextInt();

        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero!");
                } else {
                    resultado = num1 / num2;
                }
                break;
            default:
                System.out.println("Operação inválida!");
        }

        // Exibir o resultado (caso a operação seja válida)
        if (operacao >= 1 && operacao <= 4 && num2 != 0) {
            System.out.println("Resultado: " + resultado);
        }
    }
}