/**
 * Program MainLompatKatak ini adalah sebuah game sederhana yang
 * memanfaatkan sifat implementation pada java
 * 
 * @author Muhammad Akbarul Ihsan
 * @version 11.0.15.1
 * {@link https://drive.google.com/file/d/1nmvUS9newWueE23rBwrFhSbxQEfDNmAs/view?usp=share_link}
 */

import java.util.Scanner;
public class MainLompatKatak {
    private boolean play;
    private String kalimat;

    /**
     * The main method that reads input, calls the function 
     * for each question's query, and output the results.
     * @param args Unused.
     * @return Nothing.
     */
    public static void main(String[] args){
        String kalimat;
        boolean condition = true;
        String nama;
        int skortemp = 0;
        int j = 500;
        int jk = 150;
        int jm = 100;

        Menu menu = new Menu();


        do{
            menu.menu2();

            Scanner posisi = new Scanner(System.in);
            Scanner ulang = new Scanner(System.in);
            Scanner namaIn = new Scanner(System.in);
            KotakPermainan KoPer = new KotakPermainan(j,jk,jm);
            Katak katak = new Katak();

            System.out.println("masukkan nama");
            System.out.print("nama :");
            nama = namaIn.nextLine();
            if (nama.isEmpty()){
                nama = "Null";
            }

            Pemain pemain = new Pemain(nama);
            System.out.println("anda memiliki 2 pilihan untuk bergerak");
            
                
            while (katak.getPosisi() < j){
                menu.menu1();

                System.out.print("langkah anda : ");
                int p1 = posisi.nextInt();
                System.out.println("");

                katak.setPosisi(p1,j);
                int p2 = katak.getPosisi();
                if ( p2 >= j){
                    break;
                }

                skortemp = KoPer.contain(p2);
                System.out.println(skortemp + katak.getSkor());


            }
            katak.setSkor(skortemp);

            System.out.println("\nPermainan telah Berakhir");
            System.out.println("Nama : " + pemain.getNama());
            System.out.println("skor terakhir anda = " + katak.getSkor() + "\n");


            System.out.println("apakah anda ingin bermain lagi (y/n)");    
            MainLompatKatak game = new MainLompatKatak(true);
            kalimat = ulang.nextLine();
            if (kalimat.equalsIgnoreCase("y")) {
                game.setMainkan("ya");
            } else {
                game.setMainkan("tidak");
            }
            if (game.getMainkan() == true) {
                condition = true;
            } else {
                condition = false;
                posisi.close();
                ulang.close();
                namaIn.close();
            }
    } while(condition);
    System.out.println("\n--------------------KELUAR DARI GAME--------------------");
    System.out.println("                 Terima kasih telah bermain");
    System.out.println("--------------------------------------------------------");
 
    }

    public MainLompatKatak(boolean play){
        this.play = play;
    }

    public boolean getMainkan(){
        if (kalimat.equalsIgnoreCase("ya")) {
            this.play = true;
        }
        else {
            this.play = false;
        }
        return this.play;
    }

    public void setMainkan(String k){
        this.kalimat = k;
    }

    
}
