package Strategy;

public class SortingStrategyFactory {
    public static SortingStrategy create(String code) {
        switch (code) {
            case "q":
                return new QuickSortStrategy();
            default:
                return new QuickSortStrategy();
        }
    }
}
