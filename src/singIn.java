import java.util.Scanner;

public class singIn {
    public static void main(String[] args) {

        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Kullanıcı Adınızı Giriniz: ");
        userName = input.nextLine();
        System.out.print("Lütfen Parolanızı Giriniz: ");
        password = input.nextLine();

        if(userName.equals("sekortet") && password.equals("123456")){
            System.out.println("Hoşgeldiniz...");
        } else {
            System.out.print("Hatalı Deneme...");
        }

    }
}
