import java.util.Scanner;

public class TempeaturaAgua {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        double somaTemperaturas = 0, temperatura, temperaturaMedia;
        int quantidadeTemperaturas = 12;
        int contador = 0;

        while (contador < quantidadeTemperaturas) {
            System.out.print("Digite a temperatura " + (contador+1) +" da água (entre 4ºC e 10ºC): ");
            temperatura = scanner.nextDouble();

            if (temperatura >= 4 && temperatura <= 10) {
                somaTemperaturas = somaTemperaturas + temperatura;
                contador++;
            } else {
                System.out.println("Temperatura inválida. Por favor, insira uma temperatura entre 4ºC e 10ºC.");
            }
        }
        temperaturaMedia = somaTemperaturas / quantidadeTemperaturas;
        System.out.printf("A média das temperaturas aferidas no dia é: %.1fºC%n", temperaturaMedia);






        scanner.close();
    }
}
