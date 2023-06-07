import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void yields_4_when_adding_two_numbers(){
        int actual = Main.sum(2, 2);
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }
}
