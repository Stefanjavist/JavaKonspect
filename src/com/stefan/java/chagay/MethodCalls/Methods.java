package com.stefan.java.chagay.MethodCalls;

public class Methods {

    public static void main(String[] args) {
        Methods methods = new Methods();

        //матршёка
        methods.printName(methods.getNewValue(methods.getString()));

       // вызов и возврат результата метода в качестве return для другог метода(типы должны совпадать)
        methods.printName(methods.returnMethod());

        //Вызов метода, который в конце снова вызывает себя до тех пор, пока не выполнится определенное условие («рекурсия»)
        System.out.println(methods.recursive(-4));//теперь тут будет 10 вмето 9
        //или рад чиселкончая 10-ю
    }

    public int recursive(int value){
        value+=1;
        if(value==10){
            return value;
        }

        System.out.println(value);

        return recursive(value);//рекурсия

    }

    private String getString() {

        return "new string";
    }
       //string - это то что вернул метод getString
    private String getNewValue(String string) {
        return string + " and new value!";
    }

    private void printName(String value) {
        System.out.println("value = " + value);

    }

    private String returnMethod() {
        return getNewValue("Return value :)");
    }

    private String getNomber(int i) {
        if(i==0){
            return "error";
        }else

        //body method

        if(i<0) {
            return "negative";
        }else{//else можно убрать и ничего не поменяется!!!
            return "unknown";
        }

    }

    public void returnExampleVoid(int count){
        if(count==0){
            return;//досрочный выход из метода
        }

        //тело метода
    }
}
