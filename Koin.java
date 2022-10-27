public class Koin{
    private int nilai;
    
    public Koin(){
        nilai = 20;
    }

    public Koin(int nilai){
        this.nilai = nilai;
    }

    public int getNilai(){
        return nilai;
    }

    public void setNilai(int nilaibaru){
        nilai = nilaibaru;
    }
}