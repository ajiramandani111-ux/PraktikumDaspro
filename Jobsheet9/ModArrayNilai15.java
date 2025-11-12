package Jobsheet9;
import java.util.Scanner;
public class ArrayNilai15{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int [10];
        
        String status = "";
        

        for(int i = 0; i < 10; i++){
            

            System.out.print("masukkan nilai akhir ke-"+i+": ");
            nilaiAkhir[i] = sc.nextInt();
            
            
        }
        for(int i = 0; i < 10; i++){
            
             System.out.println("Nilai akhir ke-"+ i +" adalah :"+ nilaiAkhir[i]);

             
        }
         for(int i = 0; i < 10; i++){
        if (nilaiAkhir[i] >= 75){
                status =  "lulus";
                
            }else{
                status =  "tidak lulus";
            }
            System.out.println("mahasiswa ke-"+ i +" "+ status + "!");
        }
       
    }
}
