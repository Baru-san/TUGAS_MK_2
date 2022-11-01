/**
 * Program Menu akan memberikan tampilan sederhana
 * 
 * @author Muhammad Akbarul Ihsan
 * @version 11.0.15.1
 */
public class Menu {

    /**
     * method untuk menciptakan objek Menu
     * @return nothing
     * 
     */
    public Menu(){

    }

    /**
     * method untuk menampikan tampilan pilihan
     * @return nothing
     * 
     */
    public void menu1(){
        
        System.out.println("masukkan 1 untuk lompat dekat");
        System.out.println("masukkan 2 untuk lompat jauh");
    }

    /**
     * method untuk menampikan tampilan awal
     * @return nothing
     * 
     */
    public void menu2(){
        System.out.println("\n================================ PERMAINAN KATAK LOMPAT ================================================");
        System.out.println("Terdapat 500 kotak yang harus di lewati oleh katak");
        System.out.println("terdapat 150 koin dan 100 monster yang tersebar");
        System.out.println("Koin akan memberikan tambahan skor sebesar 10");
        System.out.println("Monster akan mengurangi skor sebesar 5");
        System.out.println("Katak akan mulai dari kotak 0\n");
    }
}
