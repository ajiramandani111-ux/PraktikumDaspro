import java.util.Scanner;
public class Tugas {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int survei[][] = new int[3][6];
        String pert[] = {"pert1", "pert2", "pert3", "pert4", "pert5", "pert6"};

        double poin=0;
        
        System.out.println("masukkan poin 1-5");
        for(int i = 0;i < survei.length; i++){
            
            System.out.println("responden ke-"+(i+1));
            for(int j =0;j<survei[i].length;j++){
            System.out.print (pert[j]+": ");
            survei[i][j] = sc.nextInt();
                while(survei[i][j] < 1 || survei[i][j] > 5){
                    System.out.println ("Masukkan poin yang sesuai ");
                    System.out.print (pert[j]+": ");
                    survei[i][j] = sc.nextInt();
                }
                poin += survei[i][j];
            }
            System.out.println();
        }
        for (int k = 0; k < survei.length; k++) {
            double totalResponden = 0; 
            System.out.print("responden ke-" + (k+1) + " : ");
            for (int l = 0; l < survei[k].length; l++) {
                System.out.print(" " + survei[k][l]);
                totalResponden += survei[k][l];
            }
            double rataResp = totalResponden / survei[k].length;
                System.out.println();
            System.out.println("rata-rata R-" + (k+1) + " : " + rataResp + "\n");
        }
        System.out.println("========");
        for (int k = 0; k < survei[0].length; k++) {
            double totalPert = 0;
            
            for (int l = 0; l < survei.length; l++) {
                totalPert += survei[l][k];
            }
            double rataPert = totalPert / survei.length;
                System.out.println();
            System.out.println("rata-rata Pertanyaan ke-" + (k+1) + " : " + rataPert);
        }
        System.out.println("========");
        double rata = poin/(survei.length*survei[0].length);
        System.out.println("rata-rata keseluruhan: "+rata);
        
    }
}
