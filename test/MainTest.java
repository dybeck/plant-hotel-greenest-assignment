public class MainTest {
    Cactus p1 = new Cactus("Igge", 0.2);
    Palmtree p2 = new Palmtree("Laura", 5);
    CarnivorousPlant p3 = new CarnivorousPlant("Meatloaf", 0.7);
    Palmtree p4 = new Palmtree("Putte", 1);

    @org.junit.jupiter.api.Test
    public final void resultTest() {
        String correctStringP1 = "Igge ska ha 0.02l av mineralvatten per dag.";
        String correctStringP2 = "Laura ska ha 2.5l av kranvatten per dag.";
        String correctStringP3 = "Meatloaf ska ha 0.24l av proteindryck per dag.";
        String correctStringP4 = "Putte ska ha 0.5l av kranvatten per dag.";
        double correctDoubleP1 = 0.02;  //Always 2cl
        double correctDoubleP2 = 2.5;   //5m * 0,5L = 2,5L
        double correctDoubleP3 = 0.24;  //0,7m*0.2 + 0,1 = 0.24L
        double correctDoubleP4 = 0.5;   //1m * 0,5L = 0.5L

        assert (p1.toString().equals(correctStringP1));
        assert (p2.toString().equals(correctStringP2));
        assert (p3.toString().equals(correctStringP3));
        assert (p4.toString().equals(correctStringP4));

        assert (p1.getLiquidAmount() == correctDoubleP1);
        assert (p2.getLiquidAmount() == correctDoubleP2);
        assert (p3.getLiquidAmount() == correctDoubleP3);
        assert (p4.getLiquidAmount() == correctDoubleP4);

    }
}

