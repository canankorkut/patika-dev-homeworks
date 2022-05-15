import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double mat,fizik,turkce,kimya,muzik,ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz:");
        mat = input.nextDouble();

        System.out.print("Fizik notunu giriniz:");
        fizik = input.nextDouble();

        System.out.print("Türkçe notunu giriniz:");
        turkce = input.nextDouble();

        System.out.print("Kimya notunu giriniz:");
        kimya = input.nextDouble();

        System.out.print("Muzik notunu giriniz:");
        muzik = input.nextDouble();


        if (mat<0 || mat>100){
            ortalama = (fizik + turkce + kimya + muzik)/4;
        }
        if (fizik<0 || fizik>100) {
            ortalama = (mat + turkce + kimya + muzik) / 4;
        }
        if (turkce<0 || turkce>100) {
            ortalama = (mat + fizik + kimya + muzik) / 4;
        }
        if (kimya<0 || kimya>100) {
            ortalama = (mat + fizik + turkce + muzik) / 4;
        }
        if (muzik<0 || muzik>100) {
            ortalama = (mat + fizik + turkce + kimya) / 4;
        }
        else{
            ortalama = (mat + fizik + turkce + kimya + muzik)/5;
        }

        System.out.println("Ortlamanız:"+ ortalama);

        if(ortalama<55){
            System.out.println("Kaldın!");
        }else {
            System.out.println("Geçtin!");
        }



    }
}
