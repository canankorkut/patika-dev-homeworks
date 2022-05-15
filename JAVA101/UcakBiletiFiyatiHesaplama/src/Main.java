import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double km , normal;
        int yas,yolculukTipi;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz:");
        km = input.nextDouble();

        System.out.print("Yaşınızı giriniz:");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz(1 => Tek Yön , 2 => Gidiş Dönüş):");
        yolculukTipi = input.nextInt();


        if (!((yolculukTipi == 1) || (yolculukTipi == 2))){
            System.out.println("Hatalı Veri Girdiniz!");
            System.exit(0);
        }

        normal = km * 0.1;

            if (yas<12) {
                if (yolculukTipi == 2) {
                    System.out.println("Toplam Tutar:" + (normal - ((normal - normal * 0.5) * 0.2)) + " TL");
                } else {
                    System.out.println("Toplam Tutar:" + (normal - (normal - normal * 0.5)) + " TL");
                }
            }

            if ((yas>=12) && (yas<=24)) {
                if (yolculukTipi == 2) {
                    System.out.println("Toplam Tutar:" + (normal - ((normal - normal * 0.1) * 0.2)) + " TL");
                } else {
                    System.out.println("Toplam Tutar:" + (normal - normal * 0.1) + " TL");
                }
            }

            if (yas>65) {
                if (yolculukTipi == 2) {
                    System.out.println("Toplam Tutar:" + (normal - ((normal - normal * 0.3) * 0.2)) + " TL");
                } else {
                    System.out.println("Toplam Tutar:" + (normal - normal * 0.3) + " TL");
                }
            }
            if ((yas>24) && (yas<=65)) {
                if (yolculukTipi == 2) {
                    System.out.println("Toplam Tutar:" + (normal - (normal * 0.2)) + " TL");
                } else {
                    System.out.println("Toplam Tutar:" + normal + " TL");
                }
            }


    }
}
