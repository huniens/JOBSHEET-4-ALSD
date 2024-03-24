import java.util.Scanner;

/**
 * MainSum
 */
public class MainSum {

    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elem = input12.nextInt();

        ClassSum sm = new ClassSum(elem);
        System.out.println("=====================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke -" + (i + 1) + " = ");
            sm.keuntungan[i] = input12.nextDouble();
        }
        System.out.println("=====================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
        System.out.println("=====================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
    }
}