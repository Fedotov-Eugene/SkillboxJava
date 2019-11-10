import java.util.Scanner;

public class HumanitarianAssistance {

    private static final int MAX_BOX = 27;
    private static final int MAX_CONTAINER = 12;

    public static void main(String[] args) {
        int countBox = readConsole();
        if (checkNumber(countBox)) {
            printTrucks(countBox);
        }
    }

    public static int readConsole() {
        System.out.println("Введите натуральное число: ");
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();

        } catch (Exception e) {
            return -1;
        }
    }

    public static boolean checkNumber(int box) {
        if (box > 0) {
            return true;
        } else {
            System.out.println("Число не натуральное: ");
            return false;
        }
    }

    public static void printTrucks(int countBox) {
        int container = 0;
        int cargo = 0;

        for (int box = 1; box <= countBox; box++) // перебор ящиков
        {
            if (box % (MAX_CONTAINER * MAX_BOX) == 1) //
            {
                cargo++;
                System.out.println("Грузовик: " + cargo);

            }

            if (box % MAX_BOX == 1) //
            {
                container++;
                System.out.println("\tКонтейнер: " + container);
            }

            System.out.println("\t\t\tЯщик: " + box);
        }
    }
}


