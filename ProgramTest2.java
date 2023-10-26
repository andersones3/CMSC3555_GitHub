import org.junit.*;

public class ProgramTest2 {

    @Test
    public void test()
    {
        int num1 = 0;
        int num2 = 132;
        int sum = Program.add(num1, num2);
        Assert.assertEquals(132, sum);
        
    }//end test method
}//end class
