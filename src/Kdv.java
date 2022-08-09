import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {
        double tutar, oran, kdv1=0.18,kdv2=0.8;
        Scanner giris= new Scanner(System.in);
        System.out.print("Kdv'si hesaplanacak tutar: ");
        tutar=giris.nextDouble();

        boolean sonuc=tutar<1000;
        double son = sonuc ? ((tutar*0.18)+tutar) : ((tutar*0.8)+tutar);
        oran = sonuc ? kdv1 : kdv2;
        System.out.println("KDV: " + oran);
        System.out.println("KDV'li Fiyat: " + son);
    }
}

