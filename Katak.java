/**
 * Program Katak menciptakan sebuah objek dengan variabel skor dan posisi
 * akan digunakan untuk berpindah antar kotak
 * 
 * @author Muhammad Akbarul Ihsan
 * @version 11.0.15.1
 */
public class Katak {
    private int posisi;
    private int skor;

    /**
     * method untuk menciptakan objek katak
     * dengan variabel yang sudah ditentukan
     * @return nothing
     * 
     */
    public Katak(){
        skor = 100;
        posisi = -1;
    }

    /**
     * method untuk menampilkan posisi
     * @return posisi
     * 
     */
    public int getPosisi(){
        return posisi;
    }

    /**
     * method untuk memberikan nilai baru ke variabel posisi
     * @param posisiBaru parameter pertama pada method setPosisi
     * @param j parameter kedua pada method setPosisi
     * @return nothing
     * 
     */
    public void setPosisi(int posisiBaru, int j){
        int batas = j;
        if (posisiBaru == 1){
            loncatDekat(batas);
        }
        else if (posisiBaru == 2){
            loncatJauh(batas);
        }
        else{
            System.out.println("input salah \n");
        }
        
    }

    /**
     * method untuk menampilkan skor
     * @return skor
     * 
     */
    public int getSkor(){
        return skor;
    }

    /**
     * method untuk memberikan nilai baru ke variabel skor
     * @param skorBaru parameter pertama pada method setPosisi
     * @return nothing
     * 
     */
    public void setSkor(int skorBaru){
        this.skor += skorBaru;

    }

    /**
     * method untuk memberikan nilai melakukan penambahan
     * pada variabel posisi
     * @param batas parameter pertama pada method setPosisi
     * @return nothing
     * 
     */
    public void loncatDekat(int batas){
        if (posisi < (batas-1)){
        posisi += 1;
        System.out.println("posisi anda saat ini " + (posisi+1));
        }

        else {
        posisi += 1;
            System.out.println("Katak telah sampai di penghujung kotak");
        }
    }

    /**
     * method untuk memberikan nilai melakukan penambahan
     * pada variabel posisi
     * @param batas parameter pertama pada method setPosisi
     * @return nothing
     * 
     */
    public void loncatJauh(int batas){
        if(posisi < (batas-1)){
            posisi += 2;
            System.out.println("posisi anda saat ini " + (posisi+1));
        }

        else {
            posisi += 2;
            System.out.println("Katak telah sampai di penghujung kotak");
        }
    }


}
