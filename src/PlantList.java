import java.util.Arrays;
import java.util.List;
public class PlantList {
    List<Plant> plantList() {
        return Arrays.asList(p1, p2, p3, p4);
    }

    Plant p1 = new Cactus("Igge", 0.2);                     //polymorfism
    Plant p2 = new Palmtree("Laura", 5);                    //polymorfism
    Plant p3 = new CarnivorousPlant("Meatloaf", 0.7);       //polymorfism
    Plant p4 = new Palmtree("Putte", 1);                    //polymorfism

}
