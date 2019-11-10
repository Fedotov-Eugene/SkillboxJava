import core.*;
import core.Camera;

import java.util.Scanner;

public class RoadController
{
    private static double passengerCarMaxWeight = 3500.0; // kg - Переменная типа double
    private static int passengerCarMaxHeight = 2000; // mm      - Переменная типа Integer
    public static int controllerMaxHeight = 3500; // mm        - Переменная типа Integer

    private static int passengerCarPrice = 100; // RUB          - Переменная типа Integer
    private static int cargoCarPrice = 250; // RUB              - Переменная типа Integer
    private static int vehicleAdditionalPrice = 200; // RUB     - Переменная типа Integer

    public static void main(String[] args) // Метод (главный)
    {
        System.out.println("Сколько автомобилей сгенерировать?"); // Выводит сообщение в консоль

        Scanner scanner = new Scanner(System.in); /* Переменная типа Scanner (с помощью Scanner(System.in)
        получает значения из консоли*/
        int carsCount = scanner.nextInt(); // Переменная типа Integer (присваивается значение из консоли)

        for(int i = 0; i < carsCount; i++) // Цикл for будет выполнять блок ниже пока значение i будет < carsCount
        {
            Car car = Camera.getNextCar(); // Создает car и присваивает значения из getNextCar()
            System.out.println(car); // Выводит сообщение в консоль

            //Пропускаем автомобили спецтранспорта бесплатно
            if (car.isSpecial) { // услов. опер. (если верно), то выполняется openWay();
                openWay(); // Вызывает метод
                continue; // Оператор перехода (если условие верно, то послед. блоки не выполняются)
            }

            //Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
            int price = calculatePrice(car); // Переменной типа Integer присваивается значение из calculatePrice(car)
            if(price == -1) { // Если условие верно, то выполняется блок ниже
                continue; // Оператор перехода (если условие верно, то послед. блоки не выполняются)
            }

            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }
    }

    /**
     * Расчёт стоимости проезда исходя из массы и высоты
     */
    private static int calculatePrice(Car car) // Метод
    {
        int carHeight = car.height; // Переменная типа Integer
        int price;                  // Переменная типа Integer
        if (carHeight > controllerMaxHeight) // Если высота авто. больше контр.пропуск.пункта, то blockWay("...")
        {
            blockWay("высота вашего ТС привышает высоту пропускного пункта!"); // Вызов метода
            return -1;
        }
        else if (carHeight > passengerCarMaxHeight) /*Условн. опер. (если высота авто. > высоты пасс. авто.),
        то выпол. блок ниже*/
        {
            double weight = car.weight; // Переменной типа double присваивается значение "вес"
            //Грузовой автомобиль
            if (weight > passengerCarMaxWeight)// если вес авто. > веса пасс. авто., то выпол. блок ниже
            {
                price = cargoCarPrice; // переменной присваивается цена за груз.авто.
                if (car.hasVehicle) {  // если условие верно, то выпол. блок ниже
                    price = price + vehicleAdditionalPrice; /*К цене за груз.авто. приплюсовывается цена за доп.авто.
                    (прицеп)*/
                }
            }
            else { // условный оператор
                price = cargoCarPrice; // переменной присваивается цена за груз.авто.
            }
            //Легковой автомобиль
        }
        else { // условный оператор
            price = passengerCarPrice;  // переменной присваивается цена за пасс.авто.
            if (car.hasVehicle){ // если условие верно, то выпол. блок ниже
                price = price + vehicleAdditionalPrice; /*К цене за груз.авто. приплюсовывается цена за доп.авто.
                    (прицеп)*/
            }
        }
        return price; // Возвращает значение
    }

    /**
     * Открытие шлагбаума
     */
    private static void openWay() // Метод
    {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    /**
     * Сообщение о невозможности проезда
     */
    private static void blockWay(String reason) // Метод
    {
        System.out.println("Проезд невозможен: " + reason); /* Выводит сообщение + причина*/
    }
}