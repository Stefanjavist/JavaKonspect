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
        String sting = "hello";

        String ch1 = shiphe00r(sting, 2);
        System.out.println(ch1);
        System.out.println(deCipher(ch1, 2));

    }

    private static String shiphe00r(String str, int key) {
        if(key > 26) {
            key = key % 26;
        } else if(key < 0) {
            key = (key % 26) + 26;
        }

        String rope = "";
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if(Character.isLetter(a)) {

                if(Character.isLowerCase(a)) {
                    char ciherChar = (char) (a+key);
                    if(ciherChar > 'z') {
                        rope += (char) (ciherChar-(26-key));
                    } else{
                        rope += ciherChar;
                    }
                }

                if(Character.isUpperCase(a)) {
                    char ciherChar = (char) (a+key);
                    if(ciherChar > 'Z') {
                        rope += (char) (ciherChar-(26-key));
                    } else {
                        rope += ciherChar;
                    }
                }
            }else return "error it's isn't letter";
        }
        return rope;
    }
}
