import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int n,r,kombinasyon;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        n = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        r = input.nextInt();

        if (r <= n) {

            int total = 1;
            int total1 = 1;
            int total2 = 1;

            for (int i = 1; i <= n; i++) {
                    total = total * i;
            }

            for (int j = 1; j <= r; j++) {
                   total1 = total1 * j;
            }

            int k = n - r;

            for (int t = 1; t <= k; t++) {
                    total2 = total2 * t;
            }

            kombinasyon = total / (total1 * total2);

            System.out.print("Kombinasyon: " + kombinasyon);

        }else {
            System.out.print("Hatalı giriş!Tekrar deneyiniz!");
        }


    }
}
