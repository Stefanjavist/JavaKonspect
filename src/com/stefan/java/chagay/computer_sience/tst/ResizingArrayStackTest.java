package com.stefan.java.chagay.computer_sience.tst;


import com.stefan.java.chagay.computer_sience.examples.algo4.ResizingArrayStack;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;
import static junit.framework.TestCase.fail;

public class ResizingArrayStackTest {


    @Test
    public void checkResizeWhenZero()throws Exception {
        ResizingArrayStack resArr = new ResizingArrayStack();
        resArr.resize(0);
        try{
            resArr.pop();
            fail();
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Mistake please change size");
        }
    }


}
