public class Monster {
    private int nilai;
    private String nama;
    
    public Monster(){
        nilai = 10;
        nama="juminem";
    }

    public Monster(int nilai, String nama){
        this.nilai = nilai;
        this.nama = nama;
    }

    public int getNilai(){
        return nilai;
    }

}
