package com.stefan.java.chagay.JavaLessons101.Patterns.Builder;

public class Student {
    private final String rus;
    private final String math;
    private final String chemistry;
    private final String physics;

    public Student(StudentBuilder studentBuilder) {
        this.rus = studentBuilder.rus;
        this.math = studentBuilder.math;
        this.chemistry = studentBuilder.chemistry;
        this.physics = studentBuilder.physics;
    }

    public static class StudentBuilder{

        private String rus;
        private String math;
        private String chemistry;
        private String physics;

        public StudentBuilder rus(final String rus){
            this.rus = rus;
            return this;
        }

        public StudentBuilder math(final String math){
            this.math = math;
            return this;
        }

        public StudentBuilder chemistry(final String chemistry){
            this.chemistry = chemistry;
            return this;
        }

        public StudentBuilder physics(final String physics){
            this.physics = physics;
            return this;
        }

        public String getRus() {
            return rus;
        }

        public String getMath() {
            return math;
        }

        public String getChemistry() {
            return chemistry;
        }

        public String getPhysics() {
            return physics;
        }

        public Student build(){
            return new Student(this);
        }
    }

    public static void main(String[] args) {
            final Student scores = new StudentBuilder()
                                .rus("Хорошо 5")
                                .math("Уговорил 4")
                                .chemistry("Ладно уж 3")
                                .physics("Ты Гений 100")
                                .build();

            String[] sc = {scores.rus,
                    scores.math,
                    scores.chemistry,
                    scores.physics
            };

            for (String s : sc){
                System.out.println(s);
            }

    }

}
