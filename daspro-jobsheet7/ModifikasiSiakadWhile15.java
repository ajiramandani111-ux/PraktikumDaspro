import java.util.Scanner;
public class ModifikasiSiakadWhile15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        double nilai, jml;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextDouble();

        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextDouble();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid, silakan masukkan nilai antara 0-100.");
                continue;
            }

            if (nilai >= 80 && nilai <= 100) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " adalah A");
                 System.out.println("Bagus, pertahankan nilai anda");       
            } else if (nilai >= 73 && nilai < 80) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " adalah B+");
            } else if (nilai >= 65 && nilai < 73) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " adalah B");
            } else if (nilai >= 60 && nilai < 65) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " adalah C+");
            } else if (nilai >= 50 && nilai < 60) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " adalah C");
            } else if (nilai >= 39 && nilai < 50) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " adalah D");
            } else {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " adalah E");
            }
            i++;
        }
       
        
    }
    
}
