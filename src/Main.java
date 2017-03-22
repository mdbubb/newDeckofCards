import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList cards = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.println("How many suits do you want");
        int suitNum = input.nextInt();
        System.out.println("How many of each suit");
        int numSuit = input.nextInt();
        System.out.println("Names of each suit");
        boolean b = true;
        ArrayList<String> suitName = new ArrayList<>();
        while (b) {
            System.out.println("What is the name of the suit");
            String s = input.next();
            suitName.add(s);
            if (suitName.size() == suitNum) {
                b = false;
            }
        }
        int size = suitName.size();
        System.out.println("enter lowest card value");
        int cardExtreme = input.nextInt();
        System.out.println("enter highest card value");
        int cardExtreme1 = input.nextInt();
        System.out.println("Standard face? Ace, Jack, King and Queen? Yes or No");
        String standard = input.next();
        ArrayList<String> m = new ArrayList<>();
        if (standard.equalsIgnoreCase("No")) {
            boolean a = true;
            while (a) {
                System.out.println("Enter the names of the face cards (Type NULL to finish)");
                String y = input.next();
                m.add(y);
                if (y.equalsIgnoreCase("null")) {
                    m.remove("null");
                    a = false;
                }
            }
        } else {
            m.add("Jack");
            m.add("Queen");
            m.add("King");
            m.add("Ace");
        }
        System.out.println("Extra cards? Yes or No");
        String extras = input.next();
        ArrayList<String> extraList = new ArrayList<>();
        int extraNum = 0;
        if (extras.equalsIgnoreCase("Yes")) {
            boolean g = true;
            while (g) {
                System.out.println("Enter the name of the extra card (Type NULL to finish)");
                String p = input.next();
                if (!p.equalsIgnoreCase("Null")) {
                    System.out.println("Enter how many of these extra cards you would like");
                    extraNum = input.nextInt();
                    for (int i = 0; i < extraNum; i++) {
                        extraList.add(p);
                    }
                } else {
                    g = false;
                }
            }
        }
        int x = 0;
        for (int i = 0; (i < suitNum * numSuit); i++) {
            while (x < size) {
                for (int j = cardExtreme; j <= cardExtreme1; j++) {
                    System.out.print(j + " of ");
                    System.out.println(suitName.get(x));
                }
                for (int u = 0; u < m.size(); u++) {
                    System.out.print(m.get(u));
                    System.out.print(" of ");
                    System.out.println(suitName.get(x));
                }

                x++;
            }
        }
        if (extras.equalsIgnoreCase("yes")) {
            for (int y = 0; y < extraList.size(); y++) {
                System.out.println(extraList.get(y) + " # " + y);
            }
        }

    }
}
