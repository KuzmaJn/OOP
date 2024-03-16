public class ColorPicker {
    Color c;
    public static void main(String[] args) {
        Color c = pickRandomColor();
        printColor(c);
    }
    static void printColor(Color c) {
        switch (c) {
            case RED:
                System.out.println("Red");
                break;
            case GREEN:
                System.out.println("Green");
                break;
            case BLUE:
                System.out.println("Blue");
                break;
        }
    }

    static Color pickRandomColor() {return Color.getRandom();}
}
