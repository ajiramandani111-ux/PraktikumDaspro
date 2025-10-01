pertanyaan percobaan 1

1.Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan 
operator relasional?
2. Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya?
3. Sistem perlu memberikan informasi apabila pengguna memasukkan nilai false, maka 
terdapat keluaran “Registrasi ditolak. Silakan lunasi UKT terlebih dahulu”. Modifikasi 
program tersebut dengan menambahkan struktur ELSE!
4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi 
Percobaan 1

jawab

1. karena variabel sudah bertipe boolean
2. output hanya menampilkan pertanyaan, tanpa pesan verifikasi/cetak KRS.
3. import java.util.Scanner;

public class IfCetakKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
        }
    }
}
4. ✅
