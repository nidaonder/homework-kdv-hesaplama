import java.util.Scanner ;

public class Main {

    public static void main(String[] args) {

        double kdv , tutar , toplam;

        Scanner giris = new Scanner(System.in);

        System.out.print(" Ürünün KDV'siz tutarını giriniz: ");
        tutar = giris.nextDouble();

        kdv = tutar * 18 / 100 ;
        toplam = tutar + kdv ;

        System.out.println(" Ürününün toplam fiyatı = " + toplam);
    }
}
