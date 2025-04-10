/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

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


        @Test void TestTask3() {// renamed this to TestTask3, not avoid naming conflicts
        // Arrange
        SimpleFunctions classBeingTested = new SimpleFunctions(); // Task3 method was not found because this was initially App(), instead of SimpleFunctions()
        String data = "((())()(())()()()))(";
        boolean expected = false;
        // test 2
        String data2 = "()()";
        boolean expected2 = true;
        // Act
        boolean result = classBeingTested.Task3(data);
        boolean result2 = classBeingTested.Task3(data2);
        // Assert
        assertEquals(expected,result);
        assertEquals(expected2,result2);
    }

    @Test void TestTask4() {
        // Arrange
        SimpleFunctions classBeingTested = new SimpleFunctions();

        //same length
        List<Integer> fl1 = Arrays.asList(2,5,3,6);
        List<Integer> fl2 = Arrays.asList(4,2,5,7);
        
        //diff length
        List<Integer> sl1 = Arrays.asList(2,5,3,6);
        List<Integer> sl2 = Arrays.asList(4,2,5);
        

        //Act
        List<Integer> result = Arrays.asList(14,25, 6,24);
        List<Integer> result2 = null;
        
        
        // Assert
        assertIterableEquals(result, classBeingTested.Task4(fl1,fl2)); // Test if the lists have the same length
        assertIterableEquals(result2, classBeingTested.Task4(sl1,sl2)); // Test if the lists do not have the same length
    }
}
