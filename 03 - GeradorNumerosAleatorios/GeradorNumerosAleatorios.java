import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GeradorNumerosAleatorios {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem vindo ao sorteio virtual!");
        Thread.sleep(1800);
        System.out.println("Escolha o intervalo de números que deseja sortear (De 0 a 100 por exemplo): ");
        System.out.println("De: ");

        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("A: ");
        int num2 = scanner.nextInt();

        scanner.nextLine();

        int numeroSorteado = ThreadLocalRandom.current().nextInt(num1, num2 + 1);

        Thread.sleep(1800);
        System.out.println("O número sorteado é: " + numeroSorteado);


        scanner.close();
    }

}
