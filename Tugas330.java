import java.util.Scanner;

public class Tugas330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko;

        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
        } while (jumlahToko < 1);

        int totalBarangSeluruhToko = 0;
        int maxBarang = -1;
        int tokoTerbanyak = -1;

        String ringkasan = " ";

        for (int i = 1; i <= jumlahToko; i++) {
            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan untuk toko " + i + ": ");
                jumlahPelanggan = sc.nextInt();
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                int jumlahBarang;
                do {
                    System.out.print(" jumlah barang pelanggan " + j + ": ");
                    jumlahBarang = sc.nextInt();
                } while (jumlahBarang < 0);

                totalBarangToko += jumlahBarang;
            }

            ringkasan += "Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko + "\n";

            totalBarangSeluruhToko += totalBarangToko;

            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbanyak = i;
            }
        }

        System.out.println("\nRingkasan Penjualan:");
        System.out.println(ringkasan);
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
    
}
