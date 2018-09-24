package be.pxl.computerstore.hardware;

public class Processor extends ComputerComponent {

    private final double MIN_CLOCKSPEED = 0.7;
    private double clockspeed = 0.7;
    private static String articleNumber;


    public static String getArticleNumber() {
        return articleNumber;
    }

    @Override
    public String toString() {

        return String.format("%s (%s)", super.toString(), this.articleNumber);

    }

    @Override
    public String getFullDescription() {
        return String.format("articleNumber : %s \n %s \n %fGHz", this.articleNumber, super.getFullDescription(), this.clockspeed);
    }

    public Processor(String vendor, String name, double price, double clockspeed) {
        super(vendor, name, price);
        this.articleNumber = makeArticleNumber();
        if (clockspeed > this.MIN_CLOCKSPEED) {
            this.clockspeed = clockspeed;
        }
    }
}
