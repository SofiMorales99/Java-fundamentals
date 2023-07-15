package TeoremaPitagoras;
import java.util.Scanner;
public class Pitagoras {

    public static void calcularHipotenusa(int catetoA, int catetoB) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("TEOREMA PITAGORAS");
            System.out.println("valor cateto 1: ");
            double cateto1 = scanner.nextDouble();

            System.out.println("valor cateto 2: ");
            double cateto2 = scanner.nextDouble();

            double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

            System.out.println("la hipotenusa es:" + hipotenusa);
        }
    
    
    }

    
    
}
