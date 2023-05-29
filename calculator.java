import java.util.Arrays;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) throws Exception {
        Scanner str = new Scanner(System.in);
        String input = str.next();
        calc(input);

    }
        public static String calc(String input) throws Exception {
            String[] numbers = new String[0];
            int result = 0;

            if (input.indexOf('+') > 0) {
                numbers = input.split("[+]");
                result = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
                if (Integer.parseInt(numbers[0])>10||Integer.parseInt(numbers[1])>10){
                    throw new Exception("Не больше 10 братух");
                }
                System.out.println(result);
            } else if (input.indexOf('-') > 0) {
                numbers = input.split("[-]");
                result = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
                if (Integer.parseInt(numbers[0])>10||Integer.parseInt(numbers[1])>10){
                    throw new Exception("Не больше 10 братух");
                }
                System.out.println(result);
            } else if (input.indexOf('/') > 0) {
                numbers = input.split("[/]");
                result = Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]);
                if (Integer.parseInt(numbers[0])>10||Integer.parseInt(numbers[1])>10){
                    throw new Exception("Не больше 10 братух");
                }
                System.out.println(result);
            } else if (input.indexOf('*') > 0) {
                numbers = input.split("[*]");
                result = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
                if (Integer.parseInt(numbers[0])>10||Integer.parseInt(numbers[1])>10){
                    throw new Exception("Не больше 10 братух");
                }
                System.out.println(result);

            } else {
                throw new Exception("Неправильная арефметическая операция");
            }
            return String.valueOf(result);

        }
}
