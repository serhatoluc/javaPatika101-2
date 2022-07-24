import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        System.out.println(" Dört İşlem Hesap Makinesi Uygulamasına Hoş Geldiniz...");

        double n1,n2;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen İlk Sayıyı Giriniz: ");
        n1 = input.nextDouble();
        System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
        n2 = input.nextDouble();

        System.out.println("Lütfen Hangisini Yapmak İstediğinizi Seçiniz. \n 1 - Toplama \n 2 - Çıkarma \n 3 - Çarpma \n 4 - Bölme");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama İşleminin Sonucu = " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma İşleminin Sonucu = " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma İşleminin Sonucu = " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0){
                    System.out.println("Bölme İşleminin Sonucu = " + (n1 / n2));
                }else{
                    System.out.println("Bir Sayı 0'a Bölünemez...");
                }
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız. Lütfen Tekrar Deneyin.");

        }
    }
}
