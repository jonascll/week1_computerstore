package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Dimension;

public class ComputerCase extends ComputerComponent {
    private Dimension dimension;
    private double weight;
    private static String articleNumber = "";

    public static String getArticleNumber() {
        return articleNumber;
    }

    public double getWeight() {
        return weight;
    }

    public Dimension getDimension() {
        return dimension;
    }


    public ComputerCase(String vendor, String name, double price) {
        super(vendor, name, price);
        this.articleNumber = makeArticleNumber();

    }


    @Override
    public String toString() {

        return String.format("%s (%s)", super.toString(), this.articleNumber);

    }

    @Override
    public String getFullDescription() {
        return String.format("articleNumber : %s \n %s \n width : %dmm \n height : %dmm \n depth : %dmm \n weight : %fkg", this.articleNumber, super.getFullDescription(), this.dimension.getWidth(), this.dimension.getHeight(),
                this.dimension.getDepth(), this.weight);
    }


}
