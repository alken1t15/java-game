public class Player implements Fieldable {
    private static final String MOVE_LEFT = "a";
    private static final String MOVE_RIGHT = "d";
    private static final String MOVE_UP = "w";
    private static final String MOVE_DOWN = "z";
    private static final String NO_MOVE = "s";
    private int rowIndex;
    private int columnIndex;
    private Field field;
    private Game game;

    @Override
    public String getSymbol() {
        return " @ ";
    }

    public Player(int rowIndex, int columnIndex, Game game) {
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
        this.game = game;
        this.field = game.getField();

    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public int getColumnIndex() {
        return columnIndex;
    }

    public void setColumnIndex(int columnIndex) {
        this.columnIndex = columnIndex;
    }

    public void makeMove(String command) {
        switch (command) {
            case MOVE_LEFT -> movePlayer(0, -1);
            case MOVE_RIGHT -> movePlayer(0, 1);
            case MOVE_UP -> movePlayer(-1, 0);
            case MOVE_DOWN -> movePlayer(1, 0);
            default -> showError(command);
        }
    }

    private void showError(String command) {
        System.out.println("Sorry, there is no " + command + " command, please verify and try again.");
    }

    private void movePlayer(int deltaRowIndex, int deltaColumnIndex) {
        int newRowIndex = rowIndex + deltaRowIndex;
        int newColumnIndex = columnIndex + deltaColumnIndex;
        if ((newRowIndex > 0) && (newRowIndex < field.getSizeY()) && (newColumnIndex > 0) && (newColumnIndex < field.getSizeX()) && !((field.getFieldable(newColumnIndex, newRowIndex)) instanceof Enemy)) {

            if (field.getFieldable(newColumnIndex, newRowIndex) instanceof Flower) {
                Flower flower = (Flower) field.getFieldable(newColumnIndex, newRowIndex);
                game.setTransistorsGathered(flower.getTransistors());
                game.getFlowerArrayList().remove(flower);
                swapPlayer(newColumnIndex,newRowIndex);
            }
            if(field.getFieldable(newColumnIndex, newRowIndex) instanceof Empty){
                swapPlayer(newColumnIndex,newRowIndex);
            }
        }
    }
    private void swapPlayer(int newColumnIndex, int newRowIndex){
        field.setFieldable(newColumnIndex, newRowIndex, this);
        field.setFieldable(columnIndex, rowIndex, new Empty());
        rowIndex = newRowIndex;
        columnIndex = newColumnIndex;
    }
}