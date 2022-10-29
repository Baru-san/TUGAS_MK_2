import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        
        int skortemp = 0;
        Scanner posisi = new Scanner(System.in);
        int j = 10;
        int jk = 5;
        int jm = 5;
        int iterasi = 0;

        KotakPermainan KoPer = new KotakPermainan(j,jk,jm);
        Katak katak = new Katak();

        while (iterasi < j){
            System.out.println("1 untuk lompat dekat");
            System.out.println("2 untuk lompat jauh");
            
            int p1 = posisi.nextInt();
            katak.setPosisi(p1);
            int p2 = katak.getPosisi();
            skortemp = KoPer.contain(p2);
            //katak.setSkor(KoPer.contain(p2));
            iterasi++;
        }
        katak.setSkor(skortemp);
         System.out.println("skor terakhir anda = " + katak.getSkor() );
    }
}
