import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        System.out.println("Введите номер телефона в любом формате: ");
/**     +7 903 123-45-67
 *      8 (905) 673-87-22
 *      79091234567
 *      905 45623-11
 *      8 812 123-45-67
 *      812 123-45-67
 */
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().replaceAll("[^0-9]", "");

        StringBuffer phoneNumber = new StringBuffer(str);

        if (str.length() < 11){
            phoneNumber.insert(0, "7");
        }

        phoneNumber.replace(0, 1, "7")
                .insert(9, "-")
                .insert(7, "-")
                .insert(4, " ")
                .insert(1," ")
                .insert(0, "+");

        System.out.println(phoneNumber);
    }
}



