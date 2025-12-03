import java.util.Scanner;

public class RekapPunjualanCafe15 {

    static Scanner sc = new Scanner(System.in);
    
    static void inputData(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Item ke-" + (i + 1));
            for (int j = 0; j < 7; j++) {
                System.out.print("Data penjualan ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
    
    static void tampilData(String[] items, int[][] data) {
        System.out.println("\t\t h-1\th-2\th-3\th-4\th-5\th-6\th-7\tRata-rata");
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + "\t");

            for (int j = 0; j < 7; j++) {
                System.out.print(" "+data[i][j] + "\t");
            }
            System.out.println(rataMenu(data[i]));
        }
    }
    static int Tertinggi(int[][] data){
        double tertinggi = 0;
        int indexTertinggi = 0;

        for(int i = 0;i<data.length;i++){
            double rata = rataMenu(data[i]);
            if(rata>tertinggi){
                tertinggi = rata;
                indexTertinggi = i;
            }
        }
        return indexTertinggi;
    }
    static double rataMenu(int[] dataPerItem){
        int total = 0;
        for(int i = 0; i < dataPerItem.length; i++){
            total += dataPerItem[i];
        }
        return (double) total / dataPerItem.length;
    }
    public static void main(String[] args) {
        String[] Items = {"kopi\t", "teh\t", "es kelapa muda", "roti bakar", "gorengan"};
        int[][] data = new int[5][7];

        inputData(data);
        tampilData(Items, data);
        
        int index = Tertinggi(data);
        System.out.println("Penjualan tertinggi adalah ke-"+ index + " ( " + Items[index] +" )");
        
    }
}
