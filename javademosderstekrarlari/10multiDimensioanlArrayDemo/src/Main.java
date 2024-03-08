public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];

        sehirler[0][0] ="Malatyanın ilçeleri : ";
        sehirler[0][1] ="Yeşilyurt";
        sehirler[0][2] ="Battalgazi";
        sehirler[1][0] ="Doğanşehir";
        sehirler[1][1] ="Akcadağ";
        sehirler[1][2] ="Darende";
        sehirler[2][0] ="Hekimhan";
        sehirler[2][1] ="Yazıhan";
        sehirler[2][2] ="Pütürge";

        for(int i=0;i<=2;i++){
            System.out.println("-----------");
            for(int j=0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}