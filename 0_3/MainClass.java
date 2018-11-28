import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MainClass
{
    private int class_number = 20;

    private String class_string = "Hello, world";

    public String getClassString()
    {
        return class_string;
    }

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

    String class_string_field = a.getClassString();

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

    @Test
    public void testGetClassString()
    {
        Assertions.assertTrue(
            class_string_field.contains("hello") || class_string_field.contains("Hello"),
                "Expected string does not contain \"hello\" or \"Hello\""
        );
    }
}
