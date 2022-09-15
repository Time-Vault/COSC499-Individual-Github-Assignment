import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class indivGitTest {
    indivGit tester = new indivGit();

    @Test
    public void timerTest(){
        boolean waited = tester.timerFunc(5);
        Assert.assertEquals(true, waited);
    }

    @Test
    public void multiHelloTest(){
        String hellos = tester.multiHelloFunc(3);
        Assert.assertEquals("hellohellohello", hellos);
    }
}
