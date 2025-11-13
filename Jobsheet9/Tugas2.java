import java.util.Scanner;
public class Tugas2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("List Menu");
        String[] menu = {"batagor", "telurGulung", "Siomay", "tahu petis"};
        int[] harga = {5000, 3000, 10000, 2000};
        int[] jmlPesanan = new int[4];
        String semuaPesanan = "";
        int totalSemua = 0;
        
        for(int i =0;i<menu.length;i++){
            System.out.println(menu[i]+" = "+harga[i]);
        }
        
        System.out.println();
        
        for(int i = 0;i < jmlPesanan.length;i++){
            
            System.out.print("mau pesan "+menu[i]+" berapa?: ");
            jmlPesanan[i]=sc.nextInt();
            
            int total = harga[i]*jmlPesanan[i];
            semuaPesanan+="harga "+menu[i]+" yang harus dibayar adalah: "+total+"\n";
            totalSemua+=total;
        }
        System.out.println();
        System.out.print(semuaPesanan);
        System.out.println();
        System.out.println("Total keseluruhan yang harus dibayar: "+totalSemua);
    }
}
