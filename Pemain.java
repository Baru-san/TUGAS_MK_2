/**
 * Program Pemain akan menyimpan data pemain
 * 
 * @author Muhammad Akbarul Ihsan
 * @version 11.0.15.1
 */
public class Pemain {
    private String nama;
    private int nilai;

         /**
     * method untuk menciptakan objek Pemain
     * dengan variabel dari parameter
     * @return nothing
     * 
     */
    public Pemain(String nama){
        //construktor Pemain
        this.nama = nama;

    }

    /**
     * method untuk menampilkan nama
     * @return nama
     * 
     */
    public String getNama(){
        //mengembalikan nama
        return nama;
    }


    /**
     * method untuk memberikan nilai baru ke variabel nama
     * @param nama parameter pertama pada method setPosisi
     * @return nothing
     * 
     */
    public void setNama(String nama){
        //memberikan nilai ke nama
        this.nama = nama;
    }

    /**
     * method untuk menampilkan nilai
     * @return nilai
     * 
     */
    public int getNilai(){
        //mengembalikan nama
        return nilai;
    }

    /**
     * method untuk memberikan nilai baru ke variabel nilai
     * @param nilaibaru parameter pertama pada method setPosisi
     * @return nothing
     * 
     */
    public void setNilai(int nilaibaru){
        this.nilai = nilaibaru;
    }
}
