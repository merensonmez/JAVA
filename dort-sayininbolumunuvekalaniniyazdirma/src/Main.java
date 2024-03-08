public class Main {
    public static void main(String[] args) {
      int sayi = 4845451, bolen=4;

      int bolum = sayi / bolen;
      int kalan = sayi & bolen;

      System.out.println("İşlem: "+sayi+"/"+bolen);
      System.out.println("Bölüm = "+bolum);
      System.out.println("Kalan = "+kalan);
    }
}