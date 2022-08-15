import java.util.Scanner;

public class artikYilHsp {
    public static void main(String[] args) {

        int yil;
        boolean artikyil = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz:");
        yil = input.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0)
                    artikyil=true;
                else
                    artikyil=false;
            }
            else artikyil=true;
        }
        else artikyil=false;
        if (artikyil)
            System.out.print(yil + " Artık Yıldır.");
        else
            System.out.print(yil + " Artık Yıl Değildir.");
    }
}
