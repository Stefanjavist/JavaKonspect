package com.stefan.java.chagay.PassByValue;


public class ChangeState {

    public static class Clain {
        public String name;
    }

    public static void main(String[] args) {
        Clain clain = new Clain();
        clain.name = "Bug";
        processClain(clain);
        System.out.println(clain.name);
    }

    private static void processClain(Clain value/*это новая ссылка на тот же объект*/) {
       // value = new Clain();// а если мы делаем так, то создаём новый объект который
                            // уже не ссылается на объект с ссылкой clain
        value.name = "another bug";
    }

}
