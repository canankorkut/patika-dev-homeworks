import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double num1,num2,num3;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz:");
        num1 = input.nextDouble();

        System.out.print("İkinci sayıyı giriniz:");
        num2 = input.nextDouble();

        System.out.print("Üçüncü sayıyı giriniz:");
        num3 = input.nextDouble();

        if ((num1<num2) && (num1<num3)){
            if (num2<num3){
                System.out.println("num1<num2<num3");
            } else {
                System.out.println("num1<num3<num2");
            }
        }if ((num2<num1) && (num2<num3)){
            if ((num1<num3)){
                System.out.println("num2<num1<num3");
            }else {
                System.out.println("num2<num3<num1");
            }
        }if ((num3<num1) && (num3<num2)){
            if ((num2<num1)){
                System.out.println("num3<num2<num1");
            }else {
                System.out.println("num3<num1<num2");
            }
        }
    }
}
