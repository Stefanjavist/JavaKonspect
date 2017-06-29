package Arrays;

import Arrays.ArraySimple;
import Arrays.MultiArrayString;
import Arrays.StringArray;

public class Main {

    public static void main(String[] args) {
        StringArray stringArray = new StringArray();
        stringArray.traceMass();

        ArraySimple arrays = new ArraySimple();
        arrays.iArray();

        MultiArrayString mulArrStr = new MultiArrayString();
        mulArrStr.iMultiArrayString();

    }
}
