import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int k,i,sum = 0,count = -1,ort;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        k = inp.nextInt();

        for (i = 0; i <= k; i++){
            if((i % 3 == 0) && (i % 4 == 0)){
                count++;
                sum += i;
                System.out.println(i);
            }

        }
        ort = sum / count;
        System.out.println("Girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması: " + ort);
    }

}
