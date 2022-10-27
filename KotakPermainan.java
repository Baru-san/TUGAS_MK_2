import java.util.ArrayList;
import java.util.List;
import javax.print.event.PrintJobListener;
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

    public KotakPermainan(int j, int jk, int jm){
        this.jumKotak = j;
        this.jumlahKoin = jk;
        this.jumlahMonster = jm;
        generateAcak();
        inisialisasiKotak();
    }

    // public static void main(String[] args) {
    //     KotakPermainan kt = new KotakPermainan(5, 0, 0);
    //     //System.out.print(kt.jumKotak);
    //     // for (int element : kt.acakKoin){
    //     //     System.out.println(element);
    //     // }
    //     // System.out.println("\n");
    //     // for (int element : kt.acakMonster){
    //     //     System.out.println(element);
    //     // }

    //     kt.inisialisasiKotak();


    //     // for (Kotak element : kt.boardGame){
    //     //          System.out.println(element);
    //     // }
    // }

    private void generateAcak(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<jumKotak; i++) //rentang angka yang akan di acak
            list.add(i);
        Collections.shuffle(list);

        acakKoin = new int[jumlahKoin];
        for(int i=0; i<acakKoin.length; i++){ // jumlah ngka yang akan diambil
            acakKoin[i] = list.get(i);
            //System.out.println(acakKoin[i]);
        }
        
        
        Collections.shuffle(list);
        acakMonster = new int[jumlahMonster];
        for(int i=0; i<acakMonster.length; i++){ // jumlah ngka yang akan diambil

            acakMonster[i] = list.get(i);
            //System.out.println(acakMonster[i]);
        }

        Arrays.sort(acakKoin);
        Arrays.sort(acakMonster);

        // for (int num : acakKoin){
        //     System.out.print(num + " ");
        // }

        // System.out.println("\n");

        // for (int num : acakMonster){
        //     System.out.print(num + " ");
        // }
    }

    private void inisialisasiKotak(){
        boardGame = new Kotak[jumKotak];

        for (int i = 0 ; i < boardGame.length ; i++){
            Koin teskoin = new Koin(i);
            Monster tesmonster = new Monster(i,"jojo");
            boardGame[i] = new Kotak();
            boardGame[i].addKoin(teskoin);
            boardGame[i].addMonster(tesmonster);
            

            // System.out.print("iterasi ke - " + i + " \n");
            
            // System.out.println("apakah ada koin " + boardGame[i].isThereKoin());
            // System.out.println("apakah ada monster " + boardGame[i].isThereMonster());
    }
    
    }

    // public int contain(int posisi){
    //     if (boardGame[posisi].equals(acakKoin[posisi]) && boardGame[posisi].equals(acakKoin[posisi])){
    //         boardGame.isThereKoin() = true;
    //         boardGame.isThereMonster = true;
    //     }
    //     else if (boardGame[posisi].equals(acakKoin[posisi])){
    //         boardGame.isThereKoin() = true;
    //         boardGame.isThereMonster() = false;
    //     }
    //     else if (boardGame[posisi].equals(acakMonster[posisi])){
    //         boardGame.isThereKoin() = false;
    //         boardGame.isThereMonster() = true;
    //     }
    //     else {
    //         boardGame.isThereKoin() = false;
    //         boardGame.isThereMonster() = false;
    //     }
    // }
}
