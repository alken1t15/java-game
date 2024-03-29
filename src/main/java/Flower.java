import java.util.Objects;

public class Flower implements Fieldable {
    private int transistors;

    private int rowIndex;

    private int columnIndex;

    public void setTransistors(int transistors) {
        this.transistors = transistors;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public int getTransistors() {
        return transistors;
    }

    public Flower(int transistors,int rowIndex,int columnIndex) {
        this.transistors = transistors;
        this.columnIndex = columnIndex;
        this.rowIndex = rowIndex;
    }

    @Override
    public String getSymbol() {
        return String.valueOf(" " + transistors + " ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return rowIndex == flower.rowIndex && columnIndex == flower.columnIndex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rowIndex, columnIndex);
    }
}