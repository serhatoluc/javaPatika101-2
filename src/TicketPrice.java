import java.util.Scanner;

/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM),
yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/
public class TicketPrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int range, age, trip;
        double price;
        System.out.print("Lütfen Seyahat Edeceğiniz Uzaklığı KM Cinsinden Giriniz: ");
        range = input.nextInt();
        System.out.print("Lütfen Yaşınızı Giriniz: ");
        age = input.nextInt();
        System.out.print("Lütfen Yolculuk Tipini Seçiniz (1 -> Tek Yön, 2 -> Gidiş-Dönüş): ");
        trip = input.nextInt();

        price = (range * 0.1);

        if(range >= 0 && age < 12){
            switch (trip) {
                case 1:
                    System.out.print("Ödemeniz Gereken Toplam Tutar = " + (price / 2));
                    break;
                case 2:
                    System.out.println("Ödemeniz Gereken Toplam Tutar = " + ((price / 2)*0.8));
            }
        }else if((range >=0) && (age >= 12 && age <= 24)){
            switch (trip){
                case 1:
                    System.out.println("Ödemeniz Gereken Toplam Tutar = " + (price * 0.9));
                    break;
                case 2:
                    System.out.println("Ödemeniz Gereken Toplam Tutar = " + ((price * 0.9)*0.8));
                    break;
            }
        }else if (range >= 0 && age >= 65){
            switch (trip){
                case 1:
                    System.out.println("Ödemeniz Gereken Toplam Tutar = " + (price * 0.7));
                    break;
                case 2:
                    System.out.println("Ödemeniz Gereken Toplam Tutar = " + ((price * 0.7)*0.8));
            }
        }else{
            System.out.println("Hatalı Bir Giriş Yaptınız, Lütfen Tekrar Deneyiniz...");
        }

    }
}
