import java.util.ArrayList;
import java.util.List;
// import javax.print.event.PrintJobListener;
import java.util.*;
import java.util.Collections;
import java.util.Arrays;

public class KotakPermainan {
    private Kotak[] boardGame;
    private int jumKotak;
    private int jumlahKoin;
    private int jumlahMonster;
    private int[] acakKoin;
    private int[] acakMonster;
    int skortemp = 0;  

    public KotakPermainan(int j, int jk, int jm){
        this.jumKotak = j;
        this.jumlahKoin = jk;
        this.jumlahMonster = jm;
        generateAcak();
        inisialisasiKotak();
    }

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
        for (int num : acakKoin){
            System.out.print(num + " ");
        }

        System.out.println("\n");
         for (int num : acakMonster){
             System.out.print(num + " ");
         }
    }

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
                        Monster tesmonster = new Monster(1,"jojo");
                        boardGame[i].addMonster(tesmonster);
                        break;
                        }
                }
                countm++;
            }

            // if (boardGame[i].isThereKoin() == true){
                
            //     System.out.println("anda mendapatkan koin, skor bertambah 10");

            // }

            // if (boardGame[i].isThereMonster() == true){

            //     System.out.println("anda bertemu monster, skor berkurang 5");

            // }

            // System.out.println("\n");
            // System.out.print("iterasi ke - " + i + " \n");
            
            // System.out.println("apakah ada koin " + boardGame[i].isThereKoin());
            // System.out.println("apakah ada monster " + boardGame[i].isThereMonster());
    
        }
    }

    public int contain(int posisi){

        //for (int i = 0 ; i < boardGame.length ; i++){
            //boardGame[i] = new Kotak();
           
            if (boardGame[posisi].isThereKoin() == true){
                skortemp += 10;
                System.out.println("anda mendapatkan koin, skor bertambah 10");
                System.out.println("skor = " + skortemp + "\n");
            }

            if (boardGame[posisi].isThereMonster() == true){
                skortemp -= 5;
                System.out.println("anda bertemu monster, skor berkurang 5");
                System.out.println("skor = " + skortemp +"\n");
            }
        //}
        return skortemp;
            // System.out.println("\n");
            // System.out.print("iterasi ke - " + i + " \n");
            
            // System.out.println("apakah ada koin " + boardGame[i].isThereKoin());
            // System.out.println("apakah ada monster " + boardGame[i].isThereMonster());
    
    
    
    }

}