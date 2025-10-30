import java.util.Scanner;
public class Tugas1{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        for(int i = 1; i <= 3;i++){
            for(int j = 1; j <= 3;j++){
                if (i == 2 && j == 2){
                    System.out.print("  ");
                    continue;
                    }
                System.out.print(" 3");
            }
            System.out.println();
        }
        
        System.out.print("tinggi dan lebar yang diinginkan (3-9): ");
        int N = sc.nextInt();
        while (N >= 10 || N <= 2){
            System.out.println("Input ulang!");
            System.out.print("tinggi dan lebar yang diinginkan (0-9): ");
            N = sc.nextInt();
        }
        System.out.print("masukkan angka yang ditampilkan ");
        int P = sc.nextInt();
        
        for(int i = 1; i <= N;i++){
            for(int j = 1; j <= N;j++){
                if (i >=2 && i <= N-1 && j >= 2 && j <= N-1){
                    System.out.print("  ");
                    continue;
                    }
                System.out.print(" "+P);
            }
            System.out.println();
        }
    
    }
    }
