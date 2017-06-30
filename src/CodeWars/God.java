package CodeWars;

/**
 * Вы должны выполнять Божью работу.
 * Метод create должен возвращать массив длиной 2, содержащий объекты,
 * представляющие Адама и Еву.
 *
 * Первым объектом в массиве должен быть экземпляр класса Man.
 * Второй должен быть примером класса «Женщина». Оба объекта должны быть подклассами Человека.
 * Ваша задача - реализовать классы «Человек», «Man и Женщина».
 */

public class God {
    public static Human [] create(){

        return new Human[]{
                new Man(),
                new Woman()
        };

    }
}
class Human {
}

class Man extends Human{
}

class Woman extends Human{
}

