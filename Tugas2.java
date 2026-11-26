import java.util.Scanner;

public class Tugas2 {

    static void luasPersegiPanjang() {

        System.out.println("PROGRAM FUNGSI VOID TANPA PARAMETER");

        Scanner sc = new Scanner(System.in);

        int p, l;

        System.out.print("Masukkan panjang: ");
        p = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        l = sc.nextInt();

        int luas = p * l;
        System.out.println("Luas persegi panjang adalah " + luas);

        sc.close();

    }
    public static void main(String[] args) {
        luasPersegiPanjang();
    }
}
