import java.util.Scanner;

public class EficienciaDeIrrigacao {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Eficiência de irrigação");
        System.out.println("Importante: Não utilizar ponto, caso necessario útilizar virgula");

        System.out.println("volume útil de água aproveitado (L)");
        var Vu = scanner.nextFloat();

        System.out.println("volume total aplicado (L)");
        var Va = scanner.nextFloat();

        var E = (Vu/Va)*100;

        System.out.println("Resultado");
        System.out.printf("E = %s%%\n", E);
    }
}
