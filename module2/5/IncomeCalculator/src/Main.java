import java.util.Scanner;

public class Main // Класс
{
    private static int minIncome = 200000; // MIN дохом
    private static int maxIncome = 900000; // MAX доход

    private static int officeRentCharge = 140000;        // Аренда офиса
    private static int telephonyCharge = 12000;          // Расходы по телефонии
    private static int internetAccessCharge = 7200;      // Расходы по интернету

    private static int assistantSalary = 45000;          // Зарплата помощника
    private static int financeManagerSalary = 90000;     // Зарплата финансового менеджера

    private static double mainTaxPercent = 0.24;         // Процент основного налога
    private static double managerPercent = 0.1;          // Процент менеджера

    private static double minInvestmentsAmount = 100000; // MIN сумма инвестиций

    public static void main(String[] args) // Главный метод
    {
        while(true) // Цикл
        {
            System.out.println("Компания может инвестировать при доходе от 473088 рублей.");

            System.out.println("Введите сумму доходов компании за месяц " +
                "(от 200 до 900 тысяч рублей): ");
            int income = (new Scanner(System.in)).nextInt(); /*Переменной типа Integer присваивается значение
            из консоли*/

            if(!checkIncomeRange(income)) { // Если false, то код с 32 по 47 строки игнорируется
                continue;
            }
            // 473088 * 0.1 = 47308,8
            double managerSalary = income * managerPercent; // Рассчитывается зарплата менеджера
            // 473088 - 47308,8 - 294200 = 131579,2
            double pureIncome = income - managerSalary -
                    calculateFixedCharges(); // Рассчитывается чистая прибыль

            // 0.24 * 131579,2 = 31579,008
            double taxAmount = mainTaxPercent * pureIncome; // Рассчитывается сумма налога
            // 131579,2 - 31579,008 = 100000,192
            double pureIncomeAfterTax = pureIncome -
                    taxAmount; // Рассчитывается чистый доход после упл. налога
            // 100000,192 > 100000
            boolean canMakeInvestments = pureIncomeAfterTax >=
                    minInvestmentsAmount; // Рассчитывается возможность инвестирования

            System.out.println("Зарплата менеджера: " + managerSalary);/* Выводит сообщение + зарплата менеджера*/
            System.out.println("Общая сумма налогов: " + (taxAmount > 0 ? taxAmount : 0));/* Выводит сообщение +
            (если налог > 0, то значение taxAmount, иначе 0)*/
            System.out.println("Компания может инвестировать: " + (canMakeInvestments ? "да" : "нет"));/* Выводит
            сообщение + (если возможность инвестирования передает true, то "да", иначе "нет")*/
            if(pureIncome < 0) { // Если условие верно, то выполняется блок ниже
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
            }
        }
    }

    private static boolean checkIncomeRange(int income) // Метод
    {
        if(income < minIncome) // Если условие верно, то выводится сообщение и передается false
        {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if(income > maxIncome) // Если условие верно, то выводится сообщение и передается false
        {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true; // Если выше указанные условия неверны, то передается true
    }

    private static int calculateFixedCharges()// Метод
    {
        // Передается сумма переменных
        return officeRentCharge + //294200
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;
    }
}
