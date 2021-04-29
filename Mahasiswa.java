import model.MahasiswaInterface;

public class Mahasiswa{
    public static void main(String[] args) {
        MahasiswaInterface zaisul = new MahasiswaInterface();
        MahasiswaInterface ucup = new MahasiswaInterface();
        MahasiswaInterface udin = new MahasiswaInterface();


        zaisul.setNim("191011402752");
        zaisul.setNama("Zaisul");
        zaisul.setNilai(90.5);

        ucup.setNim("82173892");
        ucup.setNama("Ucup");
        ucup.setNilai(80.4);

        udin.setNim("453524114");
        udin.setNama("Udin");
        udin.setNilai(40.8);

        System.out.println("Data Objek Mahasiswa \"Zaisul\" : ");
        System.out.println("NIM          : " +zaisul.getNim());
        System.out.println("Nama         : " +zaisul.getNama());
        System.out.println("Nilai        : " +zaisul.getNilai());
        System.out.println("Status       : " +zaisul.getStatus());

        System.out.println("=========================================");
        System.out.println("Data Objek Mahasiswa \"Ucup\" : ");
        System.out.println("NIM          : " +ucup.getNim());
        System.out.println("Nama         : " +ucup.getNama());
        System.out.println("Nilai        : " +ucup.getNilai());
        System.out.println("Status       : " +ucup.getStatus());

        System.out.println("=========================================");
        System.out.println("Data Objek Mahasiswa \"Udin\" : ");
        System.out.println("NIM          : " +udin.getNim());
        System.out.println("Nama         : " +udin.getNama());
        System.out.println("Nilai        : " +udin.getNilai());
        System.out.println("Status       : " +udin.getStatus());

    }
}
