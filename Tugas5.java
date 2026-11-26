import java.util.Scanner;

public class Tugas5 {
    static int luasPersegiPanjang(int p, int l) {
        int Luas = p* l;
        return Luas;
    }

    public static void main(String[] args) {
        System.out.println("PROGRAM FUNGSI RETURN VALUE DENGAN PARAMETER");

        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.print("Masukkan panjang: ");
        x = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        y = sc.nextInt();

        int L = luasPersegiPanjang(x, y);

        System.out.println("Luas persegi panjang adalah " + L);

        sc.close();

    }
}
