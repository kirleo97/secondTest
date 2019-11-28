import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        try {
            System.out.println("Считываем данные из первого файла...");
            List<TwoComponents> firstList = readData(args[0]);
            System.out.println("Выведем данные первого списка...\n" + firstList.toString());

            System.out.println("Считываем данные из второго файла...");
            List<TwoComponents> secondList = readData(args[1]);
            System.out.println("Выведем данные второго списка...\n" + secondList.toString());
            List<ThreeComponents> resultList = Join.joinLists(firstList, secondList);

            System.out.println("Выведем данные результирующего списка списка...\n" + resultList.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка! Файл не был передан в качестве аргумента. Программа не может быть выполнена.");
            e.printStackTrace();
        }
    }

    public static List<TwoComponents> readData(String fileName) {
        List<TwoComponents> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String s;
            String[] mas;
            int numberOfString = 0;
            while (reader.ready()) {
                numberOfString++;
                s = reader.readLine().trim();
                mas = s.split(" ");
                if (!TwoComponents.checkDataForTwoComponentsObject(mas)) {
                    System.out.println("Чтение данных на строке " + numberOfString + " не было выполнено.");
                    continue;
                }
                list.add(new TwoComponents(Integer.parseInt(mas[0]), mas[1]));
            }
            System.out.println("Считывание данных из файла успешно завершено.");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка! Введённый Вами файл с именем " + fileName + " не найден. Дальнейший процесс считывания данных невозможен.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Возникла ошибка ввода/вывода данных: при чтении данных из файла. Дальнейшее чтение данных невозможно.");
            e.printStackTrace();
        }
        return list;
    }
}
