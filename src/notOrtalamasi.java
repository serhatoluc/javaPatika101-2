import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args) {

        int mat,fiz,kim,tur,muz;
        double ort;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();
        System.out.println("Lütfen Fizik Notunuzu Giriniz: ");
        fiz = input.nextInt();
        System.out.println("Lütfen Kimya Notunuzu Giriniz: ");
        kim = input.nextInt();
        System.out.println("Lütfen Türkçe Notunuzu Giriniz: ");
        tur = input.nextInt();
        System.out.println("Lütfen Müzik Notunuzu Giriniz: ");
        muz = input.nextInt();

        if (mat < 0 || mat > 100)
            mat = 0;
        if (fiz < 0 || fiz > 100)
            fiz = 0;
        if (kim < 0 || kim > 100)
            kim = 0;
        if (tur < 0 || tur > 100)
            tur = 0;
        if (muz < 0 || muz > 100)
            muz = 0;

        ort = (mat+fiz+kim+tur+muz) / 5;

        if (ort >= 55)
            System.out.println("Tebrikler Sınıfı Geçtiniz.");
        else
            System.out.println("Malesef Sınıfta Kaldınız.");
        System.out.println("Ortalamanız = " + ort);
    }
}
