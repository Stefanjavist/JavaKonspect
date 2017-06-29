package Arrays;


public class StringArray {


    private final int COUNT = 0;
    String mass[] = {
            "This",
            "is",
            "java",
            "baby"
    };

    public void traceMass() {
        System.out.println(mass[COUNT]);
        for (int i = 1; i < mass.length; i++) {
            System.out.println(" " + mass[i]);
        }
    }


}
