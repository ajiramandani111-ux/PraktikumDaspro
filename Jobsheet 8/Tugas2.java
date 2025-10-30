import java.util.Scanner;
public class Tugas2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String nama, kampus, semuaNama = "";
        int daftarKampus;
        
        System.out.println("Cabor ke-1 = badminton\nCabor ke-2 = tenis\nCabor ke-3 = basket\nCabor ke-4 = voly");
        
        
        for(int i = 1; true ;i++){
            System.out.print("Asal kampus ke-"+i+" ketik 'selesai' untuk berhenti : ");
            kampus = sc.nextLine();
            
            if (kampus.equalsIgnoreCase("selesai")) {
                System.out.println("Pendafataran diselesaikan\n");
                break;
            }
            for(int j = 1; j <= 4;j++){
                System.out.print("Nama atlet ke-"+j+" : ");
                nama = sc.nextLine();
                
                semuaNama += " "+kampus + "\t : " + "\t" + nama + "\t\t terdaftar cabor ke-"+ j +"\n";
            }
        }
        System.out.println("\t\t===Kampus dan Mahasiswa Yang terdaftar===\n");
        System.out.println("Nama Kampus\tNama peserta\tJenis Cabor" );
        System.out.println(semuaNama);
        
        
     }
    }
