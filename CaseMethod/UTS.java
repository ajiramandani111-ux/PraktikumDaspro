package Study;

import java.util.Scanner;
public class BasicSwitchCase{
  public static void main (String[] args) {
    Scanner input = new Scanner (System.in);

    int minuman;
      String[] listMinuman = {"CocaCola", "Fanta", "Myzone"};
    
        System.out.println("List minuman yang tersedia: ");
      for (String m : listMinuman){
          System.out.println("- "+ m);
        }

    System.out.println("ingin pesan apa?(1-3): ");
    minuman = input.nextInt();

    switch (minuman) {
      case 1 :
        System.out.println("pesanan CocaCola dibuat");
        break;
      case 2 :
        System.out.println("pesanan Fanta dibuat");
        break;
      case 3 :
        System.out.println("pesanan Myzone dibuat");
        break;
      default :
        System.out.println("pesanan tidak tersedia");
        
    }
    input.close();
  }
}
