import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double para, kdvOran1,kdvOran2,x,y;
        Scanner input = new Scanner(System.in) ;

        System.out.print("Para değerini giriniz: ");
        para=input.nextDouble();
        kdvOran1=0.18;
        kdvOran2=0.08;
        x= para+kdvOran1*para;
        y= para+kdvOran2*para;

        System.out.print(para<1000? x:y);




    }

}
