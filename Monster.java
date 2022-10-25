public class Monster {
    private int nilai;
    private String nama;
    
    public Monster(){
        nilai = 0;
        nama="juminem";
    }

    public  void Koin(int nilai, String nama){
        this.nilai = nilai;
        this.nama = nama;
    }

    public int getNilai(){
        return nilai;
    }

}
