import javax.swing.*;
public class CarnivorousPlant extends Plant {
    private Liquid liquid = Liquid.PROTEINSOLUTION;                                     //inkapsling
    private double liquidBaseAmount = 0.1;                                              //inkapsling
    private double liquidPerM = 0.2;                                                    //inkapsling
    private double liquidAmount = liquidBaseAmount + (liquidPerM * getHeight());        //inkapsling


    CarnivorousPlant(String name, double height) {
        super(name, height);
    }

    public Liquid getLiquid() {
        return liquid;
    }

    public double getLiquidAmount() {
        return liquidAmount;
    }

    @Override
    public String toString() {
        return getName() + " ska ha " + getLiquidAmount() + "l av " + getLiquid().liquid + " per dag.";
    }

    @Override
    public void printInstruction() {
        JOptionPane.showMessageDialog(null, toString());
    }
}
