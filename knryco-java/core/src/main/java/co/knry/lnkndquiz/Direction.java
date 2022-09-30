package co.knry.lnkndquiz;

public enum Direction {

    EAST("E"),
    SOUTH("S");

    private final String shortCode;

    Direction(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getShortCode() {
        return shortCode;
    }

}
