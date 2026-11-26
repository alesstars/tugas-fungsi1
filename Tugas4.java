import java.util.Scanner;

public class Tugas4 {

    static int luasPersegiPanjang() {
        Scanner sc = new Scanner(System.in);

        int p, l, luas;

        System.out.print("Masukkan panjang: ");
        p = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        l = sc.nextInt();

        luas = p * l;
        sc.close();

        return luas;
    }

    public static void main(String[] args) {
        System.out.println("PROGRAM FUNGSI RETURN VALUE TANPA PARAMETER");

        int L = luasPersegiPanjang();

        System.out.println("Luas persegi panjang adalah " + L);
    }
}
