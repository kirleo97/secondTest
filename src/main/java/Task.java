import java.util.*;

public class Task {
    public static void main(String[] args) {
        try {
            Reader.readFileAndAddDataToCollections(args[0], true);
            Reader.readFileAndAddDataToCollections(args[1], false);

            List<ThreeComponents> resultListForArrayLists = new ArrayList<>();
            List<ThreeComponents> resultListForSortedLinkedLists = new ArrayList<>();
            List<ThreeComponents> resultListForHashMaps = new ArrayList<>();

            Join.findAndAddEqualDataFromArrayLists(Collections.getFirstArrayList(), Collections.getSecondArrayList(), resultListForArrayLists);
            Join.findAndAddEqualDataFromSortedLinkedLists(Collections.getFirstSortedLinkedList(), Collections.getSecondSortedLinkedList(), resultListForSortedLinkedLists);
            Join.findAndAddEqualDataFromHashMap(Collections.getFirstHashMap(), Collections.getSecondHashMap(), resultListForHashMaps);

            System.out.println("Выведем данные для алгоритма ArrayList...");
            resultListForArrayLists.stream().forEach(o -> System.out.println(o.toString()));
            System.out.println("Выведем данные для алгоритма LinkedList...");
            resultListForSortedLinkedLists.stream().forEach(o -> System.out.println(o.toString()));
            System.out.println("Выведем данные для алгоритма HashMap...");
            resultListForHashMaps.stream().forEach(o -> System.out.println(o.toString()));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка! Файл не был передан в качестве аргумента. Программа не может быть выполнена.");
            e.printStackTrace();
        }
    }
}
