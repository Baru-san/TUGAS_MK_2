import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        
        int skor = 0;
        Scanner posisi = new Scanner(System.in);

        KotakPermainan KoPer = new KotakPermainan(10,5,3);
        Katak katak = new Katak();

        System.out.println("1 untuk lompat dekat");
        System.out.println("2 untuk lompat jauh");
        
        int p1 = posisi.nextInt();
        katak.setPosisi(p1);
        int p2 = katak.getPosisi();
        skor = KoPer.contain(p2);
        
         //System.out.println("skor terakhir anda = " + skor);
    }
}
