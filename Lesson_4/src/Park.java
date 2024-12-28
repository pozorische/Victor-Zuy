import java.util.ArrayList;

public class Park {
    private String parkName;
    private String workTimePark;

    public Park(String parkName1, String workTimePark1) {
        parkName = parkName1;
        workTimePark = workTimePark1;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public void setWorkTimePark(String workTimePark) {
        this.workTimePark = workTimePark;
    }

    ArrayList<Attraction> attractions = new ArrayList<>();

    public void addAttraction(String atrName, String workTime, int price) {
        attractions.add(new Attraction(atrName, workTime, price));
    }

    @Override
    public String toString() {
        return "Park: " +
                "parkName=" + parkName +
                ", workTimePark=" + workTimePark + "\n" +
                "attractions:\n" + attractions;
    }

    private class Attraction {
        private String atrName;
        private String workTime;
        private double price;

        private Attraction(String atrName1, String workTime1, double price1) {
            atrName = atrName1;
            workTime = workTime1;
            price = price1;
        }

        @Override
        public String toString() {
            return "atrName=" + atrName +
                    ", workTime='" + workTime +
                    ", price=" + price;
        }
    }
}