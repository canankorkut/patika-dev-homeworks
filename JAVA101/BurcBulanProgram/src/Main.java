import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int gun,ay;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz gün: ");
        gun = input.nextInt();

        System.out.print("Doğduğunuz ay: ");
        ay = input.nextInt();

        if ((ay == 1) && (gun<=31)){
            if (gun>=22){
                System.out.print("Burcunuz : Kova");
            }else{
                System.out.print("Burcunuz : Oğlak");
            }
        }
        if ((ay == 2) && (gun<=28)){
            if (gun>=20){
                System.out.print("Burcunuz : Balık");
            }else{
                System.out.print("Burcunuz : Kova");
            }
        }
        if ((ay == 3) && (gun<=31)) {
            if (gun >= 21) {
                System.out.print("Burcunuz : Koç");
            } else {
                System.out.print("Burcunuz : Balık");
            }
        }
        if ((ay == 4) && (gun<=30)) {
            if (gun >= 21) {
                System.out.print("Burcunuz : Boğa");
            } else {
                System.out.print("Burcunuz : Koç");
            }
        }
        if ((ay == 5) && (gun<=31)) {
            if (gun >= 22) {
                System.out.print("Burcunuz : İkizler");
            } else {
                System.out.print("Burcunuz : Boğa");
            }
        }
        if ((ay == 6) && (gun<=30)) {
            if (gun >= 23) {
                System.out.print("Burcunuz : Yengeç");
            } else {
                System.out.print("Burcunuz : İkizler");
            }
        }
        if ((ay == 7) && (gun<=31)) {
            if (gun >= 23) {
                System.out.print("Burcunuz : Aslan");
            } else {
                System.out.print("Burcunuz : Yengeç");
            }
        }
        if ((ay == 8) && (gun<=31)) {
            if (gun >= 23) {
                System.out.print("Burcunuz : Başak");
            } else {
                System.out.print("Burcunuz : Aslan");
            }
        }
        if ((ay == 9) && (gun<=30)) {
            if (gun >= 23) {
                System.out.print("Burcunuz : Terazi");
            } else {
                System.out.print("Burcunuz : Başak");
            }
        }
        if ((ay == 10) && (gun<=31)) {
            if (gun >= 23) {
                System.out.print("Burcunuz : Akrep");
            } else {
                System.out.print("Burcunuz : Terazi");
            }
        }
        if ((ay == 11) && (gun<=30)) {
            if (gun >= 22) {
                System.out.print("Burcunuz : Yay");
            } else {
                System.out.print("Burcunuz : Akrep");
            }
        }
        if ((ay == 12) && (gun<=31)) {
            if (gun >= 21) {
                System.out.print("Burcunuz : Oğlak");
            } else {
                System.out.print("Burcunuz : Koç");
            }
        }
        else{
            System.out.print("Hatalı giriş yaptınız.Tekrar deneyiniz!");
        }

    }
}
