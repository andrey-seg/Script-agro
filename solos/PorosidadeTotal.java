import java.util.Scanner;

public class PorosidadeTotal {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Calculo de porosidade total");

        System.err.println("Digite a Densidade do solo Ds: ");
        var Ds = scanner.nextFloat();

        System.err.println("Digite a densidade das partículas: ");
        var Dp = scanner.nextFloat();

        var Pt =  (1-(Ds/Dp))*100;

        System.err.printf("Pt = %s%%\n",Pt);
        
    }
}
