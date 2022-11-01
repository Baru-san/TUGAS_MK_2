/**
 * Program Koin menciptakan koin
 * akan memberikan nilai jika ditemukan
 * 
 * @author Muhammad Akbarul Ihsan
 * @version 11.0.15.1
 */
public class Koin{
    private int nilai;
    
     /**
     * method untuk menciptakan objek Koin
     * @return nothing
     * 
     */
    public Koin(){
        
    }

     /**
     * method untuk menciptakan objek koin
     * dengan variabel dari parameter
     * @param nilai parameter pertama pada method setPosisi
     * @return nothing
     * 
     */
    public Koin(int nilai){
        this.nilai = nilai;
    }

    /**
     * method untuk menampilkan nilai
     * @return nilai
     * 
     */
    public int getNilai(){
        return nilai;
    }

    /**
     * method untuk memberikan nilai baru ke variabel nilai
     * @param nilaiBaru parameter pertama pada method setNilai
     * @return nothing
     * 
     */
    public void setNilai(int nilaibaru){
        nilai = nilaibaru;
    }
}