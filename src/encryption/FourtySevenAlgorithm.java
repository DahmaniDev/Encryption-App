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
public class FourtySevenAlgorithm {

    public String encryptFourtySevenP(String value) {
        String newStr = "47";
        newStr = newStr + value.length() + ".";
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 4;
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
        newStr = firstGeneratedString + newStr;
        for (int i = 0; i < value.length(); i++) {
            char ch = Character.toLowerCase(value.charAt(i));
            switch (ch) {
                case 'a':
                    newStr = newStr + "#";
                    break;
                case 'b':
                    newStr = newStr + "~";
                    break;
                case 'c':
                    newStr = newStr + "{";
                    break;
                case 'd':
                    newStr = newStr + "}";
                    break;
                case 'e':
                    newStr = newStr + "+";
                    break;
                case 'f':
                    newStr = newStr + "%";
                    break;
                case 'g':
                    newStr = newStr + "=";
                    break;
                case 'h':
                    newStr = newStr + "$";
                    break;
                case 'i':
                    newStr = newStr + "&";
                    break;
                case 'j':
                    newStr = newStr + "-";
                    break;
                case 'k':
                    newStr = newStr + "*";
                    break;
                case 'l':
                    newStr = newStr + "@";
                    break;
                case 'm':
                    newStr = newStr + "/";
                    break;
                case 'n':
                    newStr = newStr + "\\";
                    break;
                case 'o':
                    newStr = newStr + "_";
                    break;
                case 'p':
                    newStr = newStr + "|";
                    break;
                case 'q':
                    newStr = newStr + "[";
                    break;
                case 'r':
                    newStr = newStr + "]";
                    break;
                case 's':
                    newStr = newStr + "a";
                    break;
                case 't':
                    newStr = newStr + "b";
                    break;
                case 'u':
                    newStr = newStr + "c";
                    break;
                case 'v':
                    newStr = newStr + "d";
                    break;
                case 'w':
                    newStr = newStr + "1";
                    break;
                case 'x':
                    newStr = newStr + "2";
                    break;
                case 'y':
                    newStr = newStr + "3";
                    break;
                case 'z':
                    newStr = newStr + "4";
                    break;
                case '0':
                    newStr = newStr + "<";
                    break;
                case '1':
                    newStr = newStr + '>';
                    break;
                case '2':
                    newStr = newStr + "e";
                    break;
                case '3':
                    newStr = newStr + 'f';
                    break;
                case '4':
                    newStr = newStr + 'g';
                    break;
                case '5':
                    newStr = newStr + "h";
                    break;
                case '6':
                    newStr = newStr + "5";
                    break;
                case '7':
                    newStr = newStr + "6";
                    break;
                case '8':
                    newStr = newStr + "7";
                    break;
                case '9':
                    newStr = newStr + "8";
                    break;
                case ' ':
                    newStr = newStr + "µ";
                    break;
                case '.':
                    newStr = newStr + "!";
                    break;
                case ',':
                    newStr = newStr + "i";
                    break;
                case ';':
                    newStr = newStr + "j";
                    break;
                case '(':
                    newStr = newStr + "k";
                    break;
                case ')':
                    newStr = newStr + "l";
                    break;
                case '/':
                    newStr = newStr + ":";
                    break;
                case '*':
                    newStr = newStr + ";";
                    break;
                case '-':
                    newStr = newStr + "9";
                    break;
                case '+':
                    newStr = newStr + "0";
                    break;
                case '%':
                    newStr = newStr + "?";
                    break;
                default:
                    newStr = newStr + ch;
                    break;
            }
        }
        newStr = newStr + generatedString + "P";
        return newStr;
    }
    
    public String decryptFourtySevenP(String value){
        int len;
        String x="";
        try{
            len = Integer.parseInt(value.substring(5, value.indexOf(".")));
            x = value.substring(value.indexOf(".")+1, value.indexOf(".")+1+len);
        }catch(Exception e){
            return "Error decrypting your entry";
        }
        
        String newStr ="";
        for (int i = 0; i < x.length(); i++) {
            char ch = Character.toLowerCase(x.charAt(i));
            switch (ch) {
                case '#':
                    newStr = newStr + "a";
                    break;
                case '~':
                    newStr = newStr + "b";
                    break;
                case '{':
                    newStr = newStr + "c";
                    break;
                case '}':
                    newStr = newStr + "d";
                    break;
                case '+':
                    newStr = newStr + "e";
                    break;
                case '%':
                    newStr = newStr + "f";
                    break;
                case '=':
                    newStr = newStr + "g";
                    break;
                case '$':
                    newStr = newStr + "h";
                    break;
                case '&':
                    newStr = newStr + "i";
                    break;
                case '-':
                    newStr = newStr + "j";
                    break;
                case '*':
                    newStr = newStr + "k";
                    break;
                case '@':
                    newStr = newStr + "l";
                    break;
                case '/':
                    newStr = newStr + "m";
                    break;
                case '\\':
                    newStr = newStr + "n";
                    break;
                case '_':
                    newStr = newStr + "o";
                    break;
                case '|':
                    newStr = newStr + "p";
                    break;
                case '[':
                    newStr = newStr + "q";
                    break;
                case ']':
                    newStr = newStr + "r";
                    break;
                case 'a':
                    newStr = newStr + "s";
                    break;
                case 'b':
                    newStr = newStr + "t";
                    break;
                case 'c':
                    newStr = newStr + "u";
                    break;
                case 'd':
                    newStr = newStr + "v";
                    break;
                case '1':
                    newStr = newStr + "w";
                    break;
                case '2':
                    newStr = newStr + "x";
                    break;
                case '3':
                    newStr = newStr + "y";
                    break;
                case '4':
                    newStr = newStr + "z";
                    break;
                case '<':
                    newStr = newStr + "0";
                    break;
                case '>':
                    newStr = newStr + '1';
                    break;
                case 'e':
                    newStr = newStr + "2";
                    break;
                case 'f':
                    newStr = newStr + '3';
                    break;
                case 'g':
                    newStr = newStr + '4';
                    break;
                case 'h':
                    newStr = newStr + "5";
                    break;
                case '5':
                    newStr = newStr + "6";
                    break;
                case '6':
                    newStr = newStr + "7";
                    break;
                case '7':
                    newStr = newStr + "8";
                    break;
                case '8':
                    newStr = newStr + "9";
                    break;
                case 'µ':
                    newStr = newStr + " ";
                    break;
                case '!':
                    newStr = newStr + ".";
                    break;
                case 'i':
                    newStr = newStr + ",";
                    break;
                case 'j':
                    newStr = newStr + ";";
                    break;
                case 'k':
                    newStr = newStr + "(";
                    break;
                case 'l':
                    newStr = newStr + ")";
                    break;
                case ':':
                    newStr = newStr + "/";
                    break;
                case ';':
                    newStr = newStr + "*";
                    break;
                case '9':
                    newStr = newStr + "-";
                    break;
                case '0':
                    newStr = newStr + "+";
                    break;
                case '?':
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
