import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    // Link to Repository: https://github.com/BernhardV-GH/prog2-ss21-exercise1

    @Test
    @DisplayName("AppTest1: File only has one line")
    void AppTest1(){
        List<Integer> actual = Result.gradingStudents(Reader.readFromInput("src/test/resources/appTest1.txt"));
        List<Integer> expected = null;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("AppTest2: File is empty")
    void AppTest2(){
        List<Integer> actual = Result.gradingStudents(Reader.readFromInput("src/test/resources/appTest2.txt"));
        List<Integer> expected = null;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("AppTest2: File is too long (n > 60)")
    void AppTest3(){
        List<Integer> actual = Result.gradingStudents(Reader.readFromInput("src/test/resources/appTest3.txt"));
        List<Integer> expected = null;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("AppTest4: testcase with wrong entries")
    void AppTest4(){
        List<Integer> actual = Result.gradingStudents(Reader.readFromInput("src/test/resources/appTest4.txt"));
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(-1);
        expected.add(20);
        expected.add(35);
        expected.add(50);
        expected.add(-1);
        expected.add(-1);
        expected.add(100);
        expected.add(100);
        expected.add(-1);
        expected.add(39);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("AppTest5: generic testcase")
    void AppTest5(){
        List<Integer> actual = Result.gradingStudents(Reader.readFromInput("src/test/resources/appTest5.txt"));
        List<Integer> expected = new ArrayList<>();
        expected.add(90);
        expected.add(75);
        expected.add(71);
        expected.add(65);
        expected.add(39);
        expected.add(38);
        expected.add(24);
        expected.add(77);
        expected.add(57);
        expected.add(60);
        expected.add(95);
        expected.add(100);
        expected.add(96);

        assertEquals(expected, actual);
    }
}