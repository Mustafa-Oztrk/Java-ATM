import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int bakiye = 15000;

            System.out.println("CoddeLord Bank'a Hoşgeldiniz \n");
            System.out.println("Lütfen yapmak istediğiniz işlem Numarasını giriniz");
            System.out.println(" 1. Para Çekme ");
            System.out.println(" 2. Para Yatırma");
            System.out.println(" 3. Anlık bakiye öğrenme ");

            int bank = scanner.nextInt();
            switch (bank){
                case 1:
                    System.out.println("Çekmek istediğiniz tutarı giriniz");
                    int cekbak = scanner.nextInt();
                    if (cekbak > bakiye){
                        System.out.println("Çekmek istediğiniz miktar şuan ki bakiyenizden yüksek");
                    }else {
                        bakiye = bakiye - cekbak;
                        System.out.println("Kalan Tutar : "+bakiye);
                    }

                case 2:
                    System.out.println("Yatırmak istediğiniz tutarı giriniz");
                    int yatir = scanner.nextInt();
                    bakiye = yatir + bakiye;
                    System.out.println("Şuan ki Bakiyeniz : "+ bakiye );

                case 3:
                    System.out.println("Bakiyeniz : " + bakiye );

                default:
                    System.out.println("Yanlış işlem Numarası girdiniz \n");
            }


        }


    }
}