package be.pxl.computerstore.hardware;

public class Monitor extends Peripheral {
    private static String articleNumber;

    public Monitor(String vendor, String name, double price) {
        super(vendor, name, price);
        this.articleNumber = makeArticleNumber();
    }
    @Override
    public String toString() {

        return String.format("%s %s (%s)",this.getClass().getName(), super.getName(), this.articleNumber);

    }


}
