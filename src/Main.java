import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by mb977 on 3/22/17.
 */
public class Main {
    public static void main (String[] args){
        ArrayList cards = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.println("How many suits do you want");
        int suitNum = input.nextInt();
        System.out.println("How many of each suit");
        int numSuit = input.nextInt();
        System.out.println("Names of each suit");
        boolean b = true;
        ArrayList suitName = new ArrayList();
        while(b){
            System.out.println("What is the name of the suit");
            String s = input.next();
            suitName.add(s);
            if(suitName.size()==suitNum){
                b=false;
            }
        }
        int size = suitName.size();
        System.out.println("enter lowest card value");
        int cardExtreme = input.nextInt();
        System.out.println("enter highest card value");
        int cardExtreme1 = input.nextInt();
        System.out.println("Standard face? Ace, Jack, King and Queen? Yes or No");
        String standard = input.next();

        System.out.println("Extra cards and amount?");
        String extras = input.next();
        int x = 0;
        for (int i = 0; (i < suitNum*numSuit); i++){
            for (int j = cardExtreme; j <= cardExtreme1; j++){
                System.out.print(j+ " ");
                System.out.println(suitName.get(i));

            }

        }

    }

}
