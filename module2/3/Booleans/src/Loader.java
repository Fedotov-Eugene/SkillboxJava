import java.util.Scanner;

public class Loader
{
    public static void main(String[] args)
    {
        /*int milkAmount = 1000; // ml
        int powderAmount = 400; // g
        int eggsCount = 3; // items
        int sugarAmount = 10; // g
        int oilAmount = 30; // ml
        int appleCount = 8;*/

        System.out.println("Pancakes: " + "мука - 400 g, сахр - 10 g, молоко - 1 l, масло - 30 ml" + "\n"
        + "Omelette: " + "молоко - 300 ml, мука - 5 g, яйца - 5 items" + "\n"
        + "Apple pie: " + "яблок - 3, молоко - 100 ml, мука - 300 g, яйца - 4 items" + "\n"
        + "********************************************************************");

        Scanner scanner = new Scanner(System.in);

        int milkAmount;
        int powderAmount;
        int eggsCount;
        int sugarAmount;
        int oilAmount;
        int appleCount;

        System.out.print("Введите количество молока в мл.: ");
        milkAmount = scanner.nextInt();

        System.out.print("Введите количество муки в г.: ");
        powderAmount = scanner.nextInt();

        System.out.print("Введите количество яиц в шт.: ");
        eggsCount = scanner.nextInt();

        System.out.print("Введите количество сахара в г.: ");
        sugarAmount = scanner.nextInt();

        System.out.print("Введите количество масла (не сливочного) в мл: ");
        oilAmount = scanner.nextInt();

        System.out.print("Введите количество яблок в шт.: ");
        appleCount = scanner.nextInt();

        System.out.println("********************************************************************");

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30){
            System.out.println("Pancakes");
        }else{
            System.out.println("no Pancakes");
        }

        //milk - 300 ml, powder - 5 g, eggs - 5
        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 3){
            System.out.println("Omelette");
        }else{
            System.out.println("no Omelette");
        }

        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4){
            System.out.println("Apple pie");
        }else{
            System.out.println("no Apple pie");
        }
    }
}