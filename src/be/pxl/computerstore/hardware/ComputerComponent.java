package be.pxl.computerstore.hardware;

import java.util.Random;

public class ComputerComponent {
    private String vendor;
    private String name;
    private double price;


    public ComputerComponent(String vendor, String name, double price) {
        this.vendor = vendor;
        this.name = name;
        this.price = price;
    }


    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {

        return String.format("%s", this.name);

    }

    public String getFullDescription() {
        return String.format("Vendor : %s \n name : %s \n Price : %f", vendor, name, price);
    }


    public String makeArticleNumber() {
        Random rand = new Random();
        String uniqueNumber = "0000";
        String articleNumber = "";

        while (this.vendor.length() < 3) {
            this.vendor += 'X';
        }
        articleNumber = this.vendor.substring(0, 2);
        articleNumber += '-';
        while (uniqueNumber.length() < 5) {
            uniqueNumber += rand.nextInt(10);
        }
        articleNumber += uniqueNumber;
        return articleNumber;
    }
}
