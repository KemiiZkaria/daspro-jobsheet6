import java.util.Scanner;

public class Pemilihan2Percobaan104 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        System.out.print("Masukkan tahun yang anda inginkan: ");
        int tahun = input04.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun " + tahun + " merupakan tahun kabisat");
            }
            else System.out.println("Tahun " + tahun + " bukan tahun kabisat");
        } else
            System.out.println("Tahun " + tahun + " bukan tahun kabisat");
    }
}
