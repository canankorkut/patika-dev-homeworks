import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double kenar1,kenar2,kenar3,cevre,u,alanxalan,alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin bir kenarını giriniz: ");
        kenar1=input.nextDouble();

        System.out.print("Üçgenin ikinci kenarını giriniz: ");
        kenar2=input.nextDouble();

        System.out.print("Üçgenin üçüncü kenarını giriniz: ");
        kenar3=input.nextDouble();

        cevre=(kenar1+kenar2+kenar3);
        u=cevre/2;
        alanxalan=(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        alan = Math.sqrt(alanxalan);

        System.out.println("Üçgenin alanı: "+" "+alan);



    }
}
