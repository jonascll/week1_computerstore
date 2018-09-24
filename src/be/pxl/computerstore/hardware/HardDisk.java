package be.pxl.computerstore.hardware;

public class HardDisk extends ComputerComponent {


    private int capacity;
    private static String articleNumber = "";


    public int getCapacity() {
        return capacity;
    }

    public static String getArticleNumber() {
        return articleNumber;
    }

    public HardDisk(String vendor, String name, double price, int capacity) {
        super(vendor, name, price);
        this.capacity = capacity;
    }


}

