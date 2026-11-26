import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("PROGRAM FUNGSI BIASA");

        int p, l, luas;

        System.out.print("Masukkan panjang: ");
        p = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        l = sc.nextInt();

        luas = p * l;

        System.out.println("Luas persegi panjang adalah " + luas);

        sc.close();
    }

}