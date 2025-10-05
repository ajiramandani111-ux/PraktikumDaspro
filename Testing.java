import java.util.Scanner;
public class Testing{
  public static void main (String [] args){
    Scanner input = new Scanner(System.in);

    double diskon = 0.0;
    double diskonHarga = 0.0;
    double diskonPoin = 0.0;
    double harga, poin, TotalHarga, TotalDiskon, totalBayar;

    System.out.println("Masukkan harga yang anda beli: ");
    harga = input.nextDouble();

    System.out.println("Berapa poin yang anda miliki: ");
    poin = input.nextDouble();

    if (harga >= 500000){
      diskonHarga = 0.05;
      if (poin >= 70){
        diskonPoin = 0.10;
        TotalDiskon = diskonHarga + diskonPoin;
        TotalHarga = harga - (harga * TotalDiskon);
        System.out.println("harga yang harus dibayar: " + TotalHarga);
      }else{
        totalBayar = harga - (harga * diskonHarga);
        System.out.println("Harga yang harus dibayar: " + totalBayar);
      }
    }else{
      System.out.println("harga yang harus dibayar: " + harga);
    }
    input.close();
  }
}
