import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        CollectionUtilsimpl utils = new CollectionUtilsimpl();
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        List<Integer> linkedList = new ArrayList<>();
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(9);

        System.out.println("\nОбъединение двух коллекций с дубликатами: " + utils.union(arrayList, linkedList));
    }

}
