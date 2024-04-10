
public class Main {
    public static void main(String[] args) {
        String message = "It's a beautiful day today.";
        String newMessage = giveCity();
        String newMessage1 = giveCity1();
        System.out.println(newMessage);
        System.out.println(newMessage1);
        int number = plus(4124124,2313);
        System.out.println(number);
        int total = Plus2(1,2,3);
        System.out.println(total);

    }

    public static void plus(){
        System.out.println("Added");
    }

    public static void minus(){
        System.out.println("Deleted!!!");
    }

    public static void update(){
        System.out.println("Updated");
    }
    public static int plus(int number1,int number2){
        return number1+number2;
    }
    public static int Plus2(int... numbers){
        int total = 0;
        for(int number:numbers){
            total+=number;
        }
        return total;
    }

    public static String giveCity(){
        return "Malatya";
    }
    public static String giveCity1(){
        return "Elazığ";
    }
}