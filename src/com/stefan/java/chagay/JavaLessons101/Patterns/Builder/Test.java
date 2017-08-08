package com.stefan.java.chagay.JavaLessons101.Patterns.Builder;


public class Test {

    private final String fruit;
    private final String veggie;
    private final String sweet;
    private final String meat;

    public Test(TestBuilder testBuilder) {
        this.fruit = testBuilder.fruit;
        this.veggie = testBuilder.veggie;
        this.sweet = testBuilder.sweet;
        this.meat = testBuilder.meat;
    }

    public static class TestBuilder {

        private String fruit;
        private String veggie;
        private String sweet;
        private String meat;

        public TestBuilder fruit(final String fruit) {
            this.fruit = fruit;
            return this;
        }

        public TestBuilder veggie(final String veggie) {
            this.veggie = veggie;
            return this;
        }

        public TestBuilder sweet(final String sweet) {
            this.sweet = sweet;
            return this;
        }

        public TestBuilder meat(final String meat) {
            this.meat = meat;
            return this;
        }

        public String getFruit() {
            return fruit;
        }

        public String getVeggie() {
            return veggie;
        }

        public String getSweet() {
            return sweet;
        }

        public String getMeat() {
            return meat;
        }

        public Test build() {
            return new Test(this);
        }
    }

    public static void main(String[] args) {
        final Test test = new TestBuilder()
                                        .fruit("2 apples")
                                        .meat("3 cheek")
                                        .sweet("23 lollipops")
                                        .veggie("45 carrots")
                                        .build();



    }
}
