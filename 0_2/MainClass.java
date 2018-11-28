import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MainClass
{
    private int class_number = 20;

    public int getClassNumber()
    {
        return class_number;
    }

    public int getLocalNumber()
    {
        return 14;
    }
}


class MainClassTest
{
    MainClass a = new MainClass();
    int actual = a.getLocalNumber();

    int class_field = a.getClassNumber();

    @Test
    public void testGetLocalNumber()
    {
        int expected = 14;
        Assertions.assertEquals(expected, actual, "Expected int is not equal to actual int");
    }

    @Test
    public void testGetClassNumber()
    {
        int border = 45;
        Assertions.assertTrue(class_field > border, "Expected int is not more then border defined");
    }
}
