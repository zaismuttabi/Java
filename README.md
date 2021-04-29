// mengimpor Scanner ke program
import java.util.Scanner;

public class UjianTengahSemester{

    public static void main(String[] args) {
        // deklarasi variabel
        String nilaiHuruf;
        double nilaiAngka;
        int jumlahSoal, jumlahBenar;

        // membuat scanner baru
        Scanner scanner = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("Nilai Mahasiswa");
        System.out.print("Jumlah Soal : ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        jumlahSoal = scanner.nextInt();
        // Tampilkan outpu lagi
        System.out.print("Jumlah Benar : ");
        // menggunakan scanner lagi
        jumlahBenar = scanner.nextInt();

        System.out.print("Nilai Angka : ");
        nilaiAngka = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nilai Huruf : ");
        nilaiHuruf = scanner.nextLine();


        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("-----------------------------------");
        System.out.println("Jumlah Soal     : " + jumlahSoal);
        System.out.println("Jumlah Benar    : " + jumlahBenar);
        System.out.println("Nilai Angka     : " + nilaiAngka);
        System.out.println("Nilai Huruf     : " + nilaiHuruf);
    }

}
