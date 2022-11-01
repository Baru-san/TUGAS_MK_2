/**
 * Program Monster akan meenciptakan Monster
 * jika ditemukan akan mengurangi nilai
 * 
 * @author Muhammad Akbarul Ihsan
 * @version 11.0.15.1
 */
public class Monster {
    private int nilai;
    private String nama;
    
         /**
     * method untuk menciptakan objek Monster
     * @return nothing
     * 
     */
    public Monster(){

    }

     /**
     * method untuk menciptakan objek Monster
     * dengan variabel dari parameter
     * @return nothing
     * 
     */
    public Monster(int nilai, String nama){
        this.nilai = nilai;
        this.nama = nama;
    }

    /**
     * method untuk menampilkan nilai
     * @return nilai
     * 
     */
    public int getNilai(){
        return nilai;
    }

}
