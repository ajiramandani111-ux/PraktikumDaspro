import java.util.Scanner;
public class tugas {
    static Scanner sc = new Scanner(System.in);
    static int hitung(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.print("Masukkan angka ke-" + n + ": ");
            int angka = sc.nextInt();
            return angka + hitung(n - 1);
        }
    }
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();

        int total = hitung(N);
        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + total);
    }
}
