import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");
        char operação = scanner.next().charAt(0);

        double resultado;


        switch (operação) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);
            break;
            case '*':
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
            break;
            case '/':
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
            break;
            default:
                System.out.println("Operaçao inválida. Por favor, escolha +, -, * ou /.");
                break;
        }

        scanner.close();
    }
}