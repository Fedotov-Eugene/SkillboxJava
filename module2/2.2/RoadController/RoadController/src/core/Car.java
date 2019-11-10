package core;

public class Car
{
    public String number; // - Переменная типа String
    public int height;    // - Переменная типа int
    public double weight; // - Переменная типа double
    public boolean hasVehicle; // - Переменная типа boolean
    public boolean isSpecial;  // - Переменная типа boolean

    public String toString() // - метод
    {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +  // - Оператор перехода return
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}