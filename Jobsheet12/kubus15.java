public class kubus15 {
    static int kubus15(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }
    
    static int KUBUS15(int sisi) {
        int permukaan = 6 * (sisi * sisi);
        return permukaan;
    }

    public static void main(String[] args) {
        System.out.println(kubus15(5));
        System.out.println(KUBUS15(5));
    }
}
