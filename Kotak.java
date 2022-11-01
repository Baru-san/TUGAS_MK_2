/**
 * Program Kotak akan menampung koin dan monster
 * 
 * @author Muhammad Akbarul Ihsan
 * @version 11.0.15.1
 */
public class Kotak {
    private Koin coin;
    private Monster monsta;
    
    /**
     * method untuk menciptakan objek Kotak
     * @return nothing
     * 
     */
    public Kotak(){
        coin = new Koin();
        monsta = new Monster();
    }

    /**
     * method untuk memberikan nilai baru ke coin
     * @param c parameter pertama pada method addKoin
     * @return nothing
     * 
     */
    public void addKoin(Koin c){
        this.coin = c;
    }
    
    /**
     * method untuk memberikan nilai baru ke monster
     * @param c parameter pertama pada method addMonster
     * @return nothing
     * 
     */
    public void addMonster(Monster m){
        this.monsta = m;
    }

    /**
     * method untuk menampilkan coin
     * @return coin
     * 
     */
    public Koin getKoin(){

        return coin;
    }

    /**
     * method untuk menampilkan monster
     * @return monsta
     * 
     */
    public Monster getMonster(){
        return monsta;
    }

    /**
     * method untuk mengecek keberadaan koin
     * @return boolean
     * 
     */
    public boolean isThereKoin(){
        if(coin.getNilai() == 1){
        return true;
        }
        else 
        return false;
    }

    /**
     * method untuk mengecek keberadaan monster
     * @return boolean
     * 
     */
    public boolean isThereMonster(){
        if(monsta.getNilai() == 1){
            return true;
            }
            else 
            return false;
    }
}