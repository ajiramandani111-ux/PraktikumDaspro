package jobsheet5;
import java.util.Scanner;

public class ifCetakKRS15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("---Cetak KRS Siakad---");
        
        System.out.print("Apakah ukt sudah lunas(true/false): ");
        Boolean uktlunas = sc.nextBoolean();

        String pesan = uktLunas 
            ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA"
            : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.";
        
        System.out.println("\n[Output dengan ternary]");
        System.out.println(pesan);

        }
    }
}
