import java.util.Scanner;

public class Pemilihan2Percobaan204 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        String member, metodePembayaran;
        double menu, harga, totalBayar = 0, jumlahBeli, totalAkhir = 0, potonganQris = 1000;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        menu = input04.nextInt();
        input04.nextLine();
        System.out.print("Masukkan jumlah pembelian = ");
        jumlahBeli = input04.nextInt();
        input04.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input04.nextLine();
        System.out.println("--------------------------------------");

        if (member.equals("y")) {
            double diskon = 0.1;
            System.out.println("Besar diskon = 10%");
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            }
            else if (menu == 2){
                harga = 3000;
                System.out.println(" Harga ice tea = " + harga);
            }
            else if (menu == 3){
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            }
            else{
                System.out.println("Masukkan pilhan menu dengan  benar");
                return;
            }
            totalBayar = harga * jumlahBeli - ((harga * jumlahBeli) * diskon);
            System.out.println("Total bayar setelah diskon = " + totalBayar);
        }
        else if (member.equals("n")){
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            }
            else if (menu == 2){
                harga = 3000;
                System.out.println(" Harga ice tea = " + harga);
            }
            else if (menu == 3){
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            }
            else{
                System.out.println("Masukkan pilhan menu dengan  benar");
                return;
            }
            totalBayar = harga * jumlahBeli;
            System.out.println("Total bayar = " + totalBayar);
        }
        else{
            System.out.println("Member tidak valid");
        }
        System.out.println("--------------------------------------");

        System.out.print("Masukkan metode pembayaran (QRIS/Cash) = ");
        metodePembayaran = input04.nextLine();

        if (metodePembayaran.equalsIgnoreCase("QRIS")) {
            totalAkhir = totalBayar - potonganQris;
            System.out.println("Potongan sebesar 1000 dengan jenis pembayaran QRIS");
            System.out.println("Total yang harus dibayar = " + totalAkhir );
            System.out.println("--------------------------------------");
        }
        else if (metodePembayaran.equalsIgnoreCase("cash")) {
            System.out.println("Total yang harus dibayar = " + totalBayar);
            System.out.println("--------------------------------------");
        }
        else{
            System.out.println("Jenis pembayaran invalid");
            System.out.println("--------------------------------------");
        }
    }
}
