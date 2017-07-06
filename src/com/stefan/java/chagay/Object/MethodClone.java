package com.stefan.java.chagay.Object;


public class MethodClone {
    /**
     * Метод предназначен для создания копии объекта, у которого вы вызываете этот метод.
     * Еще раз вспомним, что наши переменные на объекты — это ссылки.
     * Не реальные объекты, а ссылки, которые указывают на объекты, которые создаются с помощью ключевого слова new.
     * Я бы хотел, чтобы вы это очень хорошо усвоили. Подкрепим это примером.
     */

    private int a;
    private String name;

    public MethodClone(int a, String name) {
        this.a = a;
        this.name = name;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        /**
         * две ссылки указывают на одини тот же объект: MethodClone
         */
        MethodClone o1 = new MethodClone(1, "lol");
        MethodClone o2 = o1;

        o1.a = 12;
        o2.a = 2;
        o2.a = 1;

        System.out.println(o1.a + o1.a);

        MethodClone a1 = new MethodClone(2, "lil");
        MethodClone a2 =(MethodClone) a1.clone();
    }


}
