import java.util.Scanner;
public class tes {
    public static void main(String[] args) {
        Scanner rawr = new Scanner(System.in);
        
        System.out.println("===INPUT DATA MAHASISWA===");

        System.out.print("Masukkan Nama: ");
        String nama = rawr.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = rawr.nextLine();

        rawr.close();
    }
  }
