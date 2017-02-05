import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.*;


public class HelloTest {
    @Test
    public void evaluatesSayHelloToMe() {
        Hello hello = new Hello();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps); 
        hello.sayHelloToMe();
        System.out.flush();
        System.setOut(old);
        assertEquals("Hello, Chad\n", baos.toString());
    }

    @Test
    public void evaluatesSayHelloToSomeone() {
        //Hello hello = new Hello();
        //ByteArrayOutputStream baos = new ByteArrayOutputStream();
        //PrintStream ps = new PrintStream(baos);
        //PrintStream old = System.out;
        //System.setOut(ps);
        //hello.sayHelloToSomeone(value);
        //String s = "Hello, " + value;
        //System.out.flush();
        //System.setOut(old);
        //assertEquals(s, baos.toString());
    }
}

