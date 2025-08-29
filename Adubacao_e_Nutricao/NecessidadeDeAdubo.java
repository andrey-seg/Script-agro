import java.util.Scanner;

public class NecessidadeDeAdubo {
  public static void main(String[] args) {
      var scanner = new Scanner(System.in);

      System.out.println("Necessidade de adubo");

      System.out.println("Recomendação do nutriente (kg/ha)");
      var R = scanner.nextFloat();

      System.out.println("teor do nutriente no adubo (%)");
      var T = scanner.nextFloat();

      var Q = (R * 100)/T;

      System.out.println("Resultado: ");
      System.out.printf("Q = %sKg\n",Q);
  }  
}
