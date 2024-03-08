public class Main {
    public static void main (String[] args){
        String grade="T";

        switch(grade){
            case "A" :
                System.out.println("A ile geçtiniz-Mükemmel");
                break;
            case "B" :
                System.out.println("B ile geçtiniz-İyi");
                break;
            case "C" :
                System.out.println("C ile geçtiniz-Ortalama");
                break;
            case "D" :
                System.out.println("D ile geçtiniz-İdare Eder ");
                break;
            case "F" :
                System.out.println("F ile geçtiniz- Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not");

        }

    }
}