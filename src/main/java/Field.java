public class Field {
    private int rows;
    private int columns;

    private Fieldable[][] field;

    public Field(int sizeX, int sizeY) {
        this.rows = sizeX;
        this.columns = sizeY;
        field = new Fieldable[sizeX][sizeY];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public void setFieldable(int x, int y, Fieldable object) {
        field[x][y] = object;
    }

    public Fieldable getFieldable(int x, int y) {
        return field[x][y];
    }

    public void showField() {
        System.out.println();
        for (int i = 0; i < getRows(); i++) {
            System.out.println();
            for (int j = 0; j < getColumns(); j++) {
                System.out.println(field[i][j].getSymbol());
            }
        }
        System.out.println();
    }
}