package com.stefan.java.chagay.JavaLessons101.inheritance;

/**
 * java 7 The complete Reference 8th Edition page 198
 */
public class DemoBoxWeight {

    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(2, 2, 4, 5);
        BoxWeight mybox2 = new BoxWeight(23, 2, 3, 1);
        int vol;

        vol= mybox1.volume();
        System.out.println("Volume mybox1 = " + vol);

        vol = mybox2.volume();
        System.out.println("Volume mybox2 = " + vol);
        System.out.println("Weight mybox2 = " + mybox2.weight);

        System.out.println("\n\n");

        Box plainBox= new Box();
        BoxWeight boxWeight = new BoxWeight(3, 3, 3,3);
        int vol1;

        vol1 = boxWeight.volume();
        System.out.println("Volume boxWeight = " + vol1);
        System.out.println("Weight boxWeight = " + boxWeight.weight);

        //присваиваем ссылки на объекты BoxWeight ссылки на объект Box
        plainBox = boxWeight;
        vol1 = plainBox.volume();
        System.out.println("Volume plainBox = " + vol1);
    }
}
