import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik ;
        Scanner ders = new Scanner(System.in) ;

        System.out.print("Matematik notunuz : ");
        mat = ders.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = ders.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = ders.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = ders.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = ders.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = ders.nextInt();

        int toplam= (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc= toplam/6.0;

        System.out.println("Ortalamanız"+" " + sonuc);
        System.out.println(sonuc>60 ? "Sınıfı Geçti": "Sınıfta Kaldı");


    }
}
