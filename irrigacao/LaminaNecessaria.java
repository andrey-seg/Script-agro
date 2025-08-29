import java.util.Scanner;

public class LaminaNecessaria {
  
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Lâmina necessária");

        System.out.println("Importante: use frações (não %). Z em cm dá lâmina em cm (multiplique por 10 para mm).");

        System.out.println("capacidade de campo (%)");
        var CC = scanner.nextFloat();

        System.out.println("umidade atual (%)");
        var U = scanner.nextFloat();

        System.out.println("densidade do solo (g/cm³)");
        var Ds = scanner.nextFloat();

        System.out.println("profundidade da raiz (mm ou cm)");
        var Z = scanner.nextFloat();

        var Ln = (CC-U)*Ds*Z;
        
        System.out.println("Resultado: ");
        System.out.printf("Ln = %smm\n", Ln);

    }
}
