public class BonusMilesService {
     public int calculate(int prise) {
        int result;
        if (prise > 20) {
            result = prise * 1 / 20;
        } else {
            result = 0;
        }
        return result;
    }
}
