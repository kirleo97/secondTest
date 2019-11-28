import java.util.ArrayList;
import java.util.List;

public class Join {
    public static List<ThreeComponents> joinLists(List<TwoComponents> firstList, List<TwoComponents> secondList) {
        List<ThreeComponents> resultList = new ArrayList<>();
        for (TwoComponents first : firstList) {
            for (TwoComponents second : secondList) {
                if (first.equals(second))
                    resultList.add(new ThreeComponents(first.getId(), first.getData(), second.getData()));
            }
        }
        return resultList;
    }
}
