import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int acilisücreti;
        double tutar,mesafe;
        Scanner input=new Scanner(System.in);
        System.out.print("Gidilecek mesafeyi km cinsinden giriniz: ");
        mesafe=input.nextDouble();
        acilisücreti=10;
        tutar=acilisücreti+mesafe*2.20;
        tutar=(tutar<20) ? 20:tutar;
        System.out.print("Taksimetre tutarı:"+tutar);



    }

}
