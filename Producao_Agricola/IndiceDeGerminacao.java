import java.util.Scanner;

public class IndiceDeGerminacao {
    
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        
        System.out.println("Programa para Índice de Germinação");
        System.out.println("número de sementes germinadas: ");
        var n = scanner.nextFloat();
        System.out.println("número total de sementes testadas: ");
        var N = scanner.nextFloat();

        var IG = (n/N)*100;
        System.out.println("Resultado: ");
        System.out.printf("IG = %s%%\n", IG);

        scanner.close();

    }
}
