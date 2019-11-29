import java.util.*;

public class Join {
    public static ArrayList<ThreeComponents> joinToArrayList(List<TwoComponents> firstList, List<TwoComponents> secondList) {
        ArrayList<ThreeComponents> resultList = new ArrayList<>();
        findAndAddEqualElementsToResultList(firstList, secondList, resultList);
        return resultList;
    }

    public static LinkedList<ThreeComponents> joinToSortedLinkedList(List<TwoComponents> firstList, List<TwoComponents> secondList) {
        LinkedList<ThreeComponents> resultList = new LinkedList<>();
        findAndAddEqualElementsToResultList(firstList, secondList, resultList);
        resultList.sort(Comparator.comparing(ThreeComponents::getId).thenComparing(ThreeComponents::getFirstData).thenComparing(ThreeComponents::getSecondData));
        return resultList;
    }

    public static Map<Integer, ThreeComponents> joinToMap(List<TwoComponents> firstList, List<TwoComponents> secondList) {
        Map<Integer, ThreeComponents> resultMap = new HashMap<>();
        int number = 0;
        for (TwoComponents first : firstList) {
            for (TwoComponents second : secondList) {
                if (first.equals(second))
                    resultMap.put(++number, new ThreeComponents(first.getId(), first.getData(), second.getData()));
            }
        }
        return resultMap;
    }

    public static void findAndAddEqualElementsToResultList(List<TwoComponents> firstList, List<TwoComponents> secondList, List<ThreeComponents> resultList) {
        for (TwoComponents first : firstList) {
            for (TwoComponents second : secondList) {
                if (first.equals(second))
                    resultList.add(new ThreeComponents(first.getId(), first.getData(), second.getData()));
            }
        }
    }
}
