import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nСоздаем новый список");
        List<Integer> numbers = new ArrayList<>();

        System.out.println("\nadd(E element): Добавляем элементы в конец списка");
        numbers.add(1);
        numbers.add(8);
        numbers.add(2);
        numbers.add(4);
        numbers.add(99);

        System.out.println("\n-add(int index, E element): Добавляем элементы в список на определенные позиции");
        numbers.add(2, 15);

        System.out.println("\n-remove(int index): Удаляет элемент на определенной позиции");
        numbers.remove(3);

        System.out.println("\n-set(int index, E element): Заменяет элемент на указанной позиции новым значением");
        numbers.set(0, 99);

        System.out.println("\n-get(int index): Возвращает элемент на данной позиции");
        System.out.println("Получаю элемент с индексом 0: "
                + numbers.get(0));

        System.out.println("\n-indexOf(Object o): Находит индекс первого вхождения данного объекта в списке");
        System.out.println("Получаю индекс 1ой или единственной, в которой лежит число 99: "
                + numbers.indexOf(99));

        System.out.println("\n-lastIndexOf(Object o): Находит последний индекс вхождения данного объекта в списке");
        System.out.println("Получаю индекс последней или единственной, в которой лежит число 99: "
                + numbers.lastIndexOf(99));

        System.out.println("\n-contains(Object o): Проверяет, содержит ли список данный объект");
        System.out.println("Проверка есть ли элемент 99 в списке: " + numbers.contains(99));
        System.out.println("Проверка есть ли элемент 0 в списке: " + numbers.contains(0));

/*
        System.out.println("\n-sort(): Сортирует элементы в списке");
        numbers.sort();

        System.out.println("\nВыводим все элементы списка после сортировки");
        System.out.println(numbers);
*/

        System.out.println("\nВыводим все элементы списка до очистки");
        System.out.println(numbers);

        System.out.println("\n-clear(): Очищает список");
        numbers.clear();

        System.out.println("\nВыводим все элементы списка после очистки");
        System.out.println(numbers);
    }
}
