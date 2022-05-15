import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double perArmut=2.14,armutKg,perElma=3.67,elmaKg,perDomates=1.11,domatesKg,perMuz=0.95,muzKg,perPatlican=5.00,patlicanKg,toplam;
        Scanner input=new Scanner(System.in);
        System.out.print("Armut Kaç Kilo?:");
        armutKg= input.nextDouble();

        System.out.print("Elma Kaç Kilo?:");
        elmaKg= input.nextDouble();

        System.out.print("Domates Kaç Kilo?:");
        domatesKg= input.nextDouble();

        System.out.print("Muz Kaç Kilo?:");
        muzKg= input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo?:");
        patlicanKg= input.nextDouble();

        toplam=(perArmut*armutKg)+(perElma*elmaKg)+(perDomates*domatesKg)+(perMuz*muzKg)+(perPatlican*patlicanKg);

        System.out.print("Toplam Tutar: "+toplam+" TL");



    }


}
