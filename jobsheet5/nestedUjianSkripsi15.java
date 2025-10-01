import java.util.Scanner;
public class nestedUjianSkripsi15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String pesan;
         System.out.print("Apakah mahasiswa sudah bebas kompen(Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print(: "Masukkan jumlah log bimbingan Pembimbing 1: ");
         int bimbinganP1 sc.nextInt();
        System.out.print(s: "Masukkan jumlah log bimbingan Pembimbing 2: ");
         int bimbinganP2= sc.nextInt();
      
         if (bebasKompen.equalsIgnoreCase (anotherString: "Ya")) {
          if (bimbinganP1 && bimbinganP2 >= 4) {
         pesan "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
           else if (bimbinganP1 && bimbinganP24) (
         pesan "Gagall Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
           else if (bimbinganP1) (
         pesan "Gagall Log binbingan P1 belum mencapai 8 kali";
    } else (
         pesan "Gagal! Log bimbingan P2 belum mencapai 4 kali";
    } else {
         pesan "Gagall Mahasiswa masih memiliki tanggungan kompen";
         System.out.println(pesan);
        
        int jmlAnak = sc.nextInt();
        System.out.print("Masukin tunjangan anak per anak : ");
        int tnjAnak = sc.nextInt();

        double totalTunjangan = jmlAnak * tnjAnak;
        double potongPensiun = gaji*0.05;
        double gajii = gaji + totalTunjangan - potongPensiun;

        System.out.println("Gaji bersih bu jesi = " + gajii);
    }
          }
