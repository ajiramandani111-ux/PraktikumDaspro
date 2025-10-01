import java.util.Scanner;

public class SistemUjianOnline {
    public static void main(String[] args) {
        // Membaca input presensi dan nilai tugas
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan persentase kehadiran: ");
        double presensiKehadiran = scanner.nextDouble();

        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = scanner.nextDouble();

        // Mengecek kelayakan untuk ikut ujian
        if (presensiKehadiran < 75) {
            System.out.println("Tidak boleh ikut ujian");
        } else {
            if (nilaiTugas >= 60) {
                System.out.println("Mahasiswa bisa ikut ujian");
            } else {
                System.out.println("Tidak boleh ikut ujian karena nilai tugas kurang");
            }
        }

        // Menutup scanner untuk mencegah memory leak
        scanner.close();
    }
}
