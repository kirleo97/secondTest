public class ThreeComponents {
    private int id;
    private String firstData;
    private String secondDate;

    public ThreeComponents(int id, String firstData, String secondDate) {
        this.id = id;
        this.firstData = firstData;
        this.secondDate = secondDate;
    }

    @Override
    public String toString() {
        return id + "   " + firstData + "   " + secondDate + "\n";
    }
}
