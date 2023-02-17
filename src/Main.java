import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Input line " + i);
            listA.add(scanner.nextLine());
        }
        System.out.println("ListA:" + listA);

        ArrayList<String> listB = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Input line " + i);
            listB.add(scanner.nextLine());
        }
        System.out.println("ListB:" + listB);
        Collections.reverse(listB);

        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        System.out.println("ListC:" + listC);

        listC.sort(Comparator.comparingInt(String::length));

        System.out.println("ListC sorted:" + listC);


    }
}