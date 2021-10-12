public class BonusMilesService {
    public int calculate(int cost) {
        byte oneBonus = 20;
        int miles = cost / oneBonus;

        return miles;
    }
}
