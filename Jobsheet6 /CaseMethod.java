import java.util.Scanner;
public class tes {
    public static void main(String[] args) {
        Scanner rawr = new Scanner(System.in);
        double UTS1, UAS1, TUGAS1, UTS2, UAS2, TUGAS2;
        double nilaiAkhir1, nilaiAkhir2, NilaiAkhir;
        String grade = "-", status = "-";
        
        System.out.println("===INPUT DATA MAHASISWA===");

        System.out.print("Masukkan Nama: ");
        String nama = rawr.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = rawr.nextLine();

        System.out.println("");
        System.out.println("---Mata Kuliah 1: Algoritma dan Pemrograman---");

        System.out.print("Masukkan Nilai UTS: ");
        UTS1 = rawr.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        UAS1 = rawr.nextDouble();

        System.out.print("Masukkan Nilai Tugas: ");
        TUGAS1 = rawr.nextDouble();

        System.out.println("");
        System.out.println("---Mata Kuliah 2: Struktur Data---");

        System.out.print("Masukkan Nilai UTS: ");
        UTS2 = rawr.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        UAS2 = rawr.nextDouble();

        System.out.print("Masukkan Nilai Tugas: ");
        TUGAS2 = rawr.nextDouble();
        System.out.println("");

        rawr.close();
    }
  }
