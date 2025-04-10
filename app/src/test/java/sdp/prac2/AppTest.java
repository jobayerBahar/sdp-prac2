/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class AppTest {
    @Test void testTask2(){
        SimpleFunctions sf = new SimpleFunctions();
        List<String> check1 = new ArrayList<String>();
        check1.add("biscuit");
        check1.add("cookies");
        List<String> check2 = new ArrayList<String>();
        check2.add("");
        check2.add("biscuit");

        List<String> expect1 = new ArrayList<String>();
        expect1.add("iscuit");
        expect1.add("ookies");
        List<String> expect2 = new ArrayList<String>();
        expect2.add("iscuit");

        assertEquals(expect1, sf.Task2(check1));
        assertEquals(expect2, sf.Task2(check2));

        
    }
}
