package com.stefan.java.chagay.philosophyJava.static_in_java.explicit_initialization;


public class Cup {

    Cup(int marker){
        System.out.println("Cup("+marker+")");
    }
    void f(int marker) {
        System.out.println("f("+marker+")");
    }

    /**
     * 3/есть в java initialization_in_java block, с помощью которого можно инициал статик объекты, он выполняется только один раз
     */
    private static class Cups {
        static Cup cup1;
        static Cup cup2;
        static {
            cup1 = new Cup(1);
            cup2 = new Cup(2);
        }
    }

    public static void main(String[] args) {
        System.out.println("inside main()");
        Cups.cup1.f(99);//(1)
    }

    /**
     * 1/initialization_in_java in java инициализируется только один раз пример:
     (так нельзя)
     initialization_in_java Cups cups1 = new Cups();
     initialization_in_java Cups cups1 = new Cups();
     */
//    initialization_in_java Cups cups1 = new Cups();//(2)
//    initialization_in_java Cups cups2 = new Cups();//(2)
}
