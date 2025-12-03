import java.util.Scanner;

public class ModPercobaan3{
    static double diskon = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Nama: ");
        String nama = sc.nextLine();

        System.out.print("Apakah anda member (true/false)?: ");
        boolean member = sc.nextBoolean();
        
        sc.nextLine();

        System.out.print("Masukkan kode promo: ");
        String promo = sc.nextLine();

        menu(nama, member, promo);

        int totalSemua = 0;

        while (true) {
            System.out.print("\nMasukkan nomor menu: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan banyak item: ");
            int banyakItem = sc.nextInt();
            sc.nextLine();
            
            totalSemua += hitungTotalHarga(pilihanMenu, banyakItem);

            System.out.print("ada tambahan? (y/n): ");
            String nambah = sc.nextLine();

            if (nambah.equalsIgnoreCase("n")) {
                break;
            }
        }
        double totalSetelahDiskon = totalSemua - (totalSemua * diskon);

        System.out.println("\nTotal akhir setelah diskon: Rp. " + (int) totalSetelahDiskon);
    }
    static void menu(String namaPelanggan, boolean isMember, String kodePromo) {

        System.out.println("\nSelamat datang " + namaPelanggan + "!");

        if (kodePromo.equalsIgnoreCase("diskon50"))
            diskon += 0.5;
        else if (kodePromo.equalsIgnoreCase("diskon10"))
            diskon += 0.1;

        if (isMember)
            diskon += 0.1;

        System.out.println("=== Kafe15 Menu ===");
        System.out.println("1. Kopi Hitam - Rp. 15000");
        System.out.println("2. Cappuccino - Rp. 20000");
        System.out.println("3. Latte - Rp. 22000");
        System.out.println("4. Teh Tarik - Rp. 12000");
        System.out.println("5. Roti Bakar - Rp. 10000");
        System.out.println("6. Mie Goreng - Rp. 18000");
        System.out.println("=====================");
    }
    
    public static int hitungTotalHarga(int pilihan, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int total = hargaItems[pilihan - 1] * banyakItem;
        return total;
    }
}
