import java.util.Scanner;

public class DensidadeDoSolo {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        System.out.println("Esse script realiza o cálculo de densidade do solo.");
        System.out.println("Ds = Ms / Vt");
        
        System.out.println("Digite a massa seca do solo (g):");
        var massaSeca = scanner.nextFloat();
        
        System.out.println("Digite o volume total da amostra (cm³):");
        var volumeTotal = scanner.nextFloat();
        
        var ds = (massaSeca / volumeTotal);
        
        System.out.printf("Resultado: Ds = %.2f / %.2f%n", massaSeca, volumeTotal);
        System.out.printf("Densidade do solo: Ds = %.4f g/cm³%n", ds);
        
        scanner.close();
    }
}