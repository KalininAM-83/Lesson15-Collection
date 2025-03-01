import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        CollectionUtilsImpl utils = new CollectionUtilsImpl();
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(28);
        arrayList.add(34);
        arrayList.add(47);
        arrayList.add(51);

        List<Integer> linkedList = new ArrayList<>();
        linkedList.add(51);
        linkedList.add(35);
        linkedList.add(28);
        linkedList.add(43);
        linkedList.add(15);

        System.out.println("\nОбъединение двух коллекций с дубликатами: " + utils.union(arrayList, linkedList));

        System.out.println("\nПересечение двух коллекций с дубликатами: " + utils.intersection(arrayList, linkedList));

        System.out.println("\nРазность двух коллекций: " + utils.difference(arrayList, linkedList));
    }

}
