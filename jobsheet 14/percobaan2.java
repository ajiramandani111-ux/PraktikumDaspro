import java.util.Scanner;
public class percobaan2 {
    static int hitungPangkat(int x, int y){
        if (y == 0){
            return (1);
        }else{
            return( x * hitungPangkat(x, y-1));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("bilangan ysng dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("pangkat: ");
        int pangkat = sc.nextInt();
        
        System.out.print(hitungPangkat(bilangan, pangkat));
    }
}
