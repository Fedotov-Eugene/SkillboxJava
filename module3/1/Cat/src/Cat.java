
public class Cat {
    public static final int COUNT_OF_EYES = 2;         // Количество глаз у кошки
    public static final double MIN_WEIGHT = 1000.0;    // Мин. вес кошки
    public static final double MAX_WEIGHT = 9000.0;    // Мин. вес кошки

    private double originWeight; // Модификатор доступа private - члены классы доступны только внутри класса,
    // тип double - примитив - число с плавающей точкой( вещественное ),
    // originWeiht - имя (индификатор) поля экземпляра класса
    private double weight;       // weight- имя (индификатор) поля экземпляра класса

    private double minWeight;    // minWeight - имя (индификатор) поля экземпляра класса
    private double maxWeight;    // maxWeight - имя (индификатор) поля экземпляра класса

    private double massFood;
    private static int count;    // Модификатор доступа private - члены классы доступны только внутри класса,
    // тип int - примитив - Целочисленное число, count - имя (индификатор) поля экземпляра класса
    private CatColor color;
    private String name;

    public Cat() // Модификатор доступа public - члены класс доступны всем, Cat() - имя (индификатор) конструктора
    //(его список параметров конструктора пуст)
    {
        this(1500.0 + 3000.0 * Math.random());
    }

    public Cat(Double weight) // Модификатор доступа public - члены класс доступны всем,
    // Cat() - имя (индификатор) конструктора, список параметров передает параметр weight c
    {
        this.weight = weight;
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }

    public Cat(String name) {
        this();
        this.name = name;
    }

    public Cat(Double weight, String name, CatColor color) {
        this.weight = weight;
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        if (this.weight > minWeight && this.weight < maxWeight) {
            count++;
        }
        this.name = name;
        this.color = color;

    }


    public Cat copyCat() {
        Cat copyCat = new Cat(getWeight(), getName(), getColor());
        return copyCat;

       /* if (cat.getStatus().equals("Dead") || cat.getStatus().equals("Exploded")){
            return null;
        }
        Cat copyCat = new Cat(cat.getName());
        return copyCat;*/
    }

    public double massFood() {

        //massFood = weight - originWeight;

        if (massFood < 0) {
            massFood = 0;
        }
        return massFood;
    }

    public static int getCount() {
        return count;
    }

    public void meow() {
        if (getStatus().equals("Playing") || getStatus().equals("Sleeping")) {

            weight = weight -1;

            System.out.println("Meow");

            if (getStatus().equals("Dead")) {
                count--;
            }

        } else {
            System.out.println("Кошка не может мяукнуть, она сдохла!!!");
        }

    }

    public void catDefecate() {
        if (getStatus().equals("Playing") || getStatus().equals("Sleeping")) {

            weight--;

            System.out.println("Кошка сходила в туалет");

            if (getStatus().equals("Dead")) {
                count--;
            }

        } else {
            System.out.println("Кошка не может сходить в туалет, она сдохла!!!");
        }
    }

    public void feed(Double amount) {
        if (getStatus().equals("Playing") || getStatus().equals("Sleeping")) {
            massFood += amount;
            weight = weight + amount;
            System.out.println("Чафк! " + "Чафк! " + "Чафк! ");

            if (getStatus().equals("Exploded")) {
                count--;
            }

        } else {
            System.out.println("Кошку нельзя покормить, она сдохла!!!");
        }
    }

    public void drink(Double amount) {
        if (getStatus().equals("Playing") || getStatus().equals("Sleeping")) {
            weight = weight + amount;
            System.out.println("Хлюп! " + "Хлюп! " + "Хлюп! ");

            if (getStatus().equals("Exploded")) {
                count--;
            }

        } else {
            System.out.println("Кошку нельзя покормить, она сдохла!!!");
        }
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    public void setColor(CatColor color) {
        this.color = color;
    }

    public CatColor getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}