/**
 * Created by arwin on 10/10/16.
 */
public class Halving {
    int numberOfResults;

    Halving() {
        numberOfResults = 0;
    }

    int numberOfTimesOnePieceOfPaperWasLeft(Paper pieces) {
        if(pieces.cantTake) {
            return 0;
        }
        if(pieces.step==16) {
            numberOfResults++;
            return pieces.numberOfTimesOnePieceWasTaken;
        }

        return numberOfTimesOnePieceOfPaperWasLeft(pieces.takeA2())
                + numberOfTimesOnePieceOfPaperWasLeft(pieces.takeA3())
                + numberOfTimesOnePieceOfPaperWasLeft(pieces.takeA4())
                + numberOfTimesOnePieceOfPaperWasLeft(pieces.takeA5());
    }

    private void start() {
        Paper start = new Paper();
        int value = numberOfTimesOnePieceOfPaperWasLeft(start);
        double result = (double) value / numberOfResults;
        System.out.printf("%f", result);
    }

    public static void main(String[] args) {
        new Halving().start();

    }

}