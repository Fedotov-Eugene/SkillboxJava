public class Loader {
    public static void main(String[] args) {
        /*// Кормим кошку, взрываем, вызываем ее статус и проверяем количество
        Cat cat = new Cat();
        System.out.println(cat.getWeight() + " " + cat.getStatus());
        System.out.println(cat.getCount());

        cat.feed(9000.0);
        System.out.println(cat.massFood());


        System.out.println(cat.getWeight() + " " + cat.getStatus());
        System.out.println(cat.getCount());

        System.out.println(cat.massFood());

        cat.meow();

        System.out.println(cat.massFood());

        cat.feed(9000.0);

        System.out.println(cat.getCount());
        cat.meow();

        System.out.println(cat.getCount());


        System.out.println(cat.getWeight() + " " + cat.getStatus());*/

        /*Cat cat = new Cat();
        cat.feed(200.0);
        System.out.println(cat.getWeight());
        cat.meow();
        cat.feed(300.0);

        System.out.println("Количество съеденной еды: " + cat.massFood());*/

       /* // Замяукать кошку до смерти
        Cat cat1 = new Cat();
        System.out.println(cat1.getWeight() + " " + cat1.getStatus());
        while (!cat1.getStatus().equals("Dead"))
        {
            cat1.meow();
        }

        System.out.println(cat1.getWeight() + " " + cat1.getStatus());

        cat1.meow();

        System.out.println(cat1.getWeight() + " " + cat1.getStatus());

        cat1.feed(9000.0);

        System.out.println(cat1.getWeight() + " " + cat1.getStatus());*/

        /*Cat sir = new Cat();
        sir.setColor(CatColor.GINGER);
        System.out.println(sir.getColor());

        Cat dum = new Cat();
        dum.setColor(CatColor.BLACK);
        System.out.println(dum.getColor());*/

        /*Cat sir = new Cat(1500.0, "Думмис", CatColor.BLACK);
        sir.setName("Сири");
        System.out.println(sir.getWeight());
        System.out.println(sir.getName());
        System.out.println(sir.getColor());*/

        /*Cat sir = new Cat();
        sir.setName("Сири");
        Cat copyCat = sir.copyCat();

        System.out.println(sir.getName() + " = " + copyCat.getName());

        copyCat.setName("Думмис");

        System.out.println(sir.getName() + " != " + copyCat.getName());*/

        /*// Попытался задать вес и имя через метод генерации
        Cat dum = generateCat(500.0, "Думмис", CatColor.WHITE);
        System.out.println(dum.getName() + " " + dum.getWeight() + " " + dum.getColor());*/

        /*//задание 7
        Cat dum = new Cat("Думмис");
        dum.feed(500.0);

        System.out.println("Имя кошки: " + dum.getName()
                + "\nСтатус кошки: " + dum.getStatus()
                + "\nКоличество кошек: " + Cat.getCount() + " шт.");
        testMethodCopyCat(dum);*/

        Cat sir = new Cat(1500.0, "Сири", CatColor.GINGER);
        sir.feed(500.0);


        System.out.println("Имя: " + sir.getName() +
                "\nСтатус: " + sir.getStatus() +
                "\nВес: " + sir.getWeight() +
                "\nЦвет: " + sir.getColor() +
                "\n****************************************************");

        Cat copySir = sir.copyCat();        // Копируем кошку
        copySir.setName("копия Сири");
        copySir.setColor(CatColor.BLACK);

        copySir.feed(500.0);
        copySir.meow();
        copySir.feed(500.0);

        System.out.println("Имя: " + copySir.getName() +
                "\nСтатус: " + copySir.getStatus() +
                "\nВес: " + copySir.getWeight() +
                "\nЦвет: " + copySir.getColor() +
                "\n****************************************************");


        System.out.println("Имя: " + sir.getName() +
                "\nСтатус: " + sir.getStatus() +
                "\nВес: " + sir.getWeight() +
                "\nЦвет: " + sir.getColor() +
                "\n****************************************************");
        System.out.println("Количество кошек: " + Cat.getCount() + " шт.");
        System.out.println("Количество съеденной еды копией кошки Сири: " + copySir.massFood());
    }

    /*private static void testMethodCopyCat(Cat dum) {
        Cat copyCat = Cat.copyCat(dum);
        if (copyCat != null) {
            copyCat.setName("копия Думмис");
            copyCat.feed(500.0);
            System.out.println("Имя кошки: " + copyCat.getName()
                    + "\nСтатус кошки: " + copyCat.getStatus()
                    + "\nКоличество кошек: " + Cat.getCount() + " шт.");
        }
    }*/

    public static Cat generateCat(Double weight, String name, CatColor color) {
        return new Cat(weight, name, color);
    }
}