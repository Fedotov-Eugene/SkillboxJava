
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Саша заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        int index1 = text.indexOf(' ', 14);
        int index2 = text.lastIndexOf(' ', 20);
        int index3 = text.indexOf(' ', 55);
        int index4 = text.lastIndexOf(' ', 62);

        int sasha = Integer.parseInt(text.substring(index1, index2).trim());
        int masha = Integer.parseInt(text.substring(index3, index4).trim());

        int sum = sasha + masha;
        System.out.println(sum);
    }
}