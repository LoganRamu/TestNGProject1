import org.testng.annotations.Test;

public class SampleTest
{
    @Test(dependsOnMethods = "secondTestNG")
    public void firstTestNG()
    {
        System.out.println("TestNg1");
    }
    @Test
    public void secondTestNG()
    {
        System.out.println("TestNg2");
    }
    @Test(groups = "Apple")
    public void thirdTestNG()
    {
        System.out.println("TestNg3");
    }
}
