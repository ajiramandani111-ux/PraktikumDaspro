import java.util.Scanner;

public class AksesWifi15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Sistem Akses WiFi Kampus ---");
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa): ");
        String jenisPengguna = sc.nextLine();

        if (jenisPengguna.equalsIgnoreCase("dosen")) {
            // Jika pengguna adalah dosen
            System.out.println("Akses diberikan (dosen).");
        } else {
            // Jika bukan dosen → cek apakah mahasiswa
            if (jenisPengguna.equalsIgnoreCase("mahasiswa")) {
                System.out.print("Masukkan jumlah SKS: ");
                int sks = sc.nextInt();

                if (sks >= 12) {
                    System.out.println("Akses diberikan (mahasiswa).");
                } else {
                    System.out.println("Akses ditolak (SKS kurang dari 12).");
                }
            } else {
                // Jika bukan dosen dan bukan mahasiswa
                System.out.println("Akses ditolak (pengguna tidak valid).");
            }
        }

        sc.close();
    }
}
