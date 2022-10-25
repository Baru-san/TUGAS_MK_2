public class Pemain {
    private String nama;
    private int nilai;

    public Pemain(String nama){
        //construktor Pemain
        this.nama = nama;

    }

    public String getNama(){
        //mengembalikan nama
        return nama;
    }

    public void setNama(String nama){
        //memberikan nilai ke nama
        this.nama = nama;
    }

    public int getNilai(){
        //mengembalikan nama
        return nilai;
    }

    public void setNilai(int nilaibaru){
        this.nilai = nilaibaru;
    }
}
