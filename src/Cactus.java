import javax.swing.*;

public class Cactus extends Plant {
    protected Liquid liquid = Liquid.MINERALWATER;        //inkapsling
    protected double liquidAmount = 0.02;                  //inkapsling


    Cactus(String name, double height) {
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
