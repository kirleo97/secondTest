import java.util.*;

public class Collections {
    private static ArrayList<TwoComponents> firstArrayList = new ArrayList<TwoComponents>();
    private static ArrayList<TwoComponents> secondArrayList = new ArrayList<TwoComponents>();

    private static LinkedList<TwoComponents> firstSortedLinkedList = new LinkedList<>();
    private static LinkedList<TwoComponents> secondSortedLinkedList = new LinkedList<>();

    private static HashMap<Integer, TwoComponents> firstHashMap = new HashMap<>();
    private static HashMap<Integer, TwoComponents> secondHashMap = new HashMap<>();

    public static ArrayList<TwoComponents> getFirstArrayList() {
        return firstArrayList;
    }

    public static ArrayList<TwoComponents> getSecondArrayList() {
        return secondArrayList;
    }

    public static LinkedList<TwoComponents> getFirstSortedLinkedList() {
        return firstSortedLinkedList;
    }

    public static LinkedList<TwoComponents> getSecondSortedLinkedList() {
        return secondSortedLinkedList;
    }

    public static HashMap<Integer, TwoComponents> getFirstHashMap() {
        return firstHashMap;
    }

    public static HashMap<Integer, TwoComponents> getSecondHashMap() {
        return secondHashMap;
    }

    public static void addDataToFirstCollections(TwoComponents twoComponents, int number) {
        getFirstArrayList().add(twoComponents);
        getFirstSortedLinkedList().add(twoComponents);
        getFirstSortedLinkedList().sort(Comparator.comparing(TwoComponents::getId).thenComparing(TwoComponents::getData));
        getFirstHashMap().put(number, twoComponents);
    }

    public static void addDataToSecondCollections(TwoComponents twoComponents, int number) {
        getSecondArrayList().add(twoComponents);
        getSecondSortedLinkedList().add(twoComponents);
        getSecondSortedLinkedList().sort(Comparator.comparing(TwoComponents::getId).thenComparing(TwoComponents::getData));
        getSecondHashMap().put(number, twoComponents);
    }
}
