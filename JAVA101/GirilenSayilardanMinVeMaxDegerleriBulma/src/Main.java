import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int n, number;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();
        int maks = 0;
        int min = 0;

        for (int i = 1; i <= n; i++){
            System.out.print(i + "." + "Sayıyı giriniz: ");
            int sayi = input.nextInt();

            if(i == 1){
                maks = sayi;
                min = sayi;
            }
            if(sayi > maks){
                maks = sayi;
            }
            if(sayi < min){
                min = sayi;
            }

        }
        System.out.println("En büyük sayı: " + maks);
        System.out.println("En küçük sayı: " + min);



    }
}
