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
        for (int i  = 0, j = 0; i < firstList.size();) {
            if (firstList.get(i).equals(secondList.get(j))) {
                resultList.add(new ThreeComponents(firstList.get(i).getId(), firstList.get(i).getData(), secondList.get(j).getData()));
                if (j == secondList.size() - 1) {
                    j = 0;
                    i++;
                    continue;
                }
                j++;
                continue;
            } else {
                if (firstList.get(i).getId() < secondList.get(j).getId()) {
                    if (j == secondList.size() - 1) {
                        i++;
                        continue;
                    }
                    i++;
                    j = 0;
                    continue;
                } else {
                    if (j == secondList.size() - 1) {
                        break;
                    }
                    j++;
                }
            }
        }
    }

    public static void findAndAddEqualDataFromHashMap(HashMap<Integer, TwoComponents> firstMap, HashMap<Integer, TwoComponents> secondMap, List<ThreeComponents> resultList) {
        for (TwoComponents firstTwoComponent : firstMap.values()) {
            for (TwoComponents secondTwoComponent : secondMap.values()) {
                if (firstTwoComponent.equals(secondTwoComponent))
                    resultList.add(new ThreeComponents(firstTwoComponent.getId(), firstTwoComponent.getData(), secondTwoComponent.getData()));
            }
        }
    }
}
