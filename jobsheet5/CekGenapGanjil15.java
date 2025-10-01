import java.util.Scanner;

public class CekGenapGanjil15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        // percabangan IF-ELSE sesuai flowchart
        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " adalah Genap");
        } else {
            System.out.println("Angka " + angka + " adalah Ganjil");
        }

        sc.close();
    }
}
