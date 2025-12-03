import java.util.Scanner;
public class ModPercobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan promo: ");
        String kodePromo = sc.nextLine();
        menu("andi", true, kodePromo );
    }
    static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        
        System.out.println("Selamat datang " + namaPelanggan + "!");
        System.out.println("promo yang tersedia "+"diskon50 dan "+"diskon10");
        
        
        if(kodePromo.equalsIgnoreCase("diskon50")){
            System.out.println("selamat anda mendapat diskon 50% ");
        }else if(kodePromo.equalsIgnoreCase("diskon10")){
            System.out.println("selamat anda mendapat diskon 10% ");
        }else{
            System.out.println("Kode promo invalid");
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
}
