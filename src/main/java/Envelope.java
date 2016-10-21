/**
 * Created by arwin on 10/10/16.
 */
public class Envelope {int numberOfA1, numberOfA2, numberOfA3, numberOfA4, numberOfA5, step, numberOfTimesOnePieceWasTaken;
    boolean cantTake;

    public Envelope() {
        numberOfA1 = step = 1;
        numberOfA2 = numberOfA3 = numberOfA4 = numberOfA5 = 0;
        numberOfTimesOnePieceWasTaken = -2;
        cantTake = false;
    }

    public Envelope copy() {
        Envelope result = new Envelope();
        result.numberOfA1 = numberOfA1;
        result.numberOfA2 = numberOfA2;
        result.numberOfA3 = numberOfA3;
        result.numberOfA4 = numberOfA4;
        result.numberOfA5 = numberOfA5;
        result.step = step;
        result.numberOfTimesOnePieceWasTaken = numberOfTimesOnePieceWasTaken;
        result.cantTake = cantTake;
        return result;
    }

    public int sum() {
        return numberOfA1+numberOfA2+numberOfA3+numberOfA4+numberOfA5;
    }

    public Envelope takeA1() {
        Envelope result = copy();
        checkNumberOfPieces(result);
        if(numberOfA1 > 0) {
            result.numberOfA1--;
            result.numberOfA2++;
            result.numberOfA3++;
            result.numberOfA4++;
            result.numberOfA5++;
            result.step++;
        } else {
            result.cantTake = true;
        }
        return result;
    }

    public Envelope takeA2() {
        Envelope result = copy();
        checkNumberOfPieces(result);
        if(numberOfA2 > 0) {
            result.numberOfA2--;
            result.numberOfA3++;
            result.numberOfA4++;
            result.numberOfA5++;
            result.step++;
        } else {
            result.cantTake = true;
        }
        return result;
    }

    public Envelope takeA3() {
        Envelope result = copy();
        checkNumberOfPieces(result);
        if(numberOfA3 > 0) {
            result.numberOfA3--;
            result.numberOfA4++;
            result.numberOfA5++;
            result.step++;
        } else {
            result.cantTake = true;
        }
        return result;
    }

    public Envelope takeA4() {
        Envelope result = copy();
        checkNumberOfPieces(result);
        if(numberOfA4 > 0) {
            result.numberOfA4--;
            result.numberOfA5++;
            result.step++;
        } else {
            result.cantTake = true;
        }
        return result;
    }

    public Envelope takeA5() {
        Envelope result = copy();
        checkNumberOfPieces(result);
        if(numberOfA5 > 0) {
            result.numberOfA5--;
            result.step++;
        } else {
            result.cantTake = true;
        }
        return result;
    }


    private void checkNumberOfPieces(Envelope pieces) {
        if(pieces.numberOfA1+pieces.numberOfA2+pieces.numberOfA3+pieces.numberOfA4+pieces.numberOfA5 == 1) {
            pieces.numberOfTimesOnePieceWasTaken++;
        }
    }
}
