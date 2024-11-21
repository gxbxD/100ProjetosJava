import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.forLanguageTag("pt-BR"));

        System.out.println("Calcule seu IMC");
        Thread.sleep(1800);
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double IMC = peso / (altura * altura);

        if (IMC < 18.5) {
            System.out.println(String.format("Seu IMC é: %.2f", IMC) + " Você está abaixo do peso ideal!");
        } else if (IMC >= 18.5 && IMC < 25) {
            System.out.println(String.format("Seu IMC é: %.2f", IMC) + " Você está no peso normal!");
        } else if (IMC >= 25 && IMC < 30) {
            System.out.println(String.format("Seu IMC é: %.2f", IMC) + " Você está acima do peso ideal!");
        } else if (IMC >= 30 && IMC < 40) {
            System.out.println(String.format("Seu IMC é: %.2f", IMC) + " Você está obeso(a)!");
        } else {
            System.out.println(String.format("Seu IMC é: %.2f", IMC) + " Você está com obesidade grave!");
        }
        scanner.close();
    }
}
