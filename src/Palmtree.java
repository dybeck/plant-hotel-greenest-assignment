import javax.swing.*;

public class Palmtree extends Plant {
    private Liquid liquid = Liquid.TAPWATER;                    //inkapsling
    private double liquidPerM = 0.5;                            //inkapsling
    private double liquidAmount = liquidPerM * getHeight();     //inkapsling

    Palmtree(String name, double height) {
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
