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
public class FiftyFiveAlgorithm {
    
    
    public String encryptFiftyFiveP(String value) {
        String newStr = "55";
        newStr = newStr + "P" + value.length() + ".";
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 5;
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
                    newStr = newStr + "z";
                    break;
                case 'b':
                    newStr = newStr + "w";
                    break;
                case 'c':
                    newStr = newStr + "f";
                    break;
                case 'd':
                    newStr = newStr + "y";
                    break;
                case 'e':
                    newStr = newStr + "b";
                    break;
                case 'f':
                    newStr = newStr + "$";
                    break;
                case 'g':
                    newStr = newStr + "&";
                    break;
                case 'h':
                    newStr = newStr + "e";
                    break;
                case 'i':
                    newStr = newStr + "=";
                    break;
                case 'j':
                    newStr = newStr + "£";
                    break;
                case 'k':
                    newStr = newStr + "5";
                    break;
                case 'l':
                    newStr = newStr + "c";
                    break;
                case 'm':
                    newStr = newStr + "q";
                    break;
                case 'n':
                    newStr = newStr + "-";
                    break;
                case 'o':
                    newStr = newStr + "~";
                    break;
                case 'p':
                    newStr = newStr + "a";
                    break;
                case 'q':
                    newStr = newStr + "#";
                    break;
                case 'r':
                    newStr = newStr + "n";
                    break;
                case 's':
                    newStr = newStr + "<";
                    break;
                case 't':
                    newStr = newStr + "+";
                    break;
                case 'u':
                    newStr = newStr + "@";
                    break;
                case 'v':
                    newStr = newStr + "3";
                    break;
                case 'w':
                    newStr = newStr + "4";
                    break;
                case 'x':
                    newStr = newStr + "µ";
                    break;
                case 'y':
                    newStr = newStr + "d";
                    break;
                case 'z':
                    newStr = newStr + "/";
                    break;
                case '0':
                    newStr = newStr + "|";
                    break;
                case '1':
                    newStr = newStr + '!';
                    break;
                case '2':
                    newStr = newStr + "%";
                    break;
                case '3':
                    newStr = newStr + 'x';
                    break;
                case '4':
                    newStr = newStr + 'm';
                    break;
                case '5':
                    newStr = newStr + "8";
                    break;
                case '6':
                    newStr = newStr + "*";
                    break;
                case '7':
                    newStr = newStr + "k";
                    break;
                case '8':
                    newStr = newStr + "7";
                    break;
                case '9':
                    newStr = newStr + "h";
                    break;
                case ' ':
                    newStr = newStr + "2";
                    break;
                case '.':
                    newStr = newStr + ">";
                    break;
                case ',':
                    newStr = newStr + "1";
                    break;
                case ';':
                    newStr = newStr + "s";
                    break;
                case '(':
                    newStr = newStr + "6";
                    break;
                case ')':
                    newStr = newStr + "i";
                    break;
                case '/':
                    newStr = newStr + "0";
                    break;
                case '*':
                    newStr = newStr + "?";
                    break;
                case '-':
                    newStr = newStr + "9";
                    break;
                case '+':
                    newStr = newStr + ":";
                    break;
                case '%':
                    newStr = newStr + ";";
                    break;
                default:
                    newStr = newStr + ch;
                    break;
            }
        }
        newStr = newStr + generatedString;
        return newStr;
    }
    
    public String decryptFiftyFiveP(String value){
        int len;
        String x="";
        try{
            len = Integer.parseInt(value.substring(6, value.indexOf(".")));
            x = value.substring(value.indexOf(".")+1, value.indexOf(".")+1+len);
        }catch(Exception e){
            return "Error decrypting your entry";
        }
        
        String newStr ="";
        for (int i = 0; i < x.length(); i++) {
            char ch = Character.toLowerCase(x.charAt(i));
            switch (ch) {
                case 'z':
                    newStr = newStr + "a";
                    break;
                case 'w':
                    newStr = newStr + "b";
                    break;
                case 'f':
                    newStr = newStr + "c";
                    break;
                case 'y':
                    newStr = newStr + "d";
                    break;
                case 'b':
                    newStr = newStr + "e";
                    break;
                case '$':
                    newStr = newStr + "f";
                    break;
                case '&':
                    newStr = newStr + "g";
                    break;
                case 'e':
                    newStr = newStr + "h";
                    break;
                case '=':
                    newStr = newStr + "i";
                    break;
                case '£':
                    newStr = newStr + "j";
                    break;
                case '5':
                    newStr = newStr + "k";
                    break;
                case 'c':
                    newStr = newStr + "l";
                    break;
                case 'q':
                    newStr = newStr + "m";
                    break;
                case '-':
                    newStr = newStr + "n";
                    break;
                case '~':
                    newStr = newStr + "o";
                    break;
                case 'a':
                    newStr = newStr + "p";
                    break;
                case '#':
                    newStr = newStr + "q";
                    break;
                case 'n':
                    newStr = newStr + "r";
                    break;
                case '<':
                    newStr = newStr + "s";
                    break;
                case '+':
                    newStr = newStr + "t";
                    break;
                case '@':
                    newStr = newStr + "u";
                    break;
                case '3':
                    newStr = newStr + "v";
                    break;
                case '4':
                    newStr = newStr + "w";
                    break;
                case 'µ':
                    newStr = newStr + "x";
                    break;
                case 'd':
                    newStr = newStr + "y";
                    break;
                case '/':
                    newStr = newStr + "z";
                    break;
                case '|':
                    newStr = newStr + "0";
                    break;
                case '!':
                    newStr = newStr + '1';
                    break;
                case '%':
                    newStr = newStr + "2";
                    break;
                case 'x':
                    newStr = newStr + '3';
                    break;
                case 'm':
                    newStr = newStr + '4';
                    break;
                case '8':
                    newStr = newStr + "5";
                    break;
                case '*':
                    newStr = newStr + "6";
                    break;
                case 'k':
                    newStr = newStr + "7";
                    break;
                case '7':
                    newStr = newStr + "8";
                    break;
                case 'h':
                    newStr = newStr + "9";
                    break;
                case '2':
                    newStr = newStr + " ";
                    break;
                case '>':
                    newStr = newStr + ".";
                    break;
                case '1':
                    newStr = newStr + ",";
                    break;
                case 's':
                    newStr = newStr + ";";
                    break;
                case '6':
                    newStr = newStr + "(";
                    break;
                case 'i':
                    newStr = newStr + ")";
                    break;
                case '0':
                    newStr = newStr + "/";
                    break;
                case '?':
                    newStr = newStr + "*";
                    break;
                case '9':
                    newStr = newStr + "-";
                    break;
                case ':':
                    newStr = newStr + "+";
                    break;
                case ';':
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
