package com.zulfiqarjunejo.leftpad;

public class LeftPadder {
    public String pad(String text, int len) {
        return pad(text, len, ' ');
    }

    public String pad(String text, int len, char ch) {
        var textLength = text.length();
        if (textLength >= len) {
            return text;
        }

        var result = new char[len];
        
        var j = textLength - 1;
        for (int i=len-1; i>=0; i--) {
            if (i<textLength && j<0) {
                result[i] = ch;
            } else {
                result[i] = text.charAt(j--);
            }
        }

        return new String(result);
    }
}
