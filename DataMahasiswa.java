import java.util.Scanner;

class DataMahasiswa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] nim = new String[15];
    String[] nama = new String[50];
    String[] nilai = new String[4];
    String[] grade = new String[1];
    
    int i, jumlah;

    System.out.println("Data Mahasiswa");
    System.out.print("Masukkan Jumlah Mahasiswa : ");
    jumlah = scanner.nextInt();

    nim = new String[jumlah];
    nama = new String[jumlah];
    nilai = new String[jumlah];

    for (i=0; i<jumlah; i++) {
      scanner.nextLine();
      System.out.println(" Data ke - " + (i+1) + " : ");
      System.out.print(" NIM : " ); nim[i]=scanner.nextLine();
      System.out.print(" Nama : " ); nama[i]=scanner.nextLine();
      System.out.print(" Nilai : " ); nilai[i]=scanner.nextLine();
    }

    System.out.println(" Data Mahasiswa yang Dimasukkan");
    
    i=0;
    while(i<nim.length){
        
        System.out.println();
        System.out.println("===================================");
        System.out.println(" Data ke - " + (i+1) + " : ");
        System.out.println(" NIM : " + nim[i]);
        System.out.println(" Nama : " + nama[i]);
        System.out.println(" Nilai : " + nilai[i]);

      i++;
    }
  }
}