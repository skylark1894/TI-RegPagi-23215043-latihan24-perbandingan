/*
 * Nama:Moh.arif prasetyo
 * Nim : 23215043
 * Prodi : Teknik Informatika
 */
package pertemuan5;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Perbandingan2Nilai {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulang;

        do {
            System.out.println("=====Program Perbandingan Nilai=====");
            System.out.print("Masukkan nilai pertama: ");
            int nilaiPertama = scanner.nextInt();

            System.out.print("Masukkan nilai kedua: ");
            int nilaiKedua = scanner.nextInt();

            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println("Hasil: " + nilaiPertama + " Sama dengan " + nilaiKedua);
            }

            System.out.print("\nUlangi Aktivitas? (Ya/Tidak): ");
            ulang = scanner.next();
        } while (ulang.equalsIgnoreCase("Ya"));

        scanner.close();
    }
}
