import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String userName,password;

        Scanner input= new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifreyi giriniz: ");
        password = input.nextLine();

        if (userName.equals("aslan") && password.equals("aslan789")) {

            System.out.print("Giriş Yapınız!");

        }else{
            System.out.println("Bilgileriniz yanlış!");
        }


    }
}
