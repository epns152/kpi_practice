package practice.practice_6;

import java.util.Locale;

public class Practice_6_methods {

    public String doubleChar (String str) {
        char[] strCh = str.toCharArray();
        char[] result = new char[strCh.length * 2];
        for (int i = 0, j = 0; j < strCh.length; i++, j++) {
            result[i] = strCh[j];
            result[++i] = strCh[j];
        }
        return String.copyValueOf(result);
    }

    public int sumDigits(String str) {
        char[] strCh = str.toCharArray();
        int result = 0;
        for (char ch : strCh) {
            if (Character.isDigit(ch)) {
                result += Integer.parseInt(String.valueOf(ch));
            }
        }
        return result;
    }

    public boolean catDog (String str) {
        char[] strCh = str.toCharArray();
        int cats = 0, dogs = 0;
        for (int i = 0; i < strCh.length; i++) {
            if (strCh.length - i >= 3) {
                if (strCh[i] == 'c' && strCh[i + 1] == 'a' && strCh[i + 2] == 't') {
                    cats++;
                }
                if (strCh[i] == 'd' && strCh[i + 1] == 'o' && strCh[i + 2] == 'g') {
                    dogs++;
                }
            }
        }

        if (dogs == 0 && cats == 0) {
            return false;
        }

        return cats == dogs;
    }

    public boolean endOther (String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] str1Ch = str1.toCharArray();
        char[] str2Ch = str2.toCharArray();
        if (str1Ch.length > str2Ch.length) {
            for (int i = str2Ch.length - 1, j = str1Ch.length - 1; i > 0; i--, j--) {
                if (!(str1Ch[j] == str2Ch[i])) {
                    return false;
                }
            }
        } else {
            for (int i = str1Ch.length - 1, j = str2Ch.length - 1; i > 0; i--, j--) {
                if (!(str2Ch[j] == str1Ch[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
