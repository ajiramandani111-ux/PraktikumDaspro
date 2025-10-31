import java.util.Scanner;
public class Tugas2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String nama, kampus, semuaNama = "",cabor = "";
        
        for(int i = 1; true;i++){
            System.out.println("Asal kampus ke-"+i+" ketik 'selesai' untuk berhenti : ");
            System.out.print("Politeknik asal: ");
                kampus = sc.nextLine();
                if (kampus.equalsIgnoreCase("selesai")) {
                System.out.println("Pendafataran diselesaikan\n");
                break; 
                }
            for (int o = 1; o <= 4 ; o++){
                
                if (o == 1){
                    cabor = "badminton";
                }else if (o == 2){
                    cabor = "tenis";
                }else if (o == 3){
                    cabor = "basket";
                }else if (o == 4){
                    cabor = "voli";
                }
                
                System.out.println("Tim atlet "+cabor+": ");
                
                for(int j = 1; j <= 5;j++){
                System.out.print("Nama atlet ke-"+j+" : ");
                nama = sc.nextLine();
                
                semuaNama += " "+kampus + "\t : " + "\t" + nama + "\t\t terdaftar cabor ke-"+ cabor +"\n";
                }
                System.out.println();
            }
            System.out.println();
        }System.out.println("\t\t===Kampus dan Mahasiswa Yang terdaftar===\n");
        System.out.println("Nama Kampus\tNama peserta\tJenis Cabor" );
        System.out.println(semuaNama);
        
        
        
        
     }
                    }
