import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();


        while(number >= 1){
            total += (number % 10);
            number /= 10;
        }
        System.out.println("Toplam: " + total);

    }
}