import java.util.Scanner;

/*
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
*/
public class EtkinlikOneri {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double temp;

        System.out.print("Lütfen Hava Sıcaklığını Giriniz: ");
        temp = input.nextDouble();

        if(temp < 5)
            System.out.print("Bu Gün Kayak Yapmayı Tercih Edebilirsiniz...");
        else if (temp >= 5 && temp < 10)
            System.out.print("Bu Gün Sinemaya Gidebilirsiniz...");
        else if (temp >= 10 && temp <= 15)
            System.out.println("Bu Gün Sineme Ve/Veya Pikniğe Gidebilirsiniz...");
        else if (temp > 15 && temp <= 25)
            System.out.println("Bu Gün Pikniğe Gidebilirsiniz...");
        else
            System.out.println("Bu Gün Yüzmek İçin İyi Bir Gün Gibi...");

    }
}
