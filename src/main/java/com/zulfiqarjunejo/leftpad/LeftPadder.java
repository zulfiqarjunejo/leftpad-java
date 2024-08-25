package com.zulfiqarjunejo.leftpad;

public class LeftPadder {
    public String pad(String text, int len) {
        return pad(text, len, ' ');
    }

    public String pad(String text, int len, char ch) {
        if (text.length() >= len) {
            return text;
        }

        var result = new char[len];

        for (int i=len-1, j=text.length()-1; i>=0; i--, j--) {
            if (j<0) {
                result[i] = ch;
            } else {
                result[i] = text.charAt(j);
            }
        }

        return new String(result);
    }
}
