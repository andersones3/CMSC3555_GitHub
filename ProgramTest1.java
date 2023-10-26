import org.junit.*;

public class ProgramTest1 {
    @Test
    public void test()
    {
        int num1 = 3;
        int num2 = 4;
        int add = Program.add(num1, num2);
        Assert.assertEquals(7, add);
    }
}
