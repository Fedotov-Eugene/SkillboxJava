public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
        System.out.println(sumDigits(container.count));

    }

    public static int sumDigits(int number)
    {
        String str = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < str.length(); i++)
        {
            sum += Character.getNumericValue(str.charAt(i));
        }
        //@TODO: write code here
        return sum;
    }
}
