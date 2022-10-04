public enum Liquid {
    TAPWATER("kranvatten"),
    MINERALWATER("mineralvatten"),
    PROTEINSOLUTION("proteindryck");
    public final String liquid;

    Liquid(String s) {
        liquid = s;
    }
}
