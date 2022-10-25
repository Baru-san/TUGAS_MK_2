public class Monster {
    private int nilai;
    private String nama;
    
    public Koin(){
        nilai = 0;
        nama="juminem";
    }

    public  void Koin(int nilai){
        nilai = this.nilai;
    }

    public int getNilai(){
        return nilai;
    }

    public void setNilai(int nilaibaru){
        nilai = nilaibaru;
    }
}
