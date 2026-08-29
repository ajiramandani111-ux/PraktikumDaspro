import java.util.Scanner;
public class bioskop{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int i = 1, harga = 50000, tiket = 0, pelanggan = 0, totalTiket = 0;
        long  total = 0;
        
        System.out.print("Jumlah pelanggan dalam satu hari: ");
            pelanggan = sc.nextInt();

        while ( i <= pelanggan){
            
            
            System.out.print("Tiket yang dibeli pelanggan ke-" + i + " : ");
            tiket = sc.nextInt();
            
            while (tiket < 0){
                System.out.println("Masukkan angka yang valid");
                System.out.print("Tiket yang dibeli pelanggan ke-" + i + " : ");
                tiket = sc.nextInt();
            }
            totalTiket += tiket;
            if (tiket >= 0 || tiket <= 4){
                total += harga * tiket;
                if (tiket > 4){
                    total += harga * tiket - (harga * 0.1);
                    if (tiket > 10){
                    total += harga * tiket - (harga * 0.15);
                    }
                }
            }
            i++;
        }
        System.out.println("");
        System.out.println("Total pelanggan: " + pelanggan + " dengan " + totalTiket + " tiket terjual");
        System.out.print("Keuntungan: Rp." + total);
    }
}
