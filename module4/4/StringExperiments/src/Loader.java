
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String numbers = text.replaceAll("[^0-9]", " ");
        String [] array = numbers.replaceAll("\\s+", " ").trim().split(" ");

        int number1 = Integer.parseInt(array[0]);
        int number3 = Integer.parseInt(array[2]);

        int count = number1 + number3;

        System.out.println(count);
    }
}