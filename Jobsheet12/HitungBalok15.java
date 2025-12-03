import java.util.Scanner;
public class HitungBalok15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        int p = sc.nextInt();

        System.out.print("Masukkan lebar: ");
        int l = sc.nextInt();

        System.out.print("Masukkan tinggi: ");
        int t = sc.nextInt();

        double L = p * l;
        System.out.println("Luas persegi panjang adalah: " + L);

        double vol = p * l * t;
        System.out.println("Volume balok adalah: " + vol);

    
        System.out.println("Luas Persegi Panjang: " + hitungLuas(4, 2));
        System.out.println("Volume Balok: " + hitungVolume(5, 4, 2));

    }
    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }
    static int hitungVolume(int tinggi, int a, int b) {
        int Volume = hitungLuas(a, b) * tinggi;
        return Volume;
    }
    
                                }
