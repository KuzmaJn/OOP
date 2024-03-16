public enum Color {
    RED,
    GREEN,
    BLUE;
    public static Color getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
