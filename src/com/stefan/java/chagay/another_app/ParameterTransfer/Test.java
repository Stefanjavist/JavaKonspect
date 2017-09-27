package com.stefan.java.chagay.another_app.ParameterTransfer;


public class Test {

    public static void main(String[] args) {
        Test start = new Test();

        Car car1 = new Car("BMV");
        start.test1(car1);

        System.out.println("car.getName() = " + car1.getName());

        int i= 2;// [1]-ая эта переменная никак не изменяется второй переменной
        start.test2(i);
        System.out.println("i = " + i);

        start.test3(car1);

        Car car2 = new Car("TESLA");
        start.test4(car1, car2);
    }


    public void test1(Car car) {
        car.setName("Toyota");//меняет
    }

    public void test2(int i){
        i=6;// [2]-ая переменная никак не влияет на перевую переменную
        System.out.println("i = "+i);
    }

    public void test3(Car car){
        car = new Car("NIVA");
        test5(car);
    }

    /**передача большого количество параметров (VarArgs)
     * @param cars
     */
    public void test4(Car... cars) {
        System.out.println("cars.length ="+ cars.length);
    }

    public void test5(Car car) {
        System.out.println( car.getName());

    }

}
