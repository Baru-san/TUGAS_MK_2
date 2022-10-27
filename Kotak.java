public class Kotak {
    private Koin coin;
    private Monster monsta;
    
    public Kotak(){
        coin = new Koin();
        monsta = new Monster();
    }

    public void addKoin(Koin c){
        this.coin = c;
    }
    
    public void addMonster(Monster m){
        this.monsta = m;
    }

    public Koin getKoin(){

        return coin;
    }

    public Monster getMonster(){
        return monsta;
    }

    public boolean isThereKoin(){
        if(coin.getNilai() == 1){
        return true;
        }
        else 
        return false;
    }

    public boolean isThereMonster(){
        if(monsta.getNilai() == 1){
            return true;
            }
            else 
            return false;
    }

      public String toString(){
          return coin.getNilai() + " " + monsta.getNilai() ;
      }
}