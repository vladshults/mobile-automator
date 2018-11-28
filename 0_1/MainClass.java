import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MainClass
{
    public static int getLocalNumber()
    {
        return 14;
    }
}


class MainClassTest
{
    MainClass a = new MainClass();
    int actual = a.getLocalNumber();

    @Test
    public void testGetLocalNumber()
    {
        int expected = 14;
        Assertions.assertEquals(expected, actual, "Expected int is not equal to actual int");
    }
}
