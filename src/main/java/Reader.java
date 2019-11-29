import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void readFileAndAddDataToCollections(String fileName, boolean isItFirstFile) {
        if (isItFirstFile)
            System.out.println("Начинаем считывать данные из первого файла...");
        else System.out.println("Начинаем считывать данные из второго файла...");

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String s;
            String[] mas;
            int numberForHashMap = 0;
            int numberOfString = 0;
            while (reader.ready()) {
                numberOfString++;
                s = reader.readLine().trim();
                mas = s.split(" ");
                if (!TwoComponents.isDataForTwoComponentsObjectRight(mas)) {
                    System.out.println("Чтение данных на строке " + numberOfString + " не было выполнено.");
                    continue;
                }
                TwoComponents twoComponents = new TwoComponents(Integer.parseInt(mas[0]), mas[1]);
                if (isItFirstFile)
                    Collections.addDataToFirstCollections(twoComponents, ++numberForHashMap);
                else
                    Collections.addDataToSecondCollections(twoComponents, ++numberForHashMap);
            }
            System.out.println("Считывание данных из файла успешно завершено.");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка! Введённый Вами файл с именем " + fileName + " не найден. Дальнейший процесс считывания данных невозможен.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Возникла ошибка ввода/вывода данных: при чтении данных из файла. Дальнейшее чтение данных невозможно.");
            e.printStackTrace();
        }
    }
}
