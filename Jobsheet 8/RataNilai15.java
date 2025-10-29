import java.util.Scanner;
public class RataNilai15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        for(int j = 1;j <=5; j++){
            double totalNilai = 0;
            System.out.println("Masukkan nilai mhs ke-" + j + " : ");
            
            int i = 1;
            
            while(1 <= 5){
                
            totalNilai = 0;
                for(j = 1; j <= 5; j++){
                System.out.print("Nilai ke-" + j + " : ");
                double nilaimhs = sc.nextDouble();
                totalNilai += nilaimhs;
            }
                double rataNilai=totalNilai/5;
                System.out.println("Nilai rata-rata mahasiswa: " +rataNilai);
                i++;
        }
            
        }
            
        
        
    }
}
