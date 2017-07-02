package TransferOfParameters;


public class Test {

    public void math (int a, int b){
        a *=2;
        b /=2;
    }


    public static void main(String[] args) {
        Test test = new Test();
        int a = 10;
        int b = 8;
        System.out.println("до " + a + " " + b);
        test.math(a, b);
        System.out.println("после " + a + " " + b);
    }
}
