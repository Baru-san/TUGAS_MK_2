import java.util.Scanner;
public class MainLompatKatak {
    private boolean play;
    private String kalimat;

    public MainLompatKatak(boolean play){
        this.play = play;
    }

    public boolean getMainkan(){
        if (kalimat.equalsIgnoreCase("ya")) {
            this.play = true;
        } else {
            this.play = false;
        }
        return this.play;
    }

    public void setMainkan(String k){
        this.kalimat = k;
    }

    public static void main(String[] args){
        String kalimat;
        boolean condition = true;
        String nama = "test";
        // Scanner j = new Scanner(System.in);
        // Scanner jk = new Scanner(System.in);
        // Scanner jm = new Scanner(System.in);
        Scanner ulang = new Scanner(System.in);

        while (condition){
        System.out.println("================================ PERMAINAN TUPAI LOMPAT ================================================");
            

        Katak katak = new Katak();
        Kotak kotak = new Kotak();
        KotakPermainan kotakpermainan = new KotakPermainan(500, 50, 50);
        Pemain pemain = new Pemain(nama);

        System.out.println(kotakpermainan);

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
        }
    }
    }
}
