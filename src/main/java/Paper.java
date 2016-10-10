/**
 * Created by arwin on 10/10/16.
 */
public class Paper {
    int numberOfA2, numberOfA3, numberOfA4, numberOfA5, step, numberOfTimesOnePieceWasTaken;
    boolean cantTake;

    Paper() {
        numberOfA2 = numberOfA3 = numberOfA4 = numberOfA5 = 1;
        step = 1;
        numberOfTimesOnePieceWasTaken = -1;
        cantTake = false;
    }

    Paper copy() {
        Paper result = new Paper();
        result.numberOfA2 = numberOfA2;
        result.numberOfA3 = numberOfA3;
        result.numberOfA4 = numberOfA4;
        result.numberOfA5 = numberOfA5;
        result.step = step;
        result.numberOfTimesOnePieceWasTaken = numberOfTimesOnePieceWasTaken;
        result.cantTake = cantTake;
        return result;
    }

    Paper takeA2() {
        Paper result = copy();
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

    Paper takeA3() {
        Paper result = copy();
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

    Paper takeA4() {
        Paper result = copy();
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

    Paper takeA5() {
        Paper result = copy();
        checkNumberOfPieces(result);
        if(numberOfA5 > 0) {
            result.numberOfA5--;
            result.step++;
        } else {
            result.cantTake = true;
        }
        return result;
    }

    void checkNumberOfPieces(Paper pieces) {
        if(pieces.numberOfA2+pieces.numberOfA3+pieces.numberOfA4+pieces.numberOfA5 == 1) {
            pieces.numberOfTimesOnePieceWasTaken++;
        }
    }
}
