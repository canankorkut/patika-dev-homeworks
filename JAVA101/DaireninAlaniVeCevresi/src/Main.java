import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double cevre,alan,pi=3.14,yaricap,merkezaciolcu;
        Scanner input=new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz:");
        yaricap=input.nextDouble();

        System.out.print("Dairenin merkez açı ölçüsünü giriniz:");
        merkezaciolcu=input.nextDouble();

        cevre=2*pi*yaricap;
        alan= (pi*(yaricap*yaricap)*merkezaciolcu)/360;

        System.out.println("Dairenin çevresi: "+ cevre);
        System.out.println("Dairenin alanı: "+alan);



    }
}
