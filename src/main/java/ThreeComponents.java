public class ThreeComponents {
    private int id;
    private String firstData;
    private String secondData;

    public ThreeComponents(int id, String firstData, String secondData) {
        this.id = id;
        this.firstData = firstData;
        this.secondData = secondData;
    }

    public int getId() {
        return id;
    }

    public String getFirstData() {
        return firstData;
    }

    public String getSecondData() {
        return secondData;
    }

    @Override
    public String toString() {
        return getId() + "   " + getFirstData() + "   " + getSecondData() + "\n";
    }
}
