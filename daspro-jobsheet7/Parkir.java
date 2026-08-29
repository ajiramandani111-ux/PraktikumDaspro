
import java.util.Scanner;
public class Parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int jenis, durasi = 0, total = 0;

        do {
            System.out.println("Masukkan jenis kendaraan. mobil = 1, motor = 2, keluar = 0");
            System.out.print("Masukkan jenis kendaraan: ");
            jenis = sc.nextInt();
            
            if ( jenis == 0 ){
                break;
            }
            

            if (jenis == 1 || jenis == 2){
               System.out.print("Berapa lama (jam) parkir?: ");
               durasi = sc.nextInt();
            }
            
               if (durasi > 5){
                total += 12500;
               }else if(jenis == 1){
                total += durasi * 3000;
               }else if(jenis == 2){
                total += durasi * 2000;
               }
            System.out.println("Biaya Parkir adalah: " + total);
           jenis++;
            
        }while(jenis != 0);

        System.out.print("Program selesai");
    }
    
}
