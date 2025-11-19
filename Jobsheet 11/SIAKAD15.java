import java.util.Scanner;
public class SIAKAD15 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int jmlMhs, jmlMatkul;
        System.out.print("Banyak Mahasiswa; ");
        jmlMhs = sc.nextInt();
        System.out.print("Banyak Mata Kuliah; ");
        jmlMatkul = sc.nextInt();
        int[][] nilai = new int[jmlMhs][jmlMatkul];
        
        for(int i = 0;i<nilai.length;i++){
            System.out.println("Input nilai mahasiswa ke-"+(i+1));
            double totalPerSiswa=0; 
            
            for(int j = 0;j<nilai[i].length;j++){
                System.out.print("Nilai Mata Kuliah"+ (j+1)+": ");
                nilai[i][j]=sc.nextInt();
                totalPerSiswa+=nilai[i][j];
            }
             System.out.println("Niai Rata-rata: "+ totalPerSiswa/jmlMatkul);
        }
         System.out.println("\n=========================");
         System.out.println("Rata-rata Nilai Setiap Mata Kuliah");
        
        for(int j = 0;j<jmlMatkul;j++){
            double totalPerMatkul = 0;
            for(int i = 0;i<jmlMhs;i++){
                totalPerMatkul+=nilai[i][j];
            }
            System.out.println("Mata Kuliah "+ (j + 1) +"; "+ totalPerMatkul/jmlMhs);
        }


    }
}
