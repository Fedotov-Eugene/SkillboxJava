import core.*;
import core.Camera;

import java.util.Scanner;

public class RoadController
{
    private static double passengerCarMaxWeight = 3500.0; // kg - Переменная типа double
    private static int passengerCarMaxHeight = 2000; // mm      - Переменная типа int
    private static int controllerMaxHeight = 4000; // mm        - Переменная типа int

    private static int passengerCarPrice = 100; // RUB          - Переменная типа int
    private static int cargoCarPrice = 250; // RUB              - Переменная типа int
    private static int vehicleAdditionalPrice = 200; // RUB     - Переменная типа int

    public static void main(String[] args)// - Метод main
    {
        System.out.println("Сколько автомобилей сгенерировать?");// - Выводит сообщение

        Scanner scanner = new Scanner(System.in);// - Переменная типа Scanner
        int carsCount = scanner.nextInt(); // - Переменная типа int

        for(int i = 0; i < carsCount; i++) // - Цикл for (int i = 0; Переменная типа int)
        {
            Car car = Camera.getNextCar(); // Переменная типа Car
            System.out.println(car); // - Выводит сообщение

            //Пропускаем автомобили спецтранспорта бесплатно
            if (car.isSpecial) {// - Условный оператор
                openWay();
                continue;// - Оператор перехода continue
            }

            //Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
            int price = calculatePrice(car);// - Переменная типа int
            if(price == -1) {// - Условный оператор
                continue;// - Оператор перехода continue
            }

            System.out.println("Общая сумма к оплате: " + price + " руб.");// - Выводит сообщение
        }
    }

    /**
     * Расчёт стоимости проезда исходя из массы и высоты
     */
    private static int calculatePrice(Car car)
    {
        int carHeight = car.height; // - Переменная типа int
        int price; // - Переменная типа int
        if (carHeight > controllerMaxHeight) // - Условный оператор
        {
            blockWay("высота вашего ТС превышает высоту пропускного пункта!");
            return -1;// - Оператор перехода return
        }
        else if (carHeight > passengerCarMaxHeight) // - Условный оператор
        {
            double weight = car.weight; // - Переменная типа double
            //Грузовой автомобиль
            if (weight > passengerCarMaxWeight)// - Условный оператор
            {
                price = passengerCarPrice;
                if (car.hasVehicle) {// - Условный оператор
                    price = price + vehicleAdditionalPrice;
                }
            }
            //Легковой автомобиль
            else { // - Условный оператор
                price = cargoCarPrice;
            }
        }
        else { // - Условный оператор
            price = passengerCarPrice;
        }
        return price;// - Оператор перехода return
    }

    /**
     * Открытие шлагбаума
     */
    private static void openWay()// - метод
    {
        System.out.println("Шлагбаум открывается... Счастливого пути!");// - Выводит сообщение
    }

    /**
     * Сообщение о невозможности проезда
     */
    private static void blockWay(String reason)// - метод
    {
        System.out.println("Проезд невозможен: " + reason);// - Выводит сообщение
    }
}