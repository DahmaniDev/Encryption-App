/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

import java.util.Random;

/**
 *
 * @author Dahmani
 */
public class EightyEightAlgorithm {

    public String encryptEightyEightP(String value) {
        String newStr = "";
        newStr = value.length() + ".88." + newStr;
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 3;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        String firstGeneratedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(3)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        newStr = firstGeneratedString + newStr + generatedString;
        for (int i = 0; i < value.length(); i++) {
            char ch = Character.toLowerCase(value.charAt(i));
            switch (ch) {
                case 'a':
                    newStr = newStr + "k";
                    break;
                case 'b':
                    newStr = newStr + "j";
                    break;
                case 'c':
                    newStr = newStr + "i";
                    break;
                case 'd':
                    newStr = newStr + "h";
                    break;
                case 'e':
                    newStr = newStr + "g";
                    break;
                case 'f':
                    newStr = newStr + "x";
                    break;
                case 'g':
                    newStr = newStr + "y";
                    break;
                case 'h':
                    newStr = newStr + "w";
                    break;
                case 'i':
                    newStr = newStr + "z";
                    break;
                case 'j':
                    newStr = newStr + "&";
                    break;
                case 'k':
                    newStr = newStr + "#";
                    break;
                case 'l':
                    newStr = newStr + "{";
                    break;
                case 'm':
                    newStr = newStr + "£";
                    break;
                case 'n':
                    newStr = newStr + "$";
                    break;
                case 'o':
                    newStr = newStr + "µ";
                    break;
                case 'p':
                    newStr = newStr + "s";
                    break;
                case 'q':
                    newStr = newStr + "r";
                    break;
                case 'r':
                    newStr = newStr + "q";
                    break;
                case 's':
                    newStr = newStr + "p";
                    break;
                case 't':
                    newStr = newStr + "/";
                    break;
                case 'u':
                    newStr = newStr + "*";
                    break;
                case 'v':
                    newStr = newStr + "-";
                    break;
                case 'w':
                    newStr = newStr + "+";
                    break;
                case 'x':
                    newStr = newStr + "l";
                    break;
                case 'y':
                    newStr = newStr + "m";
                    break;
                case 'z':
                    newStr = newStr + "n";
                    break;
                case '0':
                    newStr = newStr + "|";
                    break;
                case '1':
                    newStr = newStr + '!';
                    break;
                case '2':
                    newStr = newStr + "?";
                    break;
                case '3':
                    newStr = newStr + ';';
                    break;
                case '4':
                    newStr = newStr + ':';
                    break;
                case '5':
                    newStr = newStr + "t";
                    break;
                case '6':
                    newStr = newStr + "u";
                    break;
                case '7':
                    newStr = newStr + "v";
                    break;
                case '8':
                    newStr = newStr + ".";
                    break;
                case '9':
                    newStr = newStr + "%";
                    break;
                case ' ':
                    newStr = newStr + "@";
                    break;
                case '.':
                    newStr = newStr + "a";
                    break;
                case ',':
                    newStr = newStr + "b";
                    break;
                case ';':
                    newStr = newStr + "c";
                    break;
                case '(':
                    newStr = newStr + "d";
                    break;
                case ')':
                    newStr = newStr + "e";
                    break;
                case '/':
                    newStr = newStr + "f";
                    break;
                case '*':
                    newStr = newStr + "<";
                    break;
                case '-':
                    newStr = newStr + ">";
                    break;
                case '+':
                    newStr = newStr + "~";
                    break;
                case '%':
                    newStr = newStr + " ";
                    break;
                default:
                    newStr = newStr + ch;
                    break;
            }
        }
        newStr = newStr + "P";
        return newStr;
    }

    public String decryptEightyEightP(String value) {
        int len;
        String x = "";
        try {
            len = Integer.parseInt(value.substring(3, value.indexOf(".")));
            x = value.substring(value.length() - len - 1, value.length() - 1);
        } catch (Exception e) {
            return "Error decrypting your entry";
        }
        
        String newStr ="";
        for (int i = 0; i < x.length(); i++) {
            char ch = Character.toLowerCase(x.charAt(i));
            switch (ch) {
                case 'k':
                    newStr = newStr + "a";
                    break;
                case 'j':
                    newStr = newStr + "b";
                    break;
                case 'i':
                    newStr = newStr + "c";
                    break;
                case 'h':
                    newStr = newStr + "d";
                    break;
                case 'g':
                    newStr = newStr + "e";
                    break;
                case 'x':
                    newStr = newStr + "f";
                    break;
                case 'y':
                    newStr = newStr + "g";
                    break;
                case 'w':
                    newStr = newStr + "h";
                    break;
                case 'z':
                    newStr = newStr + "i";
                    break;
                case '&':
                    newStr = newStr + "j";
                    break;
                case '#':
                    newStr = newStr + "k";
                    break;
                case '{':
                    newStr = newStr + "l";
                    break;
                case '£':
                    newStr = newStr + "m";
                    break;
                case '$':
                    newStr = newStr + "n";
                    break;
                case 'µ':
                    newStr = newStr + "o";
                    break;
                case 's':
                    newStr = newStr + "p";
                    break;
                case 'r':
                    newStr = newStr + "q";
                    break;
                case 'q':
                    newStr = newStr + "r";
                    break;
                case 'p':
                    newStr = newStr + "s";
                    break;
                case '/':
                    newStr = newStr + "t";
                    break;
                case '*':
                    newStr = newStr + "u";
                    break;
                case '-':
                    newStr = newStr + "v";
                    break;
                case '+':
                    newStr = newStr + "w";
                    break;
                case 'l':
                    newStr = newStr + "x";
                    break;
                case 'm':
                    newStr = newStr + "y";
                    break;
                case 'n':
                    newStr = newStr + "z";
                    break;
                case '|':
                    newStr = newStr + "0";
                    break;
                case '!':
                    newStr = newStr + '1';
                    break;
                case '?':
                    newStr = newStr + "2";
                    break;
                case ';':
                    newStr = newStr + '3';
                    break;
                case ':':
                    newStr = newStr + '4';
                    break;
                case 't':
                    newStr = newStr + "5";
                    break;
                case 'u':
                    newStr = newStr + "6";
                    break;
                case 'v':
                    newStr = newStr + "7";
                    break;
                case '.':
                    newStr = newStr + "8";
                    break;
                case '%':
                    newStr = newStr + "9";
                    break;
                case '@':
                    newStr = newStr + " ";
                    break;
                case 'a':
                    newStr = newStr + ".";
                    break;
                case 'b':
                    newStr = newStr + ",";
                    break;
                case 'c':
                    newStr = newStr + ";";
                    break;
                case 'd':
                    newStr = newStr + "(";
                    break;
                case 'e':
                    newStr = newStr + ")";
                    break;
                case 'f':
                    newStr = newStr + "/";
                    break;
                case '<':
                    newStr = newStr + "*";
                    break;
                case '>':
                    newStr = newStr + "-";
                    break;
                case '~':
                    newStr = newStr + "+";
                    break;
                case ' ':
                    newStr = newStr + "%";
                    break;
                default:
                    newStr = newStr + ch;
                    break;
            }
        }
        return newStr;
    }
}
