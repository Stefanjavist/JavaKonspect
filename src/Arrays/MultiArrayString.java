package Arrays;

public class MultiArrayString {


    public void iMultiArrayString() {
        String[][] multiArray = new String[4][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multiArray[i][j] = " " + i + "" + j;
            }
        }

        System.out.println("\n\nColors array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(multiArray[i][j]);
            }
        }
    }
}

