import java.lang.ref.PhantomReference;
import java.util.ArrayList;
import java.util.Random;

public class Game {
    private int sizeX;
    private int sizeY;
    private int amountOfEnemies;
    private int transistorsNeeded;
    private int movesLeft;
    private int transistorsGathered;
    private Field field;
    private boolean isGameFinished = false;
    private int amountOfFlowers;
    private ArrayList<Flower> flowerArrayList = new ArrayList<>();

    private Random randomNumber = new Random();

    public Game(int sizeX, int sizeY, int amountOfEnemies, int transistorsNeeded, int movesLeft,int amountOfFlowers) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.amountOfEnemies = amountOfEnemies;
        this.transistorsNeeded = transistorsNeeded;
        this.movesLeft = movesLeft;
        this.amountOfFlowers = amountOfFlowers;
        field = new Field(sizeX, sizeY);
    }

    public void fillFieldWithEmptyObjects() {
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                field.setFieldable(i, j, new Empty());
            }
        }
    }

    public Field getField(){
        return this.field;
    }

    public ArrayList<Flower> getFlowerArrayList(){
        return this.flowerArrayList;
    }
    public void setTransistorsGathered(int transistorsToAdd){
        this.transistorsGathered += transistorsToAdd;
    }

    public void startGame() {

        possesPlayer();
        possesEnemies();
        possesFlowers();

        while (!isGameFinished) {
            showField();
            playerTurn();
            computerTurn();
            checkIfGameNotFinished();
        }
    }

    private void possesFlowers() {

    }

    private void generateFlowers(){
        for(int i = amountOfFlowers - flowerArrayList.size();i > 0;){
           int flowerAmountOfTransistors = randomNumber.nextInt(9)+1;
           int flowersRowPosition = randomNumber.nextInt(sizeX);
           int flowerColumnPosition = randomNumber.nextInt(sizeY);

           if(field.getFieldable(flowersRowPosition,flowerColumnPosition) instanceof Player){
               transistorsGathered = transistorsGathered + flowerAmountOfTransistors;
               i--;
           }
           else if(field.getFieldable(flowersRowPosition,flowerColumnPosition) instanceof Empty){
               Flower flower = new Flower(flowerAmountOfTransistors,flowersRowPosition,flowerColumnPosition);
               field.setFieldable(flowersRowPosition,flowerColumnPosition,flower);
               flowerArrayList.add(flower);
               i--;
           }
        }
    }

    private void possesEnemies() {

    }

    private void possesPlayer() {

    }

    private void checkIfGameNotFinished() {
    }

    private void computerTurn() {

    }

    private void playerTurn() {

    }

    private void showField() {

    }
}