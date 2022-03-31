package com.company;

public class Logic {
    private String text;

    public String encode(String text) {
        //AAABBC -> 3A2B1C
        char[] array = text.toCharArray();
        String word = "";
        int length = array.length;
        int counter = 0;

        for (int i = 0; i < length; i++) {
            counter++;
            while (i < length - 1 && array[i] == array[i + 1]) {
                counter++;
                i++;
            }

            word += counter + "" + array[i];
            counter = 0;
        }

        return word;

    }

    public String decode(String text) {
        //14A2B1C => AAABBC
        char[] array = text.toCharArray();
        String word = "";
        int helperInt = 0;
        String helperString = "";

        for (int i = 0; i < array.length; i ++) {
                if (Character.isDigit(array[i])) {
                    helperString += String.valueOf(array[i]);
                }
                else{
                    helperInt = Integer.parseInt(helperString);
                    for (int j = 0; j < helperInt; j++) {
                        word += String.valueOf(array[i]);
                    }
                    helperInt = 0;
                    helperString = "";
                }

            }
        return word;
        }


}
