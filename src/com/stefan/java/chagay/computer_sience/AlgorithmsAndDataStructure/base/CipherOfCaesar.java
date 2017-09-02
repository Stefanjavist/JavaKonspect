package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.base;


public class CipherOfCaesar {

    private static String cipher(String sting, int key) {

        if (key > 26) {
            key = key % 26;
        } else if (key < 0) {
            key = (key % 26) + 26;
        }

        String cipherText = "";
        for (int j = 0; j < sting.length(); j++) {
            char m = sting.charAt(j);
            if (Character.isLetter(m)) {
                if (Character.isLowerCase(m)) {
                    char c = (char) (m + key);
                    if (c > 'z') {
                        cipherText += (char) (m - (26 - key));
                    } else {
                        cipherText += c;
                    }
                } else if (Character.isUpperCase(m)) {
                    char c = (char) (m + key);
                    if (c > 'Z') {
                        cipherText += (char) (m - (26 - key));
                    } else {
                        cipherText += c;
                    }
                }

            } else {
                cipherText += key;
            }
        }

        return cipherText;
    }

    private static String deCipher(String sting, int key) {

        if (key > 26) {
            key = key % 26;
        } else if (key < 0) {
            key = (key % 26) + 26;
        }

        String cipherText = "";
        for (int j = 0; j < sting.length(); j++) {
            char m = sting.charAt(j);
            if (Character.isLetter(m)) {
                if (Character.isLowerCase(m)) {
                    char c = (char) (m - key);//!!!
                    if (c < 'a') {
                        cipherText += (char) (m + (26 - key));
                    } else {
                        cipherText += c;
                    }
                } else if (Character.isUpperCase(m)) {
                    char c = (char) (m + key);
                    if (c < 'A') {
                        cipherText += (char) (m + (26 - key));
                    } else {
                        cipherText += c;
                    }
                }

            } else {
                cipherText += key;
            }
        }

        return cipherText;
    }

    public static void main(String[] args) {
        String sting = "zZzo";

        String ch = cipher( sting, 2);
//        String ch1 = deCipher(ch, 6);
        System.out.println(ch);
//        System.out.println(ch1);

    }


}
