
import java.util.Scanner;

public class gaji {
    public static void main(String[] args) throws InterruptedException {
        
        // start
        
        System.out.println("Kalkulator Gaji");
        System.out.println("===========================================================================================");

        // input tarif per jam

        System.out.println("Masukkan nilai tarif per jam. (Angka saja)");
        int tarif = new Scanner(System.in).nextInt();

        // input jam

        System.out.println("Masukkan jumlah jam kerja. (Angka saja)");
        int jam = new Scanner(System.in).nextInt();

        // equation

        float gaji = (tarif * jam) - ((tarif * jam) * 10 / 100);

        // output

        System.out.println("Mohon tunggu hasil dari nilai yang anda masukkan.");
        Thread.sleep(5000);
        System.out.println("Gaji anda adalah Rp" + gaji + ".");
        System.out.println("===========================================================================================");
        System.out.println("Sekian, terimakasih.");
        System.out.println("Code written by @kurniawandidaw.");

    }
}
