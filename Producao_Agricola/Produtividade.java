import java.util.Scanner;

public class Produtividade {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Programa para calculo de produtividade");
        System.out.println("Digite a produção total (kg):");
        var Q = scanner.nextFloat();

        System.out.println("Digite a área cultivada (ha)");
        var A = scanner.nextFloat();

        var P = Q/A;

        System.out.println("Resultado:");
        System.out.printf("%s Kg/ha\n", P);

        scanner.close();
    }



}
