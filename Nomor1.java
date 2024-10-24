import java.util.scanner;

public class Nomor1{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan total penjualan salesman: ");
        
        double totalPenjualan = scanner.nextDouble();
        double komisi;
        
        if (totalPenjualan == 500000) {
            komisi = totalPenjualan * 0.10;
        } else {
            double komisiPertama = 500000 * 0.10;
            double komisiKedua = (totalPenjualan - 500000) * 0.15;
            komisi = komisiPertama + komisiKedua;
        }
        
        System.out.println("Komisi yang didapatkan = " + komisi);
        
        scanner.close();

    }
}
