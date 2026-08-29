import java.util.Scanner;
public class SiakadFor15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        double nilai, tertinggi = 0, terendah = 100;

        for (i = 1; i <= 15; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        
        
    }
}
