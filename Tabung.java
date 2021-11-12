import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class Tabung {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, kelas;
        double phi = 3.14, jari2, tinggiTabung, luasTabung, volTabung;

        System.out.println("-------------------------------------------------");
        System.out.print("Masukkan Nama\t\t: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM\t\t: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas\t\t: ");
        kelas = sc.nextLine();
        System.out.println("-------------------------------------------------");
        System.out.print("Masukkan jari-jari alas tabung\t\t: ");
        jari2 = sc.nextInt();
        System.out.print("Masukkan tinggi tabung\t\t\t: ");
        tinggiTabung = sc.nextInt();

        luasTabung = 2 * (phi * jari2 * jari2) + (2 * phi * jari2 * jari2);
        volTabung = (phi * jari2 * jari2) * tinggiTabung;

        System.out.println("");
        System.out.println("=================================================");
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("NIM\t\t\t: " + nim);
        System.out.println("Kelas\t\t\t: " + kelas);
        System.out.println("=================================================");
        System.out.println(String.format("Luas tabung adalah %.2f", luasTabung));
        System.out.println(String.format("Volume tabung adalah %.2f", volTabung));
        System.out.println("=================================================");
    }
}