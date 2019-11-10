package core;

public class Box {

    private static int count;

    private int number;


    public Box() {
        count++;
        this.number = count;
    }

    @Override
    public String toString() {
        return "\t\t\tЯщик: " + number;
    }
}
