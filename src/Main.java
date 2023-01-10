import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Random rand = new Random();
        System.out.print ("Combination is:");
        String[] nizStringova = new String[]{"Heart", "Cherry", "Coin", "Melon", "Jocker"};

        for (int i = 0; i < nizStringova.length; i++) {

            System.out.print(nizStringova[rand.nextInt(4)] + " ");

        }
    }
}