package Jobsheet9;
import java.util.Scanner;
public class ModArrayRataNilai15{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
            int JmlMhs = sc.nextInt();
        int nilaiMhs[]=new int[JmlMhs], jmlTinggi = 0, jmlRendah=0;
        double nilaiTinggi = 0, nilaiRendah=0;
        String status1 = " ",status2 = " ";
        
        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] >= 75 ){
                nilaiTinggi += nilaiMhs[i];
                status1 = "lulus";
                jmlTinggi++;
            }
            if (nilaiMhs[i] < 75){
                nilaiRendah += nilaiMhs[i];
                status2 = "tidak lulus";
                jmlRendah++;
            }
        }
        if (jmlTinggi > 0){
            nilaiTinggi = nilaiTinggi / jmlTinggi;
        }else{
            nilaiTinggi = 0;
        }
        if (nilaiRendah > 0){
            nilaiRendah = nilaiRendah/jmlRendah;
        }
        System.out.println("rata-rata nilai" +status1+" : " +nilaiTinggi);
        System.out.println("rata-rata nilai" +status2+" : " +nilaiRendah);
    }
}
