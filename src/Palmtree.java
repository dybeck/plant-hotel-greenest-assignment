import javax.swing.*;

public class Palmtree extends Plant {
    protected Liquid liquid = Liquid.TAPWATER;                    //inkapsling
    protected double liquidPerM = 0.5;                            //inkapsling

    Palmtree(String name, double height) {
        super(name, height);
    }

    public Liquid getLiquid() {
        return liquid;
    }

    public double getLiquidAmount() {
        return liquidPerM * getHeight();
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
