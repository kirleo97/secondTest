import java.util.Objects;

public class TwoComponents {
    private int id;
    private String data;

    public TwoComponents(int id, String data) {
        this.id = id;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return getId() + "   " + getData() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TwoComponents that = (TwoComponents) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static boolean isDataForTwoComponentsObjectRight(String[] mas) {
        if (mas.length == 2) {
            try {
                Integer.parseInt(mas[0]);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введены данные неверного формата для числового идентификатора. Перейдем к следующней строке.");
                e.printStackTrace();
            }
        } else {
            System.out.println("Ошибка! Введены данные неверного формата: число входных данных не равно 2. Перейдем к следующней строке.");
        }
        return true;
    }
}
