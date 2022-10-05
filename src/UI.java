import javax.swing.*;
import java.util.List;

public class UI {
    public void ui(List<Plant> list) {
        String systemQuery, systemExit, inputBlankError, notOnHotel;
        systemQuery = "Vilken växt ska få mat?";
        systemExit = "Programmet avslutas";
        inputBlankError = "Inget namn inskrivet";
        notOnHotel = "finns ej på hotellet";

        while (true) {
            String input = JOptionPane.showInputDialog(null, systemQuery);
            if (input == null) {
                System.out.println(systemExit);
                System.exit(0);
            } else if (input.isBlank()) {
                JOptionPane.showMessageDialog(null, inputBlankError);
            } else {
                boolean plantExists = false;
                for (Plant plant : list) {
                    if (input.equalsIgnoreCase(plant.getName())) {
                        plantExists = true;
                        plant.printInstruction();
                        break;
                    }
                }
                if (!plantExists) {
                    JOptionPane.showMessageDialog(null, "\"" + input + "\" " + notOnHotel);
                }
            }
        }
    }
}

