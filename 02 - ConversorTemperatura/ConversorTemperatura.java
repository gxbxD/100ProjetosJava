import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer após nextDouble

        System.out.println("Digite a escala: (C°, F°, K°): ");
        String escala1 = scanner.nextLine().trim().toUpperCase();

        System.out.println("Digite para qual escala deseja converter (C°, F°, K°): ");
        String escala2 = scanner.nextLine().trim().toUpperCase();

        double conversao;

        switch (escala1) {
            case "C°": 
                if (escala2.equals("C°")) {
                    System.out.println("Erro: Não é possível converter para a mesma escala.");
                } else if (escala2.equals("F°")) {
                    conversao = temperatura * 9 / 5 + 32;
                    System.out.println(temperatura + " C° = " + conversao + " F°");
                } else if (escala2.equals("K°")) {
                    conversao = temperatura + 273.15;
                    System.out.println(temperatura + " C° = " + conversao + " K°");
                }
                break;
            case "F°":
                if (escala2.equals("C°")) {
                    conversao = (temperatura - 32) * 5 / 9; // Corrigido para adicionar parênteses
                    System.out.println(temperatura + " F° = " + conversao + " C°");
                } else if (escala2.equals("F°")) {
                    System.out.println("Erro: Não é possível converter para a mesma escala.");
                } else if (escala2.equals("K°")) {
                    conversao = (temperatura - 32) * 5 / 9 + 273.15; // Corrigido para adicionar parênteses
                    System.out.println(temperatura + " F° = " + conversao + " K°");                    
                }
                break;
            case "K°":
                if (escala2.equals("C°")) {
                    conversao = temperatura - 273.15;
                    System.out.println(temperatura + " K° = " + conversao + " C°");
                } else if (escala2.equals("F°")) {
                    conversao = (temperatura - 273.15) * 9 / 5 + 32; // Corrigido para adicionar parênteses
                    System.out.println(temperatura + " K° = " + conversao + " F°");
                } else if (escala2.equals("K°")) {
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
