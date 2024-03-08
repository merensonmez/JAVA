import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);

         System.out.print("Birinci sayıyı girin: ");
         int sayi1=reader.nextInt();
         System.out.print("İkinci sayıyı girin: ");
         int sayi2=reader.nextInt();

         int toplam=sayi1+sayi2;
         System.out.println("Sayıların toplamı= "+toplam);

    }
}