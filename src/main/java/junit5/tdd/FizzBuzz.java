package junit5.tdd;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public static void main(String[] argumentados) {
        countTo(120);
    }

    public static String getString(int count) {
        if (count % 3 == 0 && count % 5 == 0 && count % 7 == 0) {
            return FIZZ + BUZZ + WHIZZ;
        } else if (count % 3 == 0 && count % 5 == 0) {
            return FIZZ + BUZZ;
        } else if (count % 3 == 0 && count % 7 == 0) {
            return FIZZ + WHIZZ;
        } else if (count % 5 == 0 && count % 7 == 0) {
            return BUZZ + WHIZZ;
        } else if (count % 3 == 0){
            return FIZZ;
        } else if (count % 5 == 0) {
            return BUZZ;
        } else if (count % 7 == 0) {
            return WHIZZ;
        } else {
            return String.valueOf(count);
        }
    }

    public static void countTo(int count) {
        for(int i = 1; i <= count; i++) {
            System.out.println(getString(i));
        }
    }
}
