import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void yields_4_when_adding_two_numbers(){
        int actual = Main.sum(2, 2);
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void yields_text_of_input(){
        String actual = Main.fizzBuzz(10);
        String expected = "10";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void yields_a_String_fizz(){
        String actual = Main.fizzBuzzDiv(3);
        String expected= "fizz";
        Assertions.assertEquals(expected, actual);

    }
    @Test
    void is_dividable_by_5(){
        String actual = Main.fizzBuzzDiv(5);
        String expected = "5";
        Assertions.assertEquals(expected, actual);

    }
    @Test
    void is_dividable_by_5_and_3(){
        String actual = Main.fizzBuzzDiv(15);
        String expected = "fizzbuzz";
        Assertions.assertEquals(expected, actual);
    }
}
