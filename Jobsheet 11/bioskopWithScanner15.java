import java.util.Scanner;
public class bioskopWithScanner15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, pilihan;
        String nama, next;
        String[][]penonton = new String [4][2];
        
        //modifikasi 5(mengubah null ke ***
        for(int i= 0;i<penonton.length; i++){
            for(int j =0;j<penonton[i].length;j++){
                penonton[i][j]="***";
            }
        }
        
        //modifikasi 2 (opsi menu)
        while (true) {
            String menu= String.join("\n", "Menu 1: input data penonton","Menu 2: Tampilkan daftar penonton","Menu 3: Exit");
            System.out.println(menu);

            System.out.print("menu yang dipilih(Angka): ");
            pilihan = sc.nextInt();
            sc.nextLine();
            
            if (pilihan == 1){
                 while(true){
                     System.out.print("Masukkan nama: ");
                     nama = sc.nextLine();
                     System.out.print("Masukkan baris(1-4): ");
                     baris = sc.nextInt();
                     while(baris>4||baris<1){//modifikasi 3 (memberi batasan)
                         System.out.print("Masukkan baris(1-4): ");
                         baris = sc.nextInt();
                     }
                     System.out.print("Masukkan kolom(1-2): ");
                     kolom = sc.nextInt();
                     while(kolom>2||kolom<1){
                         System.out.print("Masukkan kolom(1-2): ");
                         baris = sc.nextInt();
                     }
                     sc.nextLine();
                     
                     //modifikasi 4 (memberi batasan)
                     if (penonton[baris-1][kolom-1] == "***") {
                         penonton[baris-1][kolom-1] = nama;
                     } else {
                         System.out.println("Kursi sudah terisi, Pilih yang lain.");
                     }
                     System.out.print("Input penonton lainnya?(y/n): ");
                     next=sc.nextLine();
                     if(next.equalsIgnoreCase("n")){
                         break;
                     }
                 }
            }
          
            if(pilihan==2){
                for(int i= 0;i<penonton.length; i++){
                     System.out.println();
                    for(int j =0;j<penonton[i].length;j++){
                        System.out.print(penonton[i][j]+"\t");
                    }
                }
                System.out.println();
            }

            if(pilihan==3){
                System.out.print("program selesai");
                break;
            }

        }
    }
}
