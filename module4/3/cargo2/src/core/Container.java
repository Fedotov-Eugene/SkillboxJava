package core;

public class Container {
    public static final int MAX_BOX = 27;
    private static int count;

    private Box[] arrayBox;

    private int number;


    public Container(int countBox) {
        count++;
        this.number = count;
        int currentCountBox = Math.min(MAX_BOX, countBox);
        this.arrayBox = new Box[currentCountBox];

        for(int i = 0; i < arrayBox.length; i++) {
            arrayBox[i] = new Box();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\tКонтейнер " + number + ":\n");
        for (Box b : arrayBox) {
            sb.append(b.toString()).append("\n");
        }
        return sb.toString();
    }
}
