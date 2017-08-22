package com.stefan.java.chagay.JavaLessons101.Model8lesson1;


public class Human {

    Relations relations;
    Relations.Length length;
    String name;
    int age;

//    public enum Relations {
//        DIVORCED, ACTIVE_SEARCH,
//        SINGLE, COMPLEX
//    }

    private static void staticMethod() {
        System.out.println("success");
    }

    static public class Relations{

        private final String nameRelation;

        public Relations(String nameRelation) {
            this.nameRelation = nameRelation;
        }


        public String getNameRelation() {
            return nameRelation;
        }

        static public class Length {

            final private int month;

            public Length(int month) {
                this.month = month;
            }

            public int getMonth() {
                return month;
            }
        }

    }
}
