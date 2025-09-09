import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class HummaTech {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int Belanja;

        System.out.print("Inputkan Total Belanja Anda : ");
        Belanja = a.nextInt();

        if(Belanja >= 50000){
            System.out.println("selamat anda mendapatkan diskon 10%");
        }else if (Belanja >= 20000) {
            System.out.println("Selamat Anda Mendapatkan Diskon 5%");
        }else {
            System.out.println("Terimakasih telah berbelanja");
        }
    }
}
