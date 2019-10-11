package junit5.tdd;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    void should_return_string_1_when_given_count_1() {
        int count = 1;

        String result = FizzBuzz.getString(count);

        assertThat(result, is("1"));
    }

    @Test
    void should_return_string_fizz_when_given_count_3() {
        int count = 3;

        String result = FizzBuzz.getString(count);

        assertThat(result, is("Fizz"));
    }

    @Test
    void should_return_string_fizz_when_given_count_6() {
        int count = 6;

        String result = FizzBuzz.getString(count);

        assertThat(result, is("Fizz"));
    }

    @Test
    void should_return_string_buzz_when_given_count_5() {
        int count = 5;

        String result = FizzBuzz.getString(count);

        assertThat(result, is("Buzz"));
    }

    @Test
    void should_return_string_whizz_when_given_count_7() {
        int count = 7;

        String result = FizzBuzz.getString(count);

        assertThat(result, is("Whizz"));
    }

    @Test
    void should_return_string_fizzbuzz_when_given_count_multiple_of_3_and_5() {
        int count = 3 * 5;

        String result = FizzBuzz.getString(count);

        assertThat(result, is("FizzBuzz"));
    }

    @Test
    void should_return_string_fizzwhizz_when_given_count_multiple_of_3_and_7() {
        int count = 3 * 7;

        String result = FizzBuzz.getString(count);

        assertThat(result, is("FizzWhizz"));
    }

    @Test
    void should_return_string_buzzwhizz_when_given_count_multiple_of_5_and_7() {
        int count = 5 * 7;

        String result = FizzBuzz.getString(count);

        assertThat(result, is("BuzzWhizz"));
    }

    @Test
    void should_return_string_fizzbuzzwhizz_when_given_count_multiple_of_3_5_7() {
        int count = 3 * 5 * 7;

        String result = FizzBuzz.getString(count);

        assertThat(result, is("FizzBuzzWhizz"));
    }

    @Test
    void should_output_string_ending_in_fizzbuzz_when_given_number_120() {
        int count = 120;
        System.setOut(new PrintStream(outContent));

        FizzBuzz.countTo(count);

        String result = outContent.toString();

        assertThat(result.substring(result.length() - 10), is("FizzBuzz\r\n"));
    }
}
