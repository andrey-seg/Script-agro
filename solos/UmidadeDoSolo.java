import java.util.Scanner;

public class UmidadeDoSolo {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Calculo de umidade do solo");

        System.out.println("Digite a massa úmida do solo");
        var Mu = scanner.nextFloat();

        System.out.println("Digite a massa seca do solo");
        var Ms = scanner.nextFloat();

        var U = ((Mu - Ms)/Ms)*100;

        System.out.println("Resultado:");
        System.out.printf("U = %s%%\n", U);

    }
}
