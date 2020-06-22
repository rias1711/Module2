package Week2.Day4.BT3;

public class FizzBuzzTranslate {
    public static String translate(int inputNumber) {
        boolean isFizz = inputNumber % 3 == 0;
        boolean isBuzz = inputNumber % 5 == 0;

        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return inputNumber + "";
    }

}
