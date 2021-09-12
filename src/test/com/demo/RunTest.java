import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import junit.framework.JUnit4TestAdapter;

// This section declares all of the test classes in your program.
@RunWith(Suite.class)
@Suite.SuiteClasses({
   TestHelloWorld.class
})

public class RunTest
{


    // Execution begins at main().  In this test class, we will execute
    // a text test runner that will tell you if any of your tests fail.
    public static void main (String[] args)
    {
       junit.textui.TestRunner.run (suite());
    }

    public static junit.framework.Test suite()
    {
       return new JUnit4TestAdapter(RunTest.class);
    }

}
