package core;

public class Car // Класс
{
    public String number;      // Переменная типа String
    public int height;         // Переменная типа Integer
    public double weight;      // Переменная типа double
    public boolean hasVehicle; // Переменная типа boolean
    public boolean isSpecial;  // Переменная типа boolean

    public String toString()   // Метод
    {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}