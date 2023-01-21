import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите данные в лист Animal");

        for (int i = 0; i < 5; i++) {
            String animal=scanner.nextLine();
            animals.add(animal);
        }
        System.out.println(animals);

        System.out.println();

        System.out.println("Напишите данные в лист Names");
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String name=scanner.nextLine();
            names.add(name);
        }
        System.out.println(names);

        ArrayList<String> namesAndAnimals= new ArrayList<>();
        Collections.reverse(names);
        for (int i = 0; i < animals.size(); i++) {
            namesAndAnimals.add(animals.get(i));
            namesAndAnimals.add(names.get(i));
        }
        System.out.println(namesAndAnimals);

        Comparator<String> comparator = (o1,o2) -> o1.length() - o2.length();
        Collections.sort(namesAndAnimals, comparator);
        System.out.println("Отсортированный список по длине:");
        System.out.println(namesAndAnimals);
    }
}