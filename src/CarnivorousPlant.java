import javax.swing.*;
public class CarnivorousPlant extends Plant {
    protected Liquid liquid = Liquid.PROTEINSOLUTION;                                     //inkapsling
    protected double liquidBaseAmount = 0.1;                                              //inkapsling
    protected double liquidPerM = 0.2;                                                    //inkapsling


    CarnivorousPlant(String name, double height) {
        super(name, height);
    }

    public Liquid getLiquid() {
        return liquid;
    }

    public double getLiquidAmount() {
        return liquidBaseAmount + (liquidPerM * getHeight());
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
