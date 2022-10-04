abstract class Plant implements GetFeedingInstruction {         //superklassen implementerar interface:t vilket ärvs vidare av underklasserna
    protected String name;          //inkapsling
    protected double height;        //inkapsling

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
}
