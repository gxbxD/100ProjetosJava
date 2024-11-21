import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer após nextDouble

        System.out.println("Digite a escala: (1- C°,2- F°,3- K°): ");
        Integer escala1 = scanner.nextInt();

        System.out.println("Digite para qual escala deseja converter (1- C°,2- F°,3- K°): ");
        Integer escala2 = scanner.nextInt();

        double conversao;

        switch (escala1) {
            case 1: 
                if (escala2.equals(1)) {
                    System.out.println("Erro: Não é possível converter para a mesma escala.");
                } else if (escala2.equals(2)) {
                    conversao = temperatura * 9 / 5 + 32;
                    System.out.println(temperatura + " C° = " + conversao + " F°");
                } else if (escala2.equals(3)) {
                    conversao = temperatura + 273.15;
                    System.out.println(temperatura + " C° = " + conversao + " K°");
                }
                break;
            case 2:
                if (escala2.equals(1)) {
                    conversao = (temperatura - 32) * 5 / 9; // Corrigido para adicionar parênteses
                    System.out.println(temperatura + " F° = " + conversao + " C°");
                } else if (escala2.equals(2)) {
                    System.out.println("Erro: Não é possível converter para a mesma escala.");
                } else if (escala2.equals(3)) {
                    conversao = (temperatura - 32) * 5 / 9 + 273.15; // Corrigido para adicionar parênteses
                    System.out.println(temperatura + " F° = " + conversao + " K°");                    
                }
                break;
            case 3:
                if (escala2.equals(1)) {
                    conversao = temperatura - 273.15;
                    System.out.println(temperatura + " K° = " + conversao + " C°");
                } else if (escala2.equals(2)) {
                    conversao = (temperatura - 273.15) * 9 / 5 + 32; // Corrigido para adicionar parênteses
                    System.out.println(temperatura + " K° = " + conversao + " F°");
                } else if (escala2.equals(3)) {
                    System.out.println("Erro: Não é possível converter para a mesma escala.");
                }
                break;
            default:
                System.out.println("Erro: escolha uma escala válida.");
                break;
        }
        scanner.close();
    }
}
