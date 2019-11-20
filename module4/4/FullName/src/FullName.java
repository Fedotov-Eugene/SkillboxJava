import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        System.out.print("Введите ФИО: ");
        Scanner fullName = new Scanner(System.in);
        String text = fullName.nextLine();

        String[] array = text.replaceAll("\\s+", " ").trim().split(" ");

        if (array.length == 3) {
            System.out.println("Фамилия: " + array[0]
                    + "\nИмя: " + array[1]
                    + "\nОтчество: " + array[2]);
        } else {
            System.out.println("Вы ввели неполные данные!!!");
        }
    }
}