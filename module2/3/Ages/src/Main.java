import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int vasyaAge;
        int katyaAge;
        int mishaAge;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст Васи: ");
        vasyaAge = scanner.nextInt();

        System.out.print("Введите возраст Кати: ");
        katyaAge = scanner.nextInt();

        System.out.print("Введите возраст Миши: ");
        mishaAge = scanner.nextInt();

        System.out.println("============================================");

        int min;
        int middle;
        int max;

        if (vasyaAge < katyaAge && vasyaAge < mishaAge){

            min = vasyaAge;

            if (katyaAge > mishaAge){
                middle = mishaAge;
                max = katyaAge;
            }else{
                middle = katyaAge;
                max = mishaAge;
            }

        }else if (vasyaAge > katyaAge && vasyaAge > mishaAge){

            max =vasyaAge;

            if (katyaAge > mishaAge) {
                middle = katyaAge;
                min = mishaAge;
            } else {
                middle = mishaAge;
                min = katyaAge;
            }

        }else{
            min = katyaAge;
            middle = vasyaAge;
            max = mishaAge;
        }
        System.out.println("Минимальный возраст: " + min);
        System.out.println("Средний возраст: " + middle);
        System.out.println("Максимальный возраст: " + max);
    }
}
