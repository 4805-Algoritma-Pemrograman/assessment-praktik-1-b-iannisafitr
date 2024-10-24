import java.util.Scanner;

public class Nomor2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in)
        double totalPendapatan = 0;
        int jumlahTransaksi = 0;
        String inputLagi;

        do {
            System.out.print("Masukan kode bungalow [1/2/3]: ");
            int kodeBungalow = scanner.nextInt();
            System.out.print("Lama menginap (malam): ");
            int lamaMenginap = scanner.nextInt();

            double tarifPerMalam;
            double biayaPelayanan;
            switch (kodeBungalow) {
                case 1:
                    tarifPerMalam = 50000;
                    biayaPelayanan = 0.30;
                    break;
                case 2:
                    tarifPerMalam = 40000;
                    biayaPelayanan = 0.20;
                    break;
                case 3:
                    tarifPerMalam = 30000;
                    biayaPelayanan = 0.10;
                    break;
                default:
                    System.out.println("Kode bungalow tidak valid.");
                    continue;
            }

            double biayaMenginap = lamaMenginap * tarifPerMalam;
            double biayaLayanan = biayaMenginap * biayaPelayanan;
            double totalBiaya = biayaMenginap + biayaLayanan;

            totalPendapatan += totalBiaya;
            jumlahTransaksi++;

            System.out.print("Input lagi (Y/N)?: ");
            inputLagi = scanner.next();

        } while (inputLagi.equalsIgnoreCase("Y"));

        System.out.println("Jumlah transaksi penyewaan bungalow = " + jumlahTransaksi);
        System.out.println("Total pendapatan = " + totalPendapatan);

        scanner.close();

    }
}
