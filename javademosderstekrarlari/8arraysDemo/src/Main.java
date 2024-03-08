public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Eren";
        String ogrenci2 = "Enes";
        String ogrenci3 = "Ebru";
        String ogrenci4 = "Veysel";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);
        System.out.println("-----------------");

        String[] ogrenciler=new String[4];
        ogrenciler[0]= "Eren";
        ogrenciler[1]= "Enes";
        ogrenciler[2]= "Ebru";
        ogrenciler[3]= "Veysel";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("-------------------");
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }

}