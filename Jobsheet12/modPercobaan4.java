import java.util.Scanner;
public class modPercobaan4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        daftarPengunjung("ali","budi","citra");
        daftarPengunjung("andi");
        daftarPengunjung("doni","eti","fahmi","galih");
        menu("andi", true );
        
        System.out.print("\nmasukkan nomor menu yang ingin anda pesan:");
        int pilihanMenu = sc.nextInt();
        System.out.print("masukkan banyak item yang diinginkan:");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
        System.out.println("Total harga untuk pesanan anda: Rp. " + totalHarga);
    }





    static void menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang " + namaPelanggan + "!");

        if(isMember) {
            System.out.println("Anda mendapatkan diskon 10% untuk setiap pembelian.");
        } 

        System.out.println("=== Kafe15 Menu ===");
        System.out.println("1. Kopi Hitam - Rp. 15.000");
        System.out.println("2. Cappuccino - Rp. 20.000");
        System.out.println("3. Latte - Rp. 22.000");
        System.out.println("4. Teh Tarik - Rp. 12.000");
        System.out.println("5. Roti Bakar - Rp. 10.000");
        System.out.println("6. Mie Goreng - Rp. 18.000");
        System.out.println("=====================");
        System.out.println("Pilih menu yang anda inginkan:");
    }
    public static int hitungTotalHarga(int pilihan, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihan - 1] * banyakItem;
        return hargaTotal;
    }

    static void daftarPengunjung(String...namaPengunjung){
        System.out.println("Daftar Pengunjung :");
        for(String nama : namaPengunjung){
            System.out.println("- " + nama);
        }
    }
}
