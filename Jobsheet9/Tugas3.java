import java.util.Scanner;
public class Tugas3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        String[] menu = {"Nasi Goreng","Mie Goreng","Roti Bakar","Kentang Goreng","Teh Tarik","Cappucino","Chocolate Ice" };
        String pesanan ="", key="";
        int kasus = 0;
        
        System.out.println("Menu yang tersedia");
        for(int i = 0;i <menu.length;i++){
            System.out.println("menu ke-"+(i+1)+": "+menu[i]);
            
        }
        System.out.println();
        
        System.out.print("Ketik pesanan yang dibuat: ");
        key = sc.nextLine();
        
        System.out.println();
        for(int j=0;j<menu.length;j++){
            if(key.equalsIgnoreCase(menu[j])){
                pesanan += menu[j];
                kasus=1;
                break;
            }else{
                kasus=2;
            }
        }
        if(kasus == 1){
            System.out.println("Pesanan anda adalah: "+pesanan);
        }
        if(kasus == 2){
            System.out.println("Pesanan "+key+" tidak didalam daftar menu");
        }
    }
    }
