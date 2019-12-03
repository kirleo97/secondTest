import java.util.*;

public class Collections {
    private static ArrayList<TwoComponents> firstArrayList = new ArrayList<TwoComponents>();
    private static ArrayList<TwoComponents> secondArrayList = new ArrayList<TwoComponents>();

    private static LinkedList<TwoComponents> firstSortedLinkedList = new LinkedList<>();
    private static LinkedList<TwoComponents> secondSortedLinkedList = new LinkedList<>();

    private static HashMap<Integer, List<String>> firstHashMap = new HashMap<>();
    private static HashMap<Integer, List<String>> secondHashMap = new HashMap<>();

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

    public static HashMap<Integer, List<String>> getFirstHashMap() {
        return firstHashMap;
    }

    public static HashMap<Integer, List<String>> getSecondHashMap() { return secondHashMap; }

    public static void addDataToFirstCollections(TwoComponents twoComponents) {
        getFirstArrayList().add(twoComponents);
        getFirstSortedLinkedList().add(twoComponents);
        putToHashMap(getFirstHashMap(), twoComponents);
    }

    public static void addDataToSecondCollections(TwoComponents twoComponents) {
        getSecondArrayList().add(twoComponents);
        getSecondSortedLinkedList().add(twoComponents);
        putToHashMap(getSecondHashMap(), twoComponents);
    }

    public static void putToHashMap(HashMap<Integer, List<String>> map, TwoComponents twoComponents) {
        if (map.containsKey(twoComponents.getId())) {
            map.get(twoComponents.getId()).add(twoComponents.getData());
        } else {
            List<String> list = new ArrayList<>();
            list.add(twoComponents.getData());
            map.put(twoComponents.getId(), list);
        }
    }
}
