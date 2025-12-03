import java.util.Scanner;
public class NilaiMahasiswa15 {
    static Scanner sc = new Scanner(System.in);
    
    static void isianArray(int... nilai){
        for(int i = 0; i<nilai.length;i++){
            System.out.println("Mahasiswa ke: "+(i+1));
            int total=0;
            for(int j = 0; j < 1;j++){
                System.out.print("nilai "+(j+1)+": ");
                int nilaiMhs = sc.nextInt();
                total+=nilaiMhs;
            }
            nilai[i]+=total;
            System.out.println();
        }
    }
    
    static void tampilNilai(int... nilai){
        for(int i = 0; i<nilai.length;i++){
            System.out.println("Mahasiswa ke: "+(i+1));
            for(int j = 0; j < 1;j++){
                System.out.println("nilai "+(j+1)+": "+(nilai[i]));
            }
        }
    }
    
    static int hitTot(int[] nilai){
        int total=0;
        for(int i = 0;i<nilai.length;i++){
            total+=nilai[i];
        }
        return total;
    }
    public static void main (String []args){
        
        System.out.print("Banyak mahasiswa: ");
        int banyakMhs = sc.nextInt();
        
        int[] TotalMhs = new int [banyakMhs];
        
        isianArray(TotalMhs);
        tampilNilai(TotalMhs);
        System.out.println("Total nilai: "+hitTot(TotalMhs));
    }
}
