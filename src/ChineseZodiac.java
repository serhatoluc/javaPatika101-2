/*
Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
Doğum Tarihi %12 = 0 ➜ Maymun
Doğum Tarihi %12 = 1 ➜ Horoz
Doğum Tarihi %12 = 2 ➜ Köpek
Doğum Tarihi %12 = 3 ➜ Domuz
Doğum Tarihi %12 = 4 ➜ Fare
Doğum Tarihi %12 = 5 ➜ Öküz
Doğum Tarihi %12 = 6 ➜ Kaplan
Doğum Tarihi %12 = 7 ➜ Tavşan
Doğum Tarihi %12 = 8 ➜ Ejderha
Doğum Tarihi %12 = 9 ➜ Yılan
Doğum Tarihi %12 = 10 ➜ At
Doğum Tarihi %12 = 11 ➜ Koyun
 */

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year, zodiac;

        System.out.print("Lütfen Doğum Yılınızı 4 Haneli Olacak Şekilde Giriniz (Örn: 1995): ");
        year = input.nextInt();

        zodiac = (year % 12);

        if ((year >= 1000) && (zodiac >= 0 && zodiac <= 12)){
            switch (zodiac){
                case 0:
                    System.out.println("Çin Zodyağınız Maymun...");
                    break;
                case 1:
                    System.out.println("Çin Zodyağınız Horoz...");
                    break;
                case 2:
                    System.out.println("Çin Zodyağınız Köpek...");
                    break;
                case 3:
                    System.out.println("Çin Zodyağınız Domuz...");
                    break;
                case 4:
                    System.out.println("Çin Zodyağınız Fare...");
                    break;
                case 5:
                    System.out.println("Çin Zodyağınız Öküz...");
                    break;
                case 6:
                    System.out.println("Çin Zodyağınız Kaplan...");
                    break;
                case 7:
                    System.out.println("Çin Zodyağınız Tavşan...");
                    break;
                case 8:
                    System.out.println("Çin Zodyağınız Ejderha...");
                    break;
                case 9:
                    System.out.println("Çin Zodyağınız Yılan...");
                    break;
                case 10:
                    System.out.println("Çin Zodyağınız At...");
                    break;
                case 11:
                    System.out.println("Çin Zodyağınız Koyun...");
                    break;
            }
        }else{
            System.out.println("Hatalı Bir Giriş Yaptınız, Lütfen Tekrar Deneyiniz...");
        }

    }
}
