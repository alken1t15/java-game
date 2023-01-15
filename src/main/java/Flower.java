public class Flower implements Fieldable {
    private int transistors;

    public int getTransistors() {
        return transistors;
    }

    public Flower(int transistors) {
        this.transistors = transistors;
    }

    @Override
    public String getSymbol() {
        return String.valueOf(" " + transistors + " ");
    }
}
