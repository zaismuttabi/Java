package model;

public class MahasiswaInterface {
    private String nim, nama;
    private double nilai;

    public  MahasiswaInterface() {
    }

    public  MahasiswaInterface(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public  MahasiswaInterface(String nim, String nama, double nilai) {
        this(nim, nama);
        this.nilai = nilai;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    public  String getNim() {
        return this.nim;
    }

    public  String getNama() {
            return nama;
    }

    public  double getNilai() {
        return this.nilai;
    }

    public String getStatus(){
        if((this.nilai >= 80) && (this.nilai <= 100)){
            return "A";
        }
        else if((this.nilai >= 70) && (this.nilai <= 80)){
            return "B";
        }
        else if((this.nilai >= 60) && (this.nilai <= 70)){
            return "C";
        }
        else if((this.nilai >= 50) && (this.nilai <= 60)){
            return "D";
        }else{
            return "E";
        }
    }
}