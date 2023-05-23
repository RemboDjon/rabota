package Calculator;
import java.util.Scanner;
public class Calculator {
            public static void main(String[] args) throws Exception {
                do {
                    Scanner str = new Scanner(System.in);
                    String s = str.nextLine();
                    System.out.println(text(s));
                }while (true);
            }
            public static String text(String znak) throws Exception {
                int a;
                int b;
                String operation;
                String result;
                boolean roman;
                String[] operands = znak.split("[+\\-*/]");
                if (operands.length != 2) throw new Exception("Больше двух нельзя)");
                operation = detectOperation(znak);

                if (Roman.isRoman(operands[0]) && Roman.isRoman(operands[1])) {
                    a = Roman.convertToArabian(operands[0]);
                    b = Roman.convertToArabian(operands[1]);
                    roman = true;
                }
                else if (!Roman.isRoman(operands[0]) && !Roman.isRoman(operands[1])) {
                    a = Integer.parseInt(operands[0]);
                    b = Integer.parseInt(operands[1]);
                    roman = false;
                }else {
                    throw new Exception();
                }

                if (a > 10 || b > 10) {
                    throw new Exception();
                }
                int arabian = calc(a, b, operation);
                if (roman) {
                    if (arabian <= 0) {
                        throw new Exception();
                    }
                    result = Roman.convertToRoman(arabian);
                } else {
                    result = String.valueOf(arabian);
                }
                return result;
            }

            static String detectOperation(String znak) {
                if (znak.contains("+")){
                    return "+";
                }
                else if (znak.contains("-")){
                    return "-";
                }
                else if (znak.contains("*")){
                    return "*";
                }
                else if (znak.contains("/")){
                    return "/";
                }
                else return null;


            }

            static int calc(int a, int b, String oper) {

                if (oper.equals("+")){
                    return a + b;
                }
                if (oper.equals("-")){
                    return a - b;
                }
                if (oper.equals("*")){
                    return a * b;
                }
                return a / b;
            }

        }

        class Roman {
            static String[] romanArray = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI",
                    "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV",
                    "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI",
                    "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII",
                    "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII",
                    "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV",
                    "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV",
                    "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII",
                    "XCVIII", "XCIX", "C"};

            public static boolean isRoman(String ind) {
                for (int i = 0; i < romanArray.length; i++) {
                    if (ind.equals(romanArray[i])) {
                        return true;
                    }
                }
                return false;
            }

            public static int convertToArabian(String roman) {
                for (int i = 0; i < romanArray.length; i++) {
                    if (roman.equals(romanArray[i])) {
                        return i;
                    }
                }
                return -1;
            }

            public static String convertToRoman(int arabian) {
                return romanArray[arabian];
            }

        }
