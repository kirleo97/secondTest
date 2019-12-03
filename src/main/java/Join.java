import java.util.*;

public class Join {
    public static void findAndAddEqualDataFromArrayLists(ArrayList<TwoComponents> firstList, ArrayList<TwoComponents> secondList, List<ThreeComponents> resultList) {
        for (TwoComponents first : firstList) {
            for (TwoComponents second : secondList) {
                if (first.equals(second))
                    resultList.add(new ThreeComponents(first.getId(), first.getData(), second.getData()));
            }
        }
    }

    public static void findAndAddEqualDataFromSortedLinkedLists(LinkedList<TwoComponents> firstList, LinkedList<TwoComponents> secondList, List<ThreeComponents> resultList) {
        Iterator<TwoComponents> firstIterator = firstList.iterator();
        Iterator<TwoComponents> secondIterator = secondList.iterator();
        if (firstIterator.hasNext() && secondIterator.hasNext()) {
            TwoComponents firstCurrent = firstIterator.next();
            TwoComponents secondCurrent = secondIterator.next();
            do {
                if (firstCurrent.equals(secondCurrent)) {
                    resultList.add(new ThreeComponents(firstCurrent.getId(), firstCurrent.getData(), secondCurrent.getData()));
                    if (!secondIterator.hasNext()) {
                        secondIterator = secondList.iterator();
                        secondCurrent = secondIterator.next();
                        firstCurrent = firstIterator.next();
                        continue;
                    }
                    secondCurrent = secondIterator.next();
                    continue;
                } else {
                    if (firstCurrent.getId() < secondCurrent.getId()) {
                        if (!secondIterator.hasNext()) {
                            firstCurrent = firstIterator.next();
                            continue;
                        }
                        firstCurrent = firstIterator.next();
                        secondIterator = secondList.iterator();
                        secondCurrent = secondIterator.next();
                        continue;
                    } else {
                        if (!secondIterator.hasNext()) {
                            break;
                        }
                        secondCurrent = secondIterator.next();
                    }
                }
            } while (firstIterator.hasNext());
        }
    }

    public static void findAndAddEqualDataFromHashMap(HashMap<Integer, List<String>> firstMap, HashMap<Integer, List<String>> secondMap, List<ThreeComponents> resultList) {
        for (int firstId : firstMap.keySet()) {
            List<String> list = secondMap.get(firstId);
            if (list == null) {
                continue;
            } else {
                for (String firstData : firstMap.get(firstId)) {
                    for (String secondData : secondMap.get(firstId))
                        resultList.add(new ThreeComponents(firstId, firstData, secondData));
                }
            }
        }
    }
}
