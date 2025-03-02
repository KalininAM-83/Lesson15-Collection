import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        CollectionUtilsImpl utils = new CollectionUtilsImpl();
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(430);
        arrayList.add(328);
        arrayList.add(151);
        arrayList.add(47);
        arrayList.add(51);

        List<Integer> linkedList = new ArrayList<>();
        linkedList.add(151);
        linkedList.add(35);
        linkedList.add(328);
        linkedList.add(430);
        linkedList.add(15);

        System.out.println("\nОбъединение двух коллекций с дубликатами в List: " + utils.union(arrayList, linkedList));

        System.out.println("\nПересечение двух коллекций с дубликатами в List: " + utils.intersection(arrayList, linkedList));

        System.out.println("\nРазность двух коллекций в List: " + utils.difference(arrayList, linkedList));

        System.out.println("\nОбъединение двух коллекций без дубликатов в LinkedSet: " + utils.unionWithoutDuplicate
                (arrayList, linkedList));

        System.out.println("\nПересечение двух коллекций без дубликатов в HashSet: " + utils.intersectionWithoutDuplicate
                (arrayList, linkedList));
    }

}
