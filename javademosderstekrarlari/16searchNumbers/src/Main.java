public class Main {
    public static void main(String[] args) {
        searchNumber();
    }

    public static void searchNumber() {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6,5123};
        int searchingNumber = 5122;
        boolean exist = false;

        for (int number : numbers) {
            if (number==searchingNumber){
                exist = true;
                break;
            }
        }
        if (exist) {
            giveMessage(searchingNumber);
        } else {
            System.out.println("This number is not available!!! ");
        }
    }
    public static void giveMessage(int searchingNumber){
        System.out.println("This number available.");

    }
}