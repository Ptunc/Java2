import java.util.Scanner;

public class java2{
    

    public static void main(String[] args) {
        Double tutar, a = 0.18, b = 0.08, sonuc;
        Scanner input = new Scanner(System.in);

        System.out.print("ürün tutarını girin: ");
        tutar = input.nextDouble();
        sonuc = tutar <= 1000 ? a : b;
        System.out.println("KDVsiz fiyat: " + tutar);
        System.out.println("KDVli fiyat: " + (tutar + (tutar*sonuc)));
        System.out.println("KDV tutarı: " + ((tutar + (tutar*sonuc)) - tutar ));
        int var2 = 1;
        ++var2;
        System.out.println(var2);
        input.close();
    }
}