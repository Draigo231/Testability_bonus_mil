public class BonusMilesService {
     public int calculate(int a, int b) {
        int result;
        if (a > b) {
            result = a * 1 / b;
        } else {
            result = 0;
        }
        return result;
    }
}

