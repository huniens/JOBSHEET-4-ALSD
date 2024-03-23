import java.util.Scanner;

public class MainPangkat12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
    
        System.out.println("=====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = input12.nextInt();

        classPangkat12 [] png = new classPangkat12[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+": ");
            int nilai = input12.nextInt();
            System.out.print("Masukkan nilai perangkat ke-"+(i+1)+": ");
            int pangkat = input12.nextInt();
            png[i] = new classPangkat12(nilai, pangkat);
        }

        System.out.println("=====================================================");
        System.out.println("1. Hasil Pangkat dengan Brute Force");
        System.out.println("2. Hasil Pangkat dengan Divide and Conquer");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = input12.nextInt();

        switch(pilihan) {
            case 1:
                System.out.println("=====================================================");
                System.out.println("Hasil Pangkat dengan Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("=====================================================");
                System.out.println("Hasil Pangkat dengan Divide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        System.out.println("=====================================================");
    }
}