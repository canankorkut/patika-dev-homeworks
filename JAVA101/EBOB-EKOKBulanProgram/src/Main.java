import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int n1,n2,ebob,ekok;
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısısnı giriniz: ");
        n1 = input.nextInt();
        System.out.print("n2 sayısısnı giriniz: ");
        n2 = input.nextInt();

        int i = 1;
        while(i <= n1*n2){
            if(i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                System.out.println("EKOK: " + ekok);
                break;
            }
            i++;
        }
        System.out.println("***");

        int k = n1;
        while(k >= 1){
            if(n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                System.out.println("EBOB: " + ebob);
                break;
            }
            k--;
        }

    }
}
