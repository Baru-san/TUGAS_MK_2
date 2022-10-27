public class Katak {
    private int posisi;
    private int skor;

    public Katak(){
        skor = 100;
        posisi = -1;
    }

    public int getPosisi(){
        return posisi;
    }

    public void setPosisi(int posisiBaru){
        if (posisiBaru == 1){
            loncatDekat();
        }
        else if (posisiBaru == 2){
            loncatJauh();
        }
        else{
            System.out.println("input salah \n");
        }
    }

    public int getSkor(){
        return skor;
    }

    public void setSkor(int skorBaru){
        this.skor = skorBaru;
    }

    public void loncatDekat(){
        posisi += 1;
        
    }

    public void loncatJauh(){
        posisi += 2;
    }
}
