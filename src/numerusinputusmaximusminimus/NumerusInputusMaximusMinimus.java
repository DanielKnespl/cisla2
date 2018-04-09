package numerusinputusmaximusminimus;

import java.util.Scanner;

public class NumerusInputusMaximusMinimus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "CP1250");
        double a;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double prm = 0;
        int x = 1;
        while (true) {
            System.out.print("vlož " + x + ". číslo ");
            a = sc.nextDouble();
            if (a == 0) {
                break;
            }
            x = x + 1;
            prm = prm + a;
            if (a < min) {
                min = a;
            }
            if (a > max) {
                max = a;
            }
            System.out.println("nejmenší zatim: " + min + ", největší zatim: " + max);
        }
        System.out.println("nejmenší: " + min + ", největší: " + max + ", průměr: " + (prm / (x - 1)));
    }
}
