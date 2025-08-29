import java.util.Scanner;

public class NecessidadeDeCalagem {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Necessidade de calagem (base simples)");
        System.out.println("saturação por bases desejada (%)");
        var v2 = scanner.nextFloat();

        System.out.println("saturação por bases atual (%)");
        var v1 = scanner.nextFloat();

        System.out.println("capacidade de troca catiônica (cmolc/dm³)");
        var CTC = scanner.nextFloat();
        
        System.out.println("Dose com PRNT 80% ? (S/N)");
        var resposta = scanner.next();

        if(resposta.equalsIgnoreCase("s"))
        {
        var NC = ((v2 - v1)*CTC)/100;

         System.out.println("Resultado: ");

        System.out.printf("NC = %s t/Ha\n", NC );

        } 
        else{
             var NC = ((v2 - v1)*CTC)/0.80;

              System.out.println("Resultado: ");

            System.out.printf("NC = %s t/Ha\n", NC);

        }

    }
}
