import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
/**
 * Program KotakPermainan akan menciptakan array
 * kotak yang akan dijelajahi katak
 * 
 * @author Muhammad Akbarul Ihsan
 * @version 11.0.15.1
 */
public class KotakPermainan {
    private Kotak[] boardGame;
    private int jumKotak;
    private int jumlahKoin;
    private int jumlahMonster;
    private int[] acakKoin;
    private int[] acakMonster;
    int skortemp = 0;  

    /**
     * method untuk menciptakan objek KotakPermainan
     * @param j parameter pertama pada method constructor
     * @param jk parameter kedua pada method constructor
     * @param jm parameter ketiga pada method constructor
     * @return nothing
     * 
     */
    public KotakPermainan(int j, int jk, int jm){
        this.jumKotak = j;
        this.jumlahKoin = jk;
        this.jumlahMonster = jm;
        generateAcak();
        inisialisasiKotak();
    }

    /**
     * method untuk mmenghasilkan angka acak
     * @return nothing
     * 
     */
    private void generateAcak(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<jumKotak; i++) //rentang angka yang akan di acak
            list.add(i);
        Collections.shuffle(list);

        acakKoin = new int[jumlahKoin];
        for(int i=0; i<acakKoin.length; i++){ // jumlah ngka yang akan diambil
            acakKoin[i] = list.get(i);
        }
              
        Collections.shuffle(list);
        acakMonster = new int[jumlahMonster];
        for(int i=0; i<acakMonster.length; i++){ // jumlah ngka yang akan diambil
            acakMonster[i] = list.get(i);
        }

        Arrays.sort(acakKoin);
        Arrays.sort(acakMonster);
    }

    /**
     * method untuk menciptakan array boardGame dan
     * memberikan nilai ke dalam nya
     * @return nothing
     * 
     */
    private void inisialisasiKotak(){
        boardGame = new Kotak[jumKotak];

        for (int i = 0 ; i < boardGame.length ; i++){
            boardGame[i] = new Kotak();
            int countk = 0;
            int countm = 0;
            while (countk < acakKoin.length){
                for ( int j = 0 ; j < acakKoin.length ; j++){
                    if (acakKoin[j] == i){
                        Koin teskoin = new Koin(1);
                        boardGame[i].addKoin(teskoin);
                        break;
                    }
                }
                countk++;
            }
            
            while (countm < acakMonster.length){
                for (int j = 0 ; j < acakMonster.length ; j++){
                    if (acakMonster[j] == i){
                        Monster tesmonster = new Monster(1,"j");
                        boardGame[i].addMonster(tesmonster);
                        break;
                        }
                }
                countm++;
            }
        }
    }

    /**
     * method untuk mengecek keberadaan koin dan monster
     * @param posisi parameter pertama pada method contain
     * @return skortemp
     * 
     */
    public int contain(int posisi){
           
        if (boardGame[posisi].isThereKoin() == true){
                skortemp += 10;
                System.out.println("anda mendapatkan koin, skor bertambah 10");
            }

        if (boardGame[posisi].isThereMonster() == true){
                skortemp -= 5;
                System.out.println("anda bertemu monster, skor berkurang 5");
            }
        
        return skortemp;
    }
}
