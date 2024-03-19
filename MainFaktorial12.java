import java.util.Scanner;

public class MainFaktorial12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = input12.nextInt();

        classFaktorial12 [] fk = new classFaktorial12[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new classFaktorial12();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = input12.nextInt();
        }
        System.out.println("=====================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktoria1BF(fk[i].nilai));
        }
        System.out.println("=====================================================");
        System.out.println("Hasil faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktoria1DC(fk[i].nilai));
        }
        System.out.println("=====================================================");
        
        input12.close(); // Menutup scanner setelah penggunaan selesai
    }
}
