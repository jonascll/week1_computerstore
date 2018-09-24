package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Computable;
import be.pxl.computerstore.util.TooManyPeripheralsException;

public class ComputerSystem implements Computable {

    private Processor processor;
    private HardDisk hardDisk;
    private ComputerCase computerCase;
    private Peripheral[] peripherals = new Peripheral[3];
    private int aantalKeerDoorLopen = 0;


    public Processor getProcessor() {
        return processor;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public ComputerSystem() {

    }

    public void addPeripheral(Peripheral peripheral) throws TooManyPeripheralsException {
        if (aantalKeerDoorLopen < 3) {
            peripherals[aantalKeerDoorLopen] = peripheral;
            aantalKeerDoorLopen++;
        } else {
            throw new TooManyPeripheralsException("peripheral limit reached");
        }

    }

    public int getNumberOfPeripherals(){
        int aantalPeripherals = 0;
        for (Peripheral peripheral : peripherals) {
            if (!(peripheral.equals(null))){
                aantalPeripherals++;
            }


        }
        return aantalPeripherals;
    }

    @Override
    public double totalPriceExcl() {
        double price = processor.getPrice() + hardDisk.getPrice() + computerCase.getPrice();
        for (Peripheral peripheral : peripherals) {
            price += peripheral.getPrice();
        }
        return price;
    }
}
