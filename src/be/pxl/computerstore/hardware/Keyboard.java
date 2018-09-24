package be.pxl.computerstore.hardware;

public class Keyboard extends Peripheral {
    private static String articleNumber;
    private String keyboardLayout;

    public Keyboard(String vendor, String name, double price, String keyboardLayouty) {
        super(vendor, name, price);
        this.articleNumber = makeArticleNumber();
        this.keyboardLayout = keyboardLayouty;
    }

    @Override
    public String toString() {

        return String.format("%s %s (%s)",this.getClass().getName(), super.getName(), this.articleNumber);

    }
}
