/**
 * Created by arwin on 10/10/16.
 */
public class Halving {

    Halving() {
    }

    double numberOfTimesOnePieceOfPaperWasLeft(Paper pieces) {
        if(pieces.cantTake) {
            return 0;
        }
        if(pieces.step==16) {
            return pieces.numberOfTimesOnePieceWasTaken;
        }
        return (double) pieces.numberOfA2/pieces.sum() * numberOfTimesOnePieceOfPaperWasLeft(pieces.takeA2())
                + (double) pieces.numberOfA3/pieces.sum() * numberOfTimesOnePieceOfPaperWasLeft(pieces.takeA3())
                + (double) pieces.numberOfA4/pieces.sum() * numberOfTimesOnePieceOfPaperWasLeft(pieces.takeA4())
                + (double) pieces.numberOfA5/pieces.sum() * numberOfTimesOnePieceOfPaperWasLeft(pieces.takeA5());
    }

    private void start() {
        Paper start = new Paper();
        double value = numberOfTimesOnePieceOfPaperWasLeft(start);
        System.out.printf("%f", value);
    }



    public static void main(String[] args) {
        new Halving().start();
    }
    
}