public class Main {
    public static void main(String[] args) {
        String mesaj = "This day weather is cold.";
        System.out.println(mesaj);
        String firstLatter = "T";
        String lastLatter = ".";

        System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5. Eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat("I feel bad because of this."));
        System.out.println(mesaj.startsWith(firstLatter));
        if (mesaj.startsWith(firstLatter)) {
            System.out.println("Yes,first letter is 'T'.");
        } else {
            System.out.println("No,first letter is not 'T'");
        }
        System.out.println(mesaj.endsWith(lastLatter));
        if (mesaj.endsWith(lastLatter)) {
            System.out.println("Yes,last letter is '.'");
        } else {
            System.out.println("No,last letter is not '.'");
        }

        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf('a'));

        String newMessage = mesaj.replace("", "-");
        System.out.println(newMessage);
        System.out.println(mesaj.substring(2, 5));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);


        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}