import java.util.Scanner;

public class ContadorPalavras {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Contador de palavras");
        Thread.sleep(1800);
        System.out.println("Escreva o seu texto: ");
        String texto = scanner.nextLine();
        String[] palavras = texto.split("\\s+");
        int quantidadePalavras = palavras.length;
        Thread.sleep(1800);
        System.out.println("Quantidade de palavras: " + quantidadePalavras);

        scanner.close();

    }
}