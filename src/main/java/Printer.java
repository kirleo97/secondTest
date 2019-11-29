import java.util.List;
import java.util.Map;

public class Printer {
    public static void printList(List<ThreeComponents> resultList) {
        resultList.stream().forEach(System.out::println);
    }

    public static void printMap(Map<Integer, ThreeComponents> resultMap) {
        for (ThreeComponents threeComponents : resultMap.values()) {
            System.out.println(threeComponents.toString());
        }
    }
}
