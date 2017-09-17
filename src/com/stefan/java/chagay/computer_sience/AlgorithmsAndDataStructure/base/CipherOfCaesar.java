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
//        System.out.println(ch);
        String ch1 = shiphe00r(sting, 2);
        System.out.println(ch1);
//        System.out.println(ch1);

    }

    private static String shiphe00r(String str, int move) {

        String emptiness = "";
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if(Character.isLetter(curr)){
                char c = (char)(curr + move);
                if (Character.isLowerCase(c)) {
                    if (c > 'z') {
                        emptiness += (char) (curr - (26 - move));
                    } else{
                        emptiness += c;
                    }

                } else if(Character.isUpperCase(c)) {
                    if (c > 'Z') {
                        emptiness += (char) (curr - (26 - move));
                    } else {
                        emptiness += c;
                    }
                }
            } else {
                emptiness += move;
            }

        }
            return emptiness;
    }































}
