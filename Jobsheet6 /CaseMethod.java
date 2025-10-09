package Jobsheet6 ;
import java.util.Scanner;
public class CaseMethod {
    public static void main(String[] args) {
        Scanner rawr = new Scanner(System.in);
        double UTS1, UAS1, TUGAS1, UTS2, UAS2, TUGAS2;
        double nilaiAkhir1, nilaiAkhir2, NilaiAkhir;
        String grade = "-", status = "-";
        
        System.out.println("===INPUT DATA MAHASISWA===");

        System.out.print("Masukkan Nama: ");
        String nama = rawr.nextLine();
        while (!nama.matches("[a-zA-Z ]+")) {
            System.out.println("namamu pakai angka? yang bener");
            System.out.print("Masukkan Nama: ");
            nama = rawr.nextLine();
        }

        System.out.print("Masukkan NIM: ");
        String nim = rawr.nextLine();
        while (!nim.matches("\\d{8,9}+")) {
            System.out.println("NIM hanya 8-9 karakter, jangan nego");
            System.out.print("Masukkan NIM: ");
            nim = rawr.nextLine();
        }

        System.out.println("");
        System.out.println("---Mata Kuliah 1: Algoritma dan Pemrograman---");

        System.out.print("Masukkan Nilai UTS: ");
        UTS1 = rawr.nextDouble();
        while (UTS1 < 1 || UTS1 > 100 ){
            System.out.println("input nilai yang masuk akal woy");
            System.out.print("Masukkan Nilai UTS: ");
        UTS1 = rawr.nextDouble();

        }

        System.out.print("Masukkan Nilai UAS: ");
        UAS1 = rawr.nextDouble();
         while (UAS1 < 1 || UAS1 > 100 ){
            System.out.println("input nilai yang masuk akal woy");
            System.out.print("Masukkan Nilai UAS: ");
        UAS1 = rawr.nextDouble();

        }


        System.out.print("Masukkan Nilai Tugas: ");
        TUGAS1 = rawr.nextDouble();
         while (TUGAS1 < 1 || TUGAS1 > 100 ){
            System.out.println("input nilai yang masuk akal woy");
            System.out.print("Masukkan Nilai Tugas: ");
        TUGAS1 = rawr.nextDouble();

        }


        System.out.println("");
        System.out.println("---Mata Kuliah 2: Struktur Data---");

        System.out.print("Masukkan Nilai UTS: ");
        UTS2 = rawr.nextDouble();
         while (UTS2 < 1 || UTS2 > 100 ){
            System.out.println("input nilai yang masuk akal woy");
            System.out.print("Masukkan Nilai UTS: ");
        UTS2 = rawr.nextDouble();

        }


        System.out.print("Masukkan Nilai UAS: ");
        UAS2 = rawr.nextDouble();
         while (UAS2 < 1 || UAS2 > 100 ){
            System.out.println("input nilai yang masuk akal woy");
            System.out.print("Masukkan Nilai UAS: ");
        UAS2 = rawr.nextDouble();

        }


        System.out.print("Masukkan Nilai Tugas: ");
        TUGAS2 = rawr.nextDouble();
         while (TUGAS2 < 1 || TUGAS2 > 100 ){
            System.out.println("input nilai yang masuk akal woy");
            System.out.print("Masukkan Nilai TUGAS: ");
        TUGAS2 = rawr.nextDouble();

        }

        System.out.println("");

        nilaiAkhir1 = (0.3 * UTS1) + (0.4 * UAS1) + (0.3 * TUGAS1);
        nilaiAkhir2 = (0.3 * UTS2) + (0.4 * UAS2) + (0.3 * TUGAS2);
        NilaiAkhir = (nilaiAkhir1 + nilaiAkhir2) / 2;

        if (NilaiAkhir >= 80 && NilaiAkhir <= 100) {
            grade = "A";
        } else {
            if (NilaiAkhir >= 73 && NilaiAkhir <= 79) {
               grade = "B+";
            } else {
               if (NilaiAkhir >= 65 && NilaiAkhir <= 72) {
                   grade = "B";
               } else {
                   if (NilaiAkhir >= 60 && NilaiAkhir <= 64) {
                      grade = "C+";
                   } else {
                      if (NilaiAkhir >= 50 && NilaiAkhir <= 59) {
                       grade = "C";
                      } else {
                         if (NilaiAkhir >= 39 && NilaiAkhir <= 49) {
                            grade = "D";
                         } else if (NilaiAkhir < 39 && NilaiAkhir >= 0) {
                                   grade = "E";
                               } else {
                                   grade = "-";
                               }
                         }
                     }
                 }
             }
         }
        if (NilaiAkhir >= 70) {
            status = "LULUS";
        } else {
            status = "TIDAK LULUS";
        }

        System.out.println("");

        System.out.println("===HASIL PENILAIAN AKADEMIK===");

        System.out.println("Nama Yang Terdata: " + nama);
        System.out.println("NIM Yang Terdata: " + nim);
        System.out.println("");

        System.out.println("Mata Kuliah\t\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus" );
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Algoritma dan Pemrograman\t" + UTS1 + "\t" + UAS1 + "\t" + TUGAS1 + "\t" + nilaiAkhir1 + "\t\t" + grade  + "\t\t" + status);
        System.out.print("Struktur Data\t\t\t" + UTS2 + "\t" + UAS2 + "\t" + TUGAS2 + "\t" + nilaiAkhir2 + "\t\t" + grade  + "\t\t" + status);
        System.out.println("");

        System.out.println("Rata-rata Nilai Akhir: " + NilaiAkhir);
        System.out.println("Status Semester: " + status);
            

        rawr.close();
    }
  }
